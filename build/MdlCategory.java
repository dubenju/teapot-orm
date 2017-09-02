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

import org.teapot.db.orm.IKeyValue;

import java.io.Serializable;

/**
 * 表category的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:57.446 +0900自动生成的。
 */
public class MdlCategory implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:CATEGORY. */
  public static final String CATEGORY = "CATEGORY";
  /** 字段：CATEGORY_ID. */
  public static final String CATEGORY_ID = "CATEGORY.CATEGORY_ID";
  /** 字段：CATEGORY_NAME. */
  public static final String CATEGORY_NAME = "CATEGORY.CATEGORY_NAME";
  /** 字段：CATEGORY_ORDER. */
  public static final String CATEGORY_ORDER = "CATEGORY.CATEGORY_ORDER";
  /** 字段：CREATE_DATE. */
  public static final String CREATE_DATE = "CATEGORY.CREATE_DATE";
  /** 字段：CREATE_TIME. */
  public static final String CREATE_TIME = "CATEGORY.CREATE_TIME";
  /** 字段：UPDATE_DATE. */
  public static final String UPDATE_DATE = "CATEGORY.UPDATE_DATE";
  /** 字段：UPDATE_TIME. */
  public static final String UPDATE_TIME = "CATEGORY.UPDATE_TIME";
  /** 字段：UPDATE_USER_ID. */
  public static final String UPDATE_USER_ID = "CATEGORY.UPDATE_USER_ID";
  /** 字段：UPDATE_SCREEN_ID. */
  public static final String UPDATE_SCREEN_ID = "CATEGORY.UPDATE_SCREEN_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlCategory.CATEGORY_ID,
    MdlCategory.CATEGORY_NAME,
    MdlCategory.CATEGORY_ORDER,
    MdlCategory.CREATE_DATE,
    MdlCategory.CREATE_TIME,
    MdlCategory.UPDATE_DATE,
    MdlCategory.UPDATE_TIME,
    MdlCategory.UPDATE_USER_ID,
    MdlCategory.UPDATE_SCREEN_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlCategory.CATEGORY_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlCategory.CATEGORY;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String categoryId;
  private java.lang.String categoryName;
  private java.lang.String categoryOrder;
  private java.lang.String createDate;
  private java.lang.String createTime;
  private java.lang.String updateDate;
  private java.lang.String updateTime;
  private java.lang.String updateUserId;
  private java.lang.String updateScreenId;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlCategory() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性categoryId的值.
   * @return categoryId的值。
   */
  public java.lang.String getCategoryId() {
    return this.categoryId;
  }
  /**
   * 设置属性categoryId的值.
   * @param value categoryId的值。
   */
  public void setCategoryId(java.lang.String value) {
    this.categoryId = value;
  }
  /**
   * 返回属性categoryName的值.
   * @return categoryName的值。
   */
  public java.lang.String getCategoryName() {
    return this.categoryName;
  }
  /**
   * 设置属性categoryName的值.
   * @param value categoryName的值。
   */
  public void setCategoryName(java.lang.String value) {
    this.categoryName = value;
  }
  /**
   * 返回属性categoryOrder的值.
   * @return categoryOrder的值。
   */
  public java.lang.String getCategoryOrder() {
    return this.categoryOrder;
  }
  /**
   * 设置属性categoryOrder的值.
   * @param value categoryOrder的值。
   */
  public void setCategoryOrder(java.lang.String value) {
    this.categoryOrder = value;
  }
  /**
   * 返回属性createDate的值.
   * @return createDate的值。
   */
  public java.lang.String getCreateDate() {
    return this.createDate;
  }
  /**
   * 设置属性createDate的值.
   * @param value createDate的值。
   */
  public void setCreateDate(java.lang.String value) {
    this.createDate = value;
  }
  /**
   * 返回属性createTime的值.
   * @return createTime的值。
   */
  public java.lang.String getCreateTime() {
    return this.createTime;
  }
  /**
   * 设置属性createTime的值.
   * @param value createTime的值。
   */
  public void setCreateTime(java.lang.String value) {
    this.createTime = value;
  }
  /**
   * 返回属性updateDate的值.
   * @return updateDate的值。
   */
  public java.lang.String getUpdateDate() {
    return this.updateDate;
  }
  /**
   * 设置属性updateDate的值.
   * @param value updateDate的值。
   */
  public void setUpdateDate(java.lang.String value) {
    this.updateDate = value;
  }
  /**
   * 返回属性updateTime的值.
   * @return updateTime的值。
   */
  public java.lang.String getUpdateTime() {
    return this.updateTime;
  }
  /**
   * 设置属性updateTime的值.
   * @param value updateTime的值。
   */
  public void setUpdateTime(java.lang.String value) {
    this.updateTime = value;
  }
  /**
   * 返回属性updateUserId的值.
   * @return updateUserId的值。
   */
  public java.lang.String getUpdateUserId() {
    return this.updateUserId;
  }
  /**
   * 设置属性updateUserId的值.
   * @param value updateUserId的值。
   */
  public void setUpdateUserId(java.lang.String value) {
    this.updateUserId = value;
  }
  /**
   * 返回属性updateScreenId的值.
   * @return updateScreenId的值。
   */
  public java.lang.String getUpdateScreenId() {
    return this.updateScreenId;
  }
  /**
   * 设置属性updateScreenId的值.
   * @param value updateScreenId的值。
   */
  public void setUpdateScreenId(java.lang.String value) {
    this.updateScreenId = value;
  }

  /**
   * 返回MdlCategory的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getCategoryId());
    buf.append(",");
    buf.append(this.getCategoryName());
    buf.append(",");
    buf.append(this.getCategoryOrder());
    buf.append(",");
    buf.append(this.getCreateDate());
    buf.append(",");
    buf.append(this.getCreateTime());
    buf.append(",");
    buf.append(this.getUpdateDate());
    buf.append(",");
    buf.append(this.getUpdateTime());
    buf.append(",");
    buf.append(this.getUpdateUserId());
    buf.append(",");
    buf.append(this.getUpdateScreenId());

    return buf.toString();
  }

  /**
   * 通过键名获取值.
   * 当指定的键名不存在的时候，返回null。
   * @return Object 对应键名值。
   */
  @Override
  public Object getValueByKey(String key) {
    Object ret = null;
    if (MdlCategory.CATEGORY_ID.equals(key)) {
      ret = this.getCategoryId();
    }
    if (MdlCategory.CATEGORY_NAME.equals(key)) {
      ret = this.getCategoryName();
    }
    if (MdlCategory.CATEGORY_ORDER.equals(key)) {
      ret = this.getCategoryOrder();
    }
    if (MdlCategory.CREATE_DATE.equals(key)) {
      ret = this.getCreateDate();
    }
    if (MdlCategory.CREATE_TIME.equals(key)) {
      ret = this.getCreateTime();
    }
    if (MdlCategory.UPDATE_DATE.equals(key)) {
      ret = this.getUpdateDate();
    }
    if (MdlCategory.UPDATE_TIME.equals(key)) {
      ret = this.getUpdateTime();
    }
    if (MdlCategory.UPDATE_USER_ID.equals(key)) {
      ret = this.getUpdateUserId();
    }
    if (MdlCategory.UPDATE_SCREEN_ID.equals(key)) {
      ret = this.getUpdateScreenId();
    }
    return ret;
  }

  /**
   * 通过键名设置值.
   * 当指定的键名不存在的时候，不作任何改动。
   * @param key 键名。
   * @param value 对应键名值。
   */
  @Override
  public void setValueByKey(String key, Object value) {
    if (MdlCategory.CATEGORY_ID.equals(key)) {
      this.setCategoryId((java.lang.String) value);
    }
    if (MdlCategory.CATEGORY_NAME.equals(key)) {
      this.setCategoryName((java.lang.String) value);
    }
    if (MdlCategory.CATEGORY_ORDER.equals(key)) {
      this.setCategoryOrder((java.lang.String) value);
    }
    if (MdlCategory.CREATE_DATE.equals(key)) {
      this.setCreateDate((java.lang.String) value);
    }
    if (MdlCategory.CREATE_TIME.equals(key)) {
      this.setCreateTime((java.lang.String) value);
    }
    if (MdlCategory.UPDATE_DATE.equals(key)) {
      this.setUpdateDate((java.lang.String) value);
    }
    if (MdlCategory.UPDATE_TIME.equals(key)) {
      this.setUpdateTime((java.lang.String) value);
    }
    if (MdlCategory.UPDATE_USER_ID.equals(key)) {
      this.setUpdateUserId((java.lang.String) value);
    }
    if (MdlCategory.UPDATE_SCREEN_ID.equals(key)) {
      this.setUpdateScreenId((java.lang.String) value);
    }
  }
}
