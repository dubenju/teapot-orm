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
 * 包类。
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public class KeyMatchWrap implements IKeyMatchWrap, IKeyValue {
  private IKeyValue obj;
  private String[] keys;
  private String[] keysIndex;

  /**
   * 构造函数.
   * @param obj IKeyValue
   * @param keys String[]
   * @param keysIndex String[]
   */
  public KeyMatchWrap(IKeyValue obj, String[] keys, String[] keysIndex) {
    this.obj = obj;
    this.keys = keys;
    this.keysIndex = keysIndex;
  }

  /**
   * 通过键名获取值.
   * @param key 键名。
   * @return 值。
   * @since TeapotORM 0.0.2
   */
  @Override
  public Object get(String key) {

    for (int i = 0 ; i < this.keysIndex.length ; i++ ) {
      if ( key.equals( keysIndex[i] ) ) {
        return obj.get( keys[i] );
      }
    }
    return null;
  }

  /**
   * 通过键名设置值.
   * @param key 键名。
   * @param value 值。
   * @since TeapotORM 0.0.2
   */
  @Override
  public IKeyValue set(String key, Object value) {
    return this;
  }

  /**
   * 返回Naked.
   * @return 返回Naked.
   * @since TeapotORM 0.0.2
   */
  @Override
  public Object getNaked() {
    return this.obj;
  }
}
