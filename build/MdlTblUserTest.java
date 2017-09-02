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
 * 表tbl_user的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:03.099 +0900自动生成的。
 */
public class MdlTblUserTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_USER", MdlTblUser.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblUser() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性userId的值的测试方法.
   */
  @Test
  public void testGetUserId() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
   * 返回属性appliStDt的值的测试方法.
   */
  @Test
  public void testGetAppliStDt() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
   * 返回属性userAcnt的值的测试方法.
   */
  @Test
  public void testGetUserAcnt() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userAcnt = new java.lang.String("userAcnt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("userAcnt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, userAcnt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性userAcnt的值与设定内容一致：", userAcnt,
        mdl.getUserAcnt());
  }

  /**
   * 设置属性userAcnt的值的测试方法.
   */
  @Test
  public void testSetUserAcnt() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userAcnt = new java.lang.String("userAcnt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("userAcnt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUserAcnt(userAcnt);

    //(B-2)
    Assert.assertEquals("设置属性userAcnt的值与设定内容一致：", userAcnt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性userNnm的值的测试方法.
   */
  @Test
  public void testGetUserNnm() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userNnm = new java.lang.String("userNnm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("userNnm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, userNnm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性userNnm的值与设定内容一致：", userNnm,
        mdl.getUserNnm());
  }

  /**
   * 设置属性userNnm的值的测试方法.
   */
  @Test
  public void testSetUserNnm() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userNnm = new java.lang.String("userNnm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("userNnm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUserNnm(userNnm);

    //(B-2)
    Assert.assertEquals("设置属性userNnm的值与设定内容一致：", userNnm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性userEml的值的测试方法.
   */
  @Test
  public void testGetUserEml() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userEml = new java.lang.String("userEml");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("userEml"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, userEml);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性userEml的值与设定内容一致：", userEml,
        mdl.getUserEml());
  }

  /**
   * 设置属性userEml的值的测试方法.
   */
  @Test
  public void testSetUserEml() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userEml = new java.lang.String("userEml");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("userEml"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUserEml(userEml);

    //(B-2)
    Assert.assertEquals("设置属性userEml的值与设定内容一致：", userEml,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性pstCd的值的测试方法.
   */
  @Test
  public void testGetPstCd() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
   * 返回属性cntctAddr的值的测试方法.
   */
  @Test
  public void testGetCntctAddr() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String cntctAddr = new java.lang.String("cntctAddr");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cntctAddr"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cntctAddr);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cntctAddr的值与设定内容一致：", cntctAddr,
        mdl.getCntctAddr());
  }

  /**
   * 设置属性cntctAddr的值的测试方法.
   */
  @Test
  public void testSetCntctAddr() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String cntctAddr = new java.lang.String("cntctAddr");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cntctAddr"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCntctAddr(cntctAddr);

    //(B-2)
    Assert.assertEquals("设置属性cntctAddr的值与设定内容一致：", cntctAddr,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性userFnm的值的测试方法.
   */
  @Test
  public void testGetUserFnm() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userFnm = new java.lang.String("userFnm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("userFnm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, userFnm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性userFnm的值与设定内容一致：", userFnm,
        mdl.getUserFnm());
  }

  /**
   * 设置属性userFnm的值的测试方法.
   */
  @Test
  public void testSetUserFnm() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userFnm = new java.lang.String("userFnm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("userFnm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUserFnm(userFnm);

    //(B-2)
    Assert.assertEquals("设置属性userFnm的值与设定内容一致：", userFnm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cntctPhn的值的测试方法.
   */
  @Test
  public void testGetCntctPhn() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("cntctPhn"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, cntctPhn);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性cntctPhn的值与设定内容一致：", cntctPhn,
        mdl.getCntctPhn());
  }

  /**
   * 设置属性cntctPhn的值的测试方法.
   */
  @Test
  public void testSetCntctPhn() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("cntctPhn"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCntctPhn(cntctPhn);

    //(B-2)
    Assert.assertEquals("设置属性cntctPhn的值与设定内容一致：", cntctPhn,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性idcrdNo的值的测试方法.
   */
  @Test
  public void testGetIdcrdNo() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String idcrdNo = new java.lang.String("idcrdNo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("idcrdNo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, idcrdNo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性idcrdNo的值与设定内容一致：", idcrdNo,
        mdl.getIdcrdNo());
  }

  /**
   * 设置属性idcrdNo的值的测试方法.
   */
  @Test
  public void testSetIdcrdNo() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String idcrdNo = new java.lang.String("idcrdNo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("idcrdNo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setIdcrdNo(idcrdNo);

    //(B-2)
    Assert.assertEquals("设置属性idcrdNo的值与设定内容一致：", idcrdNo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = new MdlTblUser();
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
    MdlTblUser mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblUser();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblUser mdlAllCol = new MdlTblUser();

    mdl = new MdlTblUser();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblUser();
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    mdlAllCol.setAppliStDt(appliStDt);
    stringBuffer = new StringBuffer();
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
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    mdlAllCol.setAppliEdDt(appliEdDt);
    stringBuffer = new StringBuffer();
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
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String userAcnt = new java.lang.String("userAcnt");
    mdl.setUserAcnt(userAcnt);
    mdlAllCol.setUserAcnt(userAcnt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUserAcnt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String userNnm = new java.lang.String("userNnm");
    mdl.setUserNnm(userNnm);
    mdlAllCol.setUserNnm(userNnm);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUserNnm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String userEml = new java.lang.String("userEml");
    mdl.setUserEml(userEml);
    mdlAllCol.setUserEml(userEml);
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
    stringBuffer.append(mdl.getUserEml());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setPstCd(pstCd);
    mdlAllCol.setPstCd(pstCd);
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblUser();
    java.lang.String cntctAddr = new java.lang.String("cntctAddr");
    mdl.setCntctAddr(cntctAddr);
    mdlAllCol.setCntctAddr(cntctAddr);
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
    stringBuffer.append(mdl.getCntctAddr());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String userFnm = new java.lang.String("userFnm");
    mdl.setUserFnm(userFnm);
    mdlAllCol.setUserFnm(userFnm);
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
    stringBuffer.append(mdl.getUserFnm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");
    mdl.setCntctPhn(cntctPhn);
    mdlAllCol.setCntctPhn(cntctPhn);
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
    stringBuffer.append(mdl.getCntctPhn());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
    java.lang.String idcrdNo = new java.lang.String("idcrdNo");
    mdl.setIdcrdNo(idcrdNo);
    mdlAllCol.setIdcrdNo(idcrdNo);
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
    stringBuffer.append(mdl.getIdcrdNo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblUser();
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

    mdl = new MdlTblUser();
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

    mdl = new MdlTblUser();
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

    mdl = new MdlTblUser();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getRntUpdTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblUser();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblUser();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getUserId()
        + "," + mdlAllCol.getAppliStDt()
        + "," + mdlAllCol.getAppliEdDt()
        + "," + mdlAllCol.getUserAcnt()
        + "," + mdlAllCol.getUserNnm()
        + "," + mdlAllCol.getUserEml()
        + "," + mdlAllCol.getPstCd()
        + "," + mdlAllCol.getCntctAddr()
        + "," + mdlAllCol.getUserFnm()
        + "," + mdlAllCol.getCntctPhn()
        + "," + mdlAllCol.getIdcrdNo()
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
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setUserId(userId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    java.lang.String userAcnt = new java.lang.String("userAcnt");
    mdl.setUserAcnt(userAcnt);
    java.lang.String userNnm = new java.lang.String("userNnm");
    mdl.setUserNnm(userNnm);
    java.lang.String userEml = new java.lang.String("userEml");
    mdl.setUserEml(userEml);
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setPstCd(pstCd);
    java.lang.String cntctAddr = new java.lang.String("cntctAddr");
    mdl.setCntctAddr(cntctAddr);
    java.lang.String userFnm = new java.lang.String("userFnm");
    mdl.setUserFnm(userFnm);
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");
    mdl.setCntctPhn(cntctPhn);
    java.lang.String idcrdNo = new java.lang.String("idcrdNo");
    mdl.setIdcrdNo(idcrdNo);
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
        mdl.getValueByKey(MdlTblUser.USER_ID));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey(MdlTblUser.APPLI_ST_DT));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey(MdlTblUser.APPLI_ED_DT));
    Assert.assertEquals(mdl.getUserAcnt(),
        mdl.getValueByKey(MdlTblUser.USER_ACNT));
    Assert.assertEquals(mdl.getUserNnm(),
        mdl.getValueByKey(MdlTblUser.USER_NNM));
    Assert.assertEquals(mdl.getUserEml(),
        mdl.getValueByKey(MdlTblUser.USER_EML));
    Assert.assertEquals(mdl.getPstCd(),
        mdl.getValueByKey(MdlTblUser.PST_CD));
    Assert.assertEquals(mdl.getCntctAddr(),
        mdl.getValueByKey(MdlTblUser.CNTCT_ADDR));
    Assert.assertEquals(mdl.getUserFnm(),
        mdl.getValueByKey(MdlTblUser.USER_FNM));
    Assert.assertEquals(mdl.getCntctPhn(),
        mdl.getValueByKey(MdlTblUser.CNTCT_PHN));
    Assert.assertEquals(mdl.getIdcrdNo(),
        mdl.getValueByKey(MdlTblUser.IDCRD_NO));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblUser.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblUser.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblUser.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblUser.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblUser.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblUser.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblUser mdl = new MdlTblUser();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setValueByKey(MdlTblUser.USER_ID, userId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setValueByKey(MdlTblUser.APPLI_ST_DT, appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setValueByKey(MdlTblUser.APPLI_ED_DT, appliEdDt);
    java.lang.String userAcnt = new java.lang.String("userAcnt");
    mdl.setValueByKey(MdlTblUser.USER_ACNT, userAcnt);
    java.lang.String userNnm = new java.lang.String("userNnm");
    mdl.setValueByKey(MdlTblUser.USER_NNM, userNnm);
    java.lang.String userEml = new java.lang.String("userEml");
    mdl.setValueByKey(MdlTblUser.USER_EML, userEml);
    java.lang.String pstCd = new java.lang.String("pstCd");
    mdl.setValueByKey(MdlTblUser.PST_CD, pstCd);
    java.lang.String cntctAddr = new java.lang.String("cntctAddr");
    mdl.setValueByKey(MdlTblUser.CNTCT_ADDR, cntctAddr);
    java.lang.String userFnm = new java.lang.String("userFnm");
    mdl.setValueByKey(MdlTblUser.USER_FNM, userFnm);
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");
    mdl.setValueByKey(MdlTblUser.CNTCT_PHN, cntctPhn);
    java.lang.String idcrdNo = new java.lang.String("idcrdNo");
    mdl.setValueByKey(MdlTblUser.IDCRD_NO, idcrdNo);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblUser.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblUser.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblUser.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblUser.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblUser.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblUser.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getUserId(),
        mdl.getValueByKey( MdlTblUser.USER_ID ));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey( MdlTblUser.APPLI_ST_DT ));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey( MdlTblUser.APPLI_ED_DT ));
    Assert.assertEquals(mdl.getUserAcnt(),
        mdl.getValueByKey( MdlTblUser.USER_ACNT ));
    Assert.assertEquals(mdl.getUserNnm(),
        mdl.getValueByKey( MdlTblUser.USER_NNM ));
    Assert.assertEquals(mdl.getUserEml(),
        mdl.getValueByKey( MdlTblUser.USER_EML ));
    Assert.assertEquals(mdl.getPstCd(),
        mdl.getValueByKey( MdlTblUser.PST_CD ));
    Assert.assertEquals(mdl.getCntctAddr(),
        mdl.getValueByKey( MdlTblUser.CNTCT_ADDR ));
    Assert.assertEquals(mdl.getUserFnm(),
        mdl.getValueByKey( MdlTblUser.USER_FNM ));
    Assert.assertEquals(mdl.getCntctPhn(),
        mdl.getValueByKey( MdlTblUser.CNTCT_PHN ));
    Assert.assertEquals(mdl.getIdcrdNo(),
        mdl.getValueByKey( MdlTblUser.IDCRD_NO ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblUser.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblUser.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblUser.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblUser.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblUser.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblUser.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblUserTest.class.getDeclaredMethods();
    Method[] methods = MdlTblUser.class.getDeclaredMethods();
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
