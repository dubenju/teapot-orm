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
 * 表tbl_cmmdt的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:59.773 +0900自动生成的。
 */
public class MdlTblCmmdtTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_CMMDT", MdlTblCmmdt.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblCmmdt() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性storeId的值的测试方法.
   */
  @Test
  public void testGetStoreId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String storeId = new java.lang.String("storeId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeId的值与设定内容一致：", storeId,
        mdl.getStoreId());
  }

  /**
   * 设置属性storeId的值的测试方法.
   */
  @Test
  public void testSetStoreId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String storeId = new java.lang.String("storeId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreId(storeId);

    //(B-2)
    Assert.assertEquals("设置属性storeId的值与设定内容一致：", storeId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cmmdtId的值的测试方法.
   */
  @Test
  public void testGetCmmdtId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtId = new java.lang.String("cmmdtId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cmmdtId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cmmdtId的值与设定内容一致：", cmmdtId,
        mdl.getCmmdtId());
  }

  /**
   * 设置属性cmmdtId的值的测试方法.
   */
  @Test
  public void testSetCmmdtId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtId = new java.lang.String("cmmdtId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCmmdtId(cmmdtId);

    //(B-2)
    Assert.assertEquals("设置属性cmmdtId的值与设定内容一致：", cmmdtId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性appliStDt的值的测试方法.
   */
  @Test
  public void testGetAppliStDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String appliStDt = new java.lang.String("appliStDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("appliStDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, appliStDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性appliStDt的值与设定内容一致：", appliStDt,
        mdl.getAppliStDt());
  }

  /**
   * 设置属性appliStDt的值的测试方法.
   */
  @Test
  public void testSetAppliStDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String appliStDt = new java.lang.String("appliStDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("appliStDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAppliStDt(appliStDt);

    //(B-2)
    Assert.assertEquals("设置属性appliStDt的值与设定内容一致：", appliStDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性appliEdDt的值的测试方法.
   */
  @Test
  public void testGetAppliEdDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("appliEdDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, appliEdDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性appliEdDt的值与设定内容一致：", appliEdDt,
        mdl.getAppliEdDt());
  }

  /**
   * 设置属性appliEdDt的值的测试方法.
   */
  @Test
  public void testSetAppliEdDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("appliEdDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAppliEdDt(appliEdDt);

    //(B-2)
    Assert.assertEquals("设置属性appliEdDt的值与设定内容一致：", appliEdDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cmmdtNm的值的测试方法.
   */
  @Test
  public void testGetCmmdtNm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtNm = new java.lang.String("cmmdtNm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtNm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cmmdtNm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cmmdtNm的值与设定内容一致：", cmmdtNm,
        mdl.getCmmdtNm());
  }

  /**
   * 设置属性cmmdtNm的值的测试方法.
   */
  @Test
  public void testSetCmmdtNm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtNm = new java.lang.String("cmmdtNm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtNm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCmmdtNm(cmmdtNm);

    //(B-2)
    Assert.assertEquals("设置属性cmmdtNm的值与设定内容一致：", cmmdtNm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cmmdtUpric的值的测试方法.
   */
  @Test
  public void testGetCmmdtUpric() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.math.BigDecimal cmmdtUpric = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtUpric"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cmmdtUpric);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cmmdtUpric的值与设定内容一致：", cmmdtUpric,
        mdl.getCmmdtUpric());
  }

  /**
   * 设置属性cmmdtUpric的值的测试方法.
   */
  @Test
  public void testSetCmmdtUpric() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.math.BigDecimal cmmdtUpric = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtUpric"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCmmdtUpric(cmmdtUpric);

    //(B-2)
    Assert.assertEquals("设置属性cmmdtUpric的值与设定内容一致：", cmmdtUpric,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cmmdtUnt的值的测试方法.
   */
  @Test
  public void testGetCmmdtUnt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtUnt = new java.lang.String("cmmdtUnt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtUnt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cmmdtUnt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cmmdtUnt的值与设定内容一致：", cmmdtUnt,
        mdl.getCmmdtUnt());
  }

  /**
   * 设置属性cmmdtUnt的值的测试方法.
   */
  @Test
  public void testSetCmmdtUnt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String cmmdtUnt = new java.lang.String("cmmdtUnt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cmmdtUnt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCmmdtUnt(cmmdtUnt);

    //(B-2)
    Assert.assertEquals("设置属性cmmdtUnt的值与设定内容一致：", cmmdtUnt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("fstCrtDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, fstCrtDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性fstCrtDt的值与设定内容一致：", fstCrtDt,
        mdl.getFstCrtDt());
  }

  /**
   * 设置属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testSetFstCrtDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("fstCrtDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setFstCrtDt(fstCrtDt);

    //(B-2)
    Assert.assertEquals("设置属性fstCrtDt的值与设定内容一致：", fstCrtDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtTm的值的测试方法.
   */
  @Test
  public void testGetFstCrtTm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("fstCrtTm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, fstCrtTm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性fstCrtTm的值与设定内容一致：", fstCrtTm,
        mdl.getFstCrtTm());
  }

  /**
   * 设置属性fstCrtTm的值的测试方法.
   */
  @Test
  public void testSetFstCrtTm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("fstCrtTm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setFstCrtTm(fstCrtTm);

    //(B-2)
    Assert.assertEquals("设置属性fstCrtTm的值与设定内容一致：", fstCrtTm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性rntUpdDt的值的测试方法.
   */
  @Test
  public void testGetRntUpdDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("rntUpdDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, rntUpdDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性rntUpdDt的值与设定内容一致：", rntUpdDt,
        mdl.getRntUpdDt());
  }

  /**
   * 设置属性rntUpdDt的值的测试方法.
   */
  @Test
  public void testSetRntUpdDt() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("rntUpdDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRntUpdDt(rntUpdDt);

    //(B-2)
    Assert.assertEquals("设置属性rntUpdDt的值与设定内容一致：", rntUpdDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性rntUpdTm的值的测试方法.
   */
  @Test
  public void testGetRntUpdTm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("rntUpdTm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, rntUpdTm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性rntUpdTm的值与设定内容一致：", rntUpdTm,
        mdl.getRntUpdTm());
  }

  /**
   * 设置属性rntUpdTm的值的测试方法.
   */
  @Test
  public void testSetRntUpdTm() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("rntUpdTm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRntUpdTm(rntUpdTm);

    //(B-2)
    Assert.assertEquals("设置属性rntUpdTm的值与设定内容一致：", rntUpdTm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updUserId的值的测试方法.
   */
  @Test
  public void testGetUpdUserId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String updUserId = new java.lang.String("updUserId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updUserId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updUserId的值与设定内容一致：", updUserId,
        mdl.getUpdUserId());
  }

  /**
   * 设置属性updUserId的值的测试方法.
   */
  @Test
  public void testSetUpdUserId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String updUserId = new java.lang.String("updUserId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdUserId(updUserId);

    //(B-2)
    Assert.assertEquals("设置属性updUserId的值与设定内容一致：", updUserId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updVwId的值的测试方法.
   */
  @Test
  public void testGetUpdVwId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String updVwId = new java.lang.String("updVwId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updVwId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updVwId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updVwId的值与设定内容一致：", updVwId,
        mdl.getUpdVwId());
  }

  /**
   * 设置属性updVwId的值的测试方法.
   */
  @Test
  public void testSetUpdVwId() throws Exception {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String updVwId = new java.lang.String("updVwId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updVwId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdVwId(updVwId);

    //(B-2)
    Assert.assertEquals("设置属性updVwId的值与设定内容一致：", updVwId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlTblCmmdt mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblCmmdt();
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

    MdlTblCmmdt mdlAllCol = new MdlTblCmmdt();

    mdl = new MdlTblCmmdt();
    java.lang.String storeId = new java.lang.String("storeId");
    mdl.setStoreId(storeId);
    mdlAllCol.setStoreId(storeId);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getStoreId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String cmmdtId = new java.lang.String("cmmdtId");
    mdl.setCmmdtId(cmmdtId);
    mdlAllCol.setCmmdtId(cmmdtId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCmmdtId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    mdlAllCol.setAppliStDt(appliStDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getAppliStDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    mdlAllCol.setAppliEdDt(appliEdDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getAppliEdDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String cmmdtNm = new java.lang.String("cmmdtNm");
    mdl.setCmmdtNm(cmmdtNm);
    mdlAllCol.setCmmdtNm(cmmdtNm);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCmmdtNm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.math.BigDecimal cmmdtUpric = new java.math.BigDecimal("2017.10111");
    mdl.setCmmdtUpric(cmmdtUpric);
    mdlAllCol.setCmmdtUpric(cmmdtUpric);
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
    stringBuffer.append(mdl.getCmmdtUpric());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String cmmdtUnt = new java.lang.String("cmmdtUnt");
    mdl.setCmmdtUnt(cmmdtUnt);
    mdlAllCol.setCmmdtUnt(cmmdtUnt);
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
    stringBuffer.append(mdl.getCmmdtUnt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setFstCrtDt(fstCrtDt);
    mdlAllCol.setFstCrtDt(fstCrtDt);
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
    stringBuffer.append(mdl.getFstCrtDt());
    stringBuffer.append(",");
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

    mdl = new MdlTblCmmdt();
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setFstCrtTm(fstCrtTm);
    mdlAllCol.setFstCrtTm(fstCrtTm);
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
    stringBuffer.append(mdl.getFstCrtTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblCmmdt();
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setRntUpdDt(rntUpdDt);
    mdlAllCol.setRntUpdDt(rntUpdDt);
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
    stringBuffer.append(mdl.getRntUpdDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblCmmdt();
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setRntUpdTm(rntUpdTm);
    mdlAllCol.setRntUpdTm(rntUpdTm);
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
    stringBuffer.append(mdl.getRntUpdTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblCmmdt();
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setUpdUserId(updUserId);
    mdlAllCol.setUpdUserId(updUserId);
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
    stringBuffer.append(mdl.getUpdUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblCmmdt();
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setUpdVwId(updVwId);
    mdlAllCol.setUpdVwId(updVwId);
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
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getStoreId()
        + "," + mdlAllCol.getCmmdtId()
        + "," + mdlAllCol.getAppliStDt()
        + "," + mdlAllCol.getAppliEdDt()
        + "," + mdlAllCol.getCmmdtNm()
        + "," + mdlAllCol.getCmmdtUpric()
        + "," + mdlAllCol.getCmmdtUnt()
        + "," + mdlAllCol.getFstCrtDt()
        + "," + mdlAllCol.getFstCrtTm()
        + "," + mdlAllCol.getRntUpdDt()
        + "," + mdlAllCol.getRntUpdTm()
        + "," + mdlAllCol.getUpdUserId()
        + "," + mdlAllCol.getUpdVwId()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGetValueByKey() {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String storeId = new java.lang.String("storeId");
    mdl.setStoreId(storeId);
    java.lang.String cmmdtId = new java.lang.String("cmmdtId");
    mdl.setCmmdtId(cmmdtId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    java.lang.String cmmdtNm = new java.lang.String("cmmdtNm");
    mdl.setCmmdtNm(cmmdtNm);
    java.math.BigDecimal cmmdtUpric = new java.math.BigDecimal("2017.10111");
    mdl.setCmmdtUpric(cmmdtUpric);
    java.lang.String cmmdtUnt = new java.lang.String("cmmdtUnt");
    mdl.setCmmdtUnt(cmmdtUnt);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setFstCrtDt(fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setFstCrtTm(fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setRntUpdDt(rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setRntUpdTm(rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setUpdUserId(updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setUpdVwId(updVwId);

    Assert.assertEquals(mdl.getStoreId(),
        mdl.getValueByKey(MdlTblCmmdt.STORE_ID));
    Assert.assertEquals(mdl.getCmmdtId(),
        mdl.getValueByKey(MdlTblCmmdt.CMMDT_ID));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey(MdlTblCmmdt.APPLI_ST_DT));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey(MdlTblCmmdt.APPLI_ED_DT));
    Assert.assertEquals(mdl.getCmmdtNm(),
        mdl.getValueByKey(MdlTblCmmdt.CMMDT_NM));
    Assert.assertEquals(mdl.getCmmdtUpric(),
        mdl.getValueByKey(MdlTblCmmdt.CMMDT_UPRIC));
    Assert.assertEquals(mdl.getCmmdtUnt(),
        mdl.getValueByKey(MdlTblCmmdt.CMMDT_UNT));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblCmmdt.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblCmmdt.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblCmmdt.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblCmmdt.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblCmmdt.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblCmmdt.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblCmmdt mdl = new MdlTblCmmdt();
    java.lang.String storeId = new java.lang.String("storeId");
    mdl.setValueByKey(MdlTblCmmdt.STORE_ID, storeId);
    java.lang.String cmmdtId = new java.lang.String("cmmdtId");
    mdl.setValueByKey(MdlTblCmmdt.CMMDT_ID, cmmdtId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setValueByKey(MdlTblCmmdt.APPLI_ST_DT, appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setValueByKey(MdlTblCmmdt.APPLI_ED_DT, appliEdDt);
    java.lang.String cmmdtNm = new java.lang.String("cmmdtNm");
    mdl.setValueByKey(MdlTblCmmdt.CMMDT_NM, cmmdtNm);
    java.math.BigDecimal cmmdtUpric = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlTblCmmdt.CMMDT_UPRIC, cmmdtUpric);
    java.lang.String cmmdtUnt = new java.lang.String("cmmdtUnt");
    mdl.setValueByKey(MdlTblCmmdt.CMMDT_UNT, cmmdtUnt);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblCmmdt.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblCmmdt.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblCmmdt.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblCmmdt.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblCmmdt.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblCmmdt.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getStoreId(),
        mdl.getValueByKey( MdlTblCmmdt.STORE_ID ));
    Assert.assertEquals(mdl.getCmmdtId(),
        mdl.getValueByKey( MdlTblCmmdt.CMMDT_ID ));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey( MdlTblCmmdt.APPLI_ST_DT ));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey( MdlTblCmmdt.APPLI_ED_DT ));
    Assert.assertEquals(mdl.getCmmdtNm(),
        mdl.getValueByKey( MdlTblCmmdt.CMMDT_NM ));
    Assert.assertEquals(mdl.getCmmdtUpric(),
        mdl.getValueByKey( MdlTblCmmdt.CMMDT_UPRIC ));
    Assert.assertEquals(mdl.getCmmdtUnt(),
        mdl.getValueByKey( MdlTblCmmdt.CMMDT_UNT ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblCmmdt.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblCmmdt.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblCmmdt.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblCmmdt.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblCmmdt.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblCmmdt.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblCmmdtTest.class.getDeclaredMethods();
    Method[] methods = MdlTblCmmdt.class.getDeclaredMethods();
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
