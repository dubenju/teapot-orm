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
 * 表serial_number的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:57.961 +0900自动生成的。
 */
public class MdlSerialNumberTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "SERIAL_NUMBER", MdlSerialNumber.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlSerialNumber() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性key1的值的测试方法.
   */
  @Test
  public void testGetKey1() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key1 = new java.lang.String("key1");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("key1"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, key1);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性key1的值与设定内容一致：", key1,
        mdl.getKey1());
  }

  /**
   * 设置属性key1的值的测试方法.
   */
  @Test
  public void testSetKey1() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key1 = new java.lang.String("key1");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("key1"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setKey1(key1);

    //(B-2)
    Assert.assertEquals("设置属性key1的值与设定内容一致：", key1,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性key2的值的测试方法.
   */
  @Test
  public void testGetKey2() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key2 = new java.lang.String("key2");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("key2"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, key2);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性key2的值与设定内容一致：", key2,
        mdl.getKey2());
  }

  /**
   * 设置属性key2的值的测试方法.
   */
  @Test
  public void testSetKey2() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key2 = new java.lang.String("key2");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("key2"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setKey2(key2);

    //(B-2)
    Assert.assertEquals("设置属性key2的值与设定内容一致：", key2,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性key3的值的测试方法.
   */
  @Test
  public void testGetKey3() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key3 = new java.lang.String("key3");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("key3"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, key3);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性key3的值与设定内容一致：", key3,
        mdl.getKey3());
  }

  /**
   * 设置属性key3的值的测试方法.
   */
  @Test
  public void testSetKey3() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key3 = new java.lang.String("key3");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("key3"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setKey3(key3);

    //(B-2)
    Assert.assertEquals("设置属性key3的值与设定内容一致：", key3,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性currentValue的值的测试方法.
   */
  @Test
  public void testGetCurrentValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal currentValue = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("currentValue"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, currentValue);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性currentValue的值与设定内容一致：", currentValue,
        mdl.getCurrentValue());
  }

  /**
   * 设置属性currentValue的值的测试方法.
   */
  @Test
  public void testSetCurrentValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal currentValue = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("currentValue"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCurrentValue(currentValue);

    //(B-2)
    Assert.assertEquals("设置属性currentValue的值与设定内容一致：", currentValue,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性stepValue的值的测试方法.
   */
  @Test
  public void testGetStepValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal stepValue = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("stepValue"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, stepValue);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性stepValue的值与设定内容一致：", stepValue,
        mdl.getStepValue());
  }

  /**
   * 设置属性stepValue的值的测试方法.
   */
  @Test
  public void testSetStepValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal stepValue = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("stepValue"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStepValue(stepValue);

    //(B-2)
    Assert.assertEquals("设置属性stepValue的值与设定内容一致：", stepValue,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性maxValue的值的测试方法.
   */
  @Test
  public void testGetMaxValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal maxValue = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("maxValue"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, maxValue);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性maxValue的值与设定内容一致：", maxValue,
        mdl.getMaxValue());
  }

  /**
   * 设置属性maxValue的值的测试方法.
   */
  @Test
  public void testSetMaxValue() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.math.BigDecimal maxValue = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("maxValue"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setMaxValue(maxValue);

    //(B-2)
    Assert.assertEquals("设置属性maxValue的值与设定内容一致：", maxValue,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createDate的值的测试方法.
   */
  @Test
  public void testGetCreateDate() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String createDate = new java.lang.String("createDate");

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
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String createDate = new java.lang.String("createDate");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateDate(createDate);

    //(B-2)
    Assert.assertEquals("设置属性createDate的值与设定内容一致：", createDate,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createTime的值的测试方法.
   */
  @Test
  public void testGetCreateTime() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String createTime = new java.lang.String("createTime");

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
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String createTime = new java.lang.String("createTime");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateTime(createTime);

    //(B-2)
    Assert.assertEquals("设置属性createTime的值与设定内容一致：", createTime,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateDate的值的测试方法.
   */
  @Test
  public void testGetUpdateDate() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String updateDate = new java.lang.String("updateDate");

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
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String updateDate = new java.lang.String("updateDate");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateDate(updateDate);

    //(B-2)
    Assert.assertEquals("设置属性updateDate的值与设定内容一致：", updateDate,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateTime的值的测试方法.
   */
  @Test
  public void testGetUpdateTime() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String updateTime = new java.lang.String("updateTime");

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
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String updateTime = new java.lang.String("updateTime");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateTime(updateTime);

    //(B-2)
    Assert.assertEquals("设置属性updateTime的值与设定内容一致：", updateTime,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateUserId的值的测试方法.
   */
  @Test
  public void testGetUpdateUserId() throws Exception {
    MdlSerialNumber mdl = new MdlSerialNumber();
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
    MdlSerialNumber mdl = new MdlSerialNumber();
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
    MdlSerialNumber mdl = new MdlSerialNumber();
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
    MdlSerialNumber mdl = new MdlSerialNumber();
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
    MdlSerialNumber mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlSerialNumber();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlSerialNumber mdlAllCol = new MdlSerialNumber();

    mdl = new MdlSerialNumber();
    java.lang.String key1 = new java.lang.String("key1");
    mdl.setKey1(key1);
    mdlAllCol.setKey1(key1);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getKey1());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.lang.String key2 = new java.lang.String("key2");
    mdl.setKey2(key2);
    mdlAllCol.setKey2(key2);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getKey2());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.lang.String key3 = new java.lang.String("key3");
    mdl.setKey3(key3);
    mdlAllCol.setKey3(key3);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getKey3());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.math.BigDecimal currentValue = new java.math.BigDecimal("2017.10111");
    mdl.setCurrentValue(currentValue);
    mdlAllCol.setCurrentValue(currentValue);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCurrentValue());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.math.BigDecimal stepValue = new java.math.BigDecimal("2017.10111");
    mdl.setStepValue(stepValue);
    mdlAllCol.setStepValue(stepValue);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getStepValue());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.math.BigDecimal maxValue = new java.math.BigDecimal("2017.10111");
    mdl.setMaxValue(maxValue);
    mdlAllCol.setMaxValue(maxValue);
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
    stringBuffer.append(mdl.getMaxValue());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlSerialNumber();
    java.lang.String createDate = new java.lang.String("createDate");
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

    mdl = new MdlSerialNumber();
    java.lang.String createTime = new java.lang.String("createTime");
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

    mdl = new MdlSerialNumber();
    java.lang.String updateDate = new java.lang.String("updateDate");
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
    stringBuffer.append(mdl.getUpdateDate());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlSerialNumber();
    java.lang.String updateTime = new java.lang.String("updateTime");
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
    stringBuffer.append(mdl.getUpdateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlSerialNumber();
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
    stringBuffer.append(mdl.getUpdateUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlSerialNumber();
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
    stringBuffer.append(mdl.getUpdateScreenId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getKey1()
        + "," + mdlAllCol.getKey2()
        + "," + mdlAllCol.getKey3()
        + "," + mdlAllCol.getCurrentValue()
        + "," + mdlAllCol.getStepValue()
        + "," + mdlAllCol.getMaxValue()
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
  public void testGetValueByKey() {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key1 = new java.lang.String("key1");
    mdl.setKey1(key1);
    java.lang.String key2 = new java.lang.String("key2");
    mdl.setKey2(key2);
    java.lang.String key3 = new java.lang.String("key3");
    mdl.setKey3(key3);
    java.math.BigDecimal currentValue = new java.math.BigDecimal("2017.10111");
    mdl.setCurrentValue(currentValue);
    java.math.BigDecimal stepValue = new java.math.BigDecimal("2017.10111");
    mdl.setStepValue(stepValue);
    java.math.BigDecimal maxValue = new java.math.BigDecimal("2017.10111");
    mdl.setMaxValue(maxValue);
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setCreateDate(createDate);
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setCreateTime(createTime);
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setUpdateDate(updateDate);
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setUpdateTime(updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setUpdateUserId(updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setUpdateScreenId(updateScreenId);

    Assert.assertEquals(mdl.getKey1(),
        mdl.getValueByKey(MdlSerialNumber.KEY1));
    Assert.assertEquals(mdl.getKey2(),
        mdl.getValueByKey(MdlSerialNumber.KEY2));
    Assert.assertEquals(mdl.getKey3(),
        mdl.getValueByKey(MdlSerialNumber.KEY3));
    Assert.assertEquals(mdl.getCurrentValue(),
        mdl.getValueByKey(MdlSerialNumber.CURRENT_VALUE));
    Assert.assertEquals(mdl.getStepValue(),
        mdl.getValueByKey(MdlSerialNumber.STEP_VALUE));
    Assert.assertEquals(mdl.getMaxValue(),
        mdl.getValueByKey(MdlSerialNumber.MAX_VALUE));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey(MdlSerialNumber.CREATE_DATE));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey(MdlSerialNumber.CREATE_TIME));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey(MdlSerialNumber.UPDATE_DATE));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey(MdlSerialNumber.UPDATE_TIME));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey(MdlSerialNumber.UPDATE_USER_ID));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey(MdlSerialNumber.UPDATE_SCREEN_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlSerialNumber mdl = new MdlSerialNumber();
    java.lang.String key1 = new java.lang.String("key1");
    mdl.setValueByKey(MdlSerialNumber.KEY1, key1);
    java.lang.String key2 = new java.lang.String("key2");
    mdl.setValueByKey(MdlSerialNumber.KEY2, key2);
    java.lang.String key3 = new java.lang.String("key3");
    mdl.setValueByKey(MdlSerialNumber.KEY3, key3);
    java.math.BigDecimal currentValue = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlSerialNumber.CURRENT_VALUE, currentValue);
    java.math.BigDecimal stepValue = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlSerialNumber.STEP_VALUE, stepValue);
    java.math.BigDecimal maxValue = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlSerialNumber.MAX_VALUE, maxValue);
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setValueByKey(MdlSerialNumber.CREATE_DATE, createDate);
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setValueByKey(MdlSerialNumber.CREATE_TIME, createTime);
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setValueByKey(MdlSerialNumber.UPDATE_DATE, updateDate);
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setValueByKey(MdlSerialNumber.UPDATE_TIME, updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setValueByKey(MdlSerialNumber.UPDATE_USER_ID, updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setValueByKey(MdlSerialNumber.UPDATE_SCREEN_ID, updateScreenId);

    Assert.assertEquals(mdl.getKey1(),
        mdl.getValueByKey( MdlSerialNumber.KEY1 ));
    Assert.assertEquals(mdl.getKey2(),
        mdl.getValueByKey( MdlSerialNumber.KEY2 ));
    Assert.assertEquals(mdl.getKey3(),
        mdl.getValueByKey( MdlSerialNumber.KEY3 ));
    Assert.assertEquals(mdl.getCurrentValue(),
        mdl.getValueByKey( MdlSerialNumber.CURRENT_VALUE ));
    Assert.assertEquals(mdl.getStepValue(),
        mdl.getValueByKey( MdlSerialNumber.STEP_VALUE ));
    Assert.assertEquals(mdl.getMaxValue(),
        mdl.getValueByKey( MdlSerialNumber.MAX_VALUE ));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey( MdlSerialNumber.CREATE_DATE ));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey( MdlSerialNumber.CREATE_TIME ));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey( MdlSerialNumber.UPDATE_DATE ));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey( MdlSerialNumber.UPDATE_TIME ));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey( MdlSerialNumber.UPDATE_USER_ID ));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey( MdlSerialNumber.UPDATE_SCREEN_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlSerialNumberTest.class.getDeclaredMethods();
    Method[] methods = MdlSerialNumber.class.getDeclaredMethods();
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
