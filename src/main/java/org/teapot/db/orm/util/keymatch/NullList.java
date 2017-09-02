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

/**
 * NULL列表预处理类.
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public class NullList {

  /**
   * isNull.
   * @param mas Master
   * @param tra Transaction
   * @param proc IMatch
   * @param instance IMatchInstance
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   */
  public static boolean isNull(IKeyValue mas, IKeyValue tra,
      IMatch proc, IMatchInstance instance) throws Exception {
    // 如果都是null，那么就没有必要再继续处理了。
    if (tra == null && mas == null) {
      return false;
    }

    if (instance instanceof DefaultMatchInstance) {
      return isNull(mas, tra, (IMatch) proc, (DefaultMatchInstance) instance);
    }

    return true;
  }

  /**
   * isNull.
   *
   * @param mas Master
   * @param tra Transaction
   * @param proc IMatch
   * @param instance DefaultMatchInstance
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   */
  private static boolean isNull(IKeyValue mas, IKeyValue tra,
      IMatch proc, DefaultMatchInstance instance) throws Exception {
    Object arg = instance.getArg();

    // TransactionOnly
    if (tra != null && mas == null) {
      while (tra != null) {
        proc.transactionOnly(tra, arg);
        tra = instance.readTra();
      }
      return false;
    }

    // MasterOnly
    if (tra == null && mas != null) {
      while (mas != null) {
        proc.masterOnly(mas, arg);
        mas = instance.readMas();
      }
      return false;
    }

    return true;
  }
}
