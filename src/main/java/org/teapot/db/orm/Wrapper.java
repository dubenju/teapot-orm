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
import java.util.Map;

public class Wrapper implements IKeyValue {
  private IKeyValue one;
  private Map<Object, Object> attributes;

  public Wrapper(IKeyValue one) {
    this.one = one;
  }

  /**
   * geOne.
   * @return one
   */
  public IKeyValue geOne() {
    return this.one;
  }

  /**
   * setOne.
   * @param om IKeyValue
   */
  public void setOne(IKeyValue one) {
    this.one = one;
  }

  /**
   * setAttribute.
   * @param key Object
   * @param value Object
   */
  public void setAttribute(Object key, Object value) {
    if ( this.attributes == null ) {
      this.attributes = new HashMap<Object, Object>();
    }
    this.attributes.put(key, value);
  }

  /**
   * getAttribute.
   * @param key Object
   * @return Object
   */
  public Object getAttribute(Object key) {
    if ( this.attributes == null ) {
      return null;
    }
    return this.attributes.get(key);
  }

  @Override
  public Object get(String key) {
    // Check attribute at first
    Object value = getAttribute(key);
    if ( value != null ) {
      return value;
    }

    // If value is null but key is given in attributes map, return null
    // no matter which value is containd in om.
    if ( this.attributes != null
            && this.attributes.containsKey( key ) ) {
      return null;
    }

    // if no key defined in attributes, check attributes in OM.
    value  = this.one.get(key);
    return value;
  }

  @Override
  public IKeyValue set(String key, Object value) {
    setAttribute( key, value );
    return this;
  }

}
