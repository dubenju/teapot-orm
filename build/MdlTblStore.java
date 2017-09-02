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

import org.teapot.db.orm.IKeyValue;

import java.io.Serializable;

/**
 * 表tbl_store的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:02.037 +0900自动生成的。
 */
public class MdlTblStore implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_STORE. */
  public static final String TBL_STORE = "TBL_STORE";
  /** 字段：STORE_ID. */
  public static final String STORE_ID = "TBL_STORE.STORE_ID";
  /** 字段：APPLI_ST_DT. */
  public static final String APPLI_ST_DT = "TBL_STORE.APPLI_ST_DT";
  /** 字段：APPLI_ED_DT. */
  public static final String APPLI_ED_DT = "TBL_STORE.APPLI_ED_DT";
  /** 字段：REG_USER_ID. */
  public static final String REG_USER_ID = "TBL_STORE.REG_USER_ID";
  /** 字段：BSNS_REG. */
  public static final String BSNS_REG = "TBL_STORE.BSNS_REG";
  /** 字段：STORE_NM. */
  public static final String STORE_NM = "TBL_STORE.STORE_NM";
  /** 字段：STORE_ADDR. */
  public static final String STORE_ADDR = "TBL_STORE.STORE_ADDR";
  /** 字段：STORE_LO. */
  public static final String STORE_LO = "TBL_STORE.STORE_LO";
  /** 字段：STORE_LA. */
  public static final String STORE_LA = "TBL_STORE.STORE_LA";
  /** 字段：STORE_GENRE. */
  public static final String STORE_GENRE = "TBL_STORE.STORE_GENRE";
  /** 字段：CNTCT_PHN. */
  public static final String CNTCT_PHN = "TBL_STORE.CNTCT_PHN";
  /** 字段：RESRV_ENAB. */
  public static final String RESRV_ENAB = "TBL_STORE.RESRV_ENAB";
  /** 字段：TRFC_MNS. */
  public static final String TRFC_MNS = "TBL_STORE.TRFC_MNS";
  /** 字段：BSNS_HOURS. */
  public static final String BSNS_HOURS = "TBL_STORE.BSNS_HOURS";
  /** 字段：BDGT_AMNT. */
  public static final String BDGT_AMNT = "TBL_STORE.BDGT_AMNT";
  /** 字段：STS_CNT. */
  public static final String STS_CNT = "TBL_STORE.STS_CNT";
  /** 字段：SNGL_HON. */
  public static final String SNGL_HON = "TBL_STORE.SNGL_HON";
  /** 字段：WIFI_HON. */
  public static final String WIFI_HON = "TBL_STORE.WIFI_HON";
  /** 字段：STORE_HP. */
  public static final String STORE_HP = "TBL_STORE.STORE_HP";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_STORE.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_STORE.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_STORE.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_STORE.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_STORE.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_STORE.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblStore.STORE_ID,
    MdlTblStore.APPLI_ST_DT,
    MdlTblStore.APPLI_ED_DT,
    MdlTblStore.REG_USER_ID,
    MdlTblStore.BSNS_REG,
    MdlTblStore.STORE_NM,
    MdlTblStore.STORE_ADDR,
    MdlTblStore.STORE_LO,
    MdlTblStore.STORE_LA,
    MdlTblStore.STORE_GENRE,
    MdlTblStore.CNTCT_PHN,
    MdlTblStore.RESRV_ENAB,
    MdlTblStore.TRFC_MNS,
    MdlTblStore.BSNS_HOURS,
    MdlTblStore.BDGT_AMNT,
    MdlTblStore.STS_CNT,
    MdlTblStore.SNGL_HON,
    MdlTblStore.WIFI_HON,
    MdlTblStore.STORE_HP,
    MdlTblStore.FST_CRT_DT,
    MdlTblStore.FST_CRT_TM,
    MdlTblStore.RNT_UPD_DT,
    MdlTblStore.RNT_UPD_TM,
    MdlTblStore.UPD_USER_ID,
    MdlTblStore.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblStore.APPLI_ST_DT,
    MdlTblStore.STORE_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblStore.TBL_STORE;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String storeId;
  private java.lang.String appliStDt;
  private java.lang.String appliEdDt;
  private java.lang.String regUserId;
  private java.lang.String bsnsReg;
  private java.lang.String storeNm;
  private java.lang.String storeAddr;
  private java.math.BigDecimal storeLo;
  private java.math.BigDecimal storeLa;
  private java.lang.String storeGenre;
  private java.lang.String cntctPhn;
  private java.lang.String resrvEnab;
  private java.lang.String trfcMns;
  private java.lang.String bsnsHours;
  private java.math.BigDecimal bdgtAmnt;
  private java.math.BigDecimal stsCnt;
  private java.lang.String snglHon;
  private java.lang.String wifiHon;
  private java.lang.String storeHp;
  private java.lang.String fstCrtDt;
  private java.lang.String fstCrtTm;
  private java.lang.String rntUpdDt;
  private java.lang.String rntUpdTm;
  private java.lang.String updUserId;
  private java.lang.String updVwId;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlTblStore() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性storeId的值.
   * @return storeId的值。
   */
  public java.lang.String getStoreId() {
    return this.storeId;
  }
  /**
   * 设置属性storeId的值.
   * @param value storeId的值。
   */
  public void setStoreId(java.lang.String value) {
    this.storeId = value;
  }
  /**
   * 返回属性appliStDt的值.
   * @return appliStDt的值。
   */
  public java.lang.String getAppliStDt() {
    return this.appliStDt;
  }
  /**
   * 设置属性appliStDt的值.
   * @param value appliStDt的值。
   */
  public void setAppliStDt(java.lang.String value) {
    this.appliStDt = value;
  }
  /**
   * 返回属性appliEdDt的值.
   * @return appliEdDt的值。
   */
  public java.lang.String getAppliEdDt() {
    return this.appliEdDt;
  }
  /**
   * 设置属性appliEdDt的值.
   * @param value appliEdDt的值。
   */
  public void setAppliEdDt(java.lang.String value) {
    this.appliEdDt = value;
  }
  /**
   * 返回属性regUserId的值.
   * @return regUserId的值。
   */
  public java.lang.String getRegUserId() {
    return this.regUserId;
  }
  /**
   * 设置属性regUserId的值.
   * @param value regUserId的值。
   */
  public void setRegUserId(java.lang.String value) {
    this.regUserId = value;
  }
  /**
   * 返回属性bsnsReg的值.
   * @return bsnsReg的值。
   */
  public java.lang.String getBsnsReg() {
    return this.bsnsReg;
  }
  /**
   * 设置属性bsnsReg的值.
   * @param value bsnsReg的值。
   */
  public void setBsnsReg(java.lang.String value) {
    this.bsnsReg = value;
  }
  /**
   * 返回属性storeNm的值.
   * @return storeNm的值。
   */
  public java.lang.String getStoreNm() {
    return this.storeNm;
  }
  /**
   * 设置属性storeNm的值.
   * @param value storeNm的值。
   */
  public void setStoreNm(java.lang.String value) {
    this.storeNm = value;
  }
  /**
   * 返回属性storeAddr的值.
   * @return storeAddr的值。
   */
  public java.lang.String getStoreAddr() {
    return this.storeAddr;
  }
  /**
   * 设置属性storeAddr的值.
   * @param value storeAddr的值。
   */
  public void setStoreAddr(java.lang.String value) {
    this.storeAddr = value;
  }
  /**
   * 返回属性storeLo的值.
   * @return storeLo的值。
   */
  public java.math.BigDecimal getStoreLo() {
    return this.storeLo;
  }
  /**
   * 设置属性storeLo的值.
   * @param value storeLo的值。
   */
  public void setStoreLo(java.math.BigDecimal value) {
    this.storeLo = value;
  }
  /**
   * 返回属性storeLa的值.
   * @return storeLa的值。
   */
  public java.math.BigDecimal getStoreLa() {
    return this.storeLa;
  }
  /**
   * 设置属性storeLa的值.
   * @param value storeLa的值。
   */
  public void setStoreLa(java.math.BigDecimal value) {
    this.storeLa = value;
  }
  /**
   * 返回属性storeGenre的值.
   * @return storeGenre的值。
   */
  public java.lang.String getStoreGenre() {
    return this.storeGenre;
  }
  /**
   * 设置属性storeGenre的值.
   * @param value storeGenre的值。
   */
  public void setStoreGenre(java.lang.String value) {
    this.storeGenre = value;
  }
  /**
   * 返回属性cntctPhn的值.
   * @return cntctPhn的值。
   */
  public java.lang.String getCntctPhn() {
    return this.cntctPhn;
  }
  /**
   * 设置属性cntctPhn的值.
   * @param value cntctPhn的值。
   */
  public void setCntctPhn(java.lang.String value) {
    this.cntctPhn = value;
  }
  /**
   * 返回属性resrvEnab的值.
   * @return resrvEnab的值。
   */
  public java.lang.String getResrvEnab() {
    return this.resrvEnab;
  }
  /**
   * 设置属性resrvEnab的值.
   * @param value resrvEnab的值。
   */
  public void setResrvEnab(java.lang.String value) {
    this.resrvEnab = value;
  }
  /**
   * 返回属性trfcMns的值.
   * @return trfcMns的值。
   */
  public java.lang.String getTrfcMns() {
    return this.trfcMns;
  }
  /**
   * 设置属性trfcMns的值.
   * @param value trfcMns的值。
   */
  public void setTrfcMns(java.lang.String value) {
    this.trfcMns = value;
  }
  /**
   * 返回属性bsnsHours的值.
   * @return bsnsHours的值。
   */
  public java.lang.String getBsnsHours() {
    return this.bsnsHours;
  }
  /**
   * 设置属性bsnsHours的值.
   * @param value bsnsHours的值。
   */
  public void setBsnsHours(java.lang.String value) {
    this.bsnsHours = value;
  }
  /**
   * 返回属性bdgtAmnt的值.
   * @return bdgtAmnt的值。
   */
  public java.math.BigDecimal getBdgtAmnt() {
    return this.bdgtAmnt;
  }
  /**
   * 设置属性bdgtAmnt的值.
   * @param value bdgtAmnt的值。
   */
  public void setBdgtAmnt(java.math.BigDecimal value) {
    this.bdgtAmnt = value;
  }
  /**
   * 返回属性stsCnt的值.
   * @return stsCnt的值。
   */
  public java.math.BigDecimal getStsCnt() {
    return this.stsCnt;
  }
  /**
   * 设置属性stsCnt的值.
   * @param value stsCnt的值。
   */
  public void setStsCnt(java.math.BigDecimal value) {
    this.stsCnt = value;
  }
  /**
   * 返回属性snglHon的值.
   * @return snglHon的值。
   */
  public java.lang.String getSnglHon() {
    return this.snglHon;
  }
  /**
   * 设置属性snglHon的值.
   * @param value snglHon的值。
   */
  public void setSnglHon(java.lang.String value) {
    this.snglHon = value;
  }
  /**
   * 返回属性wifiHon的值.
   * @return wifiHon的值。
   */
  public java.lang.String getWifiHon() {
    return this.wifiHon;
  }
  /**
   * 设置属性wifiHon的值.
   * @param value wifiHon的值。
   */
  public void setWifiHon(java.lang.String value) {
    this.wifiHon = value;
  }
  /**
   * 返回属性storeHp的值.
   * @return storeHp的值。
   */
  public java.lang.String getStoreHp() {
    return this.storeHp;
  }
  /**
   * 设置属性storeHp的值.
   * @param value storeHp的值。
   */
  public void setStoreHp(java.lang.String value) {
    this.storeHp = value;
  }
  /**
   * 返回属性fstCrtDt的值.
   * @return fstCrtDt的值。
   */
  public java.lang.String getFstCrtDt() {
    return this.fstCrtDt;
  }
  /**
   * 设置属性fstCrtDt的值.
   * @param value fstCrtDt的值。
   */
  public void setFstCrtDt(java.lang.String value) {
    this.fstCrtDt = value;
  }
  /**
   * 返回属性fstCrtTm的值.
   * @return fstCrtTm的值。
   */
  public java.lang.String getFstCrtTm() {
    return this.fstCrtTm;
  }
  /**
   * 设置属性fstCrtTm的值.
   * @param value fstCrtTm的值。
   */
  public void setFstCrtTm(java.lang.String value) {
    this.fstCrtTm = value;
  }
  /**
   * 返回属性rntUpdDt的值.
   * @return rntUpdDt的值。
   */
  public java.lang.String getRntUpdDt() {
    return this.rntUpdDt;
  }
  /**
   * 设置属性rntUpdDt的值.
   * @param value rntUpdDt的值。
   */
  public void setRntUpdDt(java.lang.String value) {
    this.rntUpdDt = value;
  }
  /**
   * 返回属性rntUpdTm的值.
   * @return rntUpdTm的值。
   */
  public java.lang.String getRntUpdTm() {
    return this.rntUpdTm;
  }
  /**
   * 设置属性rntUpdTm的值.
   * @param value rntUpdTm的值。
   */
  public void setRntUpdTm(java.lang.String value) {
    this.rntUpdTm = value;
  }
  /**
   * 返回属性updUserId的值.
   * @return updUserId的值。
   */
  public java.lang.String getUpdUserId() {
    return this.updUserId;
  }
  /**
   * 设置属性updUserId的值.
   * @param value updUserId的值。
   */
  public void setUpdUserId(java.lang.String value) {
    this.updUserId = value;
  }
  /**
   * 返回属性updVwId的值.
   * @return updVwId的值。
   */
  public java.lang.String getUpdVwId() {
    return this.updVwId;
  }
  /**
   * 设置属性updVwId的值.
   * @param value updVwId的值。
   */
  public void setUpdVwId(java.lang.String value) {
    this.updVwId = value;
  }

  /**
   * 返回MdlTblStore的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getStoreId());
    buf.append(",");
    buf.append(this.getAppliStDt());
    buf.append(",");
    buf.append(this.getAppliEdDt());
    buf.append(",");
    buf.append(this.getRegUserId());
    buf.append(",");
    buf.append(this.getBsnsReg());
    buf.append(",");
    buf.append(this.getStoreNm());
    buf.append(",");
    buf.append(this.getStoreAddr());
    buf.append(",");
    buf.append(this.getStoreLo());
    buf.append(",");
    buf.append(this.getStoreLa());
    buf.append(",");
    buf.append(this.getStoreGenre());
    buf.append(",");
    buf.append(this.getCntctPhn());
    buf.append(",");
    buf.append(this.getResrvEnab());
    buf.append(",");
    buf.append(this.getTrfcMns());
    buf.append(",");
    buf.append(this.getBsnsHours());
    buf.append(",");
    buf.append(this.getBdgtAmnt());
    buf.append(",");
    buf.append(this.getStsCnt());
    buf.append(",");
    buf.append(this.getSnglHon());
    buf.append(",");
    buf.append(this.getWifiHon());
    buf.append(",");
    buf.append(this.getStoreHp());
    buf.append(",");
    buf.append(this.getFstCrtDt());
    buf.append(",");
    buf.append(this.getFstCrtTm());
    buf.append(",");
    buf.append(this.getRntUpdDt());
    buf.append(",");
    buf.append(this.getRntUpdTm());
    buf.append(",");
    buf.append(this.getUpdUserId());
    buf.append(",");
    buf.append(this.getUpdVwId());

    return buf.toString();
  }

  /**
   * 通过键名获取值.
   * 当指定的键名不存在的时候，返回null。
   * @return Object 对应键名值。
   */
  @Override
  public Object getValueByKey(String key) {
    Object ret = null;
    if (MdlTblStore.STORE_ID.equals(key)) {
      ret = this.getStoreId();
    }
    if (MdlTblStore.APPLI_ST_DT.equals(key)) {
      ret = this.getAppliStDt();
    }
    if (MdlTblStore.APPLI_ED_DT.equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (MdlTblStore.REG_USER_ID.equals(key)) {
      ret = this.getRegUserId();
    }
    if (MdlTblStore.BSNS_REG.equals(key)) {
      ret = this.getBsnsReg();
    }
    if (MdlTblStore.STORE_NM.equals(key)) {
      ret = this.getStoreNm();
    }
    if (MdlTblStore.STORE_ADDR.equals(key)) {
      ret = this.getStoreAddr();
    }
    if (MdlTblStore.STORE_LO.equals(key)) {
      ret = this.getStoreLo();
    }
    if (MdlTblStore.STORE_LA.equals(key)) {
      ret = this.getStoreLa();
    }
    if (MdlTblStore.STORE_GENRE.equals(key)) {
      ret = this.getStoreGenre();
    }
    if (MdlTblStore.CNTCT_PHN.equals(key)) {
      ret = this.getCntctPhn();
    }
    if (MdlTblStore.RESRV_ENAB.equals(key)) {
      ret = this.getResrvEnab();
    }
    if (MdlTblStore.TRFC_MNS.equals(key)) {
      ret = this.getTrfcMns();
    }
    if (MdlTblStore.BSNS_HOURS.equals(key)) {
      ret = this.getBsnsHours();
    }
    if (MdlTblStore.BDGT_AMNT.equals(key)) {
      ret = this.getBdgtAmnt();
    }
    if (MdlTblStore.STS_CNT.equals(key)) {
      ret = this.getStsCnt();
    }
    if (MdlTblStore.SNGL_HON.equals(key)) {
      ret = this.getSnglHon();
    }
    if (MdlTblStore.WIFI_HON.equals(key)) {
      ret = this.getWifiHon();
    }
    if (MdlTblStore.STORE_HP.equals(key)) {
      ret = this.getStoreHp();
    }
    if (MdlTblStore.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblStore.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblStore.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblStore.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblStore.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblStore.UPD_VW_ID.equals(key)) {
      ret = this.getUpdVwId();
    }
    return ret;
  }

  /**
   * 通过键名设置值.
   * 当指定的键名不存在的时候，不作任何改动。
   * @param key 键名。
   * @param value 对应键名值。
   */
  @Override
  public void setValueByKey(String key, Object value) {
    if (MdlTblStore.STORE_ID.equals(key)) {
      this.setStoreId((java.lang.String) value);
    }
    if (MdlTblStore.APPLI_ST_DT.equals(key)) {
      this.setAppliStDt((java.lang.String) value);
    }
    if (MdlTblStore.APPLI_ED_DT.equals(key)) {
      this.setAppliEdDt((java.lang.String) value);
    }
    if (MdlTblStore.REG_USER_ID.equals(key)) {
      this.setRegUserId((java.lang.String) value);
    }
    if (MdlTblStore.BSNS_REG.equals(key)) {
      this.setBsnsReg((java.lang.String) value);
    }
    if (MdlTblStore.STORE_NM.equals(key)) {
      this.setStoreNm((java.lang.String) value);
    }
    if (MdlTblStore.STORE_ADDR.equals(key)) {
      this.setStoreAddr((java.lang.String) value);
    }
    if (MdlTblStore.STORE_LO.equals(key)) {
      this.setStoreLo((java.math.BigDecimal) value);
    }
    if (MdlTblStore.STORE_LA.equals(key)) {
      this.setStoreLa((java.math.BigDecimal) value);
    }
    if (MdlTblStore.STORE_GENRE.equals(key)) {
      this.setStoreGenre((java.lang.String) value);
    }
    if (MdlTblStore.CNTCT_PHN.equals(key)) {
      this.setCntctPhn((java.lang.String) value);
    }
    if (MdlTblStore.RESRV_ENAB.equals(key)) {
      this.setResrvEnab((java.lang.String) value);
    }
    if (MdlTblStore.TRFC_MNS.equals(key)) {
      this.setTrfcMns((java.lang.String) value);
    }
    if (MdlTblStore.BSNS_HOURS.equals(key)) {
      this.setBsnsHours((java.lang.String) value);
    }
    if (MdlTblStore.BDGT_AMNT.equals(key)) {
      this.setBdgtAmnt((java.math.BigDecimal) value);
    }
    if (MdlTblStore.STS_CNT.equals(key)) {
      this.setStsCnt((java.math.BigDecimal) value);
    }
    if (MdlTblStore.SNGL_HON.equals(key)) {
      this.setSnglHon((java.lang.String) value);
    }
    if (MdlTblStore.WIFI_HON.equals(key)) {
      this.setWifiHon((java.lang.String) value);
    }
    if (MdlTblStore.STORE_HP.equals(key)) {
      this.setStoreHp((java.lang.String) value);
    }
    if (MdlTblStore.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblStore.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblStore.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblStore.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblStore.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblStore.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
