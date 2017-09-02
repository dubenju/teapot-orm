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

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 抽象的匹配回调类。（带包）
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public abstract class AbstractMatch implements IMatchProcedure, IMatch {

  /**
   * 构造函数.
   * @since TeapotORM 0.0.2
   */
  public AbstractMatch() {
    super();

    System.out.println("[AbstractMatch] Initializing " + this.getClass().getName());

    Field[] fields = this.getClass().getDeclaredFields();
    FIELDS: for (int i = 0, n = fields.length; i < n; i++) {
      int mod = fields[i].getModifiers();

      boolean isFinal  = Modifier.isFinal(mod);
      boolean isStatic = Modifier.isStatic(mod);

      if (isFinal) {
        continue FIELDS;
      } // it should be thread safe.
      if (fields[i].getName().indexOf("$") != -1) {
        continue FIELDS;
      }

      String msg = "[AbstractMatch]"
          + "[Warning! : 确保变量的线程安全性被声明为"
          + fields[i].getDeclaringClass().getName()
          + " by the name of "
          + fields[i].getName()
          + " : TypeName = "
          + fields[i].getType().getName() + " : isStatic = " + isStatic;

      System.out.println(msg);
      // LoggerService.getCollectionLogger().collectionLog( msg );
    }
  }

  /**
   * 返回匹配处理实例.
   * @return IMatchInstance 匹配处理实例
   * @since TeapotORM 0.0.2
   */
  public IMatchInstance getInstance() {
    // TODO:考虑单实例
    return new DefaultMatchInstance();
  }

  /**
   * 匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract boolean doMatch(IKeyValue mas, IKeyValue tra,
       Object arg) throws Exception;

  /**
   * 只有Transaction时的处理.
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doTraOnly(IKeyValue tra, Object arg)
      throws Exception;

  /**
   * 只有Master时的处理.
   * @param mas Master
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doMasOnly(IKeyValue mas, Object arg)
      throws Exception;

  /**
   * 键名字段匹配，属性字段不匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doMismatch(IKeyValue mas, IKeyValue tra,
      Object arg) throws Exception;

  /* 为防止用户类实现这些内部方法，这些方法设置为final。 */
  /**
   * 匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public final boolean match(IKeyValue mas, IKeyValue tra,
      Object arg) throws Exception {
    return doMatch(mas, tra, arg);
  }

  /**
   * 只有Transaction时的处理.
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public final void transactionOnly(IKeyValue tra, Object arg)
      throws Exception {
    doTraOnly(tra, arg);
  }

  /**
   * 只有Master时的处理.
   * @param mas Master
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public final void masterOnly(IKeyValue mas, Object arg)
      throws Exception {
    doMasOnly(mas, arg);
  }

  /**
   * 键名字段匹配，属性字段不匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public final void mismatch(IKeyValue mas, IKeyValue tra, Object arg)
      throws Exception {
    doMismatch(mas, tra, arg);
  }
}
