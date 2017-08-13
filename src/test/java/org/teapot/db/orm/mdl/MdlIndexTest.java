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

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 表INDEX的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:53.336 +0900自动生成的。
 */
public class MdlIndexTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "INDEX", MdlIndex.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlIndex() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性tableCat的值的测试方法.
   */
  @Test
  public void testGetTableCat() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableCat = new java.lang.String("tableCat");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("tableCat"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, tableCat);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性tableCat的值与设定内容一致：", tableCat,
        mdl.getTableCat());
  }

  /**
   * 设置属性tableCat的值的测试方法.
   */
  @Test
  public void testSetTableCat() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableCat = new java.lang.String("tableCat");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("tableCat"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTableCat(tableCat);

    //(B-2)
    Assert.assertEquals("设置属性tableCat的值与设定内容一致：", tableCat,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性tableSchem的值的测试方法.
   */
  @Test
  public void testGetTableSchem() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableSchem = new java.lang.String("tableSchem");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("tableSchem"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, tableSchem);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性tableSchem的值与设定内容一致：", tableSchem,
        mdl.getTableSchem());
  }

  /**
   * 设置属性tableSchem的值的测试方法.
   */
  @Test
  public void testSetTableSchem() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableSchem = new java.lang.String("tableSchem");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("tableSchem"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTableSchem(tableSchem);

    //(B-2)
    Assert.assertEquals("设置属性tableSchem的值与设定内容一致：", tableSchem,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性tableName的值的测试方法.
   */
  @Test
  public void testGetTableName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableName = new java.lang.String("tableName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("tableName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, tableName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性tableName的值与设定内容一致：", tableName,
        mdl.getTableName());
  }

  /**
   * 设置属性tableName的值的测试方法.
   */
  @Test
  public void testSetTableName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableName = new java.lang.String("tableName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("tableName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTableName(tableName);

    //(B-2)
    Assert.assertEquals("设置属性tableName的值与设定内容一致：", tableName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性nonUnique的值的测试方法.
   */
  @Test
  public void testGetNonUnique() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String nonUnique = new java.lang.String("nonUnique");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("nonUnique"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, nonUnique);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性nonUnique的值与设定内容一致：", nonUnique,
        mdl.getNonUnique());
  }

  /**
   * 设置属性nonUnique的值的测试方法.
   */
  @Test
  public void testSetNonUnique() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String nonUnique = new java.lang.String("nonUnique");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("nonUnique"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setNonUnique(nonUnique);

    //(B-2)
    Assert.assertEquals("设置属性nonUnique的值与设定内容一致：", nonUnique,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性indexQualifier的值的测试方法.
   */
  @Test
  public void testGetIndexQualifier() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String indexQualifier = new java.lang.String("indexQualifier");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("indexQualifier"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, indexQualifier);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性indexQualifier的值与设定内容一致：", indexQualifier,
        mdl.getIndexQualifier());
  }

  /**
   * 设置属性indexQualifier的值的测试方法.
   */
  @Test
  public void testSetIndexQualifier() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String indexQualifier = new java.lang.String("indexQualifier");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("indexQualifier"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIndexQualifier(indexQualifier);

    //(B-2)
    Assert.assertEquals("设置属性indexQualifier的值与设定内容一致：", indexQualifier,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性indexName的值的测试方法.
   */
  @Test
  public void testGetIndexName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String indexName = new java.lang.String("indexName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("indexName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, indexName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性indexName的值与设定内容一致：", indexName,
        mdl.getIndexName());
  }

  /**
   * 设置属性indexName的值的测试方法.
   */
  @Test
  public void testSetIndexName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String indexName = new java.lang.String("indexName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("indexName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIndexName(indexName);

    //(B-2)
    Assert.assertEquals("设置属性indexName的值与设定内容一致：", indexName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性type的值的测试方法.
   */
  @Test
  public void testGetType() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String type = new java.lang.String("type");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("type"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, type);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性type的值与设定内容一致：", type,
        mdl.getType());
  }

  /**
   * 设置属性type的值的测试方法.
   */
  @Test
  public void testSetType() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String type = new java.lang.String("type");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("type"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setType(type);

    //(B-2)
    Assert.assertEquals("设置属性type的值与设定内容一致：", type,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性ordinalPosition的值的测试方法.
   */
  @Test
  public void testGetOrdinalPosition() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("ordinalPosition"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, ordinalPosition);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性ordinalPosition的值与设定内容一致：", ordinalPosition,
        mdl.getOrdinalPosition());
  }

  /**
   * 设置属性ordinalPosition的值的测试方法.
   */
  @Test
  public void testSetOrdinalPosition() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("ordinalPosition"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setOrdinalPosition(ordinalPosition);

    //(B-2)
    Assert.assertEquals("设置属性ordinalPosition的值与设定内容一致：", ordinalPosition,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性columnName的值的测试方法.
   */
  @Test
  public void testGetColumnName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String columnName = new java.lang.String("columnName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("columnName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, columnName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性columnName的值与设定内容一致：", columnName,
        mdl.getColumnName());
  }

  /**
   * 设置属性columnName的值的测试方法.
   */
  @Test
  public void testSetColumnName() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String columnName = new java.lang.String("columnName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("columnName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setColumnName(columnName);

    //(B-2)
    Assert.assertEquals("设置属性columnName的值与设定内容一致：", columnName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性ascOrDesc的值的测试方法.
   */
  @Test
  public void testGetAscOrDesc() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String ascOrDesc = new java.lang.String("ascOrDesc");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("ascOrDesc"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, ascOrDesc);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性ascOrDesc的值与设定内容一致：", ascOrDesc,
        mdl.getAscOrDesc());
  }

  /**
   * 设置属性ascOrDesc的值的测试方法.
   */
  @Test
  public void testSetAscOrDesc() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String ascOrDesc = new java.lang.String("ascOrDesc");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("ascOrDesc"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAscOrDesc(ascOrDesc);

    //(B-2)
    Assert.assertEquals("设置属性ascOrDesc的值与设定内容一致：", ascOrDesc,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cardinality的值的测试方法.
   */
  @Test
  public void testGetCardinality() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String cardinality = new java.lang.String("cardinality");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cardinality"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cardinality);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cardinality的值与设定内容一致：", cardinality,
        mdl.getCardinality());
  }

  /**
   * 设置属性cardinality的值的测试方法.
   */
  @Test
  public void testSetCardinality() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String cardinality = new java.lang.String("cardinality");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cardinality"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCardinality(cardinality);

    //(B-2)
    Assert.assertEquals("设置属性cardinality的值与设定内容一致：", cardinality,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性pages的值的测试方法.
   */
  @Test
  public void testGetPages() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String pages = new java.lang.String("pages");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("pages"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, pages);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性pages的值与设定内容一致：", pages,
        mdl.getPages());
  }

  /**
   * 设置属性pages的值的测试方法.
   */
  @Test
  public void testSetPages() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String pages = new java.lang.String("pages");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("pages"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPages(pages);

    //(B-2)
    Assert.assertEquals("设置属性pages的值与设定内容一致：", pages,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性filterCondition的值的测试方法.
   */
  @Test
  public void testGetFilterCondition() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String filterCondition = new java.lang.String("filterCondition");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("filterCondition"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, filterCondition);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性filterCondition的值与设定内容一致：", filterCondition,
        mdl.getFilterCondition());
  }

  /**
   * 设置属性filterCondition的值的测试方法.
   */
  @Test
  public void testSetFilterCondition() throws Exception {
    MdlIndex mdl = new MdlIndex();
    java.lang.String filterCondition = new java.lang.String("filterCondition");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("filterCondition"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setFilterCondition(filterCondition);

    //(B-2)
    Assert.assertEquals("设置属性filterCondition的值与设定内容一致：", filterCondition,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlIndex mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlIndex();
    stringBuffer = new StringBuffer();
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlIndex mdlAllCol = new MdlIndex();

    mdl = new MdlIndex();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setTableCat(tableCat);
    mdlAllCol.setTableCat(tableCat);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getTableCat());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setTableSchem(tableSchem);
    mdlAllCol.setTableSchem(tableSchem);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTableSchem());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setTableName(tableName);
    mdlAllCol.setTableName(tableName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTableName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String nonUnique = new java.lang.String("nonUnique");
    mdl.setNonUnique(nonUnique);
    mdlAllCol.setNonUnique(nonUnique);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getNonUnique());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String indexQualifier = new java.lang.String("indexQualifier");
    mdl.setIndexQualifier(indexQualifier);
    mdlAllCol.setIndexQualifier(indexQualifier);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getIndexQualifier());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String indexName = new java.lang.String("indexName");
    mdl.setIndexName(indexName);
    mdlAllCol.setIndexName(indexName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getIndexName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String type = new java.lang.String("type");
    mdl.setType(type);
    mdlAllCol.setType(type);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getType());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");
    mdl.setOrdinalPosition(ordinalPosition);
    mdlAllCol.setOrdinalPosition(ordinalPosition);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getOrdinalPosition());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setColumnName(columnName);
    mdlAllCol.setColumnName(columnName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getColumnName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String ascOrDesc = new java.lang.String("ascOrDesc");
    mdl.setAscOrDesc(ascOrDesc);
    mdlAllCol.setAscOrDesc(ascOrDesc);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getAscOrDesc());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String cardinality = new java.lang.String("cardinality");
    mdl.setCardinality(cardinality);
    mdlAllCol.setCardinality(cardinality);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCardinality());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String pages = new java.lang.String("pages");
    mdl.setPages(pages);
    mdlAllCol.setPages(pages);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getPages());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlIndex();
    java.lang.String filterCondition = new java.lang.String("filterCondition");
    mdl.setFilterCondition(filterCondition);
    mdlAllCol.setFilterCondition(filterCondition);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getFilterCondition());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getTableCat()
        + "," + mdlAllCol.getTableSchem()
        + "," + mdlAllCol.getTableName()
        + "," + mdlAllCol.getNonUnique()
        + "," + mdlAllCol.getIndexQualifier()
        + "," + mdlAllCol.getIndexName()
        + "," + mdlAllCol.getType()
        + "," + mdlAllCol.getOrdinalPosition()
        + "," + mdlAllCol.getColumnName()
        + "," + mdlAllCol.getAscOrDesc()
        + "," + mdlAllCol.getCardinality()
        + "," + mdlAllCol.getPages()
        + "," + mdlAllCol.getFilterCondition()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGetValueByKey() {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setTableCat(tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setTableSchem(tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setTableName(tableName);
    java.lang.String nonUnique = new java.lang.String("nonUnique");
    mdl.setNonUnique(nonUnique);
    java.lang.String indexQualifier = new java.lang.String("indexQualifier");
    mdl.setIndexQualifier(indexQualifier);
    java.lang.String indexName = new java.lang.String("indexName");
    mdl.setIndexName(indexName);
    java.lang.String type = new java.lang.String("type");
    mdl.setType(type);
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");
    mdl.setOrdinalPosition(ordinalPosition);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setColumnName(columnName);
    java.lang.String ascOrDesc = new java.lang.String("ascOrDesc");
    mdl.setAscOrDesc(ascOrDesc);
    java.lang.String cardinality = new java.lang.String("cardinality");
    mdl.setCardinality(cardinality);
    java.lang.String pages = new java.lang.String("pages");
    mdl.setPages(pages);
    java.lang.String filterCondition = new java.lang.String("filterCondition");
    mdl.setFilterCondition(filterCondition);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey(MdlIndex.TABLE_CAT));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey(MdlIndex.TABLE_SCHEM));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey(MdlIndex.TABLE_NAME));
    Assert.assertEquals(mdl.getNonUnique(),
        mdl.getValueByKey(MdlIndex.NON_UNIQUE));
    Assert.assertEquals(mdl.getIndexQualifier(),
        mdl.getValueByKey(MdlIndex.INDEX_QUALIFIER));
    Assert.assertEquals(mdl.getIndexName(),
        mdl.getValueByKey(MdlIndex.INDEX_NAME));
    Assert.assertEquals(mdl.getType(),
        mdl.getValueByKey(MdlIndex.TYPE));
    Assert.assertEquals(mdl.getOrdinalPosition(),
        mdl.getValueByKey(MdlIndex.ORDINAL_POSITION));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.getValueByKey(MdlIndex.COLUMN_NAME));
    Assert.assertEquals(mdl.getAscOrDesc(),
        mdl.getValueByKey(MdlIndex.ASC_OR_DESC));
    Assert.assertEquals(mdl.getCardinality(),
        mdl.getValueByKey(MdlIndex.CARDINALITY));
    Assert.assertEquals(mdl.getPages(),
        mdl.getValueByKey(MdlIndex.PAGES));
    Assert.assertEquals(mdl.getFilterCondition(),
        mdl.getValueByKey(MdlIndex.FILTER_CONDITION));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlIndex mdl = new MdlIndex();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setValueByKey(MdlIndex.TABLE_CAT, tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setValueByKey(MdlIndex.TABLE_SCHEM, tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setValueByKey(MdlIndex.TABLE_NAME, tableName);
    java.lang.String nonUnique = new java.lang.String("nonUnique");
    mdl.setValueByKey(MdlIndex.NON_UNIQUE, nonUnique);
    java.lang.String indexQualifier = new java.lang.String("indexQualifier");
    mdl.setValueByKey(MdlIndex.INDEX_QUALIFIER, indexQualifier);
    java.lang.String indexName = new java.lang.String("indexName");
    mdl.setValueByKey(MdlIndex.INDEX_NAME, indexName);
    java.lang.String type = new java.lang.String("type");
    mdl.setValueByKey(MdlIndex.TYPE, type);
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");
    mdl.setValueByKey(MdlIndex.ORDINAL_POSITION, ordinalPosition);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setValueByKey(MdlIndex.COLUMN_NAME, columnName);
    java.lang.String ascOrDesc = new java.lang.String("ascOrDesc");
    mdl.setValueByKey(MdlIndex.ASC_OR_DESC, ascOrDesc);
    java.lang.String cardinality = new java.lang.String("cardinality");
    mdl.setValueByKey(MdlIndex.CARDINALITY, cardinality);
    java.lang.String pages = new java.lang.String("pages");
    mdl.setValueByKey(MdlIndex.PAGES, pages);
    java.lang.String filterCondition = new java.lang.String("filterCondition");
    mdl.setValueByKey(MdlIndex.FILTER_CONDITION, filterCondition);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey( MdlIndex.TABLE_CAT ));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey( MdlIndex.TABLE_SCHEM ));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey( MdlIndex.TABLE_NAME ));
    Assert.assertEquals(mdl.getNonUnique(),
        mdl.getValueByKey( MdlIndex.NON_UNIQUE ));
    Assert.assertEquals(mdl.getIndexQualifier(),
        mdl.getValueByKey( MdlIndex.INDEX_QUALIFIER ));
    Assert.assertEquals(mdl.getIndexName(),
        mdl.getValueByKey( MdlIndex.INDEX_NAME ));
    Assert.assertEquals(mdl.getType(),
        mdl.getValueByKey( MdlIndex.TYPE ));
    Assert.assertEquals(mdl.getOrdinalPosition(),
        mdl.getValueByKey( MdlIndex.ORDINAL_POSITION ));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.getValueByKey( MdlIndex.COLUMN_NAME ));
    Assert.assertEquals(mdl.getAscOrDesc(),
        mdl.getValueByKey( MdlIndex.ASC_OR_DESC ));
    Assert.assertEquals(mdl.getCardinality(),
        mdl.getValueByKey( MdlIndex.CARDINALITY ));
    Assert.assertEquals(mdl.getPages(),
        mdl.getValueByKey( MdlIndex.PAGES ));
    Assert.assertEquals(mdl.getFilterCondition(),
        mdl.getValueByKey( MdlIndex.FILTER_CONDITION ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlIndexTest.class.getDeclaredMethods();
    Method[] methods = MdlIndex.class.getDeclaredMethods();
    ArrayList<Method> error = new ArrayList<Method>();

    HashMap<String, String> map = new HashMap<String, String>();
    for (Method method : testMethods) {
      System.out.println("测试方法：" + method);
      String name = method.getName();
      if (name.startsWith("test")) {
        map.put(name, name.substring(5));
      }
    }
    for (Method method : methods) {
      System.out.print("方法：" + method);
      if (((method.getModifiers() & Modifier.PUBLIC) != 0)
          || ((method.getModifiers() & Modifier.PROTECTED) != 0)) {
        String name = method.getName();

        String testName = "test" + name.substring(0, 1).toUpperCase() + name.substring(1);
        String check = map.get(testName);
        System.out.println(" " + check);
        if (check == null || check.length() <= 0) {
          error.add(method);
        }
      }
    }
    if (error.size() > 0) {
      Assert.fail("请追加对于方法「" + error + "」的测试方法！");
    }
  }
}
