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

package org.teapot.db.orm.util.sort;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.mdl.OptOrder;

import java.util.Comparator;
import java.util.List;

/**
 * 比较类。
 * @author dubenju@126.com
 *
 * @param <T> 比较数据的类型。
 */
public class DefaultComparator<T> implements Comparator<T> {

  private List<OptOrder> sortKeys = null;

  /**
   * 构造函数.
   * @param keys 比较键名。
   */
  public DefaultComparator(List<OptOrder> keys) {
    this.sortKeys = keys;
  }

  /**
   * 比较处理.
   * @param o1 比较数1。
   * @param o2 比较数2。
   * @return int 比较结果。
   */
  @SuppressWarnings("unchecked")
  @Override
  public int compare(T o1, T o2) {
    IKeyValue k1 = (IKeyValue) o1;
    IKeyValue k2 = (IKeyValue) o2;
    int comp = 0;

    for (int i = 0; i < this.sortKeys.size(); i ++) {
      @SuppressWarnings("rawtypes")
      Comparable v1 = (Comparable<?>) k1.getValueByKey(this.sortKeys.get(i).getCloumn());
      Comparable<?> v2 = (Comparable<?>) k2.getValueByKey(this.sortKeys.get(i).getCloumn());
      comp = v1.compareTo( v2 );
      if (comp != 0) {
        return comp * this.sortKeys.get(i).getOrder();
      }
    }
    return 0;
  }
}
