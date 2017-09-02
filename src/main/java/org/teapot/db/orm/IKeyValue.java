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

package org.teapot.db.orm;

/**
 * 键值接口。
 * @author dubenju@126.com
 * @since TeapotORM 0.0.1
 */
public interface IKeyValue {
  /**
   * 通过键名获取值.
   *
   * <p>
   * 注意：对于参数名称要使用常量.(2017/08/31)
   * @param key 键名。
   * @return 值。
   * @since TeapotORM 0.0.1
   */
  public Object get(String key);

  /**
   * 通过键名设置值.
   *
   * <p>
   * 注意：对于参数名称要使用常量.(2017/08/31)
   * @param key 键名。
   * @param value 值。
   * @return 自身。
   * @since TeapotORM 0.0.1
   * @since TeapotORM 0.0.2 链式方法调用
   */
  public IKeyValue set(String key, Object value);
}
