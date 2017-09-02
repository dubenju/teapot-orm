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
 * 表tbl_trfm的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:02.771 +0900自动生成的。
 */
public class MdlTblTrfmTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_TRFM", MdlTblTrfm.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblTrfm() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性admDivCd的值的测试方法.
   */
  @Test
  public void testGetAdmDivCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String admDivCd = new java.lang.String("admDivCd");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("admDivCd"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, admDivCd);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性admDivCd的值与设定内容一致：", admDivCd,
        mdl.getAdmDivCd());
  }

  /**
   * 设置属性admDivCd的值的测试方法.
   */
  @Test
  public void testSetAdmDivCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String admDivCd = new java.lang.String("admDivCd");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("admDivCd"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAdmDivCd(admDivCd);

    //(B-2)
    Assert.assertEquals("设置属性admDivCd的值与设定内容一致：", admDivCd,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性wthCd的值的测试方法.
   */
  @Test
  public void testGetWthCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String wthCd = new java.lang.String("wthCd");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wthCd"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wthCd);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wthCd的值与设定内容一致：", wthCd,
        mdl.getWthCd());
  }

  /**
   * 设置属性wthCd的值的测试方法.
   */
  @Test
  public void testSetWthCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String wthCd = new java.lang.String("wthCd");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wthCd"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWthCd(wthCd);

    //(B-2)
    Assert.assertEquals("设置属性wthCd的值与设定内容一致：", wthCd,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性pstCd的值的测试方法.
   */
  @Test
  public void testGetPstCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String pstCd = new java.lang.String("pstCd");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("pstCd"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, pstCd);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性pstCd的值与设定内容一致：", pstCd,
        mdl.getPstCd());
  }

  /**
   * 设置属性pstCd的值的测试方法.
   */
  @Test
  public void testSetPstCd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String pstCd = new java.lang.String("pstCd");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("pstCd"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPstCd(pstCd);

    //(B-2)
    Assert.assertEquals("设置属性pstCd的值与设定内容一致：", pstCd,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性ldcAcd的值的测试方法.
   */
  @Test
  public void testGetLdcAcd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String ldcAcd = new java.lang.String("ldcAcd");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("ldcAcd"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, ldcAcd);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性ldcAcd的值与设定内容一致：", ldcAcd,
        mdl.getLdcAcd());
  }

  /**
   * 设置属性ldcAcd的值的测试方法.
   */
  @Test
  public void testSetLdcAcd() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String ldcAcd = new java.lang.String("ldcAcd");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("ldcAcd"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setLdcAcd(ldcAcd);

    //(B-2)
    Assert.assertEquals("设置属性ldcAcd的值与设定内容一致：", ldcAcd,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性areaNm的值的测试方法.
   */
  @Test
  public void testGetAreaNm() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String areaNm = new java.lang.String("areaNm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("areaNm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, areaNm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性areaNm的值与设定内容一致：", areaNm,
        mdl.getAreaNm());
  }

  /**
   * 设置属性areaNm的值的测试方法.
   */
  @Test
  public void testSetAreaNm() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String areaNm = new java.lang.String("areaNm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("areaNm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAreaNm(areaNm);

    //(B-2)
    Assert.assertEquals("设置属性areaNm的值与设定内容一致：", areaNm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性areaFname的值的测试方法.
   */
  @Test
  public void testGetAreaFname() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String areaFname = new java.lang.String("areaFname");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("areaFname"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, areaFname);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性areaFname的值与设定内容一致：", areaFname,
        mdl.getAreaFname());
  }

  /**
   * 设置属性areaFname的值的测试方法.
   */
  @Test
  public void testSetAreaFname() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String areaFname = new java.lang.String("areaFname");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("areaFname"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setAreaFname(areaFname);

    //(B-2)
    Assert.assertEquals("设置属性areaFname的值与设定内容一致：", areaFname,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = new MdlTblTrfm();
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
    MdlTblTrfm mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblTrfm();
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

    MdlTblTrfm mdlAllCol = new MdlTblTrfm();

    mdl = new MdlTblTrfm();
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setAdmDivCd(admDivCd);
    mdlAllCol.setAdmDivCd(admDivCd);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getAdmDivCd());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setWthCd(wthCd);
    mdlAllCol.setWthCd(wthCd);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getWthCd());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setPstCd(pstCd);
    mdlAllCol.setPstCd(pstCd);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getPstCd());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
    java.lang.String ldcAcd = new java.lang.String("ldcAcd");
    mdl.setLdcAcd(ldcAcd);
    mdlAllCol.setLdcAcd(ldcAcd);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getLdcAcd());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
    java.lang.String areaNm = new java.lang.String("areaNm");
    mdl.setAreaNm(areaNm);
    mdlAllCol.setAreaNm(areaNm);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getAreaNm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
    java.lang.String areaFname = new java.lang.String("areaFname");
    mdl.setAreaFname(areaFname);
    mdlAllCol.setAreaFname(areaFname);
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
    stringBuffer.append(mdl.getAreaFname());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblTrfm();
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

    mdl = new MdlTblTrfm();
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

    mdl = new MdlTblTrfm();
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
    stringBuffer.append(mdl.getRntUpdDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTrfm();
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
    stringBuffer.append(mdl.getRntUpdTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTrfm();
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
    stringBuffer.append(mdl.getUpdUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblTrfm();
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
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getAdmDivCd()
        + "," + mdlAllCol.getWthCd()
        + "," + mdlAllCol.getPstCd()
        + "," + mdlAllCol.getLdcAcd()
        + "," + mdlAllCol.getAreaNm()
        + "," + mdlAllCol.getAreaFname()
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
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setAdmDivCd(admDivCd);
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setWthCd(wthCd);
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setPstCd(pstCd);
    java.lang.String ldcAcd = new java.lang.String("ldcAcd");
    mdl.setLdcAcd(ldcAcd);
    java.lang.String areaNm = new java.lang.String("areaNm");
    mdl.setAreaNm(areaNm);
    java.lang.String areaFname = new java.lang.String("areaFname");
    mdl.setAreaFname(areaFname);
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

    Assert.assertEquals(mdl.getAdmDivCd(),
        mdl.getValueByKey(MdlTblTrfm.ADM_DIV_CD));
    Assert.assertEquals(mdl.getWthCd(),
        mdl.getValueByKey(MdlTblTrfm.WTH_CD));
    Assert.assertEquals(mdl.getPstCd(),
        mdl.getValueByKey(MdlTblTrfm.PST_CD));
    Assert.assertEquals(mdl.getLdcAcd(),
        mdl.getValueByKey(MdlTblTrfm.LDC_ACD));
    Assert.assertEquals(mdl.getAreaNm(),
        mdl.getValueByKey(MdlTblTrfm.AREA_NM));
    Assert.assertEquals(mdl.getAreaFname(),
        mdl.getValueByKey(MdlTblTrfm.AREA_FNAME));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblTrfm.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblTrfm.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblTrfm.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblTrfm.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblTrfm.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblTrfm.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblTrfm mdl = new MdlTblTrfm();
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setValueByKey(MdlTblTrfm.ADM_DIV_CD, admDivCd);
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setValueByKey(MdlTblTrfm.WTH_CD, wthCd);
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setValueByKey(MdlTblTrfm.PST_CD, pstCd);
    java.lang.String ldcAcd = new java.lang.String("ldcAcd");
    mdl.setValueByKey(MdlTblTrfm.LDC_ACD, ldcAcd);
    java.lang.String areaNm = new java.lang.String("areaNm");
    mdl.setValueByKey(MdlTblTrfm.AREA_NM, areaNm);
    java.lang.String areaFname = new java.lang.String("areaFname");
    mdl.setValueByKey(MdlTblTrfm.AREA_FNAME, areaFname);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblTrfm.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblTrfm.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblTrfm.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblTrfm.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblTrfm.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblTrfm.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getAdmDivCd(),
        mdl.getValueByKey( MdlTblTrfm.ADM_DIV_CD ));
    Assert.assertEquals(mdl.getWthCd(),
        mdl.getValueByKey( MdlTblTrfm.WTH_CD ));
    Assert.assertEquals(mdl.getPstCd(),
        mdl.getValueByKey( MdlTblTrfm.PST_CD ));
    Assert.assertEquals(mdl.getLdcAcd(),
        mdl.getValueByKey( MdlTblTrfm.LDC_ACD ));
    Assert.assertEquals(mdl.getAreaNm(),
        mdl.getValueByKey( MdlTblTrfm.AREA_NM ));
    Assert.assertEquals(mdl.getAreaFname(),
        mdl.getValueByKey( MdlTblTrfm.AREA_FNAME ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblTrfm.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblTrfm.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblTrfm.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblTrfm.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblTrfm.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblTrfm.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblTrfmTest.class.getDeclaredMethods();
    Method[] methods = MdlTblTrfm.class.getDeclaredMethods();
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
