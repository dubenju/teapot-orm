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

import java.util.HashMap;
import java.util.List;

public class One2Many implements IKeyValue {
  private IKeyValue one;
  private List<IKeyValue> many;

  // TODO:这部分是否有必要需要验证。
  private HashMap<Object, Object> attributes;

  public One2Many(IKeyValue one, List<IKeyValue> many ) {
    this.one  = one;
    this.many = many;
  }

  @Override
  public Object get(String key) {
    // TODO:这部分是否有必要需要验证。
    if ( this.attributes != null ) {
      Object obj = this.attributes.get( key );
      if ( obj != null ) {
        return obj;
      }

      // If value is null but key is given in attributes map,
      // return null no matter which value is containd in om.
      if ( this.attributes.containsKey( key ) ) {
        return null;
      }
    }

    return this.one.get( key );
  }

  @Override
  public IKeyValue set(String key, Object value) {
    return this;
  }

  /**
   * getOne.
   * @return one
   */
  public IKeyValue getOne() {
    return one;
  }

  /**
   * setOne.
   * @param one IKeyValue
   */
  public void setOne(IKeyValue one) {
    this.one = one;
  }

  /**
   * getMany.
   * @return many
   */
  public List<IKeyValue> getMany() {
    return many;
  }

  /**
   * setMany.
   * @param many IKeyValue
   */
  public void setMany(List<IKeyValue> many) {
    this.many = many;
  }

  /**
   * setAttribute.
   * @param key Object
   * @param value Object
   */
  public void setAttribute(Object key, Object value) {
    if (attributes == null) {
      attributes = new HashMap<Object, Object>();
    }
    attributes.put(key, value);
  }

  /**
   * getAttribute.
   * @param key Object
   * @return Object
   */
  public Object getAttribute(Object key) {
    if (attributes == null) {
      return null;
    } else {
      return attributes.get(key);
    }
  }
  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    return buf.toString();
  }

}
