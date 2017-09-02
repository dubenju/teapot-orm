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
 * 表PRIMARY_KEY的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 13:15:52.685 +0900自动生成的。
 */
public class MdlPrimaryKeyTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "PRIMARY_KEY", MdlPrimaryKey.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlPrimaryKey() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性tableCat的值的测试方法.
   */
  @Test
  public void testGetTableCat() throws Exception {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
    MdlPrimaryKey mdl = new MdlPrimaryKey();
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
   * 返回属性keySeq的值的测试方法.
   */
  @Test
  public void testGetKeySeq() throws Exception {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String keySeq = new java.lang.String("keySeq");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("keySeq"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, keySeq);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性keySeq的值与设定内容一致：", keySeq,
        mdl.getKeySeq());
  }

  /**
   * 设置属性keySeq的值的测试方法.
   */
  @Test
  public void testSetKeySeq() throws Exception {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String keySeq = new java.lang.String("keySeq");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("keySeq"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setKeySeq(keySeq);

    //(B-2)
    Assert.assertEquals("设置属性keySeq的值与设定内容一致：", keySeq,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性pkName的值的测试方法.
   */
  @Test
  public void testGetPkName() throws Exception {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String pkName = new java.lang.String("pkName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("pkName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, pkName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性pkName的值与设定内容一致：", pkName,
        mdl.getPkName());
  }

  /**
   * 设置属性pkName的值的测试方法.
   */
  @Test
  public void testSetPkName() throws Exception {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String pkName = new java.lang.String("pkName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("pkName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPkName(pkName);

    //(B-2)
    Assert.assertEquals("设置属性pkName的值与设定内容一致：", pkName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlPrimaryKey mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlPrimaryKey();
    stringBuffer = new StringBuffer();
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlPrimaryKey mdlAllCol = new MdlPrimaryKey();

    mdl = new MdlPrimaryKey();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlPrimaryKey();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlPrimaryKey();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlPrimaryKey();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlPrimaryKey();
    java.lang.String keySeq = new java.lang.String("keySeq");
    mdl.setKeySeq(keySeq);
    mdlAllCol.setKeySeq(keySeq);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getKeySeq());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlPrimaryKey();
    java.lang.String pkName = new java.lang.String("pkName");
    mdl.setPkName(pkName);
    mdlAllCol.setPkName(pkName);
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
    stringBuffer.append(mdl.getPkName());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getTableCat()
        + "," + mdlAllCol.getTableSchem()
        + "," + mdlAllCol.getTableName()
        + "," + mdlAllCol.getColumnName()
        + "," + mdlAllCol.getKeySeq()
        + "," + mdlAllCol.getPkName()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGet() {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.setTableCat(tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.setTableSchem(tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.setTableName(tableName);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.setColumnName(columnName);
    java.lang.String keySeq = new java.lang.String("keySeq");
    mdl.setKeySeq(keySeq);
    java.lang.String pkName = new java.lang.String("pkName");
    mdl.setPkName(pkName);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.get(MdlPrimaryKey.TABLE_CAT));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.get(MdlPrimaryKey.TABLE_SCHEM));
    Assert.assertEquals(mdl.getTableName(),
        mdl.get(MdlPrimaryKey.TABLE_NAME));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.get(MdlPrimaryKey.COLUMN_NAME));
    Assert.assertEquals(mdl.getKeySeq(),
        mdl.get(MdlPrimaryKey.KEY_SEQ));
    Assert.assertEquals(mdl.getPkName(),
        mdl.get(MdlPrimaryKey.PK_NAME));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSet() {
    MdlPrimaryKey mdl = new MdlPrimaryKey();
    java.lang.String tableCat = new java.lang.String("tableCat");
    mdl.set(MdlPrimaryKey.TABLE_CAT, tableCat);
    java.lang.String tableSchem = new java.lang.String("tableSchem");
    mdl.set(MdlPrimaryKey.TABLE_SCHEM, tableSchem);
    java.lang.String tableName = new java.lang.String("tableName");
    mdl.set(MdlPrimaryKey.TABLE_NAME, tableName);
    java.lang.String columnName = new java.lang.String("columnName");
    mdl.set(MdlPrimaryKey.COLUMN_NAME, columnName);
    java.lang.String keySeq = new java.lang.String("keySeq");
    mdl.set(MdlPrimaryKey.KEY_SEQ, keySeq);
    java.lang.String pkName = new java.lang.String("pkName");
    mdl.set(MdlPrimaryKey.PK_NAME, pkName);

    Assert.assertEquals(mdl.getTableCat(),
        mdl.get( MdlPrimaryKey.TABLE_CAT ));
    Assert.assertEquals(mdl.getTableSchem(),
        mdl.get( MdlPrimaryKey.TABLE_SCHEM ));
    Assert.assertEquals(mdl.getTableName(),
        mdl.get( MdlPrimaryKey.TABLE_NAME ));
    Assert.assertEquals(mdl.getColumnName(),
        mdl.get( MdlPrimaryKey.COLUMN_NAME ));
    Assert.assertEquals(mdl.getKeySeq(),
        mdl.get( MdlPrimaryKey.KEY_SEQ ));
    Assert.assertEquals(mdl.getPkName(),
        mdl.get( MdlPrimaryKey.PK_NAME ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlPrimaryKeyTest.class.getDeclaredMethods();
    Method[] methods = MdlPrimaryKey.class.getDeclaredMethods();
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
