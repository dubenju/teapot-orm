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
 * 表TABLE的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:51.065 +0900自动生成的。
 */
public class MdlTable implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TABLE. */
  public static final String TABLE = "TABLE";
  /** 字段：TABLE_CAT. */
  public static final String TABLE_CAT = "TABLE.TABLE_CAT";
  /** 字段：TABLE_SCHEM. */
  public static final String TABLE_SCHEM = "TABLE.TABLE_SCHEM";
  /** 字段：TABLE_NAME. */
  public static final String TABLE_NAME = "TABLE.TABLE_NAME";
  /** 字段：TABLE_TYPE. */
  public static final String TABLE_TYPE = "TABLE.TABLE_TYPE";
  /** 字段：REMARKS. */
  public static final String REMARKS = "TABLE.REMARKS";
  /** 字段：TYPE_CAT. */
  public static final String TYPE_CAT = "TABLE.TYPE_CAT";
  /** 字段：TYPE_SCHEM. */
  public static final String TYPE_SCHEM = "TABLE.TYPE_SCHEM";
  /** 字段：TYPE_NAME. */
  public static final String TYPE_NAME = "TABLE.TYPE_NAME";
  /** 字段：SELF_REFERENCING_COL_NAME. */
  public static final String SELF_REFERENCING_COL_NAME = "TABLE.SELF_REFERENCING_COL_NAME";
  /** 字段：REF_GENERATION. */
  public static final String REF_GENERATION = "TABLE.REF_GENERATION";
  /** 字段：COLMUNS. */
  public static final String COLMUNS = "TABLE.COLMUNS";
  /** 字段：PRIMARY_KEYS. */
  public static final String PRIMARY_KEYS = "TABLE.PRIMARY_KEYS";
  /** 字段：INDEXS. */
  public static final String INDEXS = "TABLE.INDEXS";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTable.TABLE_CAT,
    MdlTable.TABLE_SCHEM,
    MdlTable.TABLE_NAME,
    MdlTable.TABLE_TYPE,
    MdlTable.REMARKS,
    MdlTable.TYPE_CAT,
    MdlTable.TYPE_SCHEM,
    MdlTable.TYPE_NAME,
    MdlTable.SELF_REFERENCING_COL_NAME,
    MdlTable.REF_GENERATION,
    MdlTable.COLMUNS,
    MdlTable.PRIMARY_KEYS,
    MdlTable.INDEXS
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
    return MdlTable.TABLE;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String tableCat;
  private java.lang.String tableSchem;
  private java.lang.String tableName;
  private java.lang.String tableType;
  private java.lang.String remarks;
  private java.lang.String typeCat;
  private java.lang.String typeSchem;
  private java.lang.String typeName;
  private java.lang.String selfReferencingColName;
  private java.lang.String refGeneration;
  private java.util.ArrayList<MdlColumn> colmuns;
  private java.util.ArrayList<MdlPrimaryKey> primaryKeys;
  private java.util.ArrayList<MdlIndex> indexs;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlTable() {
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
   * 返回属性tableType的值.
   * @return tableType的值。
   */
  public java.lang.String getTableType() {
    return this.tableType;
  }
  /**
   * 设置属性tableType的值.
   * @param value tableType的值。
   */
  public void setTableType(java.lang.String value) {
    this.tableType = value;
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
   * 返回属性typeCat的值.
   * @return typeCat的值。
   */
  public java.lang.String getTypeCat() {
    return this.typeCat;
  }
  /**
   * 设置属性typeCat的值.
   * @param value typeCat的值。
   */
  public void setTypeCat(java.lang.String value) {
    this.typeCat = value;
  }
  /**
   * 返回属性typeSchem的值.
   * @return typeSchem的值。
   */
  public java.lang.String getTypeSchem() {
    return this.typeSchem;
  }
  /**
   * 设置属性typeSchem的值.
   * @param value typeSchem的值。
   */
  public void setTypeSchem(java.lang.String value) {
    this.typeSchem = value;
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
   * 返回属性selfReferencingColName的值.
   * @return selfReferencingColName的值。
   */
  public java.lang.String getSelfReferencingColName() {
    return this.selfReferencingColName;
  }
  /**
   * 设置属性selfReferencingColName的值.
   * @param value selfReferencingColName的值。
   */
  public void setSelfReferencingColName(java.lang.String value) {
    this.selfReferencingColName = value;
  }
  /**
   * 返回属性refGeneration的值.
   * @return refGeneration的值。
   */
  public java.lang.String getRefGeneration() {
    return this.refGeneration;
  }
  /**
   * 设置属性refGeneration的值.
   * @param value refGeneration的值。
   */
  public void setRefGeneration(java.lang.String value) {
    this.refGeneration = value;
  }
  /**
   * 返回属性colmuns的值.
   * @return colmuns的值。
   */
  public java.util.ArrayList<MdlColumn> getColmuns() {
    return this.colmuns;
  }
  /**
   * 设置属性colmuns的值.
   * @param value colmuns的值。
   */
  public void setColmuns(java.util.ArrayList<MdlColumn> value) {
    this.colmuns = value;
  }
  /**
   * 返回属性primaryKeys的值.
   * @return primaryKeys的值。
   */
  public java.util.ArrayList<MdlPrimaryKey> getPrimaryKeys() {
    return this.primaryKeys;
  }
  /**
   * 设置属性primaryKeys的值.
   * @param value primaryKeys的值。
   */
  public void setPrimaryKeys(java.util.ArrayList<MdlPrimaryKey> value) {
    this.primaryKeys = value;
  }
  /**
   * 返回属性indexs的值.
   * @return indexs的值。
   */
  public java.util.ArrayList<MdlIndex> getIndexs() {
    return this.indexs;
  }
  /**
   * 设置属性indexs的值.
   * @param value indexs的值。
   */
  public void setIndexs(java.util.ArrayList<MdlIndex> value) {
    this.indexs = value;
  }

  /**
   * 返回MdlTable的字符串表示形式.
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
    buf.append(this.getTableType());
    buf.append(",");
    buf.append(this.getRemarks());
    buf.append(",");
    buf.append(this.getTypeCat());
    buf.append(",");
    buf.append(this.getTypeSchem());
    buf.append(",");
    buf.append(this.getTypeName());
    buf.append(",");
    buf.append(this.getSelfReferencingColName());
    buf.append(",");
    buf.append(this.getRefGeneration());
    buf.append(",");
    buf.append(this.getColmuns());
    buf.append(",");
    buf.append(this.getPrimaryKeys());
    buf.append(",");
    buf.append(this.getIndexs());

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
    if (MdlTable.TABLE_CAT.equals(key)) {
      ret = this.getTableCat();
    }
    if (MdlTable.TABLE_SCHEM.equals(key)) {
      ret = this.getTableSchem();
    }
    if (MdlTable.TABLE_NAME.equals(key)) {
      ret = this.getTableName();
    }
    if (MdlTable.TABLE_TYPE.equals(key)) {
      ret = this.getTableType();
    }
    if (MdlTable.REMARKS.equals(key)) {
      ret = this.getRemarks();
    }
    if (MdlTable.TYPE_CAT.equals(key)) {
      ret = this.getTypeCat();
    }
    if (MdlTable.TYPE_SCHEM.equals(key)) {
      ret = this.getTypeSchem();
    }
    if (MdlTable.TYPE_NAME.equals(key)) {
      ret = this.getTypeName();
    }
    if (MdlTable.SELF_REFERENCING_COL_NAME.equals(key)) {
      ret = this.getSelfReferencingColName();
    }
    if (MdlTable.REF_GENERATION.equals(key)) {
      ret = this.getRefGeneration();
    }
    if (MdlTable.COLMUNS.equals(key)) {
      ret = this.getColmuns();
    }
    if (MdlTable.PRIMARY_KEYS.equals(key)) {
      ret = this.getPrimaryKeys();
    }
    if (MdlTable.INDEXS.equals(key)) {
      ret = this.getIndexs();
    }
    return ret;
  }

  /**
   * 通过键名设置值.
   * 当指定的键名不存在的时候，不作任何改动。
   * @param key 键名。
   * @param value 对应键名值。
   */
  @SuppressWarnings("unchecked")
  @Override
  public void setValueByKey(String key, Object value) {
    if (MdlTable.TABLE_CAT.equals(key)) {
      this.setTableCat((java.lang.String) value);
    }
    if (MdlTable.TABLE_SCHEM.equals(key)) {
      this.setTableSchem((java.lang.String) value);
    }
    if (MdlTable.TABLE_NAME.equals(key)) {
      this.setTableName((java.lang.String) value);
    }
    if (MdlTable.TABLE_TYPE.equals(key)) {
      this.setTableType((java.lang.String) value);
    }
    if (MdlTable.REMARKS.equals(key)) {
      this.setRemarks((java.lang.String) value);
    }
    if (MdlTable.TYPE_CAT.equals(key)) {
      this.setTypeCat((java.lang.String) value);
    }
    if (MdlTable.TYPE_SCHEM.equals(key)) {
      this.setTypeSchem((java.lang.String) value);
    }
    if (MdlTable.TYPE_NAME.equals(key)) {
      this.setTypeName((java.lang.String) value);
    }
    if (MdlTable.SELF_REFERENCING_COL_NAME.equals(key)) {
      this.setSelfReferencingColName((java.lang.String) value);
    }
    if (MdlTable.REF_GENERATION.equals(key)) {
      this.setRefGeneration((java.lang.String) value);
    }
    if (MdlTable.COLMUNS.equals(key)) {
      this.setColmuns((java.util.ArrayList<MdlColumn>) value);
    }
    if (MdlTable.PRIMARY_KEYS.equals(key)) {
      this.setPrimaryKeys((java.util.ArrayList<MdlPrimaryKey>) value);
    }
    if (MdlTable.INDEXS.equals(key)) {
      this.setIndexs((java.util.ArrayList<MdlIndex>) value);
    }
  }
}
