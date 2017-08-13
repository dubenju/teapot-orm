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
 * 表COLUMN的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:51.933 +0900自动生成的。
 */
public class MdlColumnTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "COLUMN", MdlColumn.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlColumn() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性tableCat的值的测试方法.
   */
  @Test
  public void testGetTableCat() throws Exception {
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
   * 返回属性columnName的值的测试方法.
   */
  @Test
  public void testGetColumnName() throws Exception {
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
   * 返回属性dataType的值的测试方法.
   */
  @Test
  public void testGetDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String dataType = new java.lang.String("dataType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("dataType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, dataType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性dataType的值与设定内容一致：", dataType,
        mdl.getDataType());
  }

  /**
   * 设置属性dataType的值的测试方法.
   */
  @Test
  public void testSetDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String dataType = new java.lang.String("dataType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("dataType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setDataType(dataType);

    //(B-2)
    Assert.assertEquals("设置属性dataType的值与设定内容一致：", dataType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性typeName的值的测试方法.
   */
  @Test
  public void testGetTypeName() throws Exception {
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
   * 返回属性typeNameJava的值的测试方法.
   */
  @Test
  public void testGetTypeNameJava() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String typeNameJava = new java.lang.String("typeNameJava");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("typeNameJava"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, typeNameJava);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性typeNameJava的值与设定内容一致：", typeNameJava,
        mdl.getTypeNameJava());
  }

  /**
   * 设置属性typeNameJava的值的测试方法.
   */
  @Test
  public void testSetTypeNameJava() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String typeNameJava = new java.lang.String("typeNameJava");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("typeNameJava"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTypeNameJava(typeNameJava);

    //(B-2)
    Assert.assertEquals("设置属性typeNameJava的值与设定内容一致：", typeNameJava,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性columnSize的值的测试方法.
   */
  @Test
  public void testGetColumnSize() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String columnSize = new java.lang.String("columnSize");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("columnSize"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, columnSize);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性columnSize的值与设定内容一致：", columnSize,
        mdl.getColumnSize());
  }

  /**
   * 设置属性columnSize的值的测试方法.
   */
  @Test
  public void testSetColumnSize() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String columnSize = new java.lang.String("columnSize");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("columnSize"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setColumnSize(columnSize);

    //(B-2)
    Assert.assertEquals("设置属性columnSize的值与设定内容一致：", columnSize,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bufferLength的值的测试方法.
   */
  @Test
  public void testGetBufferLength() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String bufferLength = new java.lang.String("bufferLength");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bufferLength"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bufferLength);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bufferLength的值与设定内容一致：", bufferLength,
        mdl.getBufferLength());
  }

  /**
   * 设置属性bufferLength的值的测试方法.
   */
  @Test
  public void testSetBufferLength() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String bufferLength = new java.lang.String("bufferLength");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bufferLength"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBufferLength(bufferLength);

    //(B-2)
    Assert.assertEquals("设置属性bufferLength的值与设定内容一致：", bufferLength,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性decimalDigits的值的测试方法.
   */
  @Test
  public void testGetDecimalDigits() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String decimalDigits = new java.lang.String("decimalDigits");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("decimalDigits"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, decimalDigits);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性decimalDigits的值与设定内容一致：", decimalDigits,
        mdl.getDecimalDigits());
  }

  /**
   * 设置属性decimalDigits的值的测试方法.
   */
  @Test
  public void testSetDecimalDigits() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String decimalDigits = new java.lang.String("decimalDigits");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("decimalDigits"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setDecimalDigits(decimalDigits);

    //(B-2)
    Assert.assertEquals("设置属性decimalDigits的值与设定内容一致：", decimalDigits,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性numPrecRadix的值的测试方法.
   */
  @Test
  public void testGetNumPrecRadix() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String numPrecRadix = new java.lang.String("numPrecRadix");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("numPrecRadix"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, numPrecRadix);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性numPrecRadix的值与设定内容一致：", numPrecRadix,
        mdl.getNumPrecRadix());
  }

  /**
   * 设置属性numPrecRadix的值的测试方法.
   */
  @Test
  public void testSetNumPrecRadix() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String numPrecRadix = new java.lang.String("numPrecRadix");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("numPrecRadix"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setNumPrecRadix(numPrecRadix);

    //(B-2)
    Assert.assertEquals("设置属性numPrecRadix的值与设定内容一致：", numPrecRadix,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性nullable的值的测试方法.
   */
  @Test
  public void testGetNullable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String nullable = new java.lang.String("nullable");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("nullable"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, nullable);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性nullable的值与设定内容一致：", nullable,
        mdl.getNullable());
  }

  /**
   * 设置属性nullable的值的测试方法.
   */
  @Test
  public void testSetNullable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String nullable = new java.lang.String("nullable");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("nullable"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setNullable(nullable);

    //(B-2)
    Assert.assertEquals("设置属性nullable的值与设定内容一致：", nullable,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性remarks的值的测试方法.
   */
  @Test
  public void testGetRemarks() throws Exception {
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
   * 返回属性columnDef的值的测试方法.
   */
  @Test
  public void testGetColumnDef() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String columnDef = new java.lang.String("columnDef");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("columnDef"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, columnDef);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性columnDef的值与设定内容一致：", columnDef,
        mdl.getColumnDef());
  }

  /**
   * 设置属性columnDef的值的测试方法.
   */
  @Test
  public void testSetColumnDef() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String columnDef = new java.lang.String("columnDef");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("columnDef"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setColumnDef(columnDef);

    //(B-2)
    Assert.assertEquals("设置属性columnDef的值与设定内容一致：", columnDef,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性sqlDataType的值的测试方法.
   */
  @Test
  public void testGetSqlDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sqlDataType = new java.lang.String("sqlDataType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("sqlDataType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, sqlDataType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性sqlDataType的值与设定内容一致：", sqlDataType,
        mdl.getSqlDataType());
  }

  /**
   * 设置属性sqlDataType的值的测试方法.
   */
  @Test
  public void testSetSqlDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sqlDataType = new java.lang.String("sqlDataType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("sqlDataType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setSqlDataType(sqlDataType);

    //(B-2)
    Assert.assertEquals("设置属性sqlDataType的值与设定内容一致：", sqlDataType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性sqlDatetimeSub的值的测试方法.
   */
  @Test
  public void testGetSqlDatetimeSub() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sqlDatetimeSub = new java.lang.String("sqlDatetimeSub");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("sqlDatetimeSub"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, sqlDatetimeSub);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性sqlDatetimeSub的值与设定内容一致：", sqlDatetimeSub,
        mdl.getSqlDatetimeSub());
  }

  /**
   * 设置属性sqlDatetimeSub的值的测试方法.
   */
  @Test
  public void testSetSqlDatetimeSub() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sqlDatetimeSub = new java.lang.String("sqlDatetimeSub");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("sqlDatetimeSub"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setSqlDatetimeSub(sqlDatetimeSub);

    //(B-2)
    Assert.assertEquals("设置属性sqlDatetimeSub的值与设定内容一致：", sqlDatetimeSub,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性charOctetLength的值的测试方法.
   */
  @Test
  public void testGetCharOctetLength() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String charOctetLength = new java.lang.String("charOctetLength");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("charOctetLength"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, charOctetLength);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性charOctetLength的值与设定内容一致：", charOctetLength,
        mdl.getCharOctetLength());
  }

  /**
   * 设置属性charOctetLength的值的测试方法.
   */
  @Test
  public void testSetCharOctetLength() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String charOctetLength = new java.lang.String("charOctetLength");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("charOctetLength"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCharOctetLength(charOctetLength);

    //(B-2)
    Assert.assertEquals("设置属性charOctetLength的值与设定内容一致：", charOctetLength,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性ordinalPosition的值的测试方法.
   */
  @Test
  public void testGetOrdinalPosition() throws Exception {
    MdlColumn mdl = new MdlColumn();
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
    MdlColumn mdl = new MdlColumn();
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
   * 返回属性isNullable的值的测试方法.
   */
  @Test
  public void testGetIsNullable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isNullable = new java.lang.String("isNullable");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("isNullable"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, isNullable);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性isNullable的值与设定内容一致：", isNullable,
        mdl.getIsNullable());
  }

  /**
   * 设置属性isNullable的值的测试方法.
   */
  @Test
  public void testSetIsNullable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isNullable = new java.lang.String("isNullable");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("isNullable"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIsNullable(isNullable);

    //(B-2)
    Assert.assertEquals("设置属性isNullable的值与设定内容一致：", isNullable,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性scopeCatalog的值的测试方法.
   */
  @Test
  public void testGetScopeCatalog() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeCatalog = new java.lang.String("scopeCatalog");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeCatalog"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, scopeCatalog);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性scopeCatalog的值与设定内容一致：", scopeCatalog,
        mdl.getScopeCatalog());
  }

  /**
   * 设置属性scopeCatalog的值的测试方法.
   */
  @Test
  public void testSetScopeCatalog() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeCatalog = new java.lang.String("scopeCatalog");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeCatalog"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setScopeCatalog(scopeCatalog);

    //(B-2)
    Assert.assertEquals("设置属性scopeCatalog的值与设定内容一致：", scopeCatalog,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性scopeSchema的值的测试方法.
   */
  @Test
  public void testGetScopeSchema() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeSchema = new java.lang.String("scopeSchema");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeSchema"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, scopeSchema);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性scopeSchema的值与设定内容一致：", scopeSchema,
        mdl.getScopeSchema());
  }

  /**
   * 设置属性scopeSchema的值的测试方法.
   */
  @Test
  public void testSetScopeSchema() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeSchema = new java.lang.String("scopeSchema");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeSchema"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setScopeSchema(scopeSchema);

    //(B-2)
    Assert.assertEquals("设置属性scopeSchema的值与设定内容一致：", scopeSchema,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性scopeTable的值的测试方法.
   */
  @Test
  public void testGetScopeTable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeTable = new java.lang.String("scopeTable");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeTable"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, scopeTable);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性scopeTable的值与设定内容一致：", scopeTable,
        mdl.getScopeTable());
  }

  /**
   * 设置属性scopeTable的值的测试方法.
   */
  @Test
  public void testSetScopeTable() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String scopeTable = new java.lang.String("scopeTable");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("scopeTable"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setScopeTable(scopeTable);

    //(B-2)
    Assert.assertEquals("设置属性scopeTable的值与设定内容一致：", scopeTable,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性sourceDataType的值的测试方法.
   */
  @Test
  public void testGetSourceDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sourceDataType = new java.lang.String("sourceDataType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("sourceDataType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, sourceDataType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性sourceDataType的值与设定内容一致：", sourceDataType,
        mdl.getSourceDataType());
  }

  /**
   * 设置属性sourceDataType的值的测试方法.
   */
  @Test
  public void testSetSourceDataType() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String sourceDataType = new java.lang.String("sourceDataType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("sourceDataType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setSourceDataType(sourceDataType);

    //(B-2)
    Assert.assertEquals("设置属性sourceDataType的值与设定内容一致：", sourceDataType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性isAutoincrement的值的测试方法.
   */
  @Test
  public void testGetIsAutoincrement() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isAutoincrement = new java.lang.String("isAutoincrement");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("isAutoincrement"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, isAutoincrement);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性isAutoincrement的值与设定内容一致：", isAutoincrement,
        mdl.getIsAutoincrement());
  }

  /**
   * 设置属性isAutoincrement的值的测试方法.
   */
  @Test
  public void testSetIsAutoincrement() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isAutoincrement = new java.lang.String("isAutoincrement");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("isAutoincrement"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIsAutoincrement(isAutoincrement);

    //(B-2)
    Assert.assertEquals("设置属性isAutoincrement的值与设定内容一致：", isAutoincrement,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性isGeneratedcolumn的值的测试方法.
   */
  @Test
  public void testGetIsGeneratedcolumn() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isGeneratedcolumn = new java.lang.String("isGeneratedcolumn");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("isGeneratedcolumn"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, isGeneratedcolumn);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性isGeneratedcolumn的值与设定内容一致：", isGeneratedcolumn,
        mdl.getIsGeneratedcolumn());
  }

  /**
   * 设置属性isGeneratedcolumn的值的测试方法.
   */
  @Test
  public void testSetIsGeneratedcolumn() throws Exception {
    MdlColumn mdl = new MdlColumn();
    java.lang.String isGeneratedcolumn = new java.lang.String("isGeneratedcolumn");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("isGeneratedcolumn"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIsGeneratedcolumn(isGeneratedcolumn);

    //(B-2)
    Assert.assertEquals("设置属性isGeneratedcolumn的值与设定内容一致：", isGeneratedcolumn,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlColumn mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlColumn();
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

    MdlColumn mdlAllCol = new MdlColumn();

    mdl = new MdlColumn();
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

    mdl = new MdlColumn();
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

    mdl = new MdlColumn();
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

    mdl = new MdlColumn();
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
    stringBuffer.append(mdl.getColumnName());
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

    mdl = new MdlColumn();
    java.lang.String dataType = new java.lang.String("dataType");
    mdl.setDataType(dataType);
    mdlAllCol.setDataType(dataType);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getDataType());
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

    mdl = new MdlColumn();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String typeNameJava = new java.lang.String("typeNameJava");
    mdl.setTypeNameJava(typeNameJava);
    mdlAllCol.setTypeNameJava(typeNameJava);
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
    stringBuffer.append(mdl.getTypeNameJava());
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

    mdl = new MdlColumn();
    java.lang.String columnSize = new java.lang.String("columnSize");
    mdl.setColumnSize(columnSize);
    mdlAllCol.setColumnSize(columnSize);
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
    stringBuffer.append(mdl.getColumnSize());
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

    mdl = new MdlColumn();
    java.lang.String bufferLength = new java.lang.String("bufferLength");
    mdl.setBufferLength(bufferLength);
    mdlAllCol.setBufferLength(bufferLength);
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
    stringBuffer.append(mdl.getBufferLength());
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String decimalDigits = new java.lang.String("decimalDigits");
    mdl.setDecimalDigits(decimalDigits);
    mdlAllCol.setDecimalDigits(decimalDigits);
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
    stringBuffer.append(mdl.getDecimalDigits());
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String numPrecRadix = new java.lang.String("numPrecRadix");
    mdl.setNumPrecRadix(numPrecRadix);
    mdlAllCol.setNumPrecRadix(numPrecRadix);
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
    stringBuffer.append(mdl.getNumPrecRadix());
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String nullable = new java.lang.String("nullable");
    mdl.setNullable(nullable);
    mdlAllCol.setNullable(nullable);
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
    stringBuffer.append(mdl.getNullable());
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String columnDef = new java.lang.String("columnDef");
    mdl.setColumnDef(columnDef);
    mdlAllCol.setColumnDef(columnDef);
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getColumnDef());
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

    mdl = new MdlColumn();
    java.lang.String sqlDataType = new java.lang.String("sqlDataType");
    mdl.setSqlDataType(sqlDataType);
    mdlAllCol.setSqlDataType(sqlDataType);
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getSqlDataType());
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

    mdl = new MdlColumn();
    java.lang.String sqlDatetimeSub = new java.lang.String("sqlDatetimeSub");
    mdl.setSqlDatetimeSub(sqlDatetimeSub);
    mdlAllCol.setSqlDatetimeSub(sqlDatetimeSub);
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getSqlDatetimeSub());
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

    mdl = new MdlColumn();
    java.lang.String charOctetLength = new java.lang.String("charOctetLength");
    mdl.setCharOctetLength(charOctetLength);
    mdlAllCol.setCharOctetLength(charOctetLength);
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCharOctetLength());
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

    mdl = new MdlColumn();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String isNullable = new java.lang.String("isNullable");
    mdl.setIsNullable(isNullable);
    mdlAllCol.setIsNullable(isNullable);
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
    stringBuffer.append(mdl.getIsNullable());
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

    mdl = new MdlColumn();
    java.lang.String scopeCatalog = new java.lang.String("scopeCatalog");
    mdl.setScopeCatalog(scopeCatalog);
    mdlAllCol.setScopeCatalog(scopeCatalog);
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
    stringBuffer.append(mdl.getScopeCatalog());
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

    mdl = new MdlColumn();
    java.lang.String scopeSchema = new java.lang.String("scopeSchema");
    mdl.setScopeSchema(scopeSchema);
    mdlAllCol.setScopeSchema(scopeSchema);
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
    stringBuffer.append(mdl.getScopeSchema());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String scopeTable = new java.lang.String("scopeTable");
    mdl.setScopeTable(scopeTable);
    mdlAllCol.setScopeTable(scopeTable);
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
    stringBuffer.append(mdl.getScopeTable());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String sourceDataType = new java.lang.String("sourceDataType");
    mdl.setSourceDataType(sourceDataType);
    mdlAllCol.setSourceDataType(sourceDataType);
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
    stringBuffer.append(mdl.getSourceDataType());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String isAutoincrement = new java.lang.String("isAutoincrement");
    mdl.setIsAutoincrement(isAutoincrement);
    mdlAllCol.setIsAutoincrement(isAutoincrement);
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
    stringBuffer.append(mdl.getIsAutoincrement());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlColumn();
    java.lang.String isGeneratedcolumn = new java.lang.String("isGeneratedcolumn");
    mdl.setIsGeneratedcolumn(isGeneratedcolumn);
    mdlAllCol.setIsGeneratedcolumn(isGeneratedcolumn);
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
    stringBuffer.append(mdl.getIsGeneratedcolumn());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getTableCat()
        + "," + mdlAllCol.getTableSchem()
        + "," + mdlAllCol.getTableName()
        + "," + mdlAllCol.getColumnName()
        + "," + mdlAllCol.getDataType()
        + "," + mdlAllCol.getTypeName()
        + "," + mdlAllCol.getTypeNameJava()
        + "," + mdlAllCol.getColumnSize()
        + "," + mdlAllCol.getBufferLength()
        + "," + mdlAllCol.getDecimalDigits()
        + "," + mdlAllCol.getNumPrecRadix()
        + "," + mdlAllCol.getNullable()
        + "," + mdlAllCol.getRemarks()
        + "," + mdlAllCol.getColumnDef()
        + "," + mdlAllCol.getSqlDataType()
        + "," + mdlAllCol.getSqlDatetimeSub()
        + "," + mdlAllCol.getCharOctetLength()
        + "," + mdlAllCol.getOrdinalPosition()
        + "," + mdlAllCol.getIsNullable()
        + "," + mdlAllCol.getScopeCatalog()
        + "," + mdlAllCol.getScopeSchema()
        + "," + mdlAllCol.getScopeTable()
        + "," + mdlAllCol.getSourceDataType()
        + "," + mdlAllCol.getIsAutoincrement()
        + "," + mdlAllCol.getIsGeneratedcolumn()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGetValueByKey() {
    MdlColumn mdl = new MdlColumn();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setTableCat(tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setTableSchem(tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setTableName(tableName);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setColumnName(columnName);
    java.lang.String dataType = new java.lang.String("dataType");
    mdl.setDataType(dataType);
    java.lang.String typeName = new java.lang.String("typeName");
    mdl.setTypeName(typeName);
    java.lang.String typeNameJava = new java.lang.String("typeNameJava");
    mdl.setTypeNameJava(typeNameJava);
    java.lang.String columnSize = new java.lang.String("columnSize");
    mdl.setColumnSize(columnSize);
    java.lang.String bufferLength = new java.lang.String("bufferLength");
    mdl.setBufferLength(bufferLength);
    java.lang.String decimalDigits = new java.lang.String("decimalDigits");
    mdl.setDecimalDigits(decimalDigits);
    java.lang.String numPrecRadix = new java.lang.String("numPrecRadix");
    mdl.setNumPrecRadix(numPrecRadix);
    java.lang.String nullable = new java.lang.String("nullable");
    mdl.setNullable(nullable);
    java.lang.String remarks = new java.lang.String("remarks");
    mdl.setRemarks(remarks);
    java.lang.String columnDef = new java.lang.String("columnDef");
    mdl.setColumnDef(columnDef);
    java.lang.String sqlDataType = new java.lang.String("sqlDataType");
    mdl.setSqlDataType(sqlDataType);
    java.lang.String sqlDatetimeSub = new java.lang.String("sqlDatetimeSub");
    mdl.setSqlDatetimeSub(sqlDatetimeSub);
    java.lang.String charOctetLength = new java.lang.String("charOctetLength");
    mdl.setCharOctetLength(charOctetLength);
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");
    mdl.setOrdinalPosition(ordinalPosition);
    java.lang.String isNullable = new java.lang.String("isNullable");
    mdl.setIsNullable(isNullable);
    java.lang.String scopeCatalog = new java.lang.String("scopeCatalog");
    mdl.setScopeCatalog(scopeCatalog);
    java.lang.String scopeSchema = new java.lang.String("scopeSchema");
    mdl.setScopeSchema(scopeSchema);
    java.lang.String scopeTable = new java.lang.String("scopeTable");
    mdl.setScopeTable(scopeTable);
    java.lang.String sourceDataType = new java.lang.String("sourceDataType");
    mdl.setSourceDataType(sourceDataType);
    java.lang.String isAutoincrement = new java.lang.String("isAutoincrement");
    mdl.setIsAutoincrement(isAutoincrement);
    java.lang.String isGeneratedcolumn = new java.lang.String("isGeneratedcolumn");
    mdl.setIsGeneratedcolumn(isGeneratedcolumn);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey(MdlColumn.TABLE_CAT));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey(MdlColumn.TABLE_SCHEM));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey(MdlColumn.TABLE_NAME));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.getValueByKey(MdlColumn.COLUMN_NAME));
    Assert.assertEquals(mdl.getDataType(),
        mdl.getValueByKey(MdlColumn.DATA_TYPE));
    Assert.assertEquals(mdl.getTypeName(),
        mdl.getValueByKey(MdlColumn.TYPE_NAME));
    Assert.assertEquals(mdl.getTypeNameJava(),
        mdl.getValueByKey(MdlColumn.TYPE_NAME_JAVA));
    Assert.assertEquals(mdl.getColumnSize(),
        mdl.getValueByKey(MdlColumn.COLUMN_SIZE));
    Assert.assertEquals(mdl.getBufferLength(),
        mdl.getValueByKey(MdlColumn.BUFFER_LENGTH));
    Assert.assertEquals(mdl.getDecimalDigits(),
        mdl.getValueByKey(MdlColumn.DECIMAL_DIGITS));
    Assert.assertEquals(mdl.getNumPrecRadix(),
        mdl.getValueByKey(MdlColumn.NUM_PREC_RADIX));
    Assert.assertEquals(mdl.getNullable(),
        mdl.getValueByKey(MdlColumn.NULLABLE));
    Assert.assertEquals(mdl.getRemarks(),
        mdl.getValueByKey(MdlColumn.REMARKS));
    Assert.assertEquals(mdl.getColumnDef(),
        mdl.getValueByKey(MdlColumn.COLUMN_DEF));
    Assert.assertEquals(mdl.getSqlDataType(),
        mdl.getValueByKey(MdlColumn.SQL_DATA_TYPE));
    Assert.assertEquals(mdl.getSqlDatetimeSub(),
        mdl.getValueByKey(MdlColumn.SQL_DATETIME_SUB));
    Assert.assertEquals(mdl.getCharOctetLength(),
        mdl.getValueByKey(MdlColumn.CHAR_OCTET_LENGTH));
    Assert.assertEquals(mdl.getOrdinalPosition(),
        mdl.getValueByKey(MdlColumn.ORDINAL_POSITION));
    Assert.assertEquals(mdl.getIsNullable(),
        mdl.getValueByKey(MdlColumn.IS_NULLABLE));
    Assert.assertEquals(mdl.getScopeCatalog(),
        mdl.getValueByKey(MdlColumn.SCOPE_CATALOG));
    Assert.assertEquals(mdl.getScopeSchema(),
        mdl.getValueByKey(MdlColumn.SCOPE_SCHEMA));
    Assert.assertEquals(mdl.getScopeTable(),
        mdl.getValueByKey(MdlColumn.SCOPE_TABLE));
    Assert.assertEquals(mdl.getSourceDataType(),
        mdl.getValueByKey(MdlColumn.SOURCE_DATA_TYPE));
    Assert.assertEquals(mdl.getIsAutoincrement(),
        mdl.getValueByKey(MdlColumn.IS_AUTOINCREMENT));
    Assert.assertEquals(mdl.getIsGeneratedcolumn(),
        mdl.getValueByKey(MdlColumn.IS_GENERATEDCOLUMN));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlColumn mdl = new MdlColumn();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setValueByKey(MdlColumn.TABLE_CAT, tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setValueByKey(MdlColumn.TABLE_SCHEM, tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setValueByKey(MdlColumn.TABLE_NAME, tableName);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setValueByKey(MdlColumn.COLUMN_NAME, columnName);
    java.lang.String dataType = new java.lang.String("dataType");
    mdl.setValueByKey(MdlColumn.DATA_TYPE, dataType);
    java.lang.String typeName = new java.lang.String("typeName");
    mdl.setValueByKey(MdlColumn.TYPE_NAME, typeName);
    java.lang.String typeNameJava = new java.lang.String("typeNameJava");
    mdl.setValueByKey(MdlColumn.TYPE_NAME_JAVA, typeNameJava);
    java.lang.String columnSize = new java.lang.String("columnSize");
    mdl.setValueByKey(MdlColumn.COLUMN_SIZE, columnSize);
    java.lang.String bufferLength = new java.lang.String("bufferLength");
    mdl.setValueByKey(MdlColumn.BUFFER_LENGTH, bufferLength);
    java.lang.String decimalDigits = new java.lang.String("decimalDigits");
    mdl.setValueByKey(MdlColumn.DECIMAL_DIGITS, decimalDigits);
    java.lang.String numPrecRadix = new java.lang.String("numPrecRadix");
    mdl.setValueByKey(MdlColumn.NUM_PREC_RADIX, numPrecRadix);
    java.lang.String nullable = new java.lang.String("nullable");
    mdl.setValueByKey(MdlColumn.NULLABLE, nullable);
    java.lang.String remarks = new java.lang.String("remarks");
    mdl.setValueByKey(MdlColumn.REMARKS, remarks);
    java.lang.String columnDef = new java.lang.String("columnDef");
    mdl.setValueByKey(MdlColumn.COLUMN_DEF, columnDef);
    java.lang.String sqlDataType = new java.lang.String("sqlDataType");
    mdl.setValueByKey(MdlColumn.SQL_DATA_TYPE, sqlDataType);
    java.lang.String sqlDatetimeSub = new java.lang.String("sqlDatetimeSub");
    mdl.setValueByKey(MdlColumn.SQL_DATETIME_SUB, sqlDatetimeSub);
    java.lang.String charOctetLength = new java.lang.String("charOctetLength");
    mdl.setValueByKey(MdlColumn.CHAR_OCTET_LENGTH, charOctetLength);
    java.lang.String ordinalPosition = new java.lang.String("ordinalPosition");
    mdl.setValueByKey(MdlColumn.ORDINAL_POSITION, ordinalPosition);
    java.lang.String isNullable = new java.lang.String("isNullable");
    mdl.setValueByKey(MdlColumn.IS_NULLABLE, isNullable);
    java.lang.String scopeCatalog = new java.lang.String("scopeCatalog");
    mdl.setValueByKey(MdlColumn.SCOPE_CATALOG, scopeCatalog);
    java.lang.String scopeSchema = new java.lang.String("scopeSchema");
    mdl.setValueByKey(MdlColumn.SCOPE_SCHEMA, scopeSchema);
    java.lang.String scopeTable = new java.lang.String("scopeTable");
    mdl.setValueByKey(MdlColumn.SCOPE_TABLE, scopeTable);
    java.lang.String sourceDataType = new java.lang.String("sourceDataType");
    mdl.setValueByKey(MdlColumn.SOURCE_DATA_TYPE, sourceDataType);
    java.lang.String isAutoincrement = new java.lang.String("isAutoincrement");
    mdl.setValueByKey(MdlColumn.IS_AUTOINCREMENT, isAutoincrement);
    java.lang.String isGeneratedcolumn = new java.lang.String("isGeneratedcolumn");
    mdl.setValueByKey(MdlColumn.IS_GENERATEDCOLUMN, isGeneratedcolumn);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.getValueByKey( MdlColumn.TABLE_CAT ));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.getValueByKey( MdlColumn.TABLE_SCHEM ));
    Assert.assertEquals(mdl.getTableName(),
        mdl.getValueByKey( MdlColumn.TABLE_NAME ));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.getValueByKey( MdlColumn.COLUMN_NAME ));
    Assert.assertEquals(mdl.getDataType(),
        mdl.getValueByKey( MdlColumn.DATA_TYPE ));
    Assert.assertEquals(mdl.getTypeName(),
        mdl.getValueByKey( MdlColumn.TYPE_NAME ));
    Assert.assertEquals(mdl.getTypeNameJava(),
        mdl.getValueByKey( MdlColumn.TYPE_NAME_JAVA ));
    Assert.assertEquals(mdl.getColumnSize(),
        mdl.getValueByKey( MdlColumn.COLUMN_SIZE ));
    Assert.assertEquals(mdl.getBufferLength(),
        mdl.getValueByKey( MdlColumn.BUFFER_LENGTH ));
    Assert.assertEquals(mdl.getDecimalDigits(),
        mdl.getValueByKey( MdlColumn.DECIMAL_DIGITS ));
    Assert.assertEquals(mdl.getNumPrecRadix(),
        mdl.getValueByKey( MdlColumn.NUM_PREC_RADIX ));
    Assert.assertEquals(mdl.getNullable(),
        mdl.getValueByKey( MdlColumn.NULLABLE ));
    Assert.assertEquals(mdl.getRemarks(),
        mdl.getValueByKey( MdlColumn.REMARKS ));
    Assert.assertEquals(mdl.getColumnDef(),
        mdl.getValueByKey( MdlColumn.COLUMN_DEF ));
    Assert.assertEquals(mdl.getSqlDataType(),
        mdl.getValueByKey( MdlColumn.SQL_DATA_TYPE ));
    Assert.assertEquals(mdl.getSqlDatetimeSub(),
        mdl.getValueByKey( MdlColumn.SQL_DATETIME_SUB ));
    Assert.assertEquals(mdl.getCharOctetLength(),
        mdl.getValueByKey( MdlColumn.CHAR_OCTET_LENGTH ));
    Assert.assertEquals(mdl.getOrdinalPosition(),
        mdl.getValueByKey( MdlColumn.ORDINAL_POSITION ));
    Assert.assertEquals(mdl.getIsNullable(),
        mdl.getValueByKey( MdlColumn.IS_NULLABLE ));
    Assert.assertEquals(mdl.getScopeCatalog(),
        mdl.getValueByKey( MdlColumn.SCOPE_CATALOG ));
    Assert.assertEquals(mdl.getScopeSchema(),
        mdl.getValueByKey( MdlColumn.SCOPE_SCHEMA ));
    Assert.assertEquals(mdl.getScopeTable(),
        mdl.getValueByKey( MdlColumn.SCOPE_TABLE ));
    Assert.assertEquals(mdl.getSourceDataType(),
        mdl.getValueByKey( MdlColumn.SOURCE_DATA_TYPE ));
    Assert.assertEquals(mdl.getIsAutoincrement(),
        mdl.getValueByKey( MdlColumn.IS_AUTOINCREMENT ));
    Assert.assertEquals(mdl.getIsGeneratedcolumn(),
        mdl.getValueByKey( MdlColumn.IS_GENERATEDCOLUMN ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlColumnTest.class.getDeclaredMethods();
    Method[] methods = MdlColumn.class.getDeclaredMethods();
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
