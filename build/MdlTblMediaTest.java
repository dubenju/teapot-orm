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
 * 表tbl_media的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:00.929 +0900自动生成的。
 */
public class MdlTblMediaTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_MEDIA", MdlTblMedia.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblMedia() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性mediaType的值的测试方法.
   */
  @Test
  public void testGetMediaType() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaType = new java.lang.String("mediaType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, mediaType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性mediaType的值与设定内容一致：", mediaType,
        mdl.getMediaType());
  }

  /**
   * 设置属性mediaType的值的测试方法.
   */
  @Test
  public void testSetMediaType() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaType = new java.lang.String("mediaType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setMediaType(mediaType);

    //(B-2)
    Assert.assertEquals("设置属性mediaType的值与设定内容一致：", mediaType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性mediaId的值的测试方法.
   */
  @Test
  public void testGetMediaId() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaId = new java.lang.String("mediaId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, mediaId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性mediaId的值与设定内容一致：", mediaId,
        mdl.getMediaId());
  }

  /**
   * 设置属性mediaId的值的测试方法.
   */
  @Test
  public void testSetMediaId() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaId = new java.lang.String("mediaId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setMediaId(mediaId);

    //(B-2)
    Assert.assertEquals("设置属性mediaId的值与设定内容一致：", mediaId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性appliStDt的值的测试方法.
   */
  @Test
  public void testGetAppliStDt() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
   * 返回属性mediaCont的值的测试方法.
   */
  @Test
  public void testGetMediaCont() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    byte[] mediaCont = new byte[] {0x31};

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaCont"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, mediaCont);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性mediaCont的值与设定内容一致：", mediaCont,
        mdl.getMediaCont());
  }

  /**
   * 设置属性mediaCont的值的测试方法.
   */
  @Test
  public void testSetMediaCont() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
    byte[] mediaCont = new byte[] {0x32};

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("mediaCont"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setMediaCont(mediaCont);

    //(B-2)
    Assert.assertEquals("设置属性mediaCont的值与设定内容一致：", mediaCont,
        (byte[]) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = new MdlTblMedia();
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
    MdlTblMedia mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblMedia();
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
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblMedia mdlAllCol = new MdlTblMedia();

    mdl = new MdlTblMedia();
    java.lang.String mediaType = new java.lang.String("mediaType");
    mdl.setMediaType(mediaType);
    mdlAllCol.setMediaType(mediaType);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getMediaType());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMedia();
    java.lang.String mediaId = new java.lang.String("mediaId");
    mdl.setMediaId(mediaId);
    mdlAllCol.setMediaId(mediaId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getMediaId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMedia();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMedia();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMedia();
    byte[] mediaCont = new byte[] {0x32};
    mdl.setMediaCont(mediaCont);
    mdlAllCol.setMediaCont(mediaCont);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getMediaCont());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMedia();
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

    mdl = new MdlTblMedia();
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

    mdl = new MdlTblMedia();
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
    stringBuffer.append(mdl.getRntUpdDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMedia();
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
    stringBuffer.append(mdl.getRntUpdTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMedia();
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
    stringBuffer.append(mdl.getUpdUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMedia();
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
    stringBuffer.append(mdl.getUpdVwId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getMediaType()
        + "," + mdlAllCol.getMediaId()
        + "," + mdlAllCol.getAppliStDt()
        + "," + mdlAllCol.getAppliEdDt()
        + "," + mdlAllCol.getMediaCont()
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
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaType = new java.lang.String("mediaType");
    mdl.setMediaType(mediaType);
    java.lang.String mediaId = new java.lang.String("mediaId");
    mdl.setMediaId(mediaId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    byte[] mediaCont = new byte[] {0x32};
    mdl.setMediaCont(mediaCont);
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

    Assert.assertEquals(mdl.getMediaType(),
        mdl.getValueByKey(MdlTblMedia.MEDIA_TYPE));
    Assert.assertEquals(mdl.getMediaId(),
        mdl.getValueByKey(MdlTblMedia.MEDIA_ID));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey(MdlTblMedia.APPLI_ST_DT));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey(MdlTblMedia.APPLI_ED_DT));
    Assert.assertEquals(mdl.getMediaCont(),
        mdl.getValueByKey(MdlTblMedia.MEDIA_CONT));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblMedia.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblMedia.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblMedia.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblMedia.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblMedia.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblMedia.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblMedia mdl = new MdlTblMedia();
    java.lang.String mediaType = new java.lang.String("mediaType");
    mdl.setValueByKey(MdlTblMedia.MEDIA_TYPE, mediaType);
    java.lang.String mediaId = new java.lang.String("mediaId");
    mdl.setValueByKey(MdlTblMedia.MEDIA_ID, mediaId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setValueByKey(MdlTblMedia.APPLI_ST_DT, appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setValueByKey(MdlTblMedia.APPLI_ED_DT, appliEdDt);
    byte[] mediaCont = new byte[] {0x32};
    mdl.setValueByKey(MdlTblMedia.MEDIA_CONT, mediaCont);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblMedia.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblMedia.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblMedia.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblMedia.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblMedia.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblMedia.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getMediaType(),
        mdl.getValueByKey( MdlTblMedia.MEDIA_TYPE ));
    Assert.assertEquals(mdl.getMediaId(),
        mdl.getValueByKey( MdlTblMedia.MEDIA_ID ));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey( MdlTblMedia.APPLI_ST_DT ));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey( MdlTblMedia.APPLI_ED_DT ));
    Assert.assertEquals(mdl.getMediaCont(),
        mdl.getValueByKey( MdlTblMedia.MEDIA_CONT ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblMedia.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblMedia.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblMedia.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblMedia.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblMedia.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblMedia.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblMediaTest.class.getDeclaredMethods();
    Method[] methods = MdlTblMedia.class.getDeclaredMethods();
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
