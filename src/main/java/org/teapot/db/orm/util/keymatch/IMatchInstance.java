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

/**
 * 抽象的匹配回调类。（带包）
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public interface IMatchInstance {
  /**
   * 匹配处理.
   * @param mas Master
   * @param tra Transaction
   * @param keys 匹配
   * @param attr 属性
   * @param excludes 除外
   * @param proc 匹配处理
   * @param arg 参数
   * @param <T1> Master数据类型
   * @param <T2> Transaction数据类型
   * @throws Exception 处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public <T1 extends IKeyValue, T2 extends IKeyValue> void keyMatch(List<T1> mas,
      List<T2> tra, String[] keys,
      String[] attr, String[] excludes, IMatch proc,
      Object arg) throws Exception;
}
