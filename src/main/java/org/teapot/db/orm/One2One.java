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

public class One2One implements IKeyValue {
  private IKeyValue one;
  private IKeyValue two;

  public One2One() {
      this(null, null);
  }

  public One2One(IKeyValue one1) {
      this(one1, null);
  }

  public One2One(IKeyValue one1, IKeyValue two2) {
    this.one = one1;
    this.two = two2;
  }

  /**
   * getOne.
   * @return one IKeyValue
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
   * getTwo.
   * @return two IKeyValue
   */
  public IKeyValue getTwo() {
    return two;
  }

  /**
   * setTwo.
   * @param two IKeyValue
   */
  public void setTwo(IKeyValue two) {
    this.two = two;
  }

  @Override
  public Object get(String key) {
    Object result = null;
    if (this.one != null) {
      result = this.one.get(key);
    }
    if (result == null) {
      if (this.two != null) {
        result = this.two.get(key);
      }
    }
    return result;
  }

  @Override
  public IKeyValue set(String key, Object value) {

    return this;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.one);
    buf.append(" <=> ");
    buf.append(this.two);
    return buf.toString();
  }

}
