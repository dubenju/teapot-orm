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
 * 表PRIMARY_KEY的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:52.685 +0900自动生成的。
 */
public class MdlPrimaryKey implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:PRIMARY_KEY. */
  public static final String PRIMARY_KEY = "PRIMARY_KEY";
  /** 字段：TABLE_CAT. */
  public static final String TABLE_CAT = "PRIMARY_KEY.TABLE_CAT";
  /** 字段：TABLE_SCHEM. */
  public static final String TABLE_SCHEM = "PRIMARY_KEY.TABLE_SCHEM";
  /** 字段：TABLE_NAME. */
  public static final String TABLE_NAME = "PRIMARY_KEY.TABLE_NAME";
  /** 字段：COLUMN_NAME. */
  public static final String COLUMN_NAME = "PRIMARY_KEY.COLUMN_NAME";
  /** 字段：KEY_SEQ. */
  public static final String KEY_SEQ = "PRIMARY_KEY.KEY_SEQ";
  /** 字段：PK_NAME. */
  public static final String PK_NAME = "PRIMARY_KEY.PK_NAME";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlPrimaryKey.TABLE_CAT,
    MdlPrimaryKey.TABLE_SCHEM,
    MdlPrimaryKey.TABLE_NAME,
    MdlPrimaryKey.COLUMN_NAME,
    MdlPrimaryKey.KEY_SEQ,
    MdlPrimaryKey.PK_NAME
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlPrimaryKey.PRIMARY_KEY;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String tableCat;
  private java.lang.String tableSchem;
  private java.lang.String tableName;
  private java.lang.String columnName;
  private java.lang.String keySeq;
  private java.lang.String pkName;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlPrimaryKey() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性tableCat的值.
   * @return tableCat的值。
   */
  public java.lang.String getTableCat() {
    return this.tableCat;
  }
  /**
   * 设置属性tableCat的值.
   * @param value tableCat的值。
   */
  public void setTableCat(java.lang.String value) {
    this.tableCat = value;
  }
  /**
   * 返回属性tableSchem的值.
   * @return tableSchem的值。
   */
  public java.lang.String getTableSchem() {
    return this.tableSchem;
  }
  /**
   * 设置属性tableSchem的值.
   * @param value tableSchem的值。
   */
  public void setTableSchem(java.lang.String value) {
    this.tableSchem = value;
  }
  /**
   * 返回属性tableName的值.
   * @return tableName的值。
   */
  public java.lang.String getTableName() {
    return this.tableName;
  }
  /**
   * 设置属性tableName的值.
   * @param value tableName的值。
   */
  public void setTableName(java.lang.String value) {
    this.tableName = value;
  }
  /**
   * 返回属性columnName的值.
   * @return columnName的值。
   */
  public java.lang.String getColumnName() {
    return this.columnName;
  }
  /**
   * 设置属性columnName的值.
   * @param value columnName的值。
   */
  public void setColumnName(java.lang.String value) {
    this.columnName = value;
  }
  /**
   * 返回属性keySeq的值.
   * @return keySeq的值。
   */
  public java.lang.String getKeySeq() {
    return this.keySeq;
  }
  /**
   * 设置属性keySeq的值.
   * @param value keySeq的值。
   */
  public void setKeySeq(java.lang.String value) {
    this.keySeq = value;
  }
  /**
   * 返回属性pkName的值.
   * @return pkName的值。
   */
  public java.lang.String getPkName() {
    return this.pkName;
  }
  /**
   * 设置属性pkName的值.
   * @param value pkName的值。
   */
  public void setPkName(java.lang.String value) {
    this.pkName = value;
  }

  /**
   * 返回MdlPrimaryKey的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getTableCat());
    buf.append(",");
    buf.append(this.getTableSchem());
    buf.append(",");
    buf.append(this.getTableName());
    buf.append(",");
    buf.append(this.getColumnName());
    buf.append(",");
    buf.append(this.getKeySeq());
    buf.append(",");
    buf.append(this.getPkName());

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
    if (MdlPrimaryKey.TABLE_CAT.equals(key)) {
      ret = this.getTableCat();
    }
    if (MdlPrimaryKey.TABLE_SCHEM.equals(key)) {
      ret = this.getTableSchem();
    }
    if (MdlPrimaryKey.TABLE_NAME.equals(key)) {
      ret = this.getTableName();
    }
    if (MdlPrimaryKey.COLUMN_NAME.equals(key)) {
      ret = this.getColumnName();
    }
    if (MdlPrimaryKey.KEY_SEQ.equals(key)) {
      ret = this.getKeySeq();
    }
    if (MdlPrimaryKey.PK_NAME.equals(key)) {
      ret = this.getPkName();
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
    if (MdlPrimaryKey.TABLE_CAT.equals(key)) {
      this.setTableCat((java.lang.String) value);
    }
    if (MdlPrimaryKey.TABLE_SCHEM.equals(key)) {
      this.setTableSchem((java.lang.String) value);
    }
    if (MdlPrimaryKey.TABLE_NAME.equals(key)) {
      this.setTableName((java.lang.String) value);
    }
    if (MdlPrimaryKey.COLUMN_NAME.equals(key)) {
      this.setColumnName((java.lang.String) value);
    }
    if (MdlPrimaryKey.KEY_SEQ.equals(key)) {
      this.setKeySeq((java.lang.String) value);
    }
    if (MdlPrimaryKey.PK_NAME.equals(key)) {
      this.setPkName((java.lang.String) value);
    }
  }
}
