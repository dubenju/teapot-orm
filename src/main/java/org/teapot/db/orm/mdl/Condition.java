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
 * where clause
 * 数据库SQL的条件类.
 * WHERE 子句
 * @author dubenju@126.com
 * @since 0.0.1
 */
public class Condition implements IClause {

  /* 01. AND, OR, NOT */
  public static final String AND = " AND ";
  public static final String OR  = " OR ";
  public static final String NOT = " NOT ";

  /* 02.Comparisons */
  public static final String GREATER = " > ";
  public static final String LESS = " < ";
  public static final String EQUAL = " = ";
  public static final String GREATER_EQUAL = " >= ";
  public static final String LESS_EQUAL = " <= ";
  public static final String NOT_EQUAL = " != ";
  public static final String NOT_EQUAL2 = " <> ";

  /* 03.IS NULL, IS NOT NULL */
  public static final String IS_NULL = " IS NULL ";
  public static final String IS_NOT_NULL = " IS NOT NULL ";

  /* 04.LIKE */
  public static final String LIKE = " LIKE ";

  /* 05.BETWEEN介于两个值之间的数据范围BETWEEN同AND一起搭配使用. */
  public static final String BETWEEN = " BETWEEN ";

  /* 06.IN */
  public static final String IN = " IN ";

  /* 07.EXISTS */
  public static final  String EXISTS = " EXISTS ";

  /*
   * Quantified comparison
   * A quantified comparison is a comparison operator (<, =, >, <=, >=, <>) with ALL or ANY or
   * SOME applied.
   * Operates on table subqueries, which can return multiple rows but must return a single column.
   * If ALL is used, the comparison must be true for all values returned by the table subquery.
   * If ANY or SOME is used, the comparison must be true for at least one value of the table
   * subquery. ANY and SOME are equivalent.
   *
   * WHERE normal_rate < ALL
   * (SELECT budget/550 FROM Groups)
   *
   * Expression
   *   ComparisonOperator
   *   {
   *     ALL |
   *     ANY |
   *     SOME
   *   }
   *   TableSubquery
   */
  private StringBuffer buf;
  private List<Object> values;

  /**
   * 构造函数.
   * @since 0.0.1
   */
  public Condition() {
    this.buf = new StringBuffer();
    this.values = new ArrayList<>();
  }

  /**
   * 获取条件文中所有的值.
   * @return 条件文中所有的值。
   * @since 0.0.1
   */
  public List<?> getValues() {
    return this.values;
  }

  private void makeBuffer(String cond, Object value) {
    if (Condition.BETWEEN.equals(cond)) {
      this.buf.append(" ? AND ? ");
      if (value instanceof Object[]) {
        this.values.add(((Object[]) value)[0]);
        this.values.add(((Object[]) value)[1]);
      }
      if (value instanceof List<?>) {
        this.values.add(((List<?>) value).get(0));
        this.values.add(((List<?>) value).get(1));
      }
    } else if (Condition.IN.equals(cond)) {
      // IN 条件时的处理
      // SELECT * FROM HOGE WHERE ID IN (?,?,?)
      if (value instanceof Object[]) {
        this.buf.append(" ( ");
        Object[] coll = (Object[]) value;
        for (int idx = 0; idx < coll.length; idx ++) {
          Object val = coll[idx];
          this.buf.append(" ? ");
          if ((idx + 1) < coll.length) {
            this.buf.append(" , ");
          }
          this.values.add(val);
        }
        this.buf.append(" ) ");
      }

      if (value instanceof List<?>) {
        this.buf.append(" (");
        List<?> coll = (List<?>) value;
        for (int idx = 0; idx <  coll.size(); idx ++) {
          Object val = coll.get(idx);
          this.buf.append(" ? ");
          if ((idx + 1) < coll.size()) {
            this.buf.append(" , ");
          }
          this.values.add(val);
        }
        this.buf.append(") ");
      }
    } else {
      if ((!Condition.IS_NULL.equals(cond)) && (!Condition.IS_NOT_NULL.equals(cond))) {
        this.buf.append(" ? ");
        this.values.add(value);
      }
    }
  }
  /**
   * 向条件类中追加包括Where语句的条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   * @since 0.0.1
   * @since 0.0.2 IN 条件修改
   */
  public Condition where(String column, String cond, Object value) {
    this.buf.append(" WHERE ");
    this.buf.append(column);
    this.buf.append(cond);
    this.makeBuffer(cond, value);
    return this;
  }

  /**
   * 向条件类中追加AND条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   * @since 0.0.1
   */
  public Condition and(String column, String cond, Object value) {
    this.buf.append(" AND ");
    this.buf.append(column);
    this.buf.append(cond);
    this.makeBuffer(cond, value);
    return this;
  }

  /**
   * 向条件类中追加OR条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   * @since 0.0.1
   */
  public Condition or(String column, String cond, Object value) {
    this.buf.append(" OR ");
    this.buf.append(column);
    this.buf.append(cond);
    this.makeBuffer(cond, value);
    return this;
  }

  /**
   * 向条件类中追加AND条件.
   * @param column 字段。
   * @param cond 关系。
   * @param value 值。
   * @since 0.0.1
   */
  public Condition not(String column, String cond, Object value) {
    this.buf.append(" NOT ");
    this.buf.append(column);
    this.buf.append(cond);
    this.makeBuffer(cond, value);
    return this;
  }

  /**
   * 向条件类中追加子条件.
   * @param cond 条件。
   * @since 0.0.1
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
   * @since 0.0.1
   */
  @Override
  public String toString() {
    return buf.toString();
  }
}
