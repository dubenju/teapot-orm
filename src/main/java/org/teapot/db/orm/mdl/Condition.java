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

package org.teapot.db.orm.mdl;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库SQL的条件类。
 * @author dubenju@126.com
 */
public class Condition {
  public static final String GREATER = " > ";
  public static final String LESS = " < ";
  public static final String EQUAL = " = ";
  public static final String GREATER_EQUAL = " >= ";
  public static final String LESS_EQUAL = " <= ";
  public static final String NOT_EQUAL = " != ";
  public static final String NOT_EQUAL2 = " <> ";
  public static final String LIKE = " LIKE ";
  public static final String IN = " IN ";
  public static final String BETWEEN = " BETWEEN ";
  public static final String IS_NULL = " IS NULL ";
  public static final String IS_NOT_NULL = " IS NOT NULL ";
  public static final String AND = " AND ";
  public static final String OR = " OR ";
  public static final String NOT = " NOT ";

  private StringBuffer buf;
  private List<Object> values;

  /**
   * 构造函数.
   */
  public Condition() {
    this.buf = new StringBuffer();
    this.values = new ArrayList<>();
  }

  /**
   * 获取条件文中所有的值.
   * @return 条件文中所有的值。
   */
  public List<?> getValues() {
    return this.values;
  }

  /**
   * 向条件类中追加包括Where语句的条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   */
  public void addWhere(String column, String cond, Object value) {
    this.buf.append(" WHERE ");
    this.buf.append(column);
    this.buf.append(cond);
    this.buf.append(" ? ");
    this.values.add(value);
  }

  /**
   * 向条件类中追加AND条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   */
  public void addAnd(String column, String cond, Object value) {
    this.buf.append(" AND ");
    this.buf.append(column);
    this.buf.append(cond);
    this.buf.append(" ? ");
    this.values.add(value);
  }

  /**
   * 向条件类中追加OR条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   */
  public void addOr(String column, String cond, Object value) {
    this.buf.append(" OR ");
    this.buf.append(column);
    this.buf.append(cond);
    this.buf.append(" ? ");
    this.values.add(value);
  }

  /**
   * 向条件类中追加AND条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   */
  public void addNot(String column, String cond, Object value) {
    this.buf.append(" NOT ");
    this.buf.append(column);
    this.buf.append(cond);
    this.buf.append(" ? ");
    this.values.add(value);
  }

  /**
   * 向条件类中追加子条件.
   * @param cond 条件。
   */
  public void addCond(Condition cond) {
    this.buf.append(" ( ");
    this.buf.append(cond);
    this.buf.append(" ) ");
    this.values.addAll(cond.getValues());
  }

  /**
   * 返回条件的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return buf.toString();
  }
}
