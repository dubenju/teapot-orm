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
 */
public interface IKeyValue {
  /**
   * 通过键名获取值.
   * @param key 键名。
   * @return 值。
   */
  public Object getValueByKey(String key);
  /**
   * 通过键名设置值.
   * @param key 键名。
   * @param value 值。
   */
  public void   setValueByKey(String key, Object value);
}
