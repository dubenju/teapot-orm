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
 * 表tbl_msg的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:01.615 +0900自动生成的。
 */
public class MdlTblMsgTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_MSG", MdlTblMsg.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblMsg() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性userId的值的测试方法.
   */
  @Test
  public void testGetUserId() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
   * 返回属性pubDt的值的测试方法.
   */
  @Test
  public void testGetPubDt() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String pubDt = new java.lang.String("pubDt");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("pubDt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, pubDt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性pubDt的值与设定内容一致：", pubDt,
        mdl.getPubDt());
  }

  /**
   * 设置属性pubDt的值的测试方法.
   */
  @Test
  public void testSetPubDt() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String pubDt = new java.lang.String("pubDt");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("pubDt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPubDt(pubDt);

    //(B-2)
    Assert.assertEquals("设置属性pubDt的值与设定内容一致：", pubDt,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性pubTm的值的测试方法.
   */
  @Test
  public void testGetPubTm() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String pubTm = new java.lang.String("pubTm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("pubTm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, pubTm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性pubTm的值与设定内容一致：", pubTm,
        mdl.getPubTm());
  }

  /**
   * 设置属性pubTm的值的测试方法.
   */
  @Test
  public void testSetPubTm() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String pubTm = new java.lang.String("pubTm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("pubTm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setPubTm(pubTm);

    //(B-2)
    Assert.assertEquals("设置属性pubTm的值与设定内容一致：", pubTm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性recvUserId的值的测试方法.
   */
  @Test
  public void testGetRecvUserId() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String recvUserId = new java.lang.String("recvUserId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("recvUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, recvUserId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性recvUserId的值与设定内容一致：", recvUserId,
        mdl.getRecvUserId());
  }

  /**
   * 设置属性recvUserId的值的测试方法.
   */
  @Test
  public void testSetRecvUserId() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String recvUserId = new java.lang.String("recvUserId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("recvUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRecvUserId(recvUserId);

    //(B-2)
    Assert.assertEquals("设置属性recvUserId的值与设定内容一致：", recvUserId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性msgCont的值的测试方法.
   */
  @Test
  public void testGetMsgCont() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String msgCont = new java.lang.String("msgCont");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("msgCont"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, msgCont);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性msgCont的值与设定内容一致：", msgCont,
        mdl.getMsgCont());
  }

  /**
   * 设置属性msgCont的值的测试方法.
   */
  @Test
  public void testSetMsgCont() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String msgCont = new java.lang.String("msgCont");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("msgCont"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setMsgCont(msgCont);

    //(B-2)
    Assert.assertEquals("设置属性msgCont的值与设定内容一致：", msgCont,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性delFlg的值的测试方法.
   */
  @Test
  public void testGetDelFlg() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String delFlg = new java.lang.String("delFlg");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("delFlg"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, delFlg);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性delFlg的值与设定内容一致：", delFlg,
        mdl.getDelFlg());
  }

  /**
   * 设置属性delFlg的值的测试方法.
   */
  @Test
  public void testSetDelFlg() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String delFlg = new java.lang.String("delFlg");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("delFlg"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setDelFlg(delFlg);

    //(B-2)
    Assert.assertEquals("设置属性delFlg的值与设定内容一致：", delFlg,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = new MdlTblMsg();
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
    MdlTblMsg mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblMsg();
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

    MdlTblMsg mdlAllCol = new MdlTblMsg();

    mdl = new MdlTblMsg();
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
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlTblMsg();
    java.lang.String pubDt = new java.lang.String("pubDt");
    mdl.setPubDt(pubDt);
    mdlAllCol.setPubDt(pubDt);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getPubDt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMsg();
    java.lang.String pubTm = new java.lang.String("pubTm");
    mdl.setPubTm(pubTm);
    mdlAllCol.setPubTm(pubTm);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getPubTm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMsg();
    java.lang.String recvUserId = new java.lang.String("recvUserId");
    mdl.setRecvUserId(recvUserId);
    mdlAllCol.setRecvUserId(recvUserId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getRecvUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMsg();
    java.lang.String msgCont = new java.lang.String("msgCont");
    mdl.setMsgCont(msgCont);
    mdlAllCol.setMsgCont(msgCont);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getMsgCont());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMsg();
    java.lang.String delFlg = new java.lang.String("delFlg");
    mdl.setDelFlg(delFlg);
    mdlAllCol.setDelFlg(delFlg);
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
    stringBuffer.append(mdl.getDelFlg());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblMsg();
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

    mdl = new MdlTblMsg();
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

    mdl = new MdlTblMsg();
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

    mdl = new MdlTblMsg();
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

    mdl = new MdlTblMsg();
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

    mdl = new MdlTblMsg();
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
    Assert.assertEquals(mdlAllCol.getUserId()
        + "," + mdlAllCol.getPubDt()
        + "," + mdlAllCol.getPubTm()
        + "," + mdlAllCol.getRecvUserId()
        + "," + mdlAllCol.getMsgCont()
        + "," + mdlAllCol.getDelFlg()
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
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setUserId(userId);
    java.lang.String pubDt = new java.lang.String("pubDt");
    mdl.setPubDt(pubDt);
    java.lang.String pubTm = new java.lang.String("pubTm");
    mdl.setPubTm(pubTm);
    java.lang.String recvUserId = new java.lang.String("recvUserId");
    mdl.setRecvUserId(recvUserId);
    java.lang.String msgCont = new java.lang.String("msgCont");
    mdl.setMsgCont(msgCont);
    java.lang.String delFlg = new java.lang.String("delFlg");
    mdl.setDelFlg(delFlg);
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
        mdl.getValueByKey(MdlTblMsg.USER_ID));
    Assert.assertEquals(mdl.getPubDt(),
        mdl.getValueByKey(MdlTblMsg.PUB_DT));
    Assert.assertEquals(mdl.getPubTm(),
        mdl.getValueByKey(MdlTblMsg.PUB_TM));
    Assert.assertEquals(mdl.getRecvUserId(),
        mdl.getValueByKey(MdlTblMsg.RECV_USER_ID));
    Assert.assertEquals(mdl.getMsgCont(),
        mdl.getValueByKey(MdlTblMsg.MSG_CONT));
    Assert.assertEquals(mdl.getDelFlg(),
        mdl.getValueByKey(MdlTblMsg.DEL_FLG));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblMsg.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblMsg.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblMsg.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblMsg.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblMsg.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblMsg.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblMsg mdl = new MdlTblMsg();
    java.lang.String userId = new java.lang.String("userId");
    mdl.setValueByKey(MdlTblMsg.USER_ID, userId);
    java.lang.String pubDt = new java.lang.String("pubDt");
    mdl.setValueByKey(MdlTblMsg.PUB_DT, pubDt);
    java.lang.String pubTm = new java.lang.String("pubTm");
    mdl.setValueByKey(MdlTblMsg.PUB_TM, pubTm);
    java.lang.String recvUserId = new java.lang.String("recvUserId");
    mdl.setValueByKey(MdlTblMsg.RECV_USER_ID, recvUserId);
    java.lang.String msgCont = new java.lang.String("msgCont");
    mdl.setValueByKey(MdlTblMsg.MSG_CONT, msgCont);
    java.lang.String delFlg = new java.lang.String("delFlg");
    mdl.setValueByKey(MdlTblMsg.DEL_FLG, delFlg);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblMsg.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblMsg.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblMsg.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblMsg.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblMsg.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblMsg.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getUserId(),
        mdl.getValueByKey( MdlTblMsg.USER_ID ));
    Assert.assertEquals(mdl.getPubDt(),
        mdl.getValueByKey( MdlTblMsg.PUB_DT ));
    Assert.assertEquals(mdl.getPubTm(),
        mdl.getValueByKey( MdlTblMsg.PUB_TM ));
    Assert.assertEquals(mdl.getRecvUserId(),
        mdl.getValueByKey( MdlTblMsg.RECV_USER_ID ));
    Assert.assertEquals(mdl.getMsgCont(),
        mdl.getValueByKey( MdlTblMsg.MSG_CONT ));
    Assert.assertEquals(mdl.getDelFlg(),
        mdl.getValueByKey( MdlTblMsg.DEL_FLG ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblMsg.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblMsg.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblMsg.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblMsg.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblMsg.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblMsg.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblMsgTest.class.getDeclaredMethods();
    Method[] methods = MdlTblMsg.class.getDeclaredMethods();
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
