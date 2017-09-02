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
 * 表tbl_test的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/31 07:28:23.214 +0900自动生成的。
 */
public class MdlTblTestTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_TEST", MdlTblTest.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblTest() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性testId的值的测试方法.
   */
  @Test
  public void testGetTestId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testId = new java.lang.String("testId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testId的值与设定内容一致：", testId,
        mdl.getTestId());
  }

  /**
   * 设置属性testId的值的测试方法.
   */
  @Test
  public void testSetTestId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testId = new java.lang.String("testId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestId(testId);

    //(B-2)
    Assert.assertEquals("设置属性testId的值与设定内容一致：", testId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testName的值的测试方法.
   */
  @Test
  public void testGetTestName() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testName = new java.lang.String("testName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testName的值与设定内容一致：", testName,
        mdl.getTestName());
  }

  /**
   * 设置属性testName的值的测试方法.
   */
  @Test
  public void testSetTestName() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testName = new java.lang.String("testName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestName(testName);

    //(B-2)
    Assert.assertEquals("设置属性testName的值与设定内容一致：", testName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testBit的值的测试方法.
   */
  @Test
  public void testGetTestBit() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Boolean testBit = false;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testBit"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testBit);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testBit的值与设定内容一致：", testBit,
        mdl.getTestBit());
  }

  /**
   * 设置属性testBit的值的测试方法.
   */
  @Test
  public void testSetTestBit() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Boolean testBit = true;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testBit"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestBit(testBit);

    //(B-2)
    Assert.assertEquals("设置属性testBit的值与设定内容一致：", testBit,
        (java.lang.Boolean) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testBlob的值的测试方法.
   */
  @Test
  public void testGetTestBlob() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    byte[] testBlob = new byte[] {0x31};

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testBlob"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testBlob);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testBlob的值与设定内容一致：", testBlob,
        mdl.getTestBlob());
  }

  /**
   * 设置属性testBlob的值的测试方法.
   */
  @Test
  public void testSetTestBlob() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    byte[] testBlob = new byte[] {0x32};

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testBlob"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestBlob(testBlob);

    //(B-2)
    Assert.assertEquals("设置属性testBlob的值与设定内容一致：", testBlob,
        (byte[]) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testDouble的值的测试方法.
   */
  @Test
  public void testGetTestDouble() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Double testDouble = 12345.678d;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testDouble"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testDouble);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testDouble的值与设定内容一致：", testDouble,
        mdl.getTestDouble());
  }

  /**
   * 设置属性testDouble的值的测试方法.
   */
  @Test
  public void testSetTestDouble() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Double testDouble = 12346.679d;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testDouble"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestDouble(testDouble);

    //(B-2)
    Assert.assertEquals("设置属性testDouble的值与设定内容一致：", testDouble,
        (java.lang.Double) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testFloat的值的测试方法.
   */
  @Test
  public void testGetTestFloat() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Float testFloat = 12345.678f;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testFloat"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testFloat);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testFloat的值与设定内容一致：", testFloat,
        mdl.getTestFloat());
  }

  /**
   * 设置属性testFloat的值的测试方法.
   */
  @Test
  public void testSetTestFloat() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Float testFloat = 12355.668f;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testFloat"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestFloat(testFloat);

    //(B-2)
    Assert.assertEquals("设置属性testFloat的值与设定内容一致：", testFloat,
        (java.lang.Float) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testTinyint的值的测试方法.
   */
  @Test
  public void testGetTestTinyint() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Integer testTinyint = 54321;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testTinyint"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testTinyint);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testTinyint的值与设定内容一致：", testTinyint,
        mdl.getTestTinyint());
  }

  /**
   * 设置属性testTinyint的值的测试方法.
   */
  @Test
  public void testSetTestTinyint() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Integer testTinyint = 54421;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testTinyint"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestTinyint(testTinyint);

    //(B-2)
    Assert.assertEquals("设置属性testTinyint的值与设定内容一致：", testTinyint,
        (java.lang.Integer) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testInt的值的测试方法.
   */
  @Test
  public void testGetTestInt() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Long testInt = 654321L;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testInt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testInt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testInt的值与设定内容一致：", testInt,
        mdl.getTestInt());
  }

  /**
   * 设置属性testInt的值的测试方法.
   */
  @Test
  public void testSetTestInt() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Long testInt = 654221L;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testInt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestInt(testInt);

    //(B-2)
    Assert.assertEquals("设置属性testInt的值与设定内容一致：", testInt,
        (java.lang.Long) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testDecimal的值的测试方法.
   */
  @Test
  public void testGetTestDecimal() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.math.BigDecimal testDecimal = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testDecimal"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testDecimal);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testDecimal的值与设定内容一致：", testDecimal,
        mdl.getTestDecimal());
  }

  /**
   * 设置属性testDecimal的值的测试方法.
   */
  @Test
  public void testSetTestDecimal() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.math.BigDecimal testDecimal = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testDecimal"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestDecimal(testDecimal);

    //(B-2)
    Assert.assertEquals("设置属性testDecimal的值与设定内容一致：", testDecimal,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testBigint的值的测试方法.
   */
  @Test
  public void testGetTestBigint() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Long testBigint = 654321L;

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testBigint"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testBigint);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testBigint的值与设定内容一致：", testBigint,
        mdl.getTestBigint());
  }

  /**
   * 设置属性testBigint的值的测试方法.
   */
  @Test
  public void testSetTestBigint() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.Long testBigint = 654221L;

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testBigint"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestBigint(testBigint);

    //(B-2)
    Assert.assertEquals("设置属性testBigint的值与设定内容一致：", testBigint,
        (java.lang.Long) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testDatetime的值的测试方法.
   */
  @Test
  public void testGetTestDatetime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Timestamp testDatetime = new java.sql.Timestamp(curTime);

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testDatetime"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testDatetime);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testDatetime的值与设定内容一致：", testDatetime,
        mdl.getTestDatetime());
  }

  /**
   * 设置属性testDatetime的值的测试方法.
   */
  @Test
  public void testSetTestDatetime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Timestamp testDatetime = new java.sql.Timestamp(curTime);

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testDatetime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestDatetime(testDatetime);

    //(B-2)
    Assert.assertEquals("设置属性testDatetime的值与设定内容一致：", testDatetime,
        (java.sql.Timestamp) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性testOrder的值的测试方法.
   */
  @Test
  public void testGetTestOrder() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testOrder = new java.lang.String("testOrder");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("testOrder"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, testOrder);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性testOrder的值与设定内容一致：", testOrder,
        mdl.getTestOrder());
  }

  /**
   * 设置属性testOrder的值的测试方法.
   */
  @Test
  public void testSetTestOrder() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testOrder = new java.lang.String("testOrder");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("testOrder"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTestOrder(testOrder);

    //(B-2)
    Assert.assertEquals("设置属性testOrder的值与设定内容一致：", testOrder,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createDate的值的测试方法.
   */
  @Test
  public void testGetCreateDate() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Date createDate = new java.sql.Date(curTime);

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("createDate"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, createDate);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性createDate的值与设定内容一致：", createDate,
        mdl.getCreateDate());
  }

  /**
   * 设置属性createDate的值的测试方法.
   */
  @Test
  public void testSetCreateDate() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Date createDate = new java.sql.Date(curTime);

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateDate(createDate);

    //(B-2)
    Assert.assertEquals("设置属性createDate的值与设定内容一致：", createDate,
        (java.sql.Date) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createTime的值的测试方法.
   */
  @Test
  public void testGetCreateTime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Time createTime = new java.sql.Time(curTime);

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("createTime"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, createTime);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性createTime的值与设定内容一致：", createTime,
        mdl.getCreateTime());
  }

  /**
   * 设置属性createTime的值的测试方法.
   */
  @Test
  public void testSetCreateTime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Time createTime = new java.sql.Time(curTime);

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateTime(createTime);

    //(B-2)
    Assert.assertEquals("设置属性createTime的值与设定内容一致：", createTime,
        (java.sql.Time) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateDate的值的测试方法.
   */
  @Test
  public void testGetUpdateDate() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Date updateDate = new java.sql.Date(curTime);

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateDate"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateDate);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateDate的值与设定内容一致：", updateDate,
        mdl.getUpdateDate());
  }

  /**
   * 设置属性updateDate的值的测试方法.
   */
  @Test
  public void testSetUpdateDate() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Date updateDate = new java.sql.Date(curTime);

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateDate(updateDate);

    //(B-2)
    Assert.assertEquals("设置属性updateDate的值与设定内容一致：", updateDate,
        (java.sql.Date) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateTime的值的测试方法.
   */
  @Test
  public void testGetUpdateTime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Time updateTime = new java.sql.Time(curTime);

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateTime"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateTime);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateTime的值与设定内容一致：", updateTime,
        mdl.getUpdateTime());
  }

  /**
   * 设置属性updateTime的值的测试方法.
   */
  @Test
  public void testSetUpdateTime() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    long curTime = System.currentTimeMillis();
    java.sql.Time updateTime = new java.sql.Time(curTime);

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateTime(updateTime);

    //(B-2)
    Assert.assertEquals("设置属性updateTime的值与设定内容一致：", updateTime,
        (java.sql.Time) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateUserId的值的测试方法.
   */
  @Test
  public void testGetUpdateUserId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String updateUserId = new java.lang.String("updateUserId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateUserId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateUserId的值与设定内容一致：", updateUserId,
        mdl.getUpdateUserId());
  }

  /**
   * 设置属性updateUserId的值的测试方法.
   */
  @Test
  public void testSetUpdateUserId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String updateUserId = new java.lang.String("updateUserId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateUserId(updateUserId);

    //(B-2)
    Assert.assertEquals("设置属性updateUserId的值与设定内容一致：", updateUserId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateScreenId的值的测试方法.
   */
  @Test
  public void testGetUpdateScreenId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateScreenId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateScreenId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateScreenId的值与设定内容一致：", updateScreenId,
        mdl.getUpdateScreenId());
  }

  /**
   * 设置属性updateScreenId的值的测试方法.
   */
  @Test
  public void testSetUpdateScreenId() throws Exception {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateScreenId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateScreenId(updateScreenId);

    //(B-2)
    Assert.assertEquals("设置属性updateScreenId的值与设定内容一致：", updateScreenId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlTblTest mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblTest();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblTest mdlAllCol = new MdlTblTest();

    mdl = new MdlTblTest();
    java.lang.String testId = new java.lang.String("testId");
    mdl.setTestId(testId);
    mdlAllCol.setTestId(testId);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getTestId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.String testName = new java.lang.String("testName");
    mdl.setTestName(testName);
    mdlAllCol.setTestName(testName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTestName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Boolean testBit = true;
    mdl.setTestBit(testBit);
    mdlAllCol.setTestBit(testBit);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTestBit());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    byte[] testBlob = new byte[] {0x32};
    mdl.setTestBlob(testBlob);
    mdlAllCol.setTestBlob(testBlob);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTestBlob());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Double testDouble = 12346.679d;
    mdl.setTestDouble(testDouble);
    mdlAllCol.setTestDouble(testDouble);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getTestDouble());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Float testFloat = 12355.668f;
    mdl.setTestFloat(testFloat);
    mdlAllCol.setTestFloat(testFloat);
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
    stringBuffer.append(mdl.getTestFloat());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Integer testTinyint = 54421;
    mdl.setTestTinyint(testTinyint);
    mdlAllCol.setTestTinyint(testTinyint);
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
    stringBuffer.append(mdl.getTestTinyint());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Long testInt = 654221L;
    mdl.setTestInt(testInt);
    mdlAllCol.setTestInt(testInt);
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
    stringBuffer.append(mdl.getTestInt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.math.BigDecimal testDecimal = new java.math.BigDecimal("2017.10111");
    mdl.setTestDecimal(testDecimal);
    mdlAllCol.setTestDecimal(testDecimal);
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
    stringBuffer.append(mdl.getTestDecimal());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.Long testBigint = 654221L;
    mdl.setTestBigint(testBigint);
    mdlAllCol.setTestBigint(testBigint);
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
    stringBuffer.append(mdl.getTestBigint());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    long testDatetimeCurTime = System.currentTimeMillis();
    java.sql.Timestamp testDatetime = new java.sql.Timestamp(testDatetimeCurTime);
    mdl.setTestDatetime(testDatetime);
    mdlAllCol.setTestDatetime(testDatetime);
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
    stringBuffer.append(mdl.getTestDatetime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    java.lang.String testOrder = new java.lang.String("testOrder");
    mdl.setTestOrder(testOrder);
    mdlAllCol.setTestOrder(testOrder);
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
    stringBuffer.append(mdl.getTestOrder());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    long createDateCurTime = System.currentTimeMillis();
    java.sql.Date createDate = new java.sql.Date(createDateCurTime);
    mdl.setCreateDate(createDate);
    mdlAllCol.setCreateDate(createDate);
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
    stringBuffer.append(mdl.getCreateDate());
    stringBuffer.append(",");
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

    mdl = new MdlTblTest();
    long createTimeCurTime = System.currentTimeMillis();
    java.sql.Time createTime = new java.sql.Time(createTimeCurTime);
    mdl.setCreateTime(createTime);
    mdlAllCol.setCreateTime(createTime);
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
    stringBuffer.append(mdl.getCreateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTest();
    long updateDateCurTime = System.currentTimeMillis();
    java.sql.Date updateDate = new java.sql.Date(updateDateCurTime);
    mdl.setUpdateDate(updateDate);
    mdlAllCol.setUpdateDate(updateDate);
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
    stringBuffer.append(mdl.getUpdateDate());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTest();
    long updateTimeCurTime = System.currentTimeMillis();
    java.sql.Time updateTime = new java.sql.Time(updateTimeCurTime);
    mdl.setUpdateTime(updateTime);
    mdlAllCol.setUpdateTime(updateTime);
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
    stringBuffer.append(mdl.getUpdateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTest();
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setUpdateUserId(updateUserId);
    mdlAllCol.setUpdateUserId(updateUserId);
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
    stringBuffer.append(mdl.getUpdateUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTest();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setUpdateScreenId(updateScreenId);
    mdlAllCol.setUpdateScreenId(updateScreenId);
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
    stringBuffer.append(mdl.getUpdateScreenId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getTestId()
        + "," + mdlAllCol.getTestName()
        + "," + mdlAllCol.getTestBit()
        + "," + mdlAllCol.getTestBlob()
        + "," + mdlAllCol.getTestDouble()
        + "," + mdlAllCol.getTestFloat()
        + "," + mdlAllCol.getTestTinyint()
        + "," + mdlAllCol.getTestInt()
        + "," + mdlAllCol.getTestDecimal()
        + "," + mdlAllCol.getTestBigint()
        + "," + mdlAllCol.getTestDatetime()
        + "," + mdlAllCol.getTestOrder()
        + "," + mdlAllCol.getCreateDate()
        + "," + mdlAllCol.getCreateTime()
        + "," + mdlAllCol.getUpdateDate()
        + "," + mdlAllCol.getUpdateTime()
        + "," + mdlAllCol.getUpdateUserId()
        + "," + mdlAllCol.getUpdateScreenId()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGet() {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testId = new java.lang.String("testId");
    mdl.setTestId(testId);
    java.lang.String testName = new java.lang.String("testName");
    mdl.setTestName(testName);
    java.lang.Boolean testBit = true;
    mdl.setTestBit(testBit);
    byte[] testBlob = new byte[] {0x32};
    mdl.setTestBlob(testBlob);
    java.lang.Double testDouble = 12346.679d;
    mdl.setTestDouble(testDouble);
    java.lang.Float testFloat = 12355.668f;
    mdl.setTestFloat(testFloat);
    java.lang.Integer testTinyint = 54421;
    mdl.setTestTinyint(testTinyint);
    java.lang.Long testInt = 654221L;
    mdl.setTestInt(testInt);
    java.math.BigDecimal testDecimal = new java.math.BigDecimal("2017.10111");
    mdl.setTestDecimal(testDecimal);
    java.lang.Long testBigint = 654221L;
    mdl.setTestBigint(testBigint);
    long testDatetimeCurTime = System.currentTimeMillis();
    java.sql.Timestamp testDatetime = new java.sql.Timestamp(testDatetimeCurTime);
    mdl.setTestDatetime(testDatetime);
    java.lang.String testOrder = new java.lang.String("testOrder");
    mdl.setTestOrder(testOrder);
    long createDateCurTime = System.currentTimeMillis();
    java.sql.Date createDate = new java.sql.Date(createDateCurTime);
    mdl.setCreateDate(createDate);
    long createTimeCurTime = System.currentTimeMillis();
    java.sql.Time createTime = new java.sql.Time(createTimeCurTime);
    mdl.setCreateTime(createTime);
    long updateDateCurTime = System.currentTimeMillis();
    java.sql.Date updateDate = new java.sql.Date(updateDateCurTime);
    mdl.setUpdateDate(updateDate);
    long updateTimeCurTime = System.currentTimeMillis();
    java.sql.Time updateTime = new java.sql.Time(updateTimeCurTime);
    mdl.setUpdateTime(updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setUpdateUserId(updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setUpdateScreenId(updateScreenId);

    Assert.assertEquals(mdl.getTestId(),
        mdl.get(MdlTblTest.TEST_ID));
    Assert.assertEquals(mdl.getTestName(),
        mdl.get(MdlTblTest.TEST_NAME));
    Assert.assertEquals(mdl.getTestBit(),
        mdl.get(MdlTblTest.TEST_BIT));
    Assert.assertEquals(mdl.getTestBlob(),
        mdl.get(MdlTblTest.TEST_BLOB));
    Assert.assertEquals(mdl.getTestDouble(),
        mdl.get(MdlTblTest.TEST_DOUBLE));
    Assert.assertEquals(mdl.getTestFloat(),
        mdl.get(MdlTblTest.TEST_FLOAT));
    Assert.assertEquals(mdl.getTestTinyint(),
        mdl.get(MdlTblTest.TEST_TINYINT));
    Assert.assertEquals(mdl.getTestInt(),
        mdl.get(MdlTblTest.TEST_INT));
    Assert.assertEquals(mdl.getTestDecimal(),
        mdl.get(MdlTblTest.TEST_DECIMAL));
    Assert.assertEquals(mdl.getTestBigint(),
        mdl.get(MdlTblTest.TEST_BIGINT));
    Assert.assertEquals(mdl.getTestDatetime(),
        mdl.get(MdlTblTest.TEST_DATETIME));
    Assert.assertEquals(mdl.getTestOrder(),
        mdl.get(MdlTblTest.TEST_ORDER));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.get(MdlTblTest.CREATE_DATE));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.get(MdlTblTest.CREATE_TIME));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.get(MdlTblTest.UPDATE_DATE));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.get(MdlTblTest.UPDATE_TIME));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.get(MdlTblTest.UPDATE_USER_ID));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.get(MdlTblTest.UPDATE_SCREEN_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSet() {
    MdlTblTest mdl = new MdlTblTest();
    java.lang.String testId = new java.lang.String("testId");
    mdl.set(MdlTblTest.TEST_ID, testId);
    java.lang.String testName = new java.lang.String("testName");
    mdl.set(MdlTblTest.TEST_NAME, testName);
    java.lang.Boolean testBit = true;
    mdl.set(MdlTblTest.TEST_BIT, testBit);
    byte[] testBlob = new byte[] {0x32};
    mdl.set(MdlTblTest.TEST_BLOB, testBlob);
    java.lang.Double testDouble = 12346.679d;
    mdl.set(MdlTblTest.TEST_DOUBLE, testDouble);
    java.lang.Float testFloat = 12355.668f;
    mdl.set(MdlTblTest.TEST_FLOAT, testFloat);
    java.lang.Integer testTinyint = 54421;
    mdl.set(MdlTblTest.TEST_TINYINT, testTinyint);
    java.lang.Long testInt = 654221L;
    mdl.set(MdlTblTest.TEST_INT, testInt);
    java.math.BigDecimal testDecimal = new java.math.BigDecimal("2017.10111");
    mdl.set(MdlTblTest.TEST_DECIMAL, testDecimal);
    java.lang.Long testBigint = 654221L;
    mdl.set(MdlTblTest.TEST_BIGINT, testBigint);
    long testDatetimeCurTime = System.currentTimeMillis();
    java.sql.Timestamp testDatetime = new java.sql.Timestamp(testDatetimeCurTime);
    mdl.set(MdlTblTest.TEST_DATETIME, testDatetime);
    java.lang.String testOrder = new java.lang.String("testOrder");
    mdl.set(MdlTblTest.TEST_ORDER, testOrder);
    long createDateCurTime = System.currentTimeMillis();
    java.sql.Date createDate = new java.sql.Date(createDateCurTime);
    mdl.set(MdlTblTest.CREATE_DATE, createDate);
    long createTimeCurTime = System.currentTimeMillis();
    java.sql.Time createTime = new java.sql.Time(createTimeCurTime);
    mdl.set(MdlTblTest.CREATE_TIME, createTime);
    long updateDateCurTime = System.currentTimeMillis();
    java.sql.Date updateDate = new java.sql.Date(updateDateCurTime);
    mdl.set(MdlTblTest.UPDATE_DATE, updateDate);
    long updateTimeCurTime = System.currentTimeMillis();
    java.sql.Time updateTime = new java.sql.Time(updateTimeCurTime);
    mdl.set(MdlTblTest.UPDATE_TIME, updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.set(MdlTblTest.UPDATE_USER_ID, updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.set(MdlTblTest.UPDATE_SCREEN_ID, updateScreenId);

    Assert.assertEquals(mdl.getTestId(),
        mdl.get( MdlTblTest.TEST_ID ));
    Assert.assertEquals(mdl.getTestName(),
        mdl.get( MdlTblTest.TEST_NAME ));
    Assert.assertEquals(mdl.getTestBit(),
        mdl.get( MdlTblTest.TEST_BIT ));
    Assert.assertEquals(mdl.getTestBlob(),
        mdl.get( MdlTblTest.TEST_BLOB ));
    Assert.assertEquals(mdl.getTestDouble(),
        mdl.get( MdlTblTest.TEST_DOUBLE ));
    Assert.assertEquals(mdl.getTestFloat(),
        mdl.get( MdlTblTest.TEST_FLOAT ));
    Assert.assertEquals(mdl.getTestTinyint(),
        mdl.get( MdlTblTest.TEST_TINYINT ));
    Assert.assertEquals(mdl.getTestInt(),
        mdl.get( MdlTblTest.TEST_INT ));
    Assert.assertEquals(mdl.getTestDecimal(),
        mdl.get( MdlTblTest.TEST_DECIMAL ));
    Assert.assertEquals(mdl.getTestBigint(),
        mdl.get( MdlTblTest.TEST_BIGINT ));
    Assert.assertEquals(mdl.getTestDatetime(),
        mdl.get( MdlTblTest.TEST_DATETIME ));
    Assert.assertEquals(mdl.getTestOrder(),
        mdl.get( MdlTblTest.TEST_ORDER ));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.get( MdlTblTest.CREATE_DATE ));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.get( MdlTblTest.CREATE_TIME ));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.get( MdlTblTest.UPDATE_DATE ));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.get( MdlTblTest.UPDATE_TIME ));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.get( MdlTblTest.UPDATE_USER_ID ));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.get( MdlTblTest.UPDATE_SCREEN_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblTestTest.class.getDeclaredMethods();
    Method[] methods = MdlTblTest.class.getDeclaredMethods();
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
