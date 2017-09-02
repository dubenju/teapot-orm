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

package org.teapot.db.orm.util;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.mdl.OptOrder;
import org.teapot.db.orm.util.keybreak.DefaultKbInstance;
import org.teapot.db.orm.util.keybreak.IBreakProcedure;
import org.teapot.db.orm.util.keybreakmany.DefaultKbmInstance;
import org.teapot.db.orm.util.keybreakmany.IMergeBreakProcs;
import org.teapot.db.orm.util.keymatch.IKeyMatchWrap;
import org.teapot.db.orm.util.keymatch.IMatch;
import org.teapot.db.orm.util.keymatch.IMatchInstance;
import org.teapot.db.orm.util.keymatch.IMatchProcedure;
import org.teapot.db.orm.util.keymatch.KeyMatchWrap;
import org.teapot.db.orm.util.sort.DefaultComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 工具类。
 *
 * @author dubenju@126.com
 * @since 0.0.1
 */
public class UModel {

  /**
   * 排序.
   *
   * @param collection
   *          待排序数据。
   * @param keys
   *          排序键名。
   * @param <T>
   *          排序数据的类型。
   * @throws Exception
   *           处理过程中的异常。
   * @since 0.0.1
   */
  public static <T> void sort(List<T> collection, List<OptOrder> keys)
      throws Exception {
    Comparator<T> comp = new DefaultComparator<T>(keys);
    Collections.sort(collection, comp);
  }


  /**
   * keyBreak.
   * @param transaction Transaction
   * @param proc 回调函数
   * @param arg 参数
   * @param <T> 类型
   * @return 结果
   */
  public static <T extends IKeyValue> Object keyBreak(List<T> transaction, IBreakProcedure proc,
      Object arg) {
    if (transaction == null) {
      return transaction;
    }
    if (transaction.size() == 0) {
      return new ArrayList<T>();
    }
    return new DefaultKbInstance().runBreak(transaction, proc, arg);
  }

  /**
   * keyBreakMany.
   * @param trans 输入
   * @param mbp 回调函数
   * @param param 参数
   * @param <T> 类型
   * @return 结果
   * @throws Exception 处理过程中发生的异常。
   */
  public static <T extends IKeyValue> Object keyBreakMany(List<List<T>> trans,
      IMergeBreakProcs mbp, Object param) {

    return new DefaultKbmInstance().runBreak(trans, mbp, param);
  }

  /**
   * 字符串数组转换为列表.
   * @param keys 字符串数组
   * @return 列表
   */
  public static List<String> toList(String[] keys) {
    if (keys == null) {
      return null;
    }

    List<String> val = new ArrayList<String>( keys.length );
    for (int i = keys.length - 1; i >= 0 ;i --) {
      val.add(keys[i]);
    }
    return val;
  }

