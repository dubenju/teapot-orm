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

import org.teapot.db.orm.util.UModelConstant;

/**
 * 数据库SQL排序类。
 * @author dubenju@126.com
 */
public class OptOrder {
  private String cloumn;
  private int order;

  /**
   * 构造函数.
   * @param col 字段。
   */
  public OptOrder(String col) {
    this.cloumn = col;
    this.order = UModelConstant.SORT_ASC;
  }

  /**
   * 构造函数.
   * @param col 字段。
   * @param orde 排序。
   */
  public OptOrder(String col, int orde) {
    this.cloumn = col;
    this.order = orde;
  }

  /**
   * 获取字段.
   * @return cloumn 字段。
   */
  public String getCloumn() {
    return cloumn;
  }

  /**
   * 设置字段.
   * @param cloumn 字段。
   */
  public void setCloumn(String cloumn) {
    this.cloumn = cloumn;
  }

  /**
   * 获取排序.
   * @return order 排序。
   */
  public int getOrder() {
    return order;
  }

  /**
   * 设置排序.
   * @param order 排序。
   */
  public void setOrder(int order) {
    this.order = order;
  }
}
