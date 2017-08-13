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
 * 表INDEX的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:53.336 +0900自动生成的。
 */
public class MdlIndex implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:INDEX. */
  public static final String INDEX = "INDEX";
  /** 字段：TABLE_CAT. */
  public static final String TABLE_CAT = "INDEX.TABLE_CAT";
  /** 字段：TABLE_SCHEM. */
  public static final String TABLE_SCHEM = "INDEX.TABLE_SCHEM";
  /** 字段：TABLE_NAME. */
  public static final String TABLE_NAME = "INDEX.TABLE_NAME";
  /** 字段：NON_UNIQUE. */
  public static final String NON_UNIQUE = "INDEX.NON_UNIQUE";
  /** 字段：INDEX_QUALIFIER. */
  public static final String INDEX_QUALIFIER = "INDEX.INDEX_QUALIFIER";
  /** 字段：INDEX_NAME. */
  public static final String INDEX_NAME = "INDEX.INDEX_NAME";
  /** 字段：TYPE. */
  public static final String TYPE = "INDEX.TYPE";
  /** 字段：ORDINAL_POSITION. */
  public static final String ORDINAL_POSITION = "INDEX.ORDINAL_POSITION";
  /** 字段：COLUMN_NAME. */
  public static final String COLUMN_NAME = "INDEX.COLUMN_NAME";
  /** 字段：ASC_OR_DESC. */
  public static final String ASC_OR_DESC = "INDEX.ASC_OR_DESC";
  /** 字段：CARDINALITY. */
  public static final String CARDINALITY = "INDEX.CARDINALITY";
  /** 字段：PAGES. */
  public static final String PAGES = "INDEX.PAGES";
  /** 字段：FILTER_CONDITION. */
  public static final String FILTER_CONDITION = "INDEX.FILTER_CONDITION";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlIndex.TABLE_CAT,
    MdlIndex.TABLE_SCHEM,
    MdlIndex.TABLE_NAME,
    MdlIndex.NON_UNIQUE,
    MdlIndex.INDEX_QUALIFIER,
    MdlIndex.INDEX_NAME,
    MdlIndex.TYPE,
    MdlIndex.ORDINAL_POSITION,
    MdlIndex.COLUMN_NAME,
    MdlIndex.ASC_OR_DESC,
    MdlIndex.CARDINALITY,
    MdlIndex.PAGES,
    MdlIndex.FILTER_CONDITION
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
    return MdlIndex.INDEX;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String tableCat;
  private java.lang.String tableSchem;
  private java.lang.String tableName;
  private java.lang.String nonUnique;
  private java.lang.String indexQualifier;
  private java.lang.String indexName;
  private java.lang.String type;
  private java.lang.String ordinalPosition;
  private java.lang.String columnName;
  private java.lang.String ascOrDesc;
  private java.lang.String cardinality;
  private java.lang.String pages;
  private java.lang.String filterCondition;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlIndex() {
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
   * 返回属性nonUnique的值.
   * @return nonUnique的值。
   */
  public java.lang.String getNonUnique() {
    return this.nonUnique;
  }
  /**
   * 设置属性nonUnique的值.
   * @param value nonUnique的值。
   */
  public void setNonUnique(java.lang.String value) {
    this.nonUnique = value;
  }
  /**
   * 返回属性indexQualifier的值.
   * @return indexQualifier的值。
   */
  public java.lang.String getIndexQualifier() {
    return this.indexQualifier;
  }
  /**
   * 设置属性indexQualifier的值.
   * @param value indexQualifier的值。
   */
  public void setIndexQualifier(java.lang.String value) {
    this.indexQualifier = value;
  }
  /**
   * 返回属性indexName的值.
   * @return indexName的值。
   */
  public java.lang.String getIndexName() {
    return this.indexName;
  }
  /**
   * 设置属性indexName的值.
   * @param value indexName的值。
   */
  public void setIndexName(java.lang.String value) {
    this.indexName = value;
  }
  /**
   * 返回属性type的值.
   * @return type的值。
   */
  public java.lang.String getType() {
    return this.type;
  }
  /**
   * 设置属性type的值.
   * @param value type的值。
   */
  public void setType(java.lang.String value) {
    this.type = value;
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
   * 返回属性ascOrDesc的值.
   * @return ascOrDesc的值。
   */
  public java.lang.String getAscOrDesc() {
    return this.ascOrDesc;
  }
  /**
   * 设置属性ascOrDesc的值.
   * @param value ascOrDesc的值。
   */
  public void setAscOrDesc(java.lang.String value) {
    this.ascOrDesc = value;
  }
  /**
   * 返回属性cardinality的值.
   * @return cardinality的值。
   */
  public java.lang.String getCardinality() {
    return this.cardinality;
  }
  /**
   * 设置属性cardinality的值.
   * @param value cardinality的值。
   */
  public void setCardinality(java.lang.String value) {
    this.cardinality = value;
  }
  /**
   * 返回属性pages的值.
   * @return pages的值。
   */
  public java.lang.String getPages() {
    return this.pages;
  }
  /**
   * 设置属性pages的值.
   * @param value pages的值。
   */
  public void setPages(java.lang.String value) {
    this.pages = value;
  }
  /**
   * 返回属性filterCondition的值.
   * @return filterCondition的值。
   */
  public java.lang.String getFilterCondition() {
    return this.filterCondition;
  }
  /**
   * 设置属性filterCondition的值.
   * @param value filterCondition的值。
   */
  public void setFilterCondition(java.lang.String value) {
    this.filterCondition = value;
  }

  /**
   * 返回MdlIndex的字符串表示形式.
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
    buf.append(this.getNonUnique());
    buf.append(",");
    buf.append(this.getIndexQualifier());
    buf.append(",");
    buf.append(this.getIndexName());
    buf.append(",");
    buf.append(this.getType());
    buf.append(",");
    buf.append(this.getOrdinalPosition());
    buf.append(",");
    buf.append(this.getColumnName());
    buf.append(",");
    buf.append(this.getAscOrDesc());
    buf.append(",");
    buf.append(this.getCardinality());
    buf.append(",");
    buf.append(this.getPages());
    buf.append(",");
    buf.append(this.getFilterCondition());

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
    if (MdlIndex.TABLE_CAT.equals(key)) {
      ret = this.getTableCat();
    }
    if (MdlIndex.TABLE_SCHEM.equals(key)) {
      ret = this.getTableSchem();
    }
    if (MdlIndex.TABLE_NAME.equals(key)) {
      ret = this.getTableName();
    }
    if (MdlIndex.NON_UNIQUE.equals(key)) {
      ret = this.getNonUnique();
    }
    if (MdlIndex.INDEX_QUALIFIER.equals(key)) {
      ret = this.getIndexQualifier();
    }
    if (MdlIndex.INDEX_NAME.equals(key)) {
      ret = this.getIndexName();
    }
    if (MdlIndex.TYPE.equals(key)) {
      ret = this.getType();
    }
    if (MdlIndex.ORDINAL_POSITION.equals(key)) {
      ret = this.getOrdinalPosition();
    }
    if (MdlIndex.COLUMN_NAME.equals(key)) {
      ret = this.getColumnName();
    }
    if (MdlIndex.ASC_OR_DESC.equals(key)) {
      ret = this.getAscOrDesc();
    }
    if (MdlIndex.CARDINALITY.equals(key)) {
      ret = this.getCardinality();
    }
    if (MdlIndex.PAGES.equals(key)) {
      ret = this.getPages();
    }
    if (MdlIndex.FILTER_CONDITION.equals(key)) {
      ret = this.getFilterCondition();
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
    if (MdlIndex.TABLE_CAT.equals(key)) {
      this.setTableCat((java.lang.String) value);
    }
    if (MdlIndex.TABLE_SCHEM.equals(key)) {
      this.setTableSchem((java.lang.String) value);
    }
    if (MdlIndex.TABLE_NAME.equals(key)) {
      this.setTableName((java.lang.String) value);
    }
    if (MdlIndex.NON_UNIQUE.equals(key)) {
      this.setNonUnique((java.lang.String) value);
    }
    if (MdlIndex.INDEX_QUALIFIER.equals(key)) {
      this.setIndexQualifier((java.lang.String) value);
    }
    if (MdlIndex.INDEX_NAME.equals(key)) {
      this.setIndexName((java.lang.String) value);
    }
    if (MdlIndex.TYPE.equals(key)) {
      this.setType((java.lang.String) value);
    }
    if (MdlIndex.ORDINAL_POSITION.equals(key)) {
      this.setOrdinalPosition((java.lang.String) value);
    }
    if (MdlIndex.COLUMN_NAME.equals(key)) {
      this.setColumnName((java.lang.String) value);
    }
    if (MdlIndex.ASC_OR_DESC.equals(key)) {
      this.setAscOrDesc((java.lang.String) value);
    }
    if (MdlIndex.CARDINALITY.equals(key)) {
      this.setCardinality((java.lang.String) value);
    }
    if (MdlIndex.PAGES.equals(key)) {
      this.setPages((java.lang.String) value);
    }
    if (MdlIndex.FILTER_CONDITION.equals(key)) {
      this.setFilterCondition((java.lang.String) value);
    }
  }
}
