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
 * 表TABLE的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:51.065 +0900自动生成的。
 */
public class MdlTableTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TABLE", MdlTable.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTable() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性tableCat的值的测试方法.
   */
  @Test
  public void testGetTableCat() throws Exception {
    MdlTable mdl = new MdlTable();
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
    MdlTable mdl = new MdlTable();
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
    MdlTable mdl = new MdlTable();
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
    MdlTable mdl = new MdlTable();
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
    MdlTable mdl = new MdlTable();
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
    MdlTable mdl = new MdlTable();
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
   * 返回属性tableType的值的测试方法.
   */
  @Test
  public void testGetTableType() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String tableType = new java.lang.String("tableType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("tableType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, tableType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性tableType的值与设定内容一致：", tableType,
        mdl.getTableType());
  }

  /**
   * 设置属性tableType的值的测试方法.
   */
  @Test
  public void testSetTableType() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String tableType = new java.lang.String("tableType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("tableType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTableType(tableType);

    //(B-2)
    Assert.assertEquals("设置属性tableType的值与设定内容一致：", tableType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性remarks的值的测试方法.
   */
  @Test
  public void testGetRemarks() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String remarks = new java.lang.String("remarks");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("remarks"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, remarks);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性remarks的值与设定内容一致：", remarks,
        mdl.getRemarks());
  }

  /**
   * 设置属性remarks的值的测试方法.
   */
  @Test
  public void testSetRemarks() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String remarks = new java.lang.String("remarks");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("remarks"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRemarks(remarks);

    //(B-2)
    Assert.assertEquals("设置属性remarks的值与设定内容一致：", remarks,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性typeCat的值的测试方法.
   */
  @Test
  public void testGetTypeCat() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeCat = new java.lang.String("typeCat");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("typeCat"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, typeCat);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性typeCat的值与设定内容一致：", typeCat,
        mdl.getTypeCat());
  }

  /**
   * 设置属性typeCat的值的测试方法.
   */
  @Test
  public void testSetTypeCat() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeCat = new java.lang.String("typeCat");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("typeCat"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTypeCat(typeCat);

    //(B-2)
    Assert.assertEquals("设置属性typeCat的值与设定内容一致：", typeCat,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性typeSchem的值的测试方法.
   */
  @Test
  public void testGetTypeSchem() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeSchem = new java.lang.String("typeSchem");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("typeSchem"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, typeSchem);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性typeSchem的值与设定内容一致：", typeSchem,
        mdl.getTypeSchem());
  }

  /**
   * 设置属性typeSchem的值的测试方法.
   */
  @Test
  public void testSetTypeSchem() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeSchem = new java.lang.String("typeSchem");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("typeSchem"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTypeSchem(typeSchem);

    //(B-2)
    Assert.assertEquals("设置属性typeSchem的值与设定内容一致：", typeSchem,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性typeName的值的测试方法.
   */
  @Test
  public void testGetTypeName() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeName = new java.lang.String("typeName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("typeName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, typeName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性typeName的值与设定内容一致：", typeName,
        mdl.getTypeName());
  }

  /**
   * 设置属性typeName的值的测试方法.
   */
  @Test
  public void testSetTypeName() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String typeName = new java.lang.String("typeName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("typeName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTypeName(typeName);

    //(B-2)
    Assert.assertEquals("设置属性typeName的值与设定内容一致：", typeName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性selfReferencingColName的值的测试方法.
   */
  @Test
  public void testGetSelfReferencingColName() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String selfReferencingColName = new java.lang.String("selfReferencingColName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("selfReferencingColName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, selfReferencingColName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性selfReferencingColName的值与设定内容一致：", selfReferencingColName,
        mdl.getSelfReferencingColName());
  }

  /**
   * 设置属性selfReferencingColName的值的测试方法.
   */
  @Test
  public void testSetSelfReferencingColName() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String selfReferencingColName = new java.lang.String("selfReferencingColName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("selfReferencingColName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setSelfReferencingColName(selfReferencingColName);

    //(B-2)
    Assert.assertEquals("设置属性selfReferencingColName的值与设定内容一致：", selfReferencingColName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性refGeneration的值的测试方法.
   */
  @Test
  public void testGetRefGeneration() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String refGeneration = new java.lang.String("refGeneration");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("refGeneration"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, refGeneration);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性refGeneration的值与设定内容一致：", refGeneration,
        mdl.getRefGeneration());
  }

  /**
   * 设置属性refGeneration的值的测试方法.
   */
  @Test
  public void testSetRefGeneration() throws Exception {
    MdlTable mdl = new MdlTable();
    java.lang.String refGeneration = new java.lang.String("refGeneration");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("refGeneration"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRefGeneration(refGeneration);

    //(B-2)
    Assert.assertEquals("设置属性refGeneration的值与设定内容一致：", refGeneration,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性colmuns的值的测试方法.
   */
  @Test
  public void testGetColmuns() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlColumn> colmuns = new java.util.ArrayList<MdlColumn>();

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("colmuns"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, colmuns);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性colmuns的值与设定内容一致：", colmuns,
        mdl.getColmuns());
  }

  /**
   * 设置属性colmuns的值的测试方法.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testSetColmuns() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlColumn> colmuns = new java.util.ArrayList<MdlColumn>();

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("colmuns"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setColmuns(colmuns);

    //(B-2)
    Assert.assertEquals("设置属性colmuns的值与设定内容一致：", colmuns,
        (java.util.ArrayList<MdlColumn>) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性primaryKeys的值的测试方法.
   */
  @Test
  public void testGetPrimaryKeys() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlPrimaryKey> primaryKeys = new java.util.ArrayList<MdlPrimaryKey>();

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("primaryKeys"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, primaryKeys);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性primaryKeys的值与设定内容一致：", primaryKeys,
        mdl.getPrimaryKeys());
  }

  /**
   * 设置属性primaryKeys的值的测试方法.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testSetPrimaryKeys() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlPrimaryKey> primaryKeys = new java.util.ArrayList<MdlPrimaryKey>();

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("primaryKeys"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPrimaryKeys(primaryKeys);

    //(B-2)
    Assert.assertEquals("设置属性primaryKeys的值与设定内容一致：", primaryKeys,
        (java.util.ArrayList<MdlPrimaryKey>) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性indexs的值的测试方法.
   */
  @Test
  public void testGetIndexs() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlIndex> indexs = new java.util.ArrayList<MdlIndex>();

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("indexs"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, indexs);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性indexs的值与设定内容一致：", indexs,
        mdl.getIndexs());
  }

  /**
   * 设置属性indexs的值的测试方法.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testSetIndexs() throws Exception {
    MdlTable mdl = new MdlTable();
    java.util.ArrayList<MdlIndex> indexs = new java.util.ArrayList<MdlIndex>();

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("indexs"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIndexs(indexs);

    //(B-2)
    Assert.assertEquals("设置属性indexs的值与设定内容一致：", indexs,
        (java.util.ArrayList<MdlIndex>) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlTable mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTable();
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

    MdlTable mdlAllCol = new MdlTable();

    mdl = new MdlTable();
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

    mdl = new MdlTable();
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

    mdl = new MdlTable();
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

    mdl = new MdlTable();
    java.lang.String tableType = new java.lang.String("tableType");
    mdl.setTableType(tableType);
    mdlAllCol.setTableType(tableType);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTableType());
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

    mdl = new MdlTable();
    java.lang.String remarks = new java.lang.String("remarks");
    mdl.setRemarks(remarks);
    mdlAllCol.setRemarks(remarks);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getRemarks());
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

    mdl = new MdlTable();
    java.lang.String typeCat = new java.lang.String("typeCat");
    mdl.setTypeCat(typeCat);
    mdlAllCol.setTypeCat(typeCat);
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
    stringBuffer.append(mdl.getTypeCat());
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

    mdl = new MdlTable();
    java.lang.String typeSchem = new java.lang.String("typeSchem");
    mdl.setTypeSchem(typeSchem);
    mdlAllCol.setTypeSchem(typeSchem);
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
    stringBuffer.append(mdl.getTypeSchem());
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

    mdl = new MdlTable();
    java.lang.String typeName = new java.lang.String("typeName");
    mdl.setTypeName(typeName);
    mdlAllCol.setTypeName(typeName);
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
    stringBuffer.append(mdl.getTypeName());
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

    mdl = new MdlTable();
    java.lang.String selfReferencingColName = new java.lang.String("selfReferencingColName");
    mdl.setSelfReferencingColName(selfReferencingColName);
    mdlAllCol.setSelfReferencingColName(selfReferencingColName);
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
    stringBuffer.append(mdl.getSelfReferencingColName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTable();
    java.lang.String refGeneration = new java.lang.String("refGeneration");
    mdl.setRefGeneration(refGeneration);
    mdlAllCol.setRefGeneration(refGeneration);
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
    stringBuffer.append(mdl.getRefGeneration());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTable();
    java.util.ArrayList<MdlColumn> colmuns = new java.util.ArrayList<MdlColumn>();
    mdl.setColmuns(colmuns);
    mdlAllCol.setColmuns(colmuns);
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
    stringBuffer.append(mdl.getColmuns());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTable();
    java.util.ArrayList<MdlPrimaryKey> primaryKeys = new java.util.ArrayList<MdlPrimaryKey>();
    mdl.setPrimaryKeys(primaryKeys);
    mdlAllCol.setPrimaryKeys(primaryKeys);
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
    stringBuffer.append(mdl.getPrimaryKeys());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTable();
    java.util.ArrayList<MdlIndex> indexs = new java.util.ArrayList<MdlIndex>();
    mdl.setIndexs(indexs);
    mdlAllCol.setIndexs(indexs);
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
    stringBuffer.append(mdl.getIndexs());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getTableCat()
        + "," + mdlAllCol.getTableSchem()
        + "," + mdlAllCol.getTableName()
        + "," + mdlAllCol.getTableType()
        + "," + mdlAllCol.getRemarks()
        + "," + mdlAllCol.getTypeCat()
        + "," + mdlAllCol.getTypeSchem()
        + "," + mdlAllCol.getTypeName()
        + "," + mdlAllCol.getSelfReferencingColName()
        + "," + mdlAllCol.getRefGeneration()
        + "," + mdlAllCol.getColmuns()
        + "," + mdlAllCol.getPrimaryKeys()
        + "," + mdlAllCol.getIndexs()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGetValueByKey() {
    MdlTable mdl = new MdlTable();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setTableCat(tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setTableSchem(tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setTableName(tableName);
    java.lang.String tableType = new java.lang.String("tableType");
    mdl.setTableType(tableType);
    java.lang.String remarks = new java.lang.String("remarks");
    mdl.setRemarks(remarks);
    java.lang.String typeCat = new java.lang.String("typeCat");
    mdl.setTypeCat(typeCat);
    java.lang.String typeSchem = new java.lang.String("typeSchem");
    mdl.setTypeSchem(typeSchem);
    java.lang.String typeName = new java.lang.String("typeName");
    mdl.setTypeName(typeName);
    java.lang.String selfReferencingColName = new java.lang.String("selfReferencingColName");
    mdl.setSelfReferencingColName(selfReferencingColName);
    java.lang.String refGeneration = new java.lang.String("refGeneration");
    mdl.setRefGeneration(refGeneration);
    java.util.ArrayList<MdlColumn> colmuns = new java.util.ArrayList<MdlColumn>();
    mdl.setColmuns(colmuns);
    java.util.ArrayList<MdlPrimaryKey> primaryKeys = new java.util.ArrayList<MdlPrimaryKey>();
    mdl.setPrimaryKeys(primaryKeys);
    java.util.ArrayList<MdlIndex> indexs = new java.util.ArrayList<MdlIndex>();
    mdl.setIndexs(indexs);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey(MdlTable.TABLE_CAT));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey(MdlTable.TABLE_SCHEM));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey(MdlTable.TABLE_NAME));
    Assert.assertEquals(mdl.getTableType(),
        mdl.getValueByKey(MdlTable.TABLE_TYPE));
    Assert.assertEquals(mdl.getRemarks(),
        mdl.getValueByKey(MdlTable.REMARKS));
    Assert.assertEquals(mdl.getTypeCat(),
        mdl.getValueByKey(MdlTable.TYPE_CAT));
    Assert.assertEquals(mdl.getTypeSchem(),
        mdl.getValueByKey(MdlTable.TYPE_SCHEM));
    Assert.assertEquals(mdl.getTypeName(),
        mdl.getValueByKey(MdlTable.TYPE_NAME));
    Assert.assertEquals(mdl.getSelfReferencingColName(),
        mdl.getValueByKey(MdlTable.SELF_REFERENCING_COL_NAME));
    Assert.assertEquals(mdl.getRefGeneration(),
        mdl.getValueByKey(MdlTable.REF_GENERATION));
    Assert.assertEquals(mdl.getColmuns(),
        mdl.getValueByKey(MdlTable.COLMUNS));
    Assert.assertEquals(mdl.getPrimaryKeys(),
        mdl.getValueByKey(MdlTable.PRIMARY_KEYS));
    Assert.assertEquals(mdl.getIndexs(),
        mdl.getValueByKey(MdlTable.INDEXS));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTable mdl = new MdlTable();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setValueByKey(MdlTable.TABLE_CAT, tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setValueByKey(MdlTable.TABLE_SCHEM, tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setValueByKey(MdlTable.TABLE_NAME, tableName);
    java.lang.String tableType = new java.lang.String("tableType");
    mdl.setValueByKey(MdlTable.TABLE_TYPE, tableType);
    java.lang.String remarks = new java.lang.String("remarks");
    mdl.setValueByKey(MdlTable.REMARKS, remarks);
    java.lang.String typeCat = new java.lang.String("typeCat");
    mdl.setValueByKey(MdlTable.TYPE_CAT, typeCat);
    java.lang.String typeSchem = new java.lang.String("typeSchem");
    mdl.setValueByKey(MdlTable.TYPE_SCHEM, typeSchem);
    java.lang.String typeName = new java.lang.String("typeName");
    mdl.setValueByKey(MdlTable.TYPE_NAME, typeName);
    java.lang.String selfReferencingColName = new java.lang.String("selfReferencingColName");
    mdl.setValueByKey(MdlTable.SELF_REFERENCING_COL_NAME, selfReferencingColName);
    java.lang.String refGeneration = new java.lang.String("refGeneration");
    mdl.setValueByKey(MdlTable.REF_GENERATION, refGeneration);
    java.util.ArrayList<MdlColumn> colmuns = new java.util.ArrayList<MdlColumn>();
    mdl.setValueByKey(MdlTable.COLMUNS, colmuns);
    java.util.ArrayList<MdlPrimaryKey> primaryKeys = new java.util.ArrayList<MdlPrimaryKey>();
    mdl.setValueByKey(MdlTable.PRIMARY_KEYS, primaryKeys);
    java.util.ArrayList<MdlIndex> indexs = new java.util.ArrayList<MdlIndex>();
    mdl.setValueByKey(MdlTable.INDEXS, indexs);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey( MdlTable.TABLE_CAT ));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey( MdlTable.TABLE_SCHEM ));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey( MdlTable.TABLE_NAME ));
    Assert.assertEquals(mdl.getTableType(),
        mdl.getValueByKey( MdlTable.TABLE_TYPE ));
    Assert.assertEquals(mdl.getRemarks(),
        mdl.getValueByKey( MdlTable.REMARKS ));
    Assert.assertEquals(mdl.getTypeCat(),
        mdl.getValueByKey( MdlTable.TYPE_CAT ));
    Assert.assertEquals(mdl.getTypeSchem(),
        mdl.getValueByKey( MdlTable.TYPE_SCHEM ));
    Assert.assertEquals(mdl.getTypeName(),
        mdl.getValueByKey( MdlTable.TYPE_NAME ));
    Assert.assertEquals(mdl.getSelfReferencingColName(),
        mdl.getValueByKey( MdlTable.SELF_REFERENCING_COL_NAME ));
    Assert.assertEquals(mdl.getRefGeneration(),
        mdl.getValueByKey( MdlTable.REF_GENERATION ));
    Assert.assertEquals(mdl.getColmuns(),
        mdl.getValueByKey( MdlTable.COLMUNS ));
    Assert.assertEquals(mdl.getPrimaryKeys(),
        mdl.getValueByKey( MdlTable.PRIMARY_KEYS ));
    Assert.assertEquals(mdl.getIndexs(),
        mdl.getValueByKey( MdlTable.INDEXS ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTableTest.class.getDeclaredMethods();
    Method[] methods = MdlTable.class.getDeclaredMethods();
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
