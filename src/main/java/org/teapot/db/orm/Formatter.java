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
 * 字符串格式化类。
 * @author dubenju@126.com
 */
public enum Formatter {
  INSTANCE;

  /**
   * 把由下划线(_)连接成的变量格式化成小驼峰式命名法（lower camel case）.
   * 第一个单字以小写字母开始；第二个单字的首字母大写，例如：firstName、lastName。
   * @param str 要格式化的字符串
   * @return 格式化后的结果
   */
  public String fmtVar(String str) {
    if (str == null) {
      return str;
    }
    String[] aryu = str.toUpperCase().split("_");
    String[] aryl = str.toLowerCase().split("_");
    StringBuffer buf = new StringBuffer();
    if (aryl.length > 0) {
      buf.append(aryl[0]);
      for (int idx = 1; idx < aryu.length; idx ++) {
        if (aryu[idx].length() > 0) {
          buf.append(aryu[idx].substring(0,  1));
          buf.append(aryl[idx].substring(1));
        }
      }
    }
    return buf.toString();
  }

  /**
   * 把由下划线(_)连接成的变量格式化成大驼峰式命名法（upper camel case）.
   * 每一个单字的首字母都采用大写字母，例如：FirstName、LastName、CamelCase，也被称为Pascal命名法。
   * @param str 要格式化的字符串
   * @return 格式化后的结果
   */
  public String fmtFun(String str) {
    if (str == null) {
      return str;
    }
    String[] aryu = str.toUpperCase().split("_");
    String[] aryl = str.toLowerCase().split("_");
    StringBuffer buf = new StringBuffer();
    for (int idx = 0; idx < aryu.length; idx ++) {
      if (aryu[idx].length() > 0) {
        buf.append(aryu[idx].substring(0,  1));
        buf.append(aryl[idx].substring(1));
      }
    }

    return buf.toString();
  }

  /**
   * 用填充位的字符串把要格式化的字符串填充成指定长度的字符串.
   * @param in 要格式化的字符串
   * @param ch 填充位的字符串
   * @param len 格式化后的字符串长度
   * @return 格式化后的结果
   */
  public String fmt(String in, String ch, int len) {
    if (ch == null || ch.length() <= 0) {
      return in;
    }
    int length = 0;
    if (in != null) {
      length = in.length();
    }
    int max = len - length;
    StringBuffer buf = new StringBuffer();
    if (max > 0) {
      while (max > 0) {
        buf.append(ch);
        max --;
      }
    }
    if (in != null) {
      buf.append(in);
    }
    return buf.toString();
  }

  /**
   * 把字符串格式化成大写的.
   * @param str 要格式化的字符串
   * @return 格式化后的结果
   */
  public String upper(String str) {
    if (str == null) {
      return str;
    }
    return str.toUpperCase();
  }

  /**
   * 把字符串格式化成小写的.
   * @param str 要格式化的字符串
   * @return 格式化后的结果
   */
  public String lower(String str) {
    if (str == null) {
      return str;
    }
    return str.toLowerCase();
  }
}
