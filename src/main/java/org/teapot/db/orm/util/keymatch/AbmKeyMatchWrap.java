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
 * 抽象的匹配回调类。（带包）
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public abstract class AbmKeyMatchWrap extends AbstractMatch {

  /**
   * 匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract boolean doMatch(Object mas,
      Object tra, Object arg) throws Exception;

  /**
   * 匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @return 返回值
   * @throws Exception 处理过程中发生的异常。
   * @see org.teapot.db.orm.util.keymatch.AbstractMatch#doMatch(java.lang.Object, java.lang.Object,
   * java.lang.Object)
   * @since TeapotORM 0.0.2
   */
  protected boolean doMatch(IKeyValue mas, IKeyValue tra, Object arg)
      throws Exception {
    return doMatch(((IKeyMatchWrap) mas).getNaked(), ((IKeyMatchWrap) tra).getNaked(), arg);
  }

  /**
   * 只有Transaction时的处理.
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doTraOnly(Object tra, Object arg)
      throws Exception;

  /**
   * 只有Transaction时的处理.
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @see org.teapot.db.orm.util.keymatch.AbstractMatch#doTraOnly(java.lang.Object,
   * java.lang.Object)
   * @since TeapotORM 0.0.2
   */
  protected void doTraOnly(IKeyValue tra, Object arg) throws Exception {
    doTraOnly(((IKeyMatchWrap) tra).getNaked(), arg);
  }

  /**
   * 只有Master时的处理.
   * @param mas Master
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doMasOnly(Object mas, Object arg)
      throws Exception;

  /**
   * 只有Master时的处理.
   * @param mas Master
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @see org.teapot.db.orm.util.keymatch.AbstractMatch#doMasOnly(
   * java.lang.Object, java.lang.Object)
   * @since TeapotORM 0.0.2
   */
  protected void doMasOnly(IKeyValue mas, Object arg) throws Exception {
    doMasOnly(((IKeyMatchWrap) mas).getNaked(), arg);
  }

  /**
   * 键名字段匹配，属性字段不匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  protected abstract void doMismatch(Object mas, Object tra,
      Object arg) throws Exception;

  /**
   * 键名字段匹配，属性字段不匹配时的处理.
   * @param mas Master
   * @param tra Transaction
   * @param arg 参数
   * @throws Exception 处理过程中发生的异常。
   * @see org.teapot.db.orm.util.keymatch.AbstractMatch#doMismatch(
   * java.lang.Object, java.lang.Object, java.lang.Object)
   * @since TeapotORM 0.0.2
   */
  protected void doMismatch(IKeyValue mas, IKeyValue tra, Object arg)
      throws Exception {
    doMismatch(
        ((IKeyMatchWrap) mas).getNaked(), ((IKeyMatchWrap) tra).getNaked(), arg);
  }
}
