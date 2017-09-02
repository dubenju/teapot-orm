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

/**
 * Teapot的工具类。
 * @author dubenju@126.com
 * @since TeapotORM 0.0.2
 */
public class UTeapot {
  /**
   * 获取路径.
   * @param cls 类
   * @param <T> 类型
   * @return 路径
   * @since TeapotORM 0.0.2
   */
  public static <T> String getPath(Class<T> cls) {
    StringBuffer buf = new StringBuffer();
    String path = cls.getResource("").getPath();
//    System.out.println("path: " + path);
    if (path.indexOf(".jar!") >= 0) {
      String[] split = path.split("\\.jar!");
//      System.out.println(split[0]);
//      System.out.println(split[1]);
      int posb = split[0].lastIndexOf("/");
      int posa = split[0].indexOf("file:/");
//      path = split[0].substring(posa + 6, posb) + split[1];
      buf.append(split[0].substring(posa + 6, posb));
      buf.append(split[1]);
//      System.out.println("整形后的path：" + path);
    } else {
      buf.append(path);
    }
    return buf.toString();
  }
}
