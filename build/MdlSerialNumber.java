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
 * 表serial_number的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:57.961 +0900自动生成的。
 */
public class MdlSerialNumber implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:SERIAL_NUMBER. */
  public static final String SERIAL_NUMBER = "SERIAL_NUMBER";
  /** 字段：KEY1. */
  public static final String KEY1 = "SERIAL_NUMBER.KEY1";
  /** 字段：KEY2. */
  public static final String KEY2 = "SERIAL_NUMBER.KEY2";
  /** 字段：KEY3. */
  public static final String KEY3 = "SERIAL_NUMBER.KEY3";
  /** 字段：CURRENT_VALUE. */
  public static final String CURRENT_VALUE = "SERIAL_NUMBER.CURRENT_VALUE";
  /** 字段：STEP_VALUE. */
  public static final String STEP_VALUE = "SERIAL_NUMBER.STEP_VALUE";
  /** 字段：MAX_VALUE. */
  public static final String MAX_VALUE = "SERIAL_NUMBER.MAX_VALUE";
  /** 字段：CREATE_DATE. */
  public static final String CREATE_DATE = "SERIAL_NUMBER.CREATE_DATE";
  /** 字段：CREATE_TIME. */
  public static final String CREATE_TIME = "SERIAL_NUMBER.CREATE_TIME";
  /** 字段：UPDATE_DATE. */
  public static final String UPDATE_DATE = "SERIAL_NUMBER.UPDATE_DATE";
  /** 字段：UPDATE_TIME. */
  public static final String UPDATE_TIME = "SERIAL_NUMBER.UPDATE_TIME";
  /** 字段：UPDATE_USER_ID. */
  public static final String UPDATE_USER_ID = "SERIAL_NUMBER.UPDATE_USER_ID";
  /** 字段：UPDATE_SCREEN_ID. */
  public static final String UPDATE_SCREEN_ID = "SERIAL_NUMBER.UPDATE_SCREEN_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlSerialNumber.KEY1,
    MdlSerialNumber.KEY2,
    MdlSerialNumber.KEY3,
    MdlSerialNumber.CURRENT_VALUE,
    MdlSerialNumber.STEP_VALUE,
    MdlSerialNumber.MAX_VALUE,
    MdlSerialNumber.CREATE_DATE,
    MdlSerialNumber.CREATE_TIME,
    MdlSerialNumber.UPDATE_DATE,
    MdlSerialNumber.UPDATE_TIME,
    MdlSerialNumber.UPDATE_USER_ID,
    MdlSerialNumber.UPDATE_SCREEN_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlSerialNumber.KEY1,
    MdlSerialNumber.KEY2,
    MdlSerialNumber.KEY3
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlSerialNumber.SERIAL_NUMBER;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String key1;
  private java.lang.String key2;
  private java.lang.String key3;
  private java.math.BigDecimal currentValue;
  private java.math.BigDecimal stepValue;
  private java.math.BigDecimal maxValue;
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
  public MdlSerialNumber() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性key1的值.
   * @return key1的值。
   */
  public java.lang.String getKey1() {
    return this.key1;
  }
  /**
   * 设置属性key1的值.
   * @param value key1的值。
   */
  public void setKey1(java.lang.String value) {
    this.key1 = value;
  }
  /**
   * 返回属性key2的值.
   * @return key2的值。
   */
  public java.lang.String getKey2() {
    return this.key2;
  }
  /**
   * 设置属性key2的值.
   * @param value key2的值。
   */
  public void setKey2(java.lang.String value) {
    this.key2 = value;
  }
  /**
   * 返回属性key3的值.
   * @return key3的值。
   */
  public java.lang.String getKey3() {
    return this.key3;
  }
  /**
   * 设置属性key3的值.
   * @param value key3的值。
   */
  public void setKey3(java.lang.String value) {
    this.key3 = value;
  }
  /**
   * 返回属性currentValue的值.
   * @return currentValue的值。
   */
  public java.math.BigDecimal getCurrentValue() {
    return this.currentValue;
  }
  /**
   * 设置属性currentValue的值.
   * @param value currentValue的值。
   */
  public void setCurrentValue(java.math.BigDecimal value) {
    this.currentValue = value;
  }
  /**
   * 返回属性stepValue的值.
   * @return stepValue的值。
   */
  public java.math.BigDecimal getStepValue() {
    return this.stepValue;
  }
  /**
   * 设置属性stepValue的值.
   * @param value stepValue的值。
   */
  public void setStepValue(java.math.BigDecimal value) {
    this.stepValue = value;
  }
  /**
   * 返回属性maxValue的值.
   * @return maxValue的值。
   */
  public java.math.BigDecimal getMaxValue() {
    return this.maxValue;
  }
  /**
   * 设置属性maxValue的值.
   * @param value maxValue的值。
   */
  public void setMaxValue(java.math.BigDecimal value) {
    this.maxValue = value;
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
   * 返回MdlSerialNumber的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getKey1());
    buf.append(",");
    buf.append(this.getKey2());
    buf.append(",");
    buf.append(this.getKey3());
    buf.append(",");
    buf.append(this.getCurrentValue());
    buf.append(",");
    buf.append(this.getStepValue());
    buf.append(",");
    buf.append(this.getMaxValue());
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
    if (MdlSerialNumber.KEY1.equals(key)) {
      ret = this.getKey1();
    }
    if (MdlSerialNumber.KEY2.equals(key)) {
      ret = this.getKey2();
    }
    if (MdlSerialNumber.KEY3.equals(key)) {
      ret = this.getKey3();
    }
    if (MdlSerialNumber.CURRENT_VALUE.equals(key)) {
      ret = this.getCurrentValue();
    }
    if (MdlSerialNumber.STEP_VALUE.equals(key)) {
      ret = this.getStepValue();
    }
    if (MdlSerialNumber.MAX_VALUE.equals(key)) {
      ret = this.getMaxValue();
    }
    if (MdlSerialNumber.CREATE_DATE.equals(key)) {
      ret = this.getCreateDate();
    }
    if (MdlSerialNumber.CREATE_TIME.equals(key)) {
      ret = this.getCreateTime();
    }
    if (MdlSerialNumber.UPDATE_DATE.equals(key)) {
      ret = this.getUpdateDate();
    }
    if (MdlSerialNumber.UPDATE_TIME.equals(key)) {
      ret = this.getUpdateTime();
    }
    if (MdlSerialNumber.UPDATE_USER_ID.equals(key)) {
      ret = this.getUpdateUserId();
    }
    if (MdlSerialNumber.UPDATE_SCREEN_ID.equals(key)) {
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
    if (MdlSerialNumber.KEY1.equals(key)) {
      this.setKey1((java.lang.String) value);
    }
    if (MdlSerialNumber.KEY2.equals(key)) {
      this.setKey2((java.lang.String) value);
    }
    if (MdlSerialNumber.KEY3.equals(key)) {
      this.setKey3((java.lang.String) value);
    }
    if (MdlSerialNumber.CURRENT_VALUE.equals(key)) {
      this.setCurrentValue((java.math.BigDecimal) value);
    }
    if (MdlSerialNumber.STEP_VALUE.equals(key)) {
      this.setStepValue((java.math.BigDecimal) value);
    }
    if (MdlSerialNumber.MAX_VALUE.equals(key)) {
      this.setMaxValue((java.math.BigDecimal) value);
    }
    if (MdlSerialNumber.CREATE_DATE.equals(key)) {
      this.setCreateDate((java.lang.String) value);
    }
    if (MdlSerialNumber.CREATE_TIME.equals(key)) {
      this.setCreateTime((java.lang.String) value);
    }
    if (MdlSerialNumber.UPDATE_DATE.equals(key)) {
      this.setUpdateDate((java.lang.String) value);
    }
    if (MdlSerialNumber.UPDATE_TIME.equals(key)) {
      this.setUpdateTime((java.lang.String) value);
    }
    if (MdlSerialNumber.UPDATE_USER_ID.equals(key)) {
      this.setUpdateUserId((java.lang.String) value);
    }
    if (MdlSerialNumber.UPDATE_SCREEN_ID.equals(key)) {
      this.setUpdateScreenId((java.lang.String) value);
    }
  }
}