  /**
   * 按照指定字段匹配处理. 注意：这个处理会改变List的排序。
   *
   * @param mas Master
   * @param tra Transaction
   * @param matchKeys 匹配字段
   * @param attrKeys  属性字段
   * @param excludes 除外
   * @param matchProc 匹配回调函数
   * @param arg 参数
   * @param <T1> Master数据类型
   * @param <T2> Transaction数据类型
   * @throws Exception 处理过程中发生的异常。
   * @since 0.0.2
   */
  public static <T1 extends IKeyValue, T2 extends IKeyValue> void keyMatch(
      List<T1> mas, List<T2> tra, Map<String, String> matchKeys,
      Map<String, String> attrKeys, Map<String, String> excludes,
      IMatch matchProc, Object arg) throws Exception {

    int matcKeysSize = 0;
    String[] matcMasKeys = null;
    String[] matcTraKeys = null;
    Set<String> matchKeysKeySet = matchKeys.keySet();
    ArrayList<OptOrder> masterKeys = new ArrayList<OptOrder>();
    ArrayList<OptOrder> transactionKeys = new ArrayList<OptOrder>();
    matcKeysSize = matchKeysKeySet.size();
    matcMasKeys = new String[matcKeysSize];
    matcTraKeys = new String[matcKeysSize];

    // 准备排序键名。从matchKeys分别生成masterKeys和transactionKeys。
    Iterator<String> iterator = matchKeysKeySet.iterator();
    int idy = 0;
    while (iterator.hasNext()) {
      String masterKey = iterator.next();
      matcMasKeys[idy] = masterKey;
      matcTraKeys[idy] = matchKeys.get(masterKey);
      masterKeys.add(new OptOrder(masterKey));
      transactionKeys.add(new OptOrder(matcTraKeys[idy]));
      idy++;
    }

    // 在匹配处理前排序数据。
    sort(mas, masterKeys);
    sort(tra, transactionKeys);

    // 设置属性字段。
    int attrKeysSize = 0;
    String[] attrMasKeys = null;
    String[] attrTraKeys = null;
    if (attrKeys != null) {
      Set<String> attrKeysKeySet = attrKeys.keySet();
      attrKeysSize = attrKeysKeySet.size();
      attrMasKeys = new String[attrKeysSize];
      attrTraKeys = new String[attrKeysSize];

      // 准备属性部分的键名。
      Iterator<String> itr = attrKeysKeySet.iterator();
      int idx = 0;
      while (itr.hasNext()) {
        String incMasKey = itr.next();
        attrMasKeys[idx] = incMasKey;
        attrTraKeys[idx] = attrKeys.get(incMasKey);
        idx++;
      }
    }

    // 创建包括属性的索引。
    String[] keysIndex = new String[masterKeys.size() + attrKeysSize];
    for (int i = 0, n = keysIndex.length; i < n; i++) {
      keysIndex[i] = String.valueOf(i);
    }
    // 创建匹配键名的索引。
    String[] matchKeysIndex = new String[masterKeys.size()];
    int matchKeySize = masterKeys.size();
    for (int i = 0; i < matchKeySize; i++) {
      matchKeysIndex[i] = String.valueOf(i);
    }

    // 创建属性部分的索引。
    String[] attrKeysIndex = new String[attrKeysSize];
    for (int i = 0; i < attrKeysSize; i++) {
      attrKeysIndex[i] = String.valueOf(i + masterKeys.size());
    }

    // 加包.
    wrapData(mas, concat(matcMasKeys, attrMasKeys), keysIndex);
    wrapData(tra, concat(matcTraKeys, attrTraKeys), keysIndex);

    // 调用keyMatch处理
    IMatchProcedure frame = (IMatchProcedure) matchProc;
    IMatchInstance instance = frame.getInstance();

    instance.keyMatch(mas, tra, matchKeysIndex, attrKeysIndex, null,
        matchProc, arg);

    // 脱包.
    removeWrap(mas);
    removeWrap(tra);
  }

  /**
   * 合并字符串数组.
   * @param arya 字符串数组a
   * @param aryb 字符串数组b
   * @return 合并字符串数组
   */
  private static String[] concat(String[] arya, String[] aryb) {
    if (aryb == null) {
      return arya;
    }
    if (arya == null) {
      return aryb;
    }

    String[] result = new String[arya.length + aryb.length];
    for (int i = 0, n = arya.length; i < n; i++) {
      result[i] = arya[i];
    }
    for (int i = 0, n = aryb.length; i < n; i++) {
      result[i + arya.length] = aryb[i];
    }

    return result;
  }

  /**
   * 加包.
   * @param list 数据
   * @param keys 键名
   * @param keysIndex 键名索引。
   */
  private static <T extends IKeyValue> void wrapData(List<T> list,
      String[] keys, String[] keysIndex) {
    if (list == null) {
      return;
    }
    for (int i = 0; i < list.size(); i++) {
      @SuppressWarnings({ "unused", "unchecked" })
      T old = list.set(i, ((T) new KeyMatchWrap((IKeyValue) list.get(i), keys, keysIndex)));
    }
  }

  /**
   * 脱包.
   * @param list 数据
   */
  private static <T extends IKeyValue> void removeWrap(List<T> list) {
    if (list == null) {
      return;
    }
    for (int i = 0; i < list.size(); i++) {
      IKeyMatchWrap wrapper = (IKeyMatchWrap) list.get(i);
      @SuppressWarnings({ "unchecked", "unused" })
      T set = list.set(i, (T) wrapper.getNaked());
    }
  }

}
