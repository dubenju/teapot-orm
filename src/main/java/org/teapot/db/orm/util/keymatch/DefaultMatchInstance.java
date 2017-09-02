/*
 * Copyright (C) 2017 dubenju@126.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teapot.db.orm.util.keymatch;

import org.teapot.db.orm.IKeyValue;

import java.util.List;
import java.util.Vector;


/**
 * 抽象的匹配回调类。（带包）
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
// TODO:修正——————单实例
public class DefaultMatchInstance implements IMatchInstance {

  protected static final int MATCHED = 0;
  protected static final int TRA_AHEAD = 1;
  protected static final int MAS_AHEAD = -1;

  /**
   * 把字符串数组转换成为Vector.
   *
   * @param keys 字符串数组
   * @return Vector
   */
  protected static Vector<String> toVector(String[] keys) {
    if (keys == null) {
      return null;
    }

    Vector<String> vec = new Vector<String>();
    for (int i = 0; i < keys.length; i++) {
      vec.add(keys[i]);
    }
    return vec;
  }

  private int idxTra = 0;
  private int idxMas = 0;
  protected List<IKeyValue> loMas;
  protected List<IKeyValue> loTra;
  private   List<String> mkeys;
  protected List<String> att;

  /* 参数对象取决于每个线程，因此它不能保留在单实例对象中. */
  private Object arg;

  /**
   * 返回参数.
   * @return 返回参数。
   * @since TeapotORM 0.0.2
   */
  public Object getArg() {
    return this.arg;
  }

  /**
   * 设置属性.
   * @param attr List
   * @since TeapotORM 0.0.2
   */
  protected void setAttr(List<String> attr) {
    this.att = attr;
  }

  /**
   * 匹配处理.
   * @param mas Master
   * @param tra Transaction
   * @param mkeys 匹配
   * @param attr 包括
   * @param excludes 除外
   * @param proc 匹配处理
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  @SuppressWarnings("unchecked")
  public <T1 extends IKeyValue, T2 extends IKeyValue> void keyMatch(List<T1> mas,
      List<T2> tra, String[] mkeys,
      String[] attr, String[] excludes, IMatch proc, Object arg)
      throws Exception {
    this.loMas = (List<IKeyValue>) mas;
    this.loTra = (List<IKeyValue>) tra;
    this.mkeys = toVector(mkeys);
    setAttr(toVector(attr));
    this.arg = arg;

    // 执行 主处理方法.
    run(proc);
  }

  /*
   * 这种方法与上面的主要逻辑run（）方法有很大的关系。
   * 所以这个方法只是一个主要逻辑的子程序。
   * 小心！ 不要以类别成员方法的方式来思考这个方法。
   * 所以，这个方法设置为“final”。
   */
  /**
   * 匹配处理.
   * @param mas Master
   * @param tra Transaction
   * @param proc 匹配处理
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  private final void runKeyMatch(IKeyValue mas, IKeyValue tra, IMatch proc, Object arg)
      throws Exception {
    int compAttr;
    boolean blAttr = false;

    for (int i = 1; ; i ++) {
      // 比较属性部
      compAttr = comAttrs(mas, tra, this.att);
      ATTR: switch (compAttr) {
        case MATCHED:
          blAttr = true;
          break ATTR;
        default:
          blAttr = false;
          break ATTR;
        }

      if (blAttr == false) {
        proc.mismatch(mas, tra, arg);
      }

      // 只有属性部也匹配的时候才执行doMatch().
      if (blAttr == true && proc.match(mas, tra, arg)) {
        return;
      }

      // 如果matching返回true继续。
      mas = (IKeyValue) getMatchingMasterAhead(i);
      if (mas == null) {
        return;
      }
    }
  }

  /**
   * 主处理.
   * @param proc 回调
   * @param <T1> 数据类型.
   * @param <T2> 数据类型.
   * @throws Exception 处理过程中发生的异常.
   */
  protected <T1 extends IKeyValue, T2 extends IKeyValue> void run(IMatch proc) throws Exception {
    // 读取Master
    IKeyValue mas = readMas();
    // 读取Transaction
    IKeyValue tra = readTra();

    if (!NullList.isNull(mas, tra, proc, this)) {
      return;
    }

    boolean isMatched = false; // Generally speacking this flag is for Tra
    boolean isMasterUsed = false; // This flag is for Mas
    IKeyValue masMatched = null; // for backup 1(tra):N(mas) matching
    int comp;

    MAIN: for (;;) {
      // 循环transaction
      COMP: for (;;) {
        // 循环master
        if (mas == null) {
          // if master cannot be read, matching impossible.
          break COMP;
        }

        // 比较 keys
        comp = compareKeys(mas, tra, mkeys);
        switch (comp) {
          case MATCHED:
            isMasterUsed = true; // don't care about the result of
            isMatched = true; // doMatching() => Deterministic
            masMatched = mas;
            // matching
            // attributeMismatch
            runKeyMatch(mas, tra, proc, arg);
            break COMP;

          case TRA_AHEAD:
            // if never used (if keys never matched with any master)
            if (!isMasterUsed) {
              proc.masterOnly(mas, arg);
            } else {
              masMatched = mas;
            }
            mas = readMas();
            isMasterUsed = transactionAhead(mas, masMatched, mkeys, isMasterUsed);
            continue COMP;

          case MAS_AHEAD:
            break COMP;

          default:
            return;
        }
      } // COMP

      if (!isMatched) {
        // if no matching record exists, do some proc
        proc.transactionOnly(tra, arg);
      }

      // read next transaction and initialize the control flag
      tra = readTra();
      if (tra == null) {
        break MAIN;
      }

      isMatched = false;
    } // MAIN

    finish(mas, masMatched, mkeys, proc, arg);
  }

  /**
   * This method is additionally introduced for 1(Tra):N(Mas) mathcing. Expected
   * Use) This method is expected to be called from doMatch(). This method is
   * necessary to check whether the following records might have the same
   * matching keys. Policy of Matching Procedure Frame) I. The index of master
   * and transaction never decrement. II. The index of master and transaction
   * never be controlled from outside of this class (private state). No control
   * method is provided. Case Study) 1. Keys are matched but attributes such as
   * effective data are invalid. 2. The following master record(s) might have
   * the same keys and the valid attributes. 3. Use the valid master record as
   * the matching AND "valid" record. 4. The next "transaction" may have the
   * same keys. 5. The next transaction may find matching and valid record among
   * master records, which are already examined with the previous transaction.
   * Note: This method can be accessed from non-children classes if they are in
   * the same package. But introducing sub packages requires to let this be
   * public.
   * @param offset offset
   * @return Object 结果
   */
  public Object getMatchingMasterAhead(int offset) {
    int current = getMasterIndex();
    if (this.loMas == null || this.loMas.size() == 0 || offset < 0
        || this.loMas.size() <= current + offset) {
      return null;
    }

    // since idx was moved forward by one after read()
    if (compareMasterKeys(current, offset)) {
      return this.loMas.get(current + offset);
    } else {
      return null;
    }
  }

  /**
   * Don't leak information (Keep private/encupsulation/information hiding) =>
   * Outside of this class, no information about index, current/offset.
   */
  private boolean compareMasterKeys(int current, int offset) {
    IKeyValue currentRecord = (IKeyValue) getMaster(current);
    IKeyValue aheadRecord   = (IKeyValue) getMaster(current + offset);
    if (aheadRecord == null) {
      return false;
    }
    for (int i = 0; i < this.mkeys.size(); i++) {
      @SuppressWarnings({ "unchecked", "rawtypes" })
      int comp = ((Comparable) currentRecord.get((String) this.mkeys.get(i)))
          .compareTo(aheadRecord.get((String) this.mkeys.get(i)));
      if (comp > 0) {
        return false;
      } else if (comp < 0) {
        return false;
      }
    } // COMP
    return true;
  }

  /**
   * Don't leak information (Keep private/encupsulation/information hiding) =>
   * Outside of this class, no information about index, current/offset.
   */
  private Object getMaster(int position) {
    if (this.loMas == null || this.loMas.size() == 0
        || this.loMas.size() <= position) {
      return null;
    }
    return this.loMas.get(position); // since idx was moved forward by one after read()
  }

  /**
   * This method is heavily related with the above main logic, run() method.
   * Therefore this method is just a subrutione of the main logic. Caution ! DO
   * NOT THINK ABOUT THIS METHOD AS A CLASS MEMBER METHOD. So, this method is
   * set to "final".
   */
  private final boolean transactionAhead(IKeyValue tra, IKeyValue traMatched,
      List<String> mkeys, boolean isMasterUsed) {
    int compTra;
    if (tra == null) {
      return isMasterUsed;
    }
    // for the key comparison with the following master record
    if (traMatched == null) {
      compTra = MAS_AHEAD;
    } else {
      compTra = compareKeys(tra, traMatched, mkeys);
    }
    TRA_KEY: switch (compTra) {
      case MATCHED:
        isMasterUsed = true;
        break TRA_KEY;
      default:
        isMasterUsed = false;
        break TRA_KEY;
    }
    return isMasterUsed;
  } // transactionAhead

  /**
   * This method is heavily related with the above main logic, run() method.
   * Therefore this method is just a subrutione of the main logic. Caution ! DO
   * NOT THINK ABOUT THIS METHOD AS A CLASS MEMBER METHOD. So, this method is
   * set to "final".
   */
  private final void finish(IKeyValue mas, IKeyValue masMatched, List<String> mkeys,
      IMatch proc, Object param) throws Exception {
    // Calling back procedure class to let it know the no transaction
    // won't be examined for the lest of master records
    if (mas == null) {
      return;
    }

    int compMas;
    boolean isMasterUsed;
    while (true) {
      // for the key comparison with the following
      // master records
      if (masMatched == null) {
        compMas = MAS_AHEAD;
      } else {
        compMas = compareKeys(mas, masMatched, mkeys);
      }
      MAS_KEY: switch (compMas) {
        case MATCHED:
          isMasterUsed = true;
          break MAS_KEY;
        default:
          isMasterUsed = false;
          masMatched = null; // Once un-matched, Never match again
          // Unless null specified, meaningless
          // key comparision will be run
          break MAS_KEY;
      }

      if (!isMasterUsed) {
        proc.masterOnly(mas, param);
      }

      mas = readMas();
      if (mas == null) {
        return;
      }
    }
  }

  @SuppressWarnings("unchecked")
  protected int compareKeys(IKeyValue mas, IKeyValue tra, List<String> mkeys) {
    for (int i = 0; i < mkeys.size(); i++) {
      String mkey = (String) mkeys.get(i);
      int comp = 0;
      try {
        System.out.println("[DefaultMatchInstance::compareKeys]" + mas + "=" + tra + "=" + mkey);
        @SuppressWarnings("rawtypes")
        Comparable c1 = (Comparable) tra.get(mkey);
        @SuppressWarnings("rawtypes")
        Comparable c2 = (Comparable) mas.get(mkey);
        comp = c1.compareTo(c2);
      } catch (ClassCastException cce) {
        cce.printStackTrace();
      }

      if (comp > 0) {
        return TRA_AHEAD;
      } else if (comp < 0) {
        return MAS_AHEAD;
      }
    } // COMP
    return 0;
  }

  /**
   * 比较属性.
   * @param mas Master
   * @param tra Transaction
   * @param attr 属性
   * @return 比较结果。
   */
  protected int comAttrs(IKeyValue mas, IKeyValue tra, List<String> attr) {
    if (attr == null) {
      // System.out.println("[Warning!] Keys for Attributes is null!");
      return 0;
    }
    COMP: for (int i = 0; i < attr.size(); i++) {
      // Get attribute name
      String name = (String) attr.get(i);

      // Retrieve object as object to check type
      @SuppressWarnings("rawtypes")
      Comparable traObj = (Comparable) tra.get(name);
      @SuppressWarnings("rawtypes")
      Comparable masObj = (Comparable) mas.get(name);

      if (traObj == null && masObj == null) {
        continue COMP; // handle the same attribute ( null == null )
      }
      if (traObj == null) {
        return MAS_AHEAD;
      }
      if (masObj == null) {
        return TRA_AHEAD;
      }

      @SuppressWarnings("unchecked")
      int comp = traObj.compareTo(masObj);

      if (comp != 0 && traObj instanceof String) {
        String enc1 = (String) traObj;
        String enc2 = (String) masObj;

        comp = enc1.compareTo(enc2);
        if (comp == 0) {
          System.out.println("[MatchingFrameAttribute] Char Code Different"
              + traObj + "/" + masObj);
        }
      }

      if (comp > 0) {
        return TRA_AHEAD;
      } else if (comp < 0) {
        return MAS_AHEAD;
      }
    } // COMP
    return 0;
  }

  protected IKeyValue readMas() {
    if (this.loMas == null || this.loMas.size() == 0
        || this.loMas.size() == this.idxMas) {
      return null;
    }
    return (IKeyValue) this.loMas.get(this.idxMas++);
  }

  protected IKeyValue readTra() {
    if (this.loTra == null || this.loTra.size() == 0
        || this.loTra.size() == this.idxTra) {
      return null;
    }
    return (IKeyValue) this.loTra.get(this.idxTra++);
  }

  /**
   * 返回Master索引.
   * @return Master索引.
   */
  public int getMasterIndex() {
    return this.idxMas - 1;
  }
}
