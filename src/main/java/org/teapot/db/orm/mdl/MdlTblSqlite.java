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
 * 表TBL_SQLITE的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:18:13.069 +0900自动生成的。
 */
public class MdlTblSqlite implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_SQLITE. */
  public static final String TBL_SQLITE = "TBL_SQLITE";
  /** 字段：TEST_ID. */
  public static final String TEST_ID = "TBL_SQLITE.TEST_ID";
  /** 字段：TEST_NAME. */
  public static final String TEST_NAME = "TBL_SQLITE.TEST_NAME";
  /** 字段：TEST_BLOB. */
  public static final String TEST_BLOB = "TBL_SQLITE.TEST_BLOB";
  /** 字段：TEST_DOUBLE. */
  public static final String TEST_DOUBLE = "TBL_SQLITE.TEST_DOUBLE";
  /** 字段：TEST_FLOAT. */
  public static final String TEST_FLOAT = "TBL_SQLITE.TEST_FLOAT";
  /** 字段：TEST_TINYINT. */
  public static final String TEST_TINYINT = "TBL_SQLITE.TEST_TINYINT";
  /** 字段：TEST_INT. */
  public static final String TEST_INT = "TBL_SQLITE.TEST_INT";
  /** 字段：TEST_DECIMAL. */
  public static final String TEST_DECIMAL = "TBL_SQLITE.TEST_DECIMAL";
  /** 字段：TEST_BIGINT. */
  public static final String TEST_BIGINT = "TBL_SQLITE.TEST_BIGINT";
  /** 字段：TEST_DATETIME. */
  public static final String TEST_DATETIME = "TBL_SQLITE.TEST_DATETIME";
  /** 字段：TEST_ORDER. */
  public static final String TEST_ORDER = "TBL_SQLITE.TEST_ORDER";
  /** 字段：CREATE_DATE. */
  public static final String CREATE_DATE = "TBL_SQLITE.CREATE_DATE";
  /** 字段：CREATE_TIME. */
  public static final String CREATE_TIME = "TBL_SQLITE.CREATE_TIME";
  /** 字段：UPDATE_DATE. */
  public static final String UPDATE_DATE = "TBL_SQLITE.UPDATE_DATE";
  /** 字段：UPDATE_TIME. */
  public static final String UPDATE_TIME = "TBL_SQLITE.UPDATE_TIME";
  /** 字段：UPDATE_USER_ID. */
  public static final String UPDATE_USER_ID = "TBL_SQLITE.UPDATE_USER_ID";
  /** 字段：UPDATE_SCREEN_ID. */
  public static final String UPDATE_SCREEN_ID = "TBL_SQLITE.UPDATE_SCREEN_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblSqlite.TEST_ID,
    MdlTblSqlite.TEST_NAME,
    MdlTblSqlite.TEST_BLOB,
    MdlTblSqlite.TEST_DOUBLE,
    MdlTblSqlite.TEST_FLOAT,
    MdlTblSqlite.TEST_TINYINT,
    MdlTblSqlite.TEST_INT,
    MdlTblSqlite.TEST_DECIMAL,
    MdlTblSqlite.TEST_BIGINT,
    MdlTblSqlite.TEST_DATETIME,
    MdlTblSqlite.TEST_ORDER,
    MdlTblSqlite.CREATE_DATE,
    MdlTblSqlite.CREATE_TIME,
    MdlTblSqlite.UPDATE_DATE,
    MdlTblSqlite.UPDATE_TIME,
    MdlTblSqlite.UPDATE_USER_ID,
    MdlTblSqlite.UPDATE_SCREEN_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblSqlite.TEST_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblSqlite.TBL_SQLITE;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String testId;
  private java.lang.String testName;
  private byte[] testBlob;
  private java.lang.Double testDouble;
  private java.lang.Double testFloat;
  private java.lang.Integer testTinyint;
  private java.lang.Long testInt;
  private java.lang.Double testDecimal;
  private java.lang.Long testBigint;
  private java.lang.Long testDatetime;
  private java.lang.String testOrder;
  private java.lang.Long createDate;
  private java.lang.Long createTime;
  private java.lang.Long updateDate;
  private java.lang.Long updateTime;
  private java.lang.String updateUserId;
  private java.lang.String updateScreenId;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlTblSqlite() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性testId的值.
   * @return testId的值。
   */
  public java.lang.String getTestId() {
    return this.testId;
  }
  /**
   * 设置属性testId的值.
   * @param value testId的值。
   */
  public void setTestId(java.lang.String value) {
    this.testId = value;
  }
  /**
   * 返回属性testName的值.
   * @return testName的值。
   */
  public java.lang.String getTestName() {
    return this.testName;
  }
  /**
   * 设置属性testName的值.
   * @param value testName的值。
   */
  public void setTestName(java.lang.String value) {
    this.testName = value;
  }
  /**
   * 返回属性testBlob的值.
   * @return testBlob的值。
   */
  public byte[] getTestBlob() {
    return this.testBlob;
  }
  /**
   * 设置属性testBlob的值.
   * @param value testBlob的值。
   */
  public void setTestBlob(byte[] value) {
    this.testBlob = value;
  }
  /**
   * 返回属性testDouble的值.
   * @return testDouble的值。
   */
  public java.lang.Double getTestDouble() {
    return this.testDouble;
  }
  /**
   * 设置属性testDouble的值.
   * @param value testDouble的值。
   */
  public void setTestDouble(java.lang.Double value) {
    this.testDouble = value;
  }
  /**
   * 返回属性testFloat的值.
   * @return testFloat的值。
   */
  public java.lang.Double getTestFloat() {
    return this.testFloat;
  }
  /**
   * 设置属性testFloat的值.
   * @param value testFloat的值。
   */
  public void setTestFloat(java.lang.Double value) {
    this.testFloat = value;
  }
  /**
   * 返回属性testTinyint的值.
   * @return testTinyint的值。
   */
  public java.lang.Integer getTestTinyint() {
    return this.testTinyint;
  }
  /**
   * 设置属性testTinyint的值.
   * @param value testTinyint的值。
   */
  public void setTestTinyint(java.lang.Integer value) {
    this.testTinyint = value;
  }
  /**
   * 返回属性testInt的值.
   * @return testInt的值。
   */
  public java.lang.Long getTestInt() {
    return this.testInt;
  }
  /**
   * 设置属性testInt的值.
   * @param value testInt的值。
   */
  public void setTestInt(java.lang.Long value) {
    this.testInt = value;
  }
  /**
   * 返回属性testDecimal的值.
   * @return testDecimal的值。
   */
  public java.lang.Double getTestDecimal() {
    return this.testDecimal;
  }
  /**
   * 设置属性testDecimal的值.
   * @param value testDecimal的值。
   */
  public void setTestDecimal(java.lang.Double value) {
    this.testDecimal = value;
  }
  /**
   * 返回属性testBigint的值.
   * @return testBigint的值。
   */
  public java.lang.Long getTestBigint() {
    return this.testBigint;
  }
  /**
   * 设置属性testBigint的值.
   * @param value testBigint的值。
   */
  public void setTestBigint(java.lang.Long value) {
    this.testBigint = value;
  }
  /**
   * 返回属性testDatetime的值.
   * @return testDatetime的值。
   */
  public java.lang.Long getTestDatetime() {
    return this.testDatetime;
  }
  /**
   * 设置属性testDatetime的值.
   * @param value testDatetime的值。
   */
  public void setTestDatetime(java.lang.Long value) {
    this.testDatetime = value;
  }
  /**
   * 返回属性testOrder的值.
   * @return testOrder的值。
   */
  public java.lang.String getTestOrder() {
    return this.testOrder;
  }
  /**
   * 设置属性testOrder的值.
   * @param value testOrder的值。
   */
  public void setTestOrder(java.lang.String value) {
    this.testOrder = value;
  }
  /**
   * 返回属性createDate的值.
   * @return createDate的值。
   */
  public java.lang.Long getCreateDate() {
    return this.createDate;
  }
  /**
   * 设置属性createDate的值.
   * @param value createDate的值。
   */
  public void setCreateDate(java.lang.Long value) {
    this.createDate = value;
  }
  /**
   * 返回属性createTime的值.
   * @return createTime的值。
   */
  public java.lang.Long getCreateTime() {
    return this.createTime;
  }
  /**
   * 设置属性createTime的值.
   * @param value createTime的值。
   */
  public void setCreateTime(java.lang.Long value) {
    this.createTime = value;
  }
  /**
   * 返回属性updateDate的值.
   * @return updateDate的值。
   */
  public java.lang.Long getUpdateDate() {
    return this.updateDate;
  }
  /**
   * 设置属性updateDate的值.
   * @param value updateDate的值。
   */
  public void setUpdateDate(java.lang.Long value) {
    this.updateDate = value;
  }
  /**
   * 返回属性updateTime的值.
   * @return updateTime的值。
   */
  public java.lang.Long getUpdateTime() {
    return this.updateTime;
  }
  /**
   * 设置属性updateTime的值.
   * @param value updateTime的值。
   */
  public void setUpdateTime(java.lang.Long value) {
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
   * 返回MdlTblSqlite的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getTestId());
    buf.append(",");
    buf.append(this.getTestName());
    buf.append(",");
    buf.append(this.getTestBlob());
    buf.append(",");
    buf.append(this.getTestDouble());
    buf.append(",");
    buf.append(this.getTestFloat());
    buf.append(",");
    buf.append(this.getTestTinyint());
    buf.append(",");
    buf.append(this.getTestInt());
    buf.append(",");
    buf.append(this.getTestDecimal());
    buf.append(",");
    buf.append(this.getTestBigint());
    buf.append(",");
    buf.append(this.getTestDatetime());
    buf.append(",");
    buf.append(this.getTestOrder());
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
  public Object get(String key) {
    Object ret = null;
    if (MdlTblSqlite.TEST_ID.equals(key)) {
      ret = this.getTestId();
    }
    if (MdlTblSqlite.TEST_NAME.equals(key)) {
      ret = this.getTestName();
    }
    if (MdlTblSqlite.TEST_BLOB.equals(key)) {
      ret = this.getTestBlob();
    }
    if (MdlTblSqlite.TEST_DOUBLE.equals(key)) {
      ret = this.getTestDouble();
    }
    if (MdlTblSqlite.TEST_FLOAT.equals(key)) {
      ret = this.getTestFloat();
    }
    if (MdlTblSqlite.TEST_TINYINT.equals(key)) {
      ret = this.getTestTinyint();
    }
    if (MdlTblSqlite.TEST_INT.equals(key)) {
      ret = this.getTestInt();
    }
    if (MdlTblSqlite.TEST_DECIMAL.equals(key)) {
      ret = this.getTestDecimal();
    }
    if (MdlTblSqlite.TEST_BIGINT.equals(key)) {
      ret = this.getTestBigint();
    }
    if (MdlTblSqlite.TEST_DATETIME.equals(key)) {
      ret = this.getTestDatetime();
    }
    if (MdlTblSqlite.TEST_ORDER.equals(key)) {
      ret = this.getTestOrder();
    }
    if (MdlTblSqlite.CREATE_DATE.equals(key)) {
      ret = this.getCreateDate();
    }
    if (MdlTblSqlite.CREATE_TIME.equals(key)) {
      ret = this.getCreateTime();
    }
    if (MdlTblSqlite.UPDATE_DATE.equals(key)) {
      ret = this.getUpdateDate();
    }
    if (MdlTblSqlite.UPDATE_TIME.equals(key)) {
      ret = this.getUpdateTime();
    }
    if (MdlTblSqlite.UPDATE_USER_ID.equals(key)) {
      ret = this.getUpdateUserId();
    }
    if (MdlTblSqlite.UPDATE_SCREEN_ID.equals(key)) {
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
  public IKeyValue set(String key, Object value) {
    if (MdlTblSqlite.TEST_ID.equals(key)) {
      this.setTestId((java.lang.String) value);
    }
    if (MdlTblSqlite.TEST_NAME.equals(key)) {
      this.setTestName((java.lang.String) value);
    }
    if (MdlTblSqlite.TEST_BLOB.equals(key)) {
      this.setTestBlob((byte[]) value);
    }
    if (MdlTblSqlite.TEST_DOUBLE.equals(key)) {
      this.setTestDouble((java.lang.Double) value);
    }
    if (MdlTblSqlite.TEST_FLOAT.equals(key)) {
      this.setTestFloat((java.lang.Double) value);
    }
    if (MdlTblSqlite.TEST_TINYINT.equals(key)) {
      this.setTestTinyint((java.lang.Integer) value);
    }
    if (MdlTblSqlite.TEST_INT.equals(key)) {
      this.setTestInt((java.lang.Long) value);
    }
    if (MdlTblSqlite.TEST_DECIMAL.equals(key)) {
      this.setTestDecimal((java.lang.Double) value);
    }
    if (MdlTblSqlite.TEST_BIGINT.equals(key)) {
      this.setTestBigint((java.lang.Long) value);
    }
    if (MdlTblSqlite.TEST_DATETIME.equals(key)) {
      this.setTestDatetime((java.lang.Long) value);
    }
    if (MdlTblSqlite.TEST_ORDER.equals(key)) {
      this.setTestOrder((java.lang.String) value);
    }
    if (MdlTblSqlite.CREATE_DATE.equals(key)) {
      this.setCreateDate((java.lang.Long) value);
    }
    if (MdlTblSqlite.CREATE_TIME.equals(key)) {
      this.setCreateTime((java.lang.Long) value);
    }
    if (MdlTblSqlite.UPDATE_DATE.equals(key)) {
      this.setUpdateDate((java.lang.Long) value);
    }
    if (MdlTblSqlite.UPDATE_TIME.equals(key)) {
      this.setUpdateTime((java.lang.Long) value);
    }
    if (MdlTblSqlite.UPDATE_USER_ID.equals(key)) {
      this.setUpdateUserId((java.lang.String) value);
    }
    if (MdlTblSqlite.UPDATE_SCREEN_ID.equals(key)) {
      this.setUpdateScreenId((java.lang.String) value);
    }
    return this;
  }
}
