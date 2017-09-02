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
 * 表tbl_evnt的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:00.148 +0900自动生成的。
 */
public class MdlTblEvntTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_EVNT", MdlTblEvnt.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblEvnt() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性userId的值的测试方法.
   */
  @Test
  public void testGetUserId() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String userId = new java.lang.String("userId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("userId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, userId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性userId的值与设定内容一致：", userId,
        mdl.getUserId());
  }

  /**
   * 设置属性userId的值的测试方法.
   */
  @Test
  public void testSetUserId() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String userId = new java.lang.String("userId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("userId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUserId(userId);

    //(B-2)
    Assert.assertEquals("设置属性userId的值与设定内容一致：", userId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性evntId的值的测试方法.
   */
  @Test
  public void testGetEvntId() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntId = new java.lang.String("evntId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("evntId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, evntId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性evntId的值与设定内容一致：", evntId,
        mdl.getEvntId());
  }

  /**
   * 设置属性evntId的值的测试方法.
   */
  @Test
  public void testSetEvntId() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntId = new java.lang.String("evntId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("evntId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setEvntId(evntId);

    //(B-2)
    Assert.assertEquals("设置属性evntId的值与设定内容一致：", evntId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bgnDt的值的测试方法.
   */
  @Test
  public void testGetBgnDt() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String bgnDt = new java.lang.String("bgnDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bgnDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bgnDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bgnDt的值与设定内容一致：", bgnDt,
        mdl.getBgnDt());
  }

  /**
   * 设置属性bgnDt的值的测试方法.
   */
  @Test
  public void testSetBgnDt() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String bgnDt = new java.lang.String("bgnDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bgnDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBgnDt(bgnDt);

    //(B-2)
    Assert.assertEquals("设置属性bgnDt的值与设定内容一致：", bgnDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bgnTm的值的测试方法.
   */
  @Test
  public void testGetBgnTm() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String bgnTm = new java.lang.String("bgnTm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bgnTm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bgnTm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bgnTm的值与设定内容一致：", bgnTm,
        mdl.getBgnTm());
  }

  /**
   * 设置属性bgnTm的值的测试方法.
   */
  @Test
  public void testSetBgnTm() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String bgnTm = new java.lang.String("bgnTm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bgnTm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBgnTm(bgnTm);

    //(B-2)
    Assert.assertEquals("设置属性bgnTm的值与设定内容一致：", bgnTm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性clsDt的值的测试方法.
   */
  @Test
  public void testGetClsDt() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String clsDt = new java.lang.String("clsDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("clsDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, clsDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性clsDt的值与设定内容一致：", clsDt,
        mdl.getClsDt());
  }

  /**
   * 设置属性clsDt的值的测试方法.
   */
  @Test
  public void testSetClsDt() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String clsDt = new java.lang.String("clsDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("clsDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setClsDt(clsDt);

    //(B-2)
    Assert.assertEquals("设置属性clsDt的值与设定内容一致：", clsDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性clsTm的值的测试方法.
   */
  @Test
  public void testGetClsTm() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String clsTm = new java.lang.String("clsTm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("clsTm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, clsTm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性clsTm的值与设定内容一致：", clsTm,
        mdl.getClsTm());
  }

  /**
   * 设置属性clsTm的值的测试方法.
   */
  @Test
  public void testSetClsTm() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String clsTm = new java.lang.String("clsTm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("clsTm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setClsTm(clsTm);

    //(B-2)
    Assert.assertEquals("设置属性clsTm的值与设定内容一致：", clsTm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性admDivCd的值的测试方法.
   */
  @Test
  public void testGetAdmDivCd() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
   * 返回属性evntTtl的值的测试方法.
   */
  @Test
  public void testGetEvntTtl() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntTtl = new java.lang.String("evntTtl");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("evntTtl"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, evntTtl);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性evntTtl的值与设定内容一致：", evntTtl,
        mdl.getEvntTtl());
  }

  /**
   * 设置属性evntTtl的值的测试方法.
   */
  @Test
  public void testSetEvntTtl() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntTtl = new java.lang.String("evntTtl");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("evntTtl"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setEvntTtl(evntTtl);

    //(B-2)
    Assert.assertEquals("设置属性evntTtl的值与设定内容一致：", evntTtl,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性evntSmy的值的测试方法.
   */
  @Test
  public void testGetEvntSmy() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntSmy = new java.lang.String("evntSmy");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("evntSmy"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, evntSmy);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性evntSmy的值与设定内容一致：", evntSmy,
        mdl.getEvntSmy());
  }

  /**
   * 设置属性evntSmy的值的测试方法.
   */
  @Test
  public void testSetEvntSmy() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntSmy = new java.lang.String("evntSmy");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("evntSmy"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setEvntSmy(evntSmy);

    //(B-2)
    Assert.assertEquals("设置属性evntSmy的值与设定内容一致：", evntSmy,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性evntDtl的值的测试方法.
   */
  @Test
  public void testGetEvntDtl() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntDtl = new java.lang.String("evntDtl");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("evntDtl"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, evntDtl);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性evntDtl的值与设定内容一致：", evntDtl,
        mdl.getEvntDtl());
  }

  /**
   * 设置属性evntDtl的值的测试方法.
   */
  @Test
  public void testSetEvntDtl() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String evntDtl = new java.lang.String("evntDtl");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("evntDtl"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setEvntDtl(evntDtl);

    //(B-2)
    Assert.assertEquals("设置属性evntDtl的值与设定内容一致：", evntDtl,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = new MdlTblEvnt();
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
    MdlTblEvnt mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblEvnt();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblEvnt mdlAllCol = new MdlTblEvnt();

    mdl = new MdlTblEvnt();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setUserId(userId);
    mdlAllCol.setUserId(userId);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String evntId = new java.lang.String("evntId");
    mdl.setEvntId(evntId);
    mdlAllCol.setEvntId(evntId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getEvntId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String bgnDt = new java.lang.String("bgnDt");
    mdl.setBgnDt(bgnDt);
    mdlAllCol.setBgnDt(bgnDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBgnDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String bgnTm = new java.lang.String("bgnTm");
    mdl.setBgnTm(bgnTm);
    mdlAllCol.setBgnTm(bgnTm);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBgnTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String clsDt = new java.lang.String("clsDt");
    mdl.setClsDt(clsDt);
    mdlAllCol.setClsDt(clsDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getClsDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String clsTm = new java.lang.String("clsTm");
    mdl.setClsTm(clsTm);
    mdlAllCol.setClsTm(clsTm);
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
    stringBuffer.append(mdl.getClsTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setAdmDivCd(admDivCd);
    mdlAllCol.setAdmDivCd(admDivCd);
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblEvnt();
    java.lang.String evntTtl = new java.lang.String("evntTtl");
    mdl.setEvntTtl(evntTtl);
    mdlAllCol.setEvntTtl(evntTtl);
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
    stringBuffer.append(mdl.getEvntTtl());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String evntSmy = new java.lang.String("evntSmy");
    mdl.setEvntSmy(evntSmy);
    mdlAllCol.setEvntSmy(evntSmy);
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
    stringBuffer.append(mdl.getEvntSmy());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
    java.lang.String evntDtl = new java.lang.String("evntDtl");
    mdl.setEvntDtl(evntDtl);
    mdlAllCol.setEvntDtl(evntDtl);
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
    stringBuffer.append(mdl.getEvntDtl());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblEvnt();
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

    mdl = new MdlTblEvnt();
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

    mdl = new MdlTblEvnt();
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

    mdl = new MdlTblEvnt();
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

    mdl = new MdlTblEvnt();
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

    mdl = new MdlTblEvnt();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getUserId()
        + "," + mdlAllCol.getEvntId()
        + "," + mdlAllCol.getBgnDt()
        + "," + mdlAllCol.getBgnTm()
        + "," + mdlAllCol.getClsDt()
        + "," + mdlAllCol.getClsTm()
        + "," + mdlAllCol.getAdmDivCd()
        + "," + mdlAllCol.getEvntTtl()
        + "," + mdlAllCol.getEvntSmy()
        + "," + mdlAllCol.getEvntDtl()
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
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setUserId(userId);
    java.lang.String evntId = new java.lang.String("evntId");
    mdl.setEvntId(evntId);
    java.lang.String bgnDt = new java.lang.String("bgnDt");
    mdl.setBgnDt(bgnDt);
    java.lang.String bgnTm = new java.lang.String("bgnTm");
    mdl.setBgnTm(bgnTm);
    java.lang.String clsDt = new java.lang.String("clsDt");
    mdl.setClsDt(clsDt);
    java.lang.String clsTm = new java.lang.String("clsTm");
    mdl.setClsTm(clsTm);
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setAdmDivCd(admDivCd);
    java.lang.String evntTtl = new java.lang.String("evntTtl");
    mdl.setEvntTtl(evntTtl);
    java.lang.String evntSmy = new java.lang.String("evntSmy");
    mdl.setEvntSmy(evntSmy);
    java.lang.String evntDtl = new java.lang.String("evntDtl");
    mdl.setEvntDtl(evntDtl);
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

    Assert.assertEquals(mdl.getUserId(),
        mdl.getValueByKey(MdlTblEvnt.USER_ID));
    Assert.assertEquals(mdl.getEvntId(),
        mdl.getValueByKey(MdlTblEvnt.EVNT_ID));
    Assert.assertEquals(mdl.getBgnDt(),
        mdl.getValueByKey(MdlTblEvnt.BGN_DT));
    Assert.assertEquals(mdl.getBgnTm(),
        mdl.getValueByKey(MdlTblEvnt.BGN_TM));
    Assert.assertEquals(mdl.getClsDt(),
        mdl.getValueByKey(MdlTblEvnt.CLS_DT));
    Assert.assertEquals(mdl.getClsTm(),
        mdl.getValueByKey(MdlTblEvnt.CLS_TM));
    Assert.assertEquals(mdl.getAdmDivCd(),
        mdl.getValueByKey(MdlTblEvnt.ADM_DIV_CD));
    Assert.assertEquals(mdl.getEvntTtl(),
        mdl.getValueByKey(MdlTblEvnt.EVNT_TTL));
    Assert.assertEquals(mdl.getEvntSmy(),
        mdl.getValueByKey(MdlTblEvnt.EVNT_SMY));
    Assert.assertEquals(mdl.getEvntDtl(),
        mdl.getValueByKey(MdlTblEvnt.EVNT_DTL));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblEvnt.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblEvnt.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblEvnt.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblEvnt.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblEvnt.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblEvnt.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblEvnt mdl = new MdlTblEvnt();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setValueByKey(MdlTblEvnt.USER_ID, userId);
    java.lang.String evntId = new java.lang.String("evntId");
    mdl.setValueByKey(MdlTblEvnt.EVNT_ID, evntId);
    java.lang.String bgnDt = new java.lang.String("bgnDt");
    mdl.setValueByKey(MdlTblEvnt.BGN_DT, bgnDt);
    java.lang.String bgnTm = new java.lang.String("bgnTm");
    mdl.setValueByKey(MdlTblEvnt.BGN_TM, bgnTm);
    java.lang.String clsDt = new java.lang.String("clsDt");
    mdl.setValueByKey(MdlTblEvnt.CLS_DT, clsDt);
    java.lang.String clsTm = new java.lang.String("clsTm");
    mdl.setValueByKey(MdlTblEvnt.CLS_TM, clsTm);
    java.lang.String admDivCd = new java.lang.String("admDivCd");
    mdl.setValueByKey(MdlTblEvnt.ADM_DIV_CD, admDivCd);
    java.lang.String evntTtl = new java.lang.String("evntTtl");
    mdl.setValueByKey(MdlTblEvnt.EVNT_TTL, evntTtl);
    java.lang.String evntSmy = new java.lang.String("evntSmy");
    mdl.setValueByKey(MdlTblEvnt.EVNT_SMY, evntSmy);
    java.lang.String evntDtl = new java.lang.String("evntDtl");
    mdl.setValueByKey(MdlTblEvnt.EVNT_DTL, evntDtl);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblEvnt.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblEvnt.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblEvnt.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblEvnt.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblEvnt.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblEvnt.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getUserId(),
        mdl.getValueByKey( MdlTblEvnt.USER_ID ));
    Assert.assertEquals(mdl.getEvntId(),
        mdl.getValueByKey( MdlTblEvnt.EVNT_ID ));
    Assert.assertEquals(mdl.getBgnDt(),
        mdl.getValueByKey( MdlTblEvnt.BGN_DT ));
    Assert.assertEquals(mdl.getBgnTm(),
        mdl.getValueByKey( MdlTblEvnt.BGN_TM ));
    Assert.assertEquals(mdl.getClsDt(),
        mdl.getValueByKey( MdlTblEvnt.CLS_DT ));
    Assert.assertEquals(mdl.getClsTm(),
        mdl.getValueByKey( MdlTblEvnt.CLS_TM ));
    Assert.assertEquals(mdl.getAdmDivCd(),
        mdl.getValueByKey( MdlTblEvnt.ADM_DIV_CD ));
    Assert.assertEquals(mdl.getEvntTtl(),
        mdl.getValueByKey( MdlTblEvnt.EVNT_TTL ));
    Assert.assertEquals(mdl.getEvntSmy(),
        mdl.getValueByKey( MdlTblEvnt.EVNT_SMY ));
    Assert.assertEquals(mdl.getEvntDtl(),
        mdl.getValueByKey( MdlTblEvnt.EVNT_DTL ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblEvnt.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblEvnt.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblEvnt.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblEvnt.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblEvnt.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblEvnt.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblEvntTest.class.getDeclaredMethods();
    Method[] methods = MdlTblEvnt.class.getDeclaredMethods();
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
