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
 * 表COLUMN的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:51.933 +0900自动生成的。
 */
public class MdlColumn implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:COLUMN. */
  public static final String COLUMN = "COLUMN";
  /** 字段：TABLE_CAT. */
  public static final String TABLE_CAT = "COLUMN.TABLE_CAT";
  /** 字段：TABLE_SCHEM. */
  public static final String TABLE_SCHEM = "COLUMN.TABLE_SCHEM";
  /** 字段：TABLE_NAME. */
  public static final String TABLE_NAME = "COLUMN.TABLE_NAME";
  /** 字段：COLUMN_NAME. */
  public static final String COLUMN_NAME = "COLUMN.COLUMN_NAME";
  /** 字段：DATA_TYPE. */
  public static final String DATA_TYPE = "COLUMN.DATA_TYPE";
  /** 字段：TYPE_NAME. */
  public static final String TYPE_NAME = "COLUMN.TYPE_NAME";
  /** 字段：TYPE_NAME_JAVA. */
  public static final String TYPE_NAME_JAVA = "COLUMN.TYPE_NAME_JAVA";
  /** 字段：COLUMN_SIZE. */
  public static final String COLUMN_SIZE = "COLUMN.COLUMN_SIZE";
  /** 字段：BUFFER_LENGTH. */
  public static final String BUFFER_LENGTH = "COLUMN.BUFFER_LENGTH";
  /** 字段：DECIMAL_DIGITS. */
  public static final String DECIMAL_DIGITS = "COLUMN.DECIMAL_DIGITS";
  /** 字段：NUM_PREC_RADIX. */
  public static final String NUM_PREC_RADIX = "COLUMN.NUM_PREC_RADIX";
  /** 字段：NULLABLE. */
  public static final String NULLABLE = "COLUMN.NULLABLE";
  /** 字段：REMARKS. */
  public static final String REMARKS = "COLUMN.REMARKS";
  /** 字段：COLUMN_DEF. */
  public static final String COLUMN_DEF = "COLUMN.COLUMN_DEF";
  /** 字段：SQL_DATA_TYPE. */
  public static final String SQL_DATA_TYPE = "COLUMN.SQL_DATA_TYPE";
  /** 字段：SQL_DATETIME_SUB. */
  public static final String SQL_DATETIME_SUB = "COLUMN.SQL_DATETIME_SUB";
  /** 字段：CHAR_OCTET_LENGTH. */
  public static final String CHAR_OCTET_LENGTH = "COLUMN.CHAR_OCTET_LENGTH";
  /** 字段：ORDINAL_POSITION. */
  public static final String ORDINAL_POSITION = "COLUMN.ORDINAL_POSITION";
  /** 字段：IS_NULLABLE. */
  public static final String IS_NULLABLE = "COLUMN.IS_NULLABLE";
  /** 字段：SCOPE_CATALOG. */
  public static final String SCOPE_CATALOG = "COLUMN.SCOPE_CATALOG";
  /** 字段：SCOPE_SCHEMA. */
  public static final String SCOPE_SCHEMA = "COLUMN.SCOPE_SCHEMA";
  /** 字段：SCOPE_TABLE. */
  public static final String SCOPE_TABLE = "COLUMN.SCOPE_TABLE";
  /** 字段：SOURCE_DATA_TYPE. */
  public static final String SOURCE_DATA_TYPE = "COLUMN.SOURCE_DATA_TYPE";
  /** 字段：IS_AUTOINCREMENT. */
  public static final String IS_AUTOINCREMENT = "COLUMN.IS_AUTOINCREMENT";
  /** 字段：IS_GENERATEDCOLUMN. */
  public static final String IS_GENERATEDCOLUMN = "COLUMN.IS_GENERATEDCOLUMN";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlColumn.TABLE_CAT,
    MdlColumn.TABLE_SCHEM,
    MdlColumn.TABLE_NAME,
    MdlColumn.COLUMN_NAME,
    MdlColumn.DATA_TYPE,
    MdlColumn.TYPE_NAME,
    MdlColumn.TYPE_NAME_JAVA,
    MdlColumn.COLUMN_SIZE,
    MdlColumn.BUFFER_LENGTH,
    MdlColumn.DECIMAL_DIGITS,
    MdlColumn.NUM_PREC_RADIX,
    MdlColumn.NULLABLE,
    MdlColumn.REMARKS,
    MdlColumn.COLUMN_DEF,
    MdlColumn.SQL_DATA_TYPE,
    MdlColumn.SQL_DATETIME_SUB,
    MdlColumn.CHAR_OCTET_LENGTH,
    MdlColumn.ORDINAL_POSITION,
    MdlColumn.IS_NULLABLE,
    MdlColumn.SCOPE_CATALOG,
    MdlColumn.SCOPE_SCHEMA,
    MdlColumn.SCOPE_TABLE,
    MdlColumn.SOURCE_DATA_TYPE,
    MdlColumn.IS_AUTOINCREMENT,
    MdlColumn.IS_GENERATEDCOLUMN
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
    return MdlColumn.COLUMN;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String tableCat;
  private java.lang.String tableSchem;
  private java.lang.String tableName;
  private java.lang.String columnName;
  private java.lang.String dataType;
  private java.lang.String typeName;
  private java.lang.String typeNameJava;
  private java.lang.String columnSize;
  private java.lang.String bufferLength;
  private java.lang.String decimalDigits;
  private java.lang.String numPrecRadix;
  private java.lang.String nullable;
  private java.lang.String remarks;
  private java.lang.String columnDef;
  private java.lang.String sqlDataType;
  private java.lang.String sqlDatetimeSub;
  private java.lang.String charOctetLength;
  private java.lang.String ordinalPosition;
  private java.lang.String isNullable;
  private java.lang.String scopeCatalog;
  private java.lang.String scopeSchema;
  private java.lang.String scopeTable;
  private java.lang.String sourceDataType;
  private java.lang.String isAutoincrement;
  private java.lang.String isGeneratedcolumn;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlColumn() {
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
   * 返回属性dataType的值.
   * @return dataType的值。
   */
  public java.lang.String getDataType() {
    return this.dataType;
  }
  /**
   * 设置属性dataType的值.
   * @param value dataType的值。
   */
  public void setDataType(java.lang.String value) {
    this.dataType = value;
  }
  /**
   * 返回属性typeName的值.
   * @return typeName的值。
   */
  public java.lang.String getTypeName() {
    return this.typeName;
  }
  /**
   * 设置属性typeName的值.
   * @param value typeName的值。
   */
  public void setTypeName(java.lang.String value) {
    this.typeName = value;
  }
  /**
   * 返回属性typeNameJava的值.
   * @return typeNameJava的值。
   */
  public java.lang.String getTypeNameJava() {
    return this.typeNameJava;
  }
  /**
   * 设置属性typeNameJava的值.
   * @param value typeNameJava的值。
   */
  public void setTypeNameJava(java.lang.String value) {
    this.typeNameJava = value;
  }
  /**
   * 返回属性columnSize的值.
   * @return columnSize的值。
   */
  public java.lang.String getColumnSize() {
    return this.columnSize;
  }
  /**
   * 设置属性columnSize的值.
   * @param value columnSize的值。
   */
  public void setColumnSize(java.lang.String value) {
    this.columnSize = value;
  }
  /**
   * 返回属性bufferLength的值.
   * @return bufferLength的值。
   */
  public java.lang.String getBufferLength() {
    return this.bufferLength;
  }
  /**
   * 设置属性bufferLength的值.
   * @param value bufferLength的值。
   */
  public void setBufferLength(java.lang.String value) {
    this.bufferLength = value;
  }
  /**
   * 返回属性decimalDigits的值.
   * @return decimalDigits的值。
   */
  public java.lang.String getDecimalDigits() {
    return this.decimalDigits;
  }
  /**
   * 设置属性decimalDigits的值.
   * @param value decimalDigits的值。
   */
  public void setDecimalDigits(java.lang.String value) {
    this.decimalDigits = value;
  }
  /**
   * 返回属性numPrecRadix的值.
   * @return numPrecRadix的值。
   */
  public java.lang.String getNumPrecRadix() {
    return this.numPrecRadix;
  }
  /**
   * 设置属性numPrecRadix的值.
   * @param value numPrecRadix的值。
   */
  public void setNumPrecRadix(java.lang.String value) {
    this.numPrecRadix = value;
  }
  /**
   * 返回属性nullable的值.
   * @return nullable的值。
   */
  public java.lang.String getNullable() {
    return this.nullable;
  }
  /**
   * 设置属性nullable的值.
   * @param value nullable的值。
   */
  public void setNullable(java.lang.String value) {
    this.nullable = value;
  }
  /**
   * 返回属性remarks的值.
   * @return remarks的值。
   */
  public java.lang.String getRemarks() {
    return this.remarks;
  }
  /**
   * 设置属性remarks的值.
   * @param value remarks的值。
   */
  public void setRemarks(java.lang.String value) {
    this.remarks = value;
  }
  /**
   * 返回属性columnDef的值.
   * @return columnDef的值。
   */
  public java.lang.String getColumnDef() {
    return this.columnDef;
  }
  /**
   * 设置属性columnDef的值.
   * @param value columnDef的值。
   */
  public void setColumnDef(java.lang.String value) {
    this.columnDef = value;
  }
  /**
   * 返回属性sqlDataType的值.
   * @return sqlDataType的值。
   */
  public java.lang.String getSqlDataType() {
    return this.sqlDataType;
  }
  /**
   * 设置属性sqlDataType的值.
   * @param value sqlDataType的值。
   */
  public void setSqlDataType(java.lang.String value) {
    this.sqlDataType = value;
  }
  /**
   * 返回属性sqlDatetimeSub的值.
   * @return sqlDatetimeSub的值。
   */
  public java.lang.String getSqlDatetimeSub() {
    return this.sqlDatetimeSub;
  }
  /**
   * 设置属性sqlDatetimeSub的值.
   * @param value sqlDatetimeSub的值。
   */
  public void setSqlDatetimeSub(java.lang.String value) {
    this.sqlDatetimeSub = value;
  }
  /**
   * 返回属性charOctetLength的值.
   * @return charOctetLength的值。
   */
  public java.lang.String getCharOctetLength() {
    return this.charOctetLength;
  }
  /**
   * 设置属性charOctetLength的值.
   * @param value charOctetLength的值。
   */
  public void setCharOctetLength(java.lang.String value) {
    this.charOctetLength = value;
  }
  /**
   * 返回属性ordinalPosition的值.
   * @return ordinalPosition的值。
   */
  public java.lang.String getOrdinalPosition() {
    return this.ordinalPosition;
  }
  /**
   * 设置属性ordinalPosition的值.
   * @param value ordinalPosition的值。
   */
  public void setOrdinalPosition(java.lang.String value) {
    this.ordinalPosition = value;
  }
  /**
   * 返回属性isNullable的值.
   * @return isNullable的值。
   */
  public java.lang.String getIsNullable() {
    return this.isNullable;
  }
  /**
   * 设置属性isNullable的值.
   * @param value isNullable的值。
   */
  public void setIsNullable(java.lang.String value) {
    this.isNullable = value;
  }
  /**
   * 返回属性scopeCatalog的值.
   * @return scopeCatalog的值。
   */
  public java.lang.String getScopeCatalog() {
    return this.scopeCatalog;
  }
  /**
   * 设置属性scopeCatalog的值.
   * @param value scopeCatalog的值。
   */
  public void setScopeCatalog(java.lang.String value) {
    this.scopeCatalog = value;
  }
  /**
   * 返回属性scopeSchema的值.
   * @return scopeSchema的值。
   */
  public java.lang.String getScopeSchema() {
    return this.scopeSchema;
  }
  /**
   * 设置属性scopeSchema的值.
   * @param value scopeSchema的值。
   */
  public void setScopeSchema(java.lang.String value) {
    this.scopeSchema = value;
  }
  /**
   * 返回属性scopeTable的值.
   * @return scopeTable的值。
   */
  public java.lang.String getScopeTable() {
    return this.scopeTable;
  }
  /**
   * 设置属性scopeTable的值.
   * @param value scopeTable的值。
   */
  public void setScopeTable(java.lang.String value) {
    this.scopeTable = value;
  }
  /**
   * 返回属性sourceDataType的值.
   * @return sourceDataType的值。
   */
  public java.lang.String getSourceDataType() {
    return this.sourceDataType;
  }
  /**
   * 设置属性sourceDataType的值.
   * @param value sourceDataType的值。
   */
  public void setSourceDataType(java.lang.String value) {
    this.sourceDataType = value;
  }
  /**
   * 返回属性isAutoincrement的值.
   * @return isAutoincrement的值。
   */
  public java.lang.String getIsAutoincrement() {
    return this.isAutoincrement;
  }
  /**
   * 设置属性isAutoincrement的值.
   * @param value isAutoincrement的值。
   */
  public void setIsAutoincrement(java.lang.String value) {
    this.isAutoincrement = value;
  }
  /**
   * 返回属性isGeneratedcolumn的值.
   * @return isGeneratedcolumn的值。
   */
  public java.lang.String getIsGeneratedcolumn() {
    return this.isGeneratedcolumn;
  }
  /**
   * 设置属性isGeneratedcolumn的值.
   * @param value isGeneratedcolumn的值。
   */
  public void setIsGeneratedcolumn(java.lang.String value) {
    this.isGeneratedcolumn = value;
  }

  /**
   * 返回MdlColumn的字符串表示形式.
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
    buf.append(this.getDataType());
    buf.append(",");
    buf.append(this.getTypeName());
    buf.append(",");
    buf.append(this.getTypeNameJava());
    buf.append(",");
    buf.append(this.getColumnSize());
    buf.append(",");
    buf.append(this.getBufferLength());
    buf.append(",");
    buf.append(this.getDecimalDigits());
    buf.append(",");
    buf.append(this.getNumPrecRadix());
    buf.append(",");
    buf.append(this.getNullable());
    buf.append(",");
    buf.append(this.getRemarks());
    buf.append(",");
    buf.append(this.getColumnDef());
    buf.append(",");
    buf.append(this.getSqlDataType());
    buf.append(",");
    buf.append(this.getSqlDatetimeSub());
    buf.append(",");
    buf.append(this.getCharOctetLength());
    buf.append(",");
    buf.append(this.getOrdinalPosition());
    buf.append(",");
    buf.append(this.getIsNullable());
    buf.append(",");
    buf.append(this.getScopeCatalog());
    buf.append(",");
    buf.append(this.getScopeSchema());
    buf.append(",");
    buf.append(this.getScopeTable());
    buf.append(",");
    buf.append(this.getSourceDataType());
    buf.append(",");
    buf.append(this.getIsAutoincrement());
    buf.append(",");
    buf.append(this.getIsGeneratedcolumn());

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
    if (MdlColumn.TABLE_CAT.equals(key)) {
      ret = this.getTableCat();
    }
    if (MdlColumn.TABLE_SCHEM.equals(key)) {
      ret = this.getTableSchem();
    }
    if (MdlColumn.TABLE_NAME.equals(key)) {
      ret = this.getTableName();
    }
    if (MdlColumn.COLUMN_NAME.equals(key)) {
      ret = this.getColumnName();
    }
    if (MdlColumn.DATA_TYPE.equals(key)) {
      ret = this.getDataType();
    }
    if (MdlColumn.TYPE_NAME.equals(key)) {
      ret = this.getTypeName();
    }
    if (MdlColumn.TYPE_NAME_JAVA.equals(key)) {
      ret = this.getTypeNameJava();
    }
    if (MdlColumn.COLUMN_SIZE.equals(key)) {
      ret = this.getColumnSize();
    }
    if (MdlColumn.BUFFER_LENGTH.equals(key)) {
      ret = this.getBufferLength();
    }
    if (MdlColumn.DECIMAL_DIGITS.equals(key)) {
      ret = this.getDecimalDigits();
    }
    if (MdlColumn.NUM_PREC_RADIX.equals(key)) {
      ret = this.getNumPrecRadix();
    }
    if (MdlColumn.NULLABLE.equals(key)) {
      ret = this.getNullable();
    }
    if (MdlColumn.REMARKS.equals(key)) {
      ret = this.getRemarks();
    }
    if (MdlColumn.COLUMN_DEF.equals(key)) {
      ret = this.getColumnDef();
    }
    if (MdlColumn.SQL_DATA_TYPE.equals(key)) {
      ret = this.getSqlDataType();
    }
    if (MdlColumn.SQL_DATETIME_SUB.equals(key)) {
      ret = this.getSqlDatetimeSub();
    }
    if (MdlColumn.CHAR_OCTET_LENGTH.equals(key)) {
      ret = this.getCharOctetLength();
    }
    if (MdlColumn.ORDINAL_POSITION.equals(key)) {
      ret = this.getOrdinalPosition();
    }
    if (MdlColumn.IS_NULLABLE.equals(key)) {
      ret = this.getIsNullable();
    }
    if (MdlColumn.SCOPE_CATALOG.equals(key)) {
      ret = this.getScopeCatalog();
    }
    if (MdlColumn.SCOPE_SCHEMA.equals(key)) {
      ret = this.getScopeSchema();
    }
    if (MdlColumn.SCOPE_TABLE.equals(key)) {
      ret = this.getScopeTable();
    }
    if (MdlColumn.SOURCE_DATA_TYPE.equals(key)) {
      ret = this.getSourceDataType();
    }
    if (MdlColumn.IS_AUTOINCREMENT.equals(key)) {
      ret = this.getIsAutoincrement();
    }
    if (MdlColumn.IS_GENERATEDCOLUMN.equals(key)) {
      ret = this.getIsGeneratedcolumn();
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
    if (MdlColumn.TABLE_CAT.equals(key)) {
      this.setTableCat((java.lang.String) value);
    }
    if (MdlColumn.TABLE_SCHEM.equals(key)) {
      this.setTableSchem((java.lang.String) value);
    }
    if (MdlColumn.TABLE_NAME.equals(key)) {
      this.setTableName((java.lang.String) value);
    }
    if (MdlColumn.COLUMN_NAME.equals(key)) {
      this.setColumnName((java.lang.String) value);
    }
    if (MdlColumn.DATA_TYPE.equals(key)) {
      this.setDataType((java.lang.String) value);
    }
    if (MdlColumn.TYPE_NAME.equals(key)) {
      this.setTypeName((java.lang.String) value);
    }
    if (MdlColumn.TYPE_NAME_JAVA.equals(key)) {
      this.setTypeNameJava((java.lang.String) value);
    }
    if (MdlColumn.COLUMN_SIZE.equals(key)) {
      this.setColumnSize((java.lang.String) value);
    }
    if (MdlColumn.BUFFER_LENGTH.equals(key)) {
      this.setBufferLength((java.lang.String) value);
    }
    if (MdlColumn.DECIMAL_DIGITS.equals(key)) {
      this.setDecimalDigits((java.lang.String) value);
    }
    if (MdlColumn.NUM_PREC_RADIX.equals(key)) {
      this.setNumPrecRadix((java.lang.String) value);
    }
    if (MdlColumn.NULLABLE.equals(key)) {
      this.setNullable((java.lang.String) value);
    }
    if (MdlColumn.REMARKS.equals(key)) {
      this.setRemarks((java.lang.String) value);
    }
    if (MdlColumn.COLUMN_DEF.equals(key)) {
      this.setColumnDef((java.lang.String) value);
    }
    if (MdlColumn.SQL_DATA_TYPE.equals(key)) {
      this.setSqlDataType((java.lang.String) value);
    }
    if (MdlColumn.SQL_DATETIME_SUB.equals(key)) {
      this.setSqlDatetimeSub((java.lang.String) value);
    }
    if (MdlColumn.CHAR_OCTET_LENGTH.equals(key)) {
      this.setCharOctetLength((java.lang.String) value);
    }
    if (MdlColumn.ORDINAL_POSITION.equals(key)) {
      this.setOrdinalPosition((java.lang.String) value);
    }
    if (MdlColumn.IS_NULLABLE.equals(key)) {
      this.setIsNullable((java.lang.String) value);
    }
    if (MdlColumn.SCOPE_CATALOG.equals(key)) {
      this.setScopeCatalog((java.lang.String) value);
    }
    if (MdlColumn.SCOPE_SCHEMA.equals(key)) {
      this.setScopeSchema((java.lang.String) value);
    }
    if (MdlColumn.SCOPE_TABLE.equals(key)) {
      this.setScopeTable((java.lang.String) value);
    }
    if (MdlColumn.SOURCE_DATA_TYPE.equals(key)) {
      this.setSourceDataType((java.lang.String) value);
    }
    if (MdlColumn.IS_AUTOINCREMENT.equals(key)) {
      this.setIsAutoincrement((java.lang.String) value);
    }
    if (MdlColumn.IS_GENERATEDCOLUMN.equals(key)) {
      this.setIsGeneratedcolumn((java.lang.String) value);
    }
  }
}
