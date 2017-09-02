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
 * 表tbl_evnt的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:00.148 +0900自动生成的。
 */
public class MdlTblEvnt implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_EVNT. */
  public static final String TBL_EVNT = "TBL_EVNT";
  /** 字段：USER_ID. */
  public static final String USER_ID = "TBL_EVNT.USER_ID";
  /** 字段：EVNT_ID. */
  public static final String EVNT_ID = "TBL_EVNT.EVNT_ID";
  /** 字段：BGN_DT. */
  public static final String BGN_DT = "TBL_EVNT.BGN_DT";
  /** 字段：BGN_TM. */
  public static final String BGN_TM = "TBL_EVNT.BGN_TM";
  /** 字段：CLS_DT. */
  public static final String CLS_DT = "TBL_EVNT.CLS_DT";
  /** 字段：CLS_TM. */
  public static final String CLS_TM = "TBL_EVNT.CLS_TM";
  /** 字段：ADM_DIV_CD. */
  public static final String ADM_DIV_CD = "TBL_EVNT.ADM_DIV_CD";
  /** 字段：EVNT_TTL. */
  public static final String EVNT_TTL = "TBL_EVNT.EVNT_TTL";
  /** 字段：EVNT_SMY. */
  public static final String EVNT_SMY = "TBL_EVNT.EVNT_SMY";
  /** 字段：EVNT_DTL. */
  public static final String EVNT_DTL = "TBL_EVNT.EVNT_DTL";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_EVNT.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_EVNT.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_EVNT.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_EVNT.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_EVNT.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_EVNT.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblEvnt.USER_ID,
    MdlTblEvnt.EVNT_ID,
    MdlTblEvnt.BGN_DT,
    MdlTblEvnt.BGN_TM,
    MdlTblEvnt.CLS_DT,
    MdlTblEvnt.CLS_TM,
    MdlTblEvnt.ADM_DIV_CD,
    MdlTblEvnt.EVNT_TTL,
    MdlTblEvnt.EVNT_SMY,
    MdlTblEvnt.EVNT_DTL,
    MdlTblEvnt.FST_CRT_DT,
    MdlTblEvnt.FST_CRT_TM,
    MdlTblEvnt.RNT_UPD_DT,
    MdlTblEvnt.RNT_UPD_TM,
    MdlTblEvnt.UPD_USER_ID,
    MdlTblEvnt.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblEvnt.EVNT_ID,
    MdlTblEvnt.USER_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblEvnt.TBL_EVNT;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String userId;
  private java.lang.String evntId;
  private java.lang.String bgnDt;
  private java.lang.String bgnTm;
  private java.lang.String clsDt;
  private java.lang.String clsTm;
  private java.lang.String admDivCd;
  private java.lang.String evntTtl;
  private java.lang.String evntSmy;
  private java.lang.String evntDtl;
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
  public MdlTblEvnt() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性userId的值.
   * @return userId的值。
   */
  public java.lang.String getUserId() {
    return this.userId;
  }
  /**
   * 设置属性userId的值.
   * @param value userId的值。
   */
  public void setUserId(java.lang.String value) {
    this.userId = value;
  }
  /**
   * 返回属性evntId的值.
   * @return evntId的值。
   */
  public java.lang.String getEvntId() {
    return this.evntId;
  }
  /**
   * 设置属性evntId的值.
   * @param value evntId的值。
   */
  public void setEvntId(java.lang.String value) {
    this.evntId = value;
  }
  /**
   * 返回属性bgnDt的值.
   * @return bgnDt的值。
   */
  public java.lang.String getBgnDt() {
    return this.bgnDt;
  }
  /**
   * 设置属性bgnDt的值.
   * @param value bgnDt的值。
   */
  public void setBgnDt(java.lang.String value) {
    this.bgnDt = value;
  }
  /**
   * 返回属性bgnTm的值.
   * @return bgnTm的值。
   */
  public java.lang.String getBgnTm() {
    return this.bgnTm;
  }
  /**
   * 设置属性bgnTm的值.
   * @param value bgnTm的值。
   */
  public void setBgnTm(java.lang.String value) {
    this.bgnTm = value;
  }
  /**
   * 返回属性clsDt的值.
   * @return clsDt的值。
   */
  public java.lang.String getClsDt() {
    return this.clsDt;
  }
  /**
   * 设置属性clsDt的值.
   * @param value clsDt的值。
   */
  public void setClsDt(java.lang.String value) {
    this.clsDt = value;
  }
  /**
   * 返回属性clsTm的值.
   * @return clsTm的值。
   */
  public java.lang.String getClsTm() {
    return this.clsTm;
  }
  /**
   * 设置属性clsTm的值.
   * @param value clsTm的值。
   */
  public void setClsTm(java.lang.String value) {
    this.clsTm = value;
  }
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
   * 返回属性evntTtl的值.
   * @return evntTtl的值。
   */
  public java.lang.String getEvntTtl() {
    return this.evntTtl;
  }
  /**
   * 设置属性evntTtl的值.
   * @param value evntTtl的值。
   */
  public void setEvntTtl(java.lang.String value) {
    this.evntTtl = value;
  }
  /**
   * 返回属性evntSmy的值.
   * @return evntSmy的值。
   */
  public java.lang.String getEvntSmy() {
    return this.evntSmy;
  }
  /**
   * 设置属性evntSmy的值.
   * @param value evntSmy的值。
   */
  public void setEvntSmy(java.lang.String value) {
    this.evntSmy = value;
  }
  /**
   * 返回属性evntDtl的值.
   * @return evntDtl的值。
   */
  public java.lang.String getEvntDtl() {
    return this.evntDtl;
  }
  /**
   * 设置属性evntDtl的值.
   * @param value evntDtl的值。
   */
  public void setEvntDtl(java.lang.String value) {
    this.evntDtl = value;
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
   * 返回MdlTblEvnt的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getUserId());
    buf.append(",");
    buf.append(this.getEvntId());
    buf.append(",");
    buf.append(this.getBgnDt());
    buf.append(",");
    buf.append(this.getBgnTm());
    buf.append(",");
    buf.append(this.getClsDt());
    buf.append(",");
    buf.append(this.getClsTm());
    buf.append(",");
    buf.append(this.getAdmDivCd());
    buf.append(",");
    buf.append(this.getEvntTtl());
    buf.append(",");
    buf.append(this.getEvntSmy());
    buf.append(",");
    buf.append(this.getEvntDtl());
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
    if (MdlTblEvnt.USER_ID.equals(key)) {
      ret = this.getUserId();
    }
    if (MdlTblEvnt.EVNT_ID.equals(key)) {
      ret = this.getEvntId();
    }
    if (MdlTblEvnt.BGN_DT.equals(key)) {
      ret = this.getBgnDt();
    }
    if (MdlTblEvnt.BGN_TM.equals(key)) {
      ret = this.getBgnTm();
    }
    if (MdlTblEvnt.CLS_DT.equals(key)) {
      ret = this.getClsDt();
    }
    if (MdlTblEvnt.CLS_TM.equals(key)) {
      ret = this.getClsTm();
    }
    if (MdlTblEvnt.ADM_DIV_CD.equals(key)) {
      ret = this.getAdmDivCd();
    }
    if (MdlTblEvnt.EVNT_TTL.equals(key)) {
      ret = this.getEvntTtl();
    }
    if (MdlTblEvnt.EVNT_SMY.equals(key)) {
      ret = this.getEvntSmy();
    }
    if (MdlTblEvnt.EVNT_DTL.equals(key)) {
      ret = this.getEvntDtl();
    }
    if (MdlTblEvnt.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblEvnt.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblEvnt.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblEvnt.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblEvnt.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblEvnt.UPD_VW_ID.equals(key)) {
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
    if (MdlTblEvnt.USER_ID.equals(key)) {
      this.setUserId((java.lang.String) value);
    }
    if (MdlTblEvnt.EVNT_ID.equals(key)) {
      this.setEvntId((java.lang.String) value);
    }
    if (MdlTblEvnt.BGN_DT.equals(key)) {
      this.setBgnDt((java.lang.String) value);
    }
    if (MdlTblEvnt.BGN_TM.equals(key)) {
      this.setBgnTm((java.lang.String) value);
    }
    if (MdlTblEvnt.CLS_DT.equals(key)) {
      this.setClsDt((java.lang.String) value);
    }
    if (MdlTblEvnt.CLS_TM.equals(key)) {
      this.setClsTm((java.lang.String) value);
    }
    if (MdlTblEvnt.ADM_DIV_CD.equals(key)) {
      this.setAdmDivCd((java.lang.String) value);
    }
    if (MdlTblEvnt.EVNT_TTL.equals(key)) {
      this.setEvntTtl((java.lang.String) value);
    }
    if (MdlTblEvnt.EVNT_SMY.equals(key)) {
      this.setEvntSmy((java.lang.String) value);
    }
    if (MdlTblEvnt.EVNT_DTL.equals(key)) {
      this.setEvntDtl((java.lang.String) value);
    }
    if (MdlTblEvnt.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblEvnt.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblEvnt.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblEvnt.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblEvnt.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblEvnt.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
