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

package org.teapot.db.orm.util;

import org.teapot.db.orm.mdl.OptOrder;
import org.teapot.db.orm.util.sort.DefaultComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 工具类。
 * @author dubenju@126.com
 */
public class UModel {

  /**
   * 排序.
   * @param collection 待排序数据。
   * @param keys 排序键名。
   * @param <T> 排序数据的类型。
   * @throws Exception 处理过程中的异常。
   */
  public static <T> void sort(List<T> collection, List<OptOrder> keys) throws Exception {
    Comparator<T> comp = new DefaultComparator<T>(keys);
    Collections.sort(collection, comp);
  }


}
