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
 * 表tbl_store的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:02.037 +0900自动生成的。
 */
public class MdlTblStoreTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "TBL_STORE", MdlTblStore.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlTblStore() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性storeId的值的测试方法.
   */
  @Test
  public void testGetStoreId() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
   * 返回属性appliStDt的值的测试方法.
   */
  @Test
  public void testGetAppliStDt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
   * 返回属性regUserId的值的测试方法.
   */
  @Test
  public void testGetRegUserId() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String regUserId = new java.lang.String("regUserId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("regUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, regUserId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性regUserId的值与设定内容一致：", regUserId,
        mdl.getRegUserId());
  }

  /**
   * 设置属性regUserId的值的测试方法.
   */
  @Test
  public void testSetRegUserId() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String regUserId = new java.lang.String("regUserId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("regUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setRegUserId(regUserId);

    //(B-2)
    Assert.assertEquals("设置属性regUserId的值与设定内容一致：", regUserId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bsnsReg的值的测试方法.
   */
  @Test
  public void testGetBsnsReg() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String bsnsReg = new java.lang.String("bsnsReg");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bsnsReg"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bsnsReg);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bsnsReg的值与设定内容一致：", bsnsReg,
        mdl.getBsnsReg());
  }

  /**
   * 设置属性bsnsReg的值的测试方法.
   */
  @Test
  public void testSetBsnsReg() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String bsnsReg = new java.lang.String("bsnsReg");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bsnsReg"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBsnsReg(bsnsReg);

    //(B-2)
    Assert.assertEquals("设置属性bsnsReg的值与设定内容一致：", bsnsReg,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeNm的值的测试方法.
   */
  @Test
  public void testGetStoreNm() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeNm = new java.lang.String("storeNm");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeNm"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeNm);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeNm的值与设定内容一致：", storeNm,
        mdl.getStoreNm());
  }

  /**
   * 设置属性storeNm的值的测试方法.
   */
  @Test
  public void testSetStoreNm() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeNm = new java.lang.String("storeNm");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeNm"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreNm(storeNm);

    //(B-2)
    Assert.assertEquals("设置属性storeNm的值与设定内容一致：", storeNm,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeAddr的值的测试方法.
   */
  @Test
  public void testGetStoreAddr() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeAddr = new java.lang.String("storeAddr");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeAddr"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeAddr);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeAddr的值与设定内容一致：", storeAddr,
        mdl.getStoreAddr());
  }

  /**
   * 设置属性storeAddr的值的测试方法.
   */
  @Test
  public void testSetStoreAddr() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeAddr = new java.lang.String("storeAddr");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeAddr"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreAddr(storeAddr);

    //(B-2)
    Assert.assertEquals("设置属性storeAddr的值与设定内容一致：", storeAddr,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeLo的值的测试方法.
   */
  @Test
  public void testGetStoreLo() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal storeLo = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeLo"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeLo);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeLo的值与设定内容一致：", storeLo,
        mdl.getStoreLo());
  }

  /**
   * 设置属性storeLo的值的测试方法.
   */
  @Test
  public void testSetStoreLo() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal storeLo = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeLo"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreLo(storeLo);

    //(B-2)
    Assert.assertEquals("设置属性storeLo的值与设定内容一致：", storeLo,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeLa的值的测试方法.
   */
  @Test
  public void testGetStoreLa() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal storeLa = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeLa"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeLa);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeLa的值与设定内容一致：", storeLa,
        mdl.getStoreLa());
  }

  /**
   * 设置属性storeLa的值的测试方法.
   */
  @Test
  public void testSetStoreLa() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal storeLa = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeLa"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreLa(storeLa);

    //(B-2)
    Assert.assertEquals("设置属性storeLa的值与设定内容一致：", storeLa,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeGenre的值的测试方法.
   */
  @Test
  public void testGetStoreGenre() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeGenre = new java.lang.String("storeGenre");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeGenre"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeGenre);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeGenre的值与设定内容一致：", storeGenre,
        mdl.getStoreGenre());
  }

  /**
   * 设置属性storeGenre的值的测试方法.
   */
  @Test
  public void testSetStoreGenre() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeGenre = new java.lang.String("storeGenre");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeGenre"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreGenre(storeGenre);

    //(B-2)
    Assert.assertEquals("设置属性storeGenre的值与设定内容一致：", storeGenre,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性cntctPhn的值的测试方法.
   */
  @Test
  public void testGetCntctPhn() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
   * 返回属性resrvEnab的值的测试方法.
   */
  @Test
  public void testGetResrvEnab() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String resrvEnab = new java.lang.String("resrvEnab");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("resrvEnab"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, resrvEnab);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性resrvEnab的值与设定内容一致：", resrvEnab,
        mdl.getResrvEnab());
  }

  /**
   * 设置属性resrvEnab的值的测试方法.
   */
  @Test
  public void testSetResrvEnab() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String resrvEnab = new java.lang.String("resrvEnab");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("resrvEnab"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setResrvEnab(resrvEnab);

    //(B-2)
    Assert.assertEquals("设置属性resrvEnab的值与设定内容一致：", resrvEnab,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性trfcMns的值的测试方法.
   */
  @Test
  public void testGetTrfcMns() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String trfcMns = new java.lang.String("trfcMns");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("trfcMns"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, trfcMns);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性trfcMns的值与设定内容一致：", trfcMns,
        mdl.getTrfcMns());
  }

  /**
   * 设置属性trfcMns的值的测试方法.
   */
  @Test
  public void testSetTrfcMns() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String trfcMns = new java.lang.String("trfcMns");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("trfcMns"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setTrfcMns(trfcMns);

    //(B-2)
    Assert.assertEquals("设置属性trfcMns的值与设定内容一致：", trfcMns,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bsnsHours的值的测试方法.
   */
  @Test
  public void testGetBsnsHours() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String bsnsHours = new java.lang.String("bsnsHours");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bsnsHours"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bsnsHours);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bsnsHours的值与设定内容一致：", bsnsHours,
        mdl.getBsnsHours());
  }

  /**
   * 设置属性bsnsHours的值的测试方法.
   */
  @Test
  public void testSetBsnsHours() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String bsnsHours = new java.lang.String("bsnsHours");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bsnsHours"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBsnsHours(bsnsHours);

    //(B-2)
    Assert.assertEquals("设置属性bsnsHours的值与设定内容一致：", bsnsHours,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性bdgtAmnt的值的测试方法.
   */
  @Test
  public void testGetBdgtAmnt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal bdgtAmnt = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("bdgtAmnt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, bdgtAmnt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性bdgtAmnt的值与设定内容一致：", bdgtAmnt,
        mdl.getBdgtAmnt());
  }

  /**
   * 设置属性bdgtAmnt的值的测试方法.
   */
  @Test
  public void testSetBdgtAmnt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal bdgtAmnt = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("bdgtAmnt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBdgtAmnt(bdgtAmnt);

    //(B-2)
    Assert.assertEquals("设置属性bdgtAmnt的值与设定内容一致：", bdgtAmnt,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性stsCnt的值的测试方法.
   */
  @Test
  public void testGetStsCnt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal stsCnt = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("stsCnt"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, stsCnt);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性stsCnt的值与设定内容一致：", stsCnt,
        mdl.getStsCnt());
  }

  /**
   * 设置属性stsCnt的值的测试方法.
   */
  @Test
  public void testSetStsCnt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.math.BigDecimal stsCnt = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("stsCnt"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStsCnt(stsCnt);

    //(B-2)
    Assert.assertEquals("设置属性stsCnt的值与设定内容一致：", stsCnt,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性snglHon的值的测试方法.
   */
  @Test
  public void testGetSnglHon() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String snglHon = new java.lang.String("snglHon");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("snglHon"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, snglHon);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性snglHon的值与设定内容一致：", snglHon,
        mdl.getSnglHon());
  }

  /**
   * 设置属性snglHon的值的测试方法.
   */
  @Test
  public void testSetSnglHon() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String snglHon = new java.lang.String("snglHon");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("snglHon"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setSnglHon(snglHon);

    //(B-2)
    Assert.assertEquals("设置属性snglHon的值与设定内容一致：", snglHon,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性wifiHon的值的测试方法.
   */
  @Test
  public void testGetWifiHon() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String wifiHon = new java.lang.String("wifiHon");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("wifiHon"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, wifiHon);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性wifiHon的值与设定内容一致：", wifiHon,
        mdl.getWifiHon());
  }

  /**
   * 设置属性wifiHon的值的测试方法.
   */
  @Test
  public void testSetWifiHon() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String wifiHon = new java.lang.String("wifiHon");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("wifiHon"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setWifiHon(wifiHon);

    //(B-2)
    Assert.assertEquals("设置属性wifiHon的值与设定内容一致：", wifiHon,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性storeHp的值的测试方法.
   */
  @Test
  public void testGetStoreHp() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeHp = new java.lang.String("storeHp");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("storeHp"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, storeHp);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性storeHp的值与设定内容一致：", storeHp,
        mdl.getStoreHp());
  }

  /**
   * 设置属性storeHp的值的测试方法.
   */
  @Test
  public void testSetStoreHp() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeHp = new java.lang.String("storeHp");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("storeHp"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setStoreHp(storeHp);

    //(B-2)
    Assert.assertEquals("设置属性storeHp的值与设定内容一致：", storeHp,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性fstCrtDt的值的测试方法.
   */
  @Test
  public void testGetFstCrtDt() throws Exception {
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = new MdlTblStore();
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
    MdlTblStore mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlTblStore();
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
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlTblStore mdlAllCol = new MdlTblStore();

    mdl = new MdlTblStore();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String regUserId = new java.lang.String("regUserId");
    mdl.setRegUserId(regUserId);
    mdlAllCol.setRegUserId(regUserId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getRegUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String bsnsReg = new java.lang.String("bsnsReg");
    mdl.setBsnsReg(bsnsReg);
    mdlAllCol.setBsnsReg(bsnsReg);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBsnsReg());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String storeNm = new java.lang.String("storeNm");
    mdl.setStoreNm(storeNm);
    mdlAllCol.setStoreNm(storeNm);
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
    stringBuffer.append(mdl.getStoreNm());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String storeAddr = new java.lang.String("storeAddr");
    mdl.setStoreAddr(storeAddr);
    mdlAllCol.setStoreAddr(storeAddr);
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
    stringBuffer.append(mdl.getStoreAddr());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.math.BigDecimal storeLo = new java.math.BigDecimal("2017.10111");
    mdl.setStoreLo(storeLo);
    mdlAllCol.setStoreLo(storeLo);
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
    stringBuffer.append(mdl.getStoreLo());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.math.BigDecimal storeLa = new java.math.BigDecimal("2017.10111");
    mdl.setStoreLa(storeLa);
    mdlAllCol.setStoreLa(storeLa);
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
    stringBuffer.append(mdl.getStoreLa());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String storeGenre = new java.lang.String("storeGenre");
    mdl.setStoreGenre(storeGenre);
    mdlAllCol.setStoreGenre(storeGenre);
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
    stringBuffer.append(mdl.getStoreGenre());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String resrvEnab = new java.lang.String("resrvEnab");
    mdl.setResrvEnab(resrvEnab);
    mdlAllCol.setResrvEnab(resrvEnab);
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
    stringBuffer.append(mdl.getResrvEnab());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String trfcMns = new java.lang.String("trfcMns");
    mdl.setTrfcMns(trfcMns);
    mdlAllCol.setTrfcMns(trfcMns);
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
    stringBuffer.append(mdl.getTrfcMns());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String bsnsHours = new java.lang.String("bsnsHours");
    mdl.setBsnsHours(bsnsHours);
    mdlAllCol.setBsnsHours(bsnsHours);
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
    stringBuffer.append(mdl.getBsnsHours());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.math.BigDecimal bdgtAmnt = new java.math.BigDecimal("2017.10111");
    mdl.setBdgtAmnt(bdgtAmnt);
    mdlAllCol.setBdgtAmnt(bdgtAmnt);
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
    stringBuffer.append(mdl.getBdgtAmnt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.math.BigDecimal stsCnt = new java.math.BigDecimal("2017.10111");
    mdl.setStsCnt(stsCnt);
    mdlAllCol.setStsCnt(stsCnt);
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
    stringBuffer.append(mdl.getStsCnt());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String snglHon = new java.lang.String("snglHon");
    mdl.setSnglHon(snglHon);
    mdlAllCol.setSnglHon(snglHon);
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
    stringBuffer.append(mdl.getSnglHon());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String wifiHon = new java.lang.String("wifiHon");
    mdl.setWifiHon(wifiHon);
    mdlAllCol.setWifiHon(wifiHon);
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
    stringBuffer.append(mdl.getWifiHon());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
    java.lang.String storeHp = new java.lang.String("storeHp");
    mdl.setStoreHp(storeHp);
    mdlAllCol.setStoreHp(storeHp);
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getStoreHp());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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

    mdl = new MdlTblStore();
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
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
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
        + "," + mdlAllCol.getAppliStDt()
        + "," + mdlAllCol.getAppliEdDt()
        + "," + mdlAllCol.getRegUserId()
        + "," + mdlAllCol.getBsnsReg()
        + "," + mdlAllCol.getStoreNm()
        + "," + mdlAllCol.getStoreAddr()
        + "," + mdlAllCol.getStoreLo()
        + "," + mdlAllCol.getStoreLa()
        + "," + mdlAllCol.getStoreGenre()
        + "," + mdlAllCol.getCntctPhn()
        + "," + mdlAllCol.getResrvEnab()
        + "," + mdlAllCol.getTrfcMns()
        + "," + mdlAllCol.getBsnsHours()
        + "," + mdlAllCol.getBdgtAmnt()
        + "," + mdlAllCol.getStsCnt()
        + "," + mdlAllCol.getSnglHon()
        + "," + mdlAllCol.getWifiHon()
        + "," + mdlAllCol.getStoreHp()
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
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeId = new java.lang.String("storeId");
    mdl.setStoreId(storeId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setAppliStDt(appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setAppliEdDt(appliEdDt);
    java.lang.String regUserId = new java.lang.String("regUserId");
    mdl.setRegUserId(regUserId);
    java.lang.String bsnsReg = new java.lang.String("bsnsReg");
    mdl.setBsnsReg(bsnsReg);
    java.lang.String storeNm = new java.lang.String("storeNm");
    mdl.setStoreNm(storeNm);
    java.lang.String storeAddr = new java.lang.String("storeAddr");
    mdl.setStoreAddr(storeAddr);
    java.math.BigDecimal storeLo = new java.math.BigDecimal("2017.10111");
    mdl.setStoreLo(storeLo);
    java.math.BigDecimal storeLa = new java.math.BigDecimal("2017.10111");
    mdl.setStoreLa(storeLa);
    java.lang.String storeGenre = new java.lang.String("storeGenre");
    mdl.setStoreGenre(storeGenre);
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");
    mdl.setCntctPhn(cntctPhn);
    java.lang.String resrvEnab = new java.lang.String("resrvEnab");
    mdl.setResrvEnab(resrvEnab);
    java.lang.String trfcMns = new java.lang.String("trfcMns");
    mdl.setTrfcMns(trfcMns);
    java.lang.String bsnsHours = new java.lang.String("bsnsHours");
    mdl.setBsnsHours(bsnsHours);
    java.math.BigDecimal bdgtAmnt = new java.math.BigDecimal("2017.10111");
    mdl.setBdgtAmnt(bdgtAmnt);
    java.math.BigDecimal stsCnt = new java.math.BigDecimal("2017.10111");
    mdl.setStsCnt(stsCnt);
    java.lang.String snglHon = new java.lang.String("snglHon");
    mdl.setSnglHon(snglHon);
    java.lang.String wifiHon = new java.lang.String("wifiHon");
    mdl.setWifiHon(wifiHon);
    java.lang.String storeHp = new java.lang.String("storeHp");
    mdl.setStoreHp(storeHp);
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
        mdl.getValueByKey(MdlTblStore.STORE_ID));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey(MdlTblStore.APPLI_ST_DT));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey(MdlTblStore.APPLI_ED_DT));
    Assert.assertEquals(mdl.getRegUserId(),
        mdl.getValueByKey(MdlTblStore.REG_USER_ID));
    Assert.assertEquals(mdl.getBsnsReg(),
        mdl.getValueByKey(MdlTblStore.BSNS_REG));
    Assert.assertEquals(mdl.getStoreNm(),
        mdl.getValueByKey(MdlTblStore.STORE_NM));
    Assert.assertEquals(mdl.getStoreAddr(),
        mdl.getValueByKey(MdlTblStore.STORE_ADDR));
    Assert.assertEquals(mdl.getStoreLo(),
        mdl.getValueByKey(MdlTblStore.STORE_LO));
    Assert.assertEquals(mdl.getStoreLa(),
        mdl.getValueByKey(MdlTblStore.STORE_LA));
    Assert.assertEquals(mdl.getStoreGenre(),
        mdl.getValueByKey(MdlTblStore.STORE_GENRE));
    Assert.assertEquals(mdl.getCntctPhn(),
        mdl.getValueByKey(MdlTblStore.CNTCT_PHN));
    Assert.assertEquals(mdl.getResrvEnab(),
        mdl.getValueByKey(MdlTblStore.RESRV_ENAB));
    Assert.assertEquals(mdl.getTrfcMns(),
        mdl.getValueByKey(MdlTblStore.TRFC_MNS));
    Assert.assertEquals(mdl.getBsnsHours(),
        mdl.getValueByKey(MdlTblStore.BSNS_HOURS));
    Assert.assertEquals(mdl.getBdgtAmnt(),
        mdl.getValueByKey(MdlTblStore.BDGT_AMNT));
    Assert.assertEquals(mdl.getStsCnt(),
        mdl.getValueByKey(MdlTblStore.STS_CNT));
    Assert.assertEquals(mdl.getSnglHon(),
        mdl.getValueByKey(MdlTblStore.SNGL_HON));
    Assert.assertEquals(mdl.getWifiHon(),
        mdl.getValueByKey(MdlTblStore.WIFI_HON));
    Assert.assertEquals(mdl.getStoreHp(),
        mdl.getValueByKey(MdlTblStore.STORE_HP));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey(MdlTblStore.FST_CRT_DT));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey(MdlTblStore.FST_CRT_TM));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey(MdlTblStore.RNT_UPD_DT));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey(MdlTblStore.RNT_UPD_TM));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey(MdlTblStore.UPD_USER_ID));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey(MdlTblStore.UPD_VW_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlTblStore mdl = new MdlTblStore();
    java.lang.String storeId = new java.lang.String("storeId");
    mdl.setValueByKey(MdlTblStore.STORE_ID, storeId);
    java.lang.String appliStDt = new java.lang.String("appliStDt");
    mdl.setValueByKey(MdlTblStore.APPLI_ST_DT, appliStDt);
    java.lang.String appliEdDt = new java.lang.String("appliEdDt");
    mdl.setValueByKey(MdlTblStore.APPLI_ED_DT, appliEdDt);
    java.lang.String regUserId = new java.lang.String("regUserId");
    mdl.setValueByKey(MdlTblStore.REG_USER_ID, regUserId);
    java.lang.String bsnsReg = new java.lang.String("bsnsReg");
    mdl.setValueByKey(MdlTblStore.BSNS_REG, bsnsReg);
    java.lang.String storeNm = new java.lang.String("storeNm");
    mdl.setValueByKey(MdlTblStore.STORE_NM, storeNm);
    java.lang.String storeAddr = new java.lang.String("storeAddr");
    mdl.setValueByKey(MdlTblStore.STORE_ADDR, storeAddr);
    java.math.BigDecimal storeLo = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlTblStore.STORE_LO, storeLo);
    java.math.BigDecimal storeLa = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlTblStore.STORE_LA, storeLa);
    java.lang.String storeGenre = new java.lang.String("storeGenre");
    mdl.setValueByKey(MdlTblStore.STORE_GENRE, storeGenre);
    java.lang.String cntctPhn = new java.lang.String("cntctPhn");
    mdl.setValueByKey(MdlTblStore.CNTCT_PHN, cntctPhn);
    java.lang.String resrvEnab = new java.lang.String("resrvEnab");
    mdl.setValueByKey(MdlTblStore.RESRV_ENAB, resrvEnab);
    java.lang.String trfcMns = new java.lang.String("trfcMns");
    mdl.setValueByKey(MdlTblStore.TRFC_MNS, trfcMns);
    java.lang.String bsnsHours = new java.lang.String("bsnsHours");
    mdl.setValueByKey(MdlTblStore.BSNS_HOURS, bsnsHours);
    java.math.BigDecimal bdgtAmnt = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlTblStore.BDGT_AMNT, bdgtAmnt);
    java.math.BigDecimal stsCnt = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlTblStore.STS_CNT, stsCnt);
    java.lang.String snglHon = new java.lang.String("snglHon");
    mdl.setValueByKey(MdlTblStore.SNGL_HON, snglHon);
    java.lang.String wifiHon = new java.lang.String("wifiHon");
    mdl.setValueByKey(MdlTblStore.WIFI_HON, wifiHon);
    java.lang.String storeHp = new java.lang.String("storeHp");
    mdl.setValueByKey(MdlTblStore.STORE_HP, storeHp);
    java.lang.String fstCrtDt = new java.lang.String("fstCrtDt");
    mdl.setValueByKey(MdlTblStore.FST_CRT_DT, fstCrtDt);
    java.lang.String fstCrtTm = new java.lang.String("fstCrtTm");
    mdl.setValueByKey(MdlTblStore.FST_CRT_TM, fstCrtTm);
    java.lang.String rntUpdDt = new java.lang.String("rntUpdDt");
    mdl.setValueByKey(MdlTblStore.RNT_UPD_DT, rntUpdDt);
    java.lang.String rntUpdTm = new java.lang.String("rntUpdTm");
    mdl.setValueByKey(MdlTblStore.RNT_UPD_TM, rntUpdTm);
    java.lang.String updUserId = new java.lang.String("updUserId");
    mdl.setValueByKey(MdlTblStore.UPD_USER_ID, updUserId);
    java.lang.String updVwId = new java.lang.String("updVwId");
    mdl.setValueByKey(MdlTblStore.UPD_VW_ID, updVwId);

    Assert.assertEquals(mdl.getStoreId(),
        mdl.getValueByKey( MdlTblStore.STORE_ID ));
    Assert.assertEquals(mdl.getAppliStDt(),
        mdl.getValueByKey( MdlTblStore.APPLI_ST_DT ));
    Assert.assertEquals(mdl.getAppliEdDt(),
        mdl.getValueByKey( MdlTblStore.APPLI_ED_DT ));
    Assert.assertEquals(mdl.getRegUserId(),
        mdl.getValueByKey( MdlTblStore.REG_USER_ID ));
    Assert.assertEquals(mdl.getBsnsReg(),
        mdl.getValueByKey( MdlTblStore.BSNS_REG ));
    Assert.assertEquals(mdl.getStoreNm(),
        mdl.getValueByKey( MdlTblStore.STORE_NM ));
    Assert.assertEquals(mdl.getStoreAddr(),
        mdl.getValueByKey( MdlTblStore.STORE_ADDR ));
    Assert.assertEquals(mdl.getStoreLo(),
        mdl.getValueByKey( MdlTblStore.STORE_LO ));
    Assert.assertEquals(mdl.getStoreLa(),
        mdl.getValueByKey( MdlTblStore.STORE_LA ));
    Assert.assertEquals(mdl.getStoreGenre(),
        mdl.getValueByKey( MdlTblStore.STORE_GENRE ));
    Assert.assertEquals(mdl.getCntctPhn(),
        mdl.getValueByKey( MdlTblStore.CNTCT_PHN ));
    Assert.assertEquals(mdl.getResrvEnab(),
        mdl.getValueByKey( MdlTblStore.RESRV_ENAB ));
    Assert.assertEquals(mdl.getTrfcMns(),
        mdl.getValueByKey( MdlTblStore.TRFC_MNS ));
    Assert.assertEquals(mdl.getBsnsHours(),
        mdl.getValueByKey( MdlTblStore.BSNS_HOURS ));
    Assert.assertEquals(mdl.getBdgtAmnt(),
        mdl.getValueByKey( MdlTblStore.BDGT_AMNT ));
    Assert.assertEquals(mdl.getStsCnt(),
        mdl.getValueByKey( MdlTblStore.STS_CNT ));
    Assert.assertEquals(mdl.getSnglHon(),
        mdl.getValueByKey( MdlTblStore.SNGL_HON ));
    Assert.assertEquals(mdl.getWifiHon(),
        mdl.getValueByKey( MdlTblStore.WIFI_HON ));
    Assert.assertEquals(mdl.getStoreHp(),
        mdl.getValueByKey( MdlTblStore.STORE_HP ));
    Assert.assertEquals(mdl.getFstCrtDt(),
        mdl.getValueByKey( MdlTblStore.FST_CRT_DT ));
    Assert.assertEquals(mdl.getFstCrtTm(),
        mdl.getValueByKey( MdlTblStore.FST_CRT_TM ));
    Assert.assertEquals(mdl.getRntUpdDt(),
        mdl.getValueByKey( MdlTblStore.RNT_UPD_DT ));
    Assert.assertEquals(mdl.getRntUpdTm(),
        mdl.getValueByKey( MdlTblStore.RNT_UPD_TM ));
    Assert.assertEquals(mdl.getUpdUserId(),
        mdl.getValueByKey( MdlTblStore.UPD_USER_ID ));
    Assert.assertEquals(mdl.getUpdVwId(),
        mdl.getValueByKey( MdlTblStore.UPD_VW_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlTblStoreTest.class.getDeclaredMethods();
    Method[] methods = MdlTblStore.class.getDeclaredMethods();
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
