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
 * 表tbl_trfm的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:02.771 +0900自动生成的。
 */
public class MdlTblTrfm implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_TRFM. */
  public static final String TBL_TRFM = "TBL_TRFM";
  /** 字段：ADM_DIV_CD. */
  public static final String ADM_DIV_CD = "TBL_TRFM.ADM_DIV_CD";
  /** 字段：WTH_CD. */
  public static final String WTH_CD = "TBL_TRFM.WTH_CD";
  /** 字段：PST_CD. */
  public static final String PST_CD = "TBL_TRFM.PST_CD";
  /** 字段：LDC_ACD. */
  public static final String LDC_ACD = "TBL_TRFM.LDC_ACD";
  /** 字段：AREA_NM. */
  public static final String AREA_NM = "TBL_TRFM.AREA_NM";
  /** 字段：AREA_FNAME. */
  public static final String AREA_FNAME = "TBL_TRFM.AREA_FNAME";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_TRFM.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_TRFM.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_TRFM.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_TRFM.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_TRFM.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_TRFM.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblTrfm.ADM_DIV_CD,
    MdlTblTrfm.WTH_CD,
    MdlTblTrfm.PST_CD,
    MdlTblTrfm.LDC_ACD,
    MdlTblTrfm.AREA_NM,
    MdlTblTrfm.AREA_FNAME,
    MdlTblTrfm.FST_CRT_DT,
    MdlTblTrfm.FST_CRT_TM,
    MdlTblTrfm.RNT_UPD_DT,
    MdlTblTrfm.RNT_UPD_TM,
    MdlTblTrfm.UPD_USER_ID,
    MdlTblTrfm.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblTrfm.ADM_DIV_CD,
    MdlTblTrfm.LDC_ACD,
    MdlTblTrfm.PST_CD,
    MdlTblTrfm.WTH_CD
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblTrfm.TBL_TRFM;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String admDivCd;
  private java.lang.String wthCd;
  private java.lang.String pstCd;
  private java.lang.String ldcAcd;
  private java.lang.String areaNm;
  private java.lang.String areaFname;
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
  public MdlTblTrfm() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性admDivCd的值.
   * @return admDivCd的值。
   */
  public java.lang.String getAdmDivCd() {
    return this.admDivCd;
  }
  /**
   * 设置属性admDivCd的值.
   * @param value admDivCd的值。
   */
  public void setAdmDivCd(java.lang.String value) {
    this.admDivCd = value;
  }
  /**
   * 返回属性wthCd的值.
   * @return wthCd的值。
   */
  public java.lang.String getWthCd() {
    return this.wthCd;
  }
  /**
   * 设置属性wthCd的值.
   * @param value wthCd的值。
   */
  public void setWthCd(java.lang.String value) {
    this.wthCd = value;
  }
  /**
   * 返回属性pstCd的值.
   * @return pstCd的值。
   */
  public java.lang.String getPstCd() {
    return this.pstCd;
  }
  /**
   * 设置属性pstCd的值.
   * @param value pstCd的值。
   */
  public void setPstCd(java.lang.String value) {
    this.pstCd = value;
  }
  /**
   * 返回属性ldcAcd的值.
   * @return ldcAcd的值。
   */
  public java.lang.String getLdcAcd() {
    return this.ldcAcd;
  }
  /**
   * 设置属性ldcAcd的值.
   * @param value ldcAcd的值。
   */
  public void setLdcAcd(java.lang.String value) {
    this.ldcAcd = value;
  }
  /**
   * 返回属性areaNm的值.
   * @return areaNm的值。
   */
  public java.lang.String getAreaNm() {
    return this.areaNm;
  }
  /**
   * 设置属性areaNm的值.
   * @param value areaNm的值。
   */
  public void setAreaNm(java.lang.String value) {
    this.areaNm = value;
  }
  /**
   * 返回属性areaFname的值.
   * @return areaFname的值。
   */
  public java.lang.String getAreaFname() {
    return this.areaFname;
  }
  /**
   * 设置属性areaFname的值.
   * @param value areaFname的值。
   */
  public void setAreaFname(java.lang.String value) {
    this.areaFname = value;
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
   * 返回MdlTblTrfm的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getAdmDivCd());
    buf.append(",");
    buf.append(this.getWthCd());
    buf.append(",");
    buf.append(this.getPstCd());
    buf.append(",");
    buf.append(this.getLdcAcd());
    buf.append(",");
    buf.append(this.getAreaNm());
    buf.append(",");
    buf.append(this.getAreaFname());
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
    if (MdlTblTrfm.ADM_DIV_CD.equals(key)) {
      ret = this.getAdmDivCd();
    }
    if (MdlTblTrfm.WTH_CD.equals(key)) {
      ret = this.getWthCd();
    }
    if (MdlTblTrfm.PST_CD.equals(key)) {
      ret = this.getPstCd();
    }
    if (MdlTblTrfm.LDC_ACD.equals(key)) {
      ret = this.getLdcAcd();
    }
    if (MdlTblTrfm.AREA_NM.equals(key)) {
      ret = this.getAreaNm();
    }
    if (MdlTblTrfm.AREA_FNAME.equals(key)) {
      ret = this.getAreaFname();
    }
    if (MdlTblTrfm.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblTrfm.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblTrfm.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblTrfm.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblTrfm.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblTrfm.UPD_VW_ID.equals(key)) {
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
    if (MdlTblTrfm.ADM_DIV_CD.equals(key)) {
      this.setAdmDivCd((java.lang.String) value);
    }
    if (MdlTblTrfm.WTH_CD.equals(key)) {
      this.setWthCd((java.lang.String) value);
    }
    if (MdlTblTrfm.PST_CD.equals(key)) {
      this.setPstCd((java.lang.String) value);
    }
    if (MdlTblTrfm.LDC_ACD.equals(key)) {
      this.setLdcAcd((java.lang.String) value);
    }
    if (MdlTblTrfm.AREA_NM.equals(key)) {
      this.setAreaNm((java.lang.String) value);
    }
    if (MdlTblTrfm.AREA_FNAME.equals(key)) {
      this.setAreaFname((java.lang.String) value);
    }
    if (MdlTblTrfm.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblTrfm.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblTrfm.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblTrfm.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblTrfm.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblTrfm.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
