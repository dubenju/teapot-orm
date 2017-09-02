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
 * 表tbl_wth的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:03.411 +0900自动生成的。
 */
public class MdlTblWthTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_WTH", MdlTblWth.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblWth() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性wthCd的值的测试方法.
   */
  @Test
  public void testGetWthCd() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
   * 返回属性obtnDt的值的测试方法.
   */
  @Test
  public void testGetObtnDt() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String obtnDt = new java.lang.String("obtnDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("obtnDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, obtnDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性obtnDt的值与设定内容一致：", obtnDt,
        mdl.getObtnDt());
  }

  /**
   * 设置属性obtnDt的值的测试方法.
   */
  @Test
  public void testSetObtnDt() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String obtnDt = new java.lang.String("obtnDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("obtnDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setObtnDt(obtnDt);

    //(B-2)
    Assert.assertEquals("设置属性obtnDt的值与设定内容一致：", obtnDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性wthDt的值的测试方法.
   */
  @Test
  public void testGetWthDt() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthDt = new java.lang.String("wthDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wthDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wthDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wthDt的值与设定内容一致：", wthDt,
        mdl.getWthDt());
  }

  /**
   * 设置属性wthDt的值的测试方法.
   */
  @Test
  public void testSetWthDt() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthDt = new java.lang.String("wthDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wthDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWthDt(wthDt);

    //(B-2)
    Assert.assertEquals("设置属性wthDt的值与设定内容一致：", wthDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性areaNm的值的测试方法.
   */
  @Test
  public void testGetAreaNm() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
   * 返回属性wthInfo的值的测试方法.
   */
  @Test
  public void testGetWthInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthInfo = new java.lang.String("wthInfo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wthInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wthInfo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wthInfo的值与设定内容一致：", wthInfo,
        mdl.getWthInfo());
  }

  /**
   * 设置属性wthInfo的值的测试方法.
   */
  @Test
  public void testSetWthInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthInfo = new java.lang.String("wthInfo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wthInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWthInfo(wthInfo);

    //(B-2)
    Assert.assertEquals("设置属性wthInfo的值与设定内容一致：", wthInfo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性tmprInfo的值的测试方法.
   */
  @Test
  public void testGetTmprInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String tmprInfo = new java.lang.String("tmprInfo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("tmprInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, tmprInfo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性tmprInfo的值与设定内容一致：", tmprInfo,
        mdl.getTmprInfo());
  }

  /**
   * 设置属性tmprInfo的值的测试方法.
   */
  @Test
  public void testSetTmprInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String tmprInfo = new java.lang.String("tmprInfo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("tmprInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTmprInfo(tmprInfo);

    //(B-2)
    Assert.assertEquals("设置属性tmprInfo的值与设定内容一致：", tmprInfo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性wndirInfo的值的测试方法.
   */
  @Test
  public void testGetWndirInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wndirInfo = new java.lang.String("wndirInfo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wndirInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wndirInfo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wndirInfo的值与设定内容一致：", wndirInfo,
        mdl.getWndirInfo());
  }

  /**
   * 设置属性wndirInfo的值的测试方法.
   */
  @Test
  public void testSetWndirInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wndirInfo = new java.lang.String("wndirInfo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wndirInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWndirInfo(wndirInfo);

    //(B-2)
    Assert.assertEquals("设置属性wndirInfo的值与设定内容一致：", wndirInfo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性wnlvlInfo的值的测试方法.
   */
  @Test
  public void testGetWnlvlInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wnlvlInfo = new java.lang.String("wnlvlInfo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wnlvlInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wnlvlInfo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wnlvlInfo的值与设定内容一致：", wnlvlInfo,
        mdl.getWnlvlInfo());
  }

  /**
   * 设置属性wnlvlInfo的值的测试方法.
   */
  @Test
  public void testSetWnlvlInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wnlvlInfo = new java.lang.String("wnlvlInfo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wnlvlInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWnlvlInfo(wnlvlInfo);

    //(B-2)
    Assert.assertEquals("设置属性wnlvlInfo的值与设定内容一致：", wnlvlInfo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性othInfo的值的测试方法.
   */
  @Test
  public void testGetOthInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String othInfo = new java.lang.String("othInfo");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("othInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, othInfo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性othInfo的值与设定内容一致：", othInfo,
        mdl.getOthInfo());
  }

  /**
   * 设置属性othInfo的值的测试方法.
   */
  @Test
  public void testSetOthInfo() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String othInfo = new java.lang.String("othInfo");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("othInfo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setOthInfo(othInfo);

    //(B-2)
    Assert.assertEquals("设置属性othInfo的值与设定内容一致：", othInfo,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = new MdlTblWth();
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
    MdlTblWth mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblWth();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblWth mdlAllCol = new MdlTblWth();

    mdl = new MdlTblWth();
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setWthCd(wthCd);
    mdlAllCol.setWthCd(wthCd);
    stringBuffer = new StringBuffer();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblWth();
    java.lang.String obtnDt = new java.lang.String("obtnDt");
    mdl.setObtnDt(obtnDt);
    mdlAllCol.setObtnDt(obtnDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getObtnDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
    java.lang.String wthDt = new java.lang.String("wthDt");
    mdl.setWthDt(wthDt);
    mdlAllCol.setWthDt(wthDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getWthDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblWth();
    java.lang.String wthInfo = new java.lang.String("wthInfo");
    mdl.setWthInfo(wthInfo);
    mdlAllCol.setWthInfo(wthInfo);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getWthInfo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
    java.lang.String tmprInfo = new java.lang.String("tmprInfo");
    mdl.setTmprInfo(tmprInfo);
    mdlAllCol.setTmprInfo(tmprInfo);
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
    stringBuffer.append(mdl.getTmprInfo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
    java.lang.String wndirInfo = new java.lang.String("wndirInfo");
    mdl.setWndirInfo(wndirInfo);
    mdlAllCol.setWndirInfo(wndirInfo);
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
    stringBuffer.append(mdl.getWndirInfo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
    java.lang.String wnlvlInfo = new java.lang.String("wnlvlInfo");
    mdl.setWnlvlInfo(wnlvlInfo);
    mdlAllCol.setWnlvlInfo(wnlvlInfo);
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
    stringBuffer.append(mdl.getWnlvlInfo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
    java.lang.String othInfo = new java.lang.String("othInfo");
    mdl.setOthInfo(othInfo);
    mdlAllCol.setOthInfo(othInfo);
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
    stringBuffer.append(mdl.getOthInfo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblWth();
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

    mdl = new MdlTblWth();
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

    mdl = new MdlTblWth();
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
    stringBuffer.append(mdl.getRntUpdDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblWth();
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
    stringBuffer.append(mdl.getRntUpdTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblWth();
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
    stringBuffer.append(mdl.getUpdUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblWth();
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
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getWthCd()
        + "," + mdlAllCol.getObtnDt()
        + "," + mdlAllCol.getWthDt()
        + "," + mdlAllCol.getAreaNm()
        + "," + mdlAllCol.getWthInfo()
        + "," + mdlAllCol.getTmprInfo()
        + "," + mdlAllCol.getWndirInfo()
        + "," + mdlAllCol.getWnlvlInfo()
        + "," + mdlAllCol.getOthInfo()
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
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setWthCd(wthCd);
    java.lang.String obtnDt = new java.lang.String("obtnDt");
    mdl.setObtnDt(obtnDt);
    java.lang.String wthDt = new java.lang.String("wthDt");
    mdl.setWthDt(wthDt);
    java.lang.String areaNm = new java.lang.String("areaNm");
    mdl.setAreaNm(areaNm);
    java.lang.String wthInfo = new java.lang.String("wthInfo");
    mdl.setWthInfo(wthInfo);
    java.lang.String tmprInfo = new java.lang.String("tmprInfo");
    mdl.setTmprInfo(tmprInfo);
    java.lang.String wndirInfo = new java.lang.String("wndirInfo");
    mdl.setWndirInfo(wndirInfo);
    java.lang.String wnlvlInfo = new java.lang.String("wnlvlInfo");
    mdl.setWnlvlInfo(wnlvlInfo);
    java.lang.String othInfo = new java.lang.String("othInfo");
    mdl.setOthInfo(othInfo);
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

    Assert.assertEquals(mdl.getWthCd(),
        mdl.getValueByKey(MdlTblWth.WTH_CD));
    Assert.assertEquals(mdl.getObtnDt(),
        mdl.getValueByKey(MdlTblWth.OBTN_DT));
    Assert.assertEquals(mdl.getWthDt(),
        mdl.getValueByKey(MdlTblWth.WTH_DT));
    Assert.assertEquals(mdl.getAreaNm(),
        mdl.getValueByKey(MdlTblWth.AREA_NM));
    Assert.assertEquals(mdl.getWthInfo(),
        mdl.getValueByKey(MdlTblWth.WTH_INFO));
    Assert.assertEquals(mdl.getTmprInfo(),
        mdl.getValueByKey(MdlTblWth.TMPR_INFO));
    Assert.assertEquals(mdl.getWndirInfo(),
        mdl.getValueByKey(MdlTblWth.WNDIR_INFO));
    Assert.assertEquals(mdl.getWnlvlInfo(),
        mdl.getValueByKey(MdlTblWth.WNLVL_INFO));
    Assert.assertEquals(mdl.getOthInfo(),
        mdl.getValueByKey(MdlTblWth.OTH_INFO));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblWth.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblWth.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblWth.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblWth.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblWth.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblWth.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblWth mdl = new MdlTblWth();
    java.lang.String wthCd = new java.lang.String("wthCd");
    mdl.setValueByKey(MdlTblWth.WTH_CD, wthCd);
    java.lang.String obtnDt = new java.lang.String("obtnDt");
    mdl.setValueByKey(MdlTblWth.OBTN_DT, obtnDt);
    java.lang.String wthDt = new java.lang.String("wthDt");
    mdl.setValueByKey(MdlTblWth.WTH_DT, wthDt);
    java.lang.String areaNm = new java.lang.String("areaNm");
    mdl.setValueByKey(MdlTblWth.AREA_NM, areaNm);
    java.lang.String wthInfo = new java.lang.String("wthInfo");
    mdl.setValueByKey(MdlTblWth.WTH_INFO, wthInfo);
    java.lang.String tmprInfo = new java.lang.String("tmprInfo");
    mdl.setValueByKey(MdlTblWth.TMPR_INFO, tmprInfo);
    java.lang.String wndirInfo = new java.lang.String("wndirInfo");
    mdl.setValueByKey(MdlTblWth.WNDIR_INFO, wndirInfo);
    java.lang.String wnlvlInfo = new java.lang.String("wnlvlInfo");
    mdl.setValueByKey(MdlTblWth.WNLVL_INFO, wnlvlInfo);
    java.lang.String othInfo = new java.lang.String("othInfo");
    mdl.setValueByKey(MdlTblWth.OTH_INFO, othInfo);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblWth.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblWth.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblWth.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblWth.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblWth.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblWth.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getWthCd(),
        mdl.getValueByKey( MdlTblWth.WTH_CD ));
    Assert.assertEquals(mdl.getObtnDt(),
        mdl.getValueByKey( MdlTblWth.OBTN_DT ));
    Assert.assertEquals(mdl.getWthDt(),
        mdl.getValueByKey( MdlTblWth.WTH_DT ));
    Assert.assertEquals(mdl.getAreaNm(),
        mdl.getValueByKey( MdlTblWth.AREA_NM ));
    Assert.assertEquals(mdl.getWthInfo(),
        mdl.getValueByKey( MdlTblWth.WTH_INFO ));
    Assert.assertEquals(mdl.getTmprInfo(),
        mdl.getValueByKey( MdlTblWth.TMPR_INFO ));
    Assert.assertEquals(mdl.getWndirInfo(),
        mdl.getValueByKey( MdlTblWth.WNDIR_INFO ));
    Assert.assertEquals(mdl.getWnlvlInfo(),
        mdl.getValueByKey( MdlTblWth.WNLVL_INFO ));
    Assert.assertEquals(mdl.getOthInfo(),
        mdl.getValueByKey( MdlTblWth.OTH_INFO ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblWth.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblWth.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblWth.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblWth.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblWth.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblWth.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblWthTest.class.getDeclaredMethods();
    Method[] methods = MdlTblWth.class.getDeclaredMethods();
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
