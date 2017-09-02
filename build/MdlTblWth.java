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
 * 表tbl_wth的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:03.411 +0900自动生成的。
 */
public class MdlTblWth implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_WTH. */
  public static final String TBL_WTH = "TBL_WTH";
  /** 字段：WTH_CD. */
  public static final String WTH_CD = "TBL_WTH.WTH_CD";
  /** 字段：OBTN_DT. */
  public static final String OBTN_DT = "TBL_WTH.OBTN_DT";
  /** 字段：WTH_DT. */
  public static final String WTH_DT = "TBL_WTH.WTH_DT";
  /** 字段：AREA_NM. */
  public static final String AREA_NM = "TBL_WTH.AREA_NM";
  /** 字段：WTH_INFO. */
  public static final String WTH_INFO = "TBL_WTH.WTH_INFO";
  /** 字段：TMPR_INFO. */
  public static final String TMPR_INFO = "TBL_WTH.TMPR_INFO";
  /** 字段：WNDIR_INFO. */
  public static final String WNDIR_INFO = "TBL_WTH.WNDIR_INFO";
  /** 字段：WNLVL_INFO. */
  public static final String WNLVL_INFO = "TBL_WTH.WNLVL_INFO";
  /** 字段：OTH_INFO. */
  public static final String OTH_INFO = "TBL_WTH.OTH_INFO";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_WTH.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_WTH.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_WTH.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_WTH.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_WTH.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_WTH.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblWth.WTH_CD,
    MdlTblWth.OBTN_DT,
    MdlTblWth.WTH_DT,
    MdlTblWth.AREA_NM,
    MdlTblWth.WTH_INFO,
    MdlTblWth.TMPR_INFO,
    MdlTblWth.WNDIR_INFO,
    MdlTblWth.WNLVL_INFO,
    MdlTblWth.OTH_INFO,
    MdlTblWth.FST_CRT_DT,
    MdlTblWth.FST_CRT_TM,
    MdlTblWth.RNT_UPD_DT,
    MdlTblWth.RNT_UPD_TM,
    MdlTblWth.UPD_USER_ID,
    MdlTblWth.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblWth.OBTN_DT,
    MdlTblWth.WTH_CD,
    MdlTblWth.WTH_DT
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblWth.TBL_WTH;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String wthCd;
  private java.lang.String obtnDt;
  private java.lang.String wthDt;
  private java.lang.String areaNm;
  private java.lang.String wthInfo;
  private java.lang.String tmprInfo;
  private java.lang.String wndirInfo;
  private java.lang.String wnlvlInfo;
  private java.lang.String othInfo;
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
  public MdlTblWth() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
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
   * 返回属性obtnDt的值.
   * @return obtnDt的值。
   */
  public java.lang.String getObtnDt() {
    return this.obtnDt;
  }
  /**
   * 设置属性obtnDt的值.
   * @param value obtnDt的值。
   */
  public void setObtnDt(java.lang.String value) {
    this.obtnDt = value;
  }
  /**
   * 返回属性wthDt的值.
   * @return wthDt的值。
   */
  public java.lang.String getWthDt() {
    return this.wthDt;
  }
  /**
   * 设置属性wthDt的值.
   * @param value wthDt的值。
   */
  public void setWthDt(java.lang.String value) {
    this.wthDt = value;
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
   * 返回属性wthInfo的值.
   * @return wthInfo的值。
   */
  public java.lang.String getWthInfo() {
    return this.wthInfo;
  }
  /**
   * 设置属性wthInfo的值.
   * @param value wthInfo的值。
   */
  public void setWthInfo(java.lang.String value) {
    this.wthInfo = value;
  }
  /**
   * 返回属性tmprInfo的值.
   * @return tmprInfo的值。
   */
  public java.lang.String getTmprInfo() {
    return this.tmprInfo;
  }
  /**
   * 设置属性tmprInfo的值.
   * @param value tmprInfo的值。
   */
  public void setTmprInfo(java.lang.String value) {
    this.tmprInfo = value;
  }
  /**
   * 返回属性wndirInfo的值.
   * @return wndirInfo的值。
   */
  public java.lang.String getWndirInfo() {
    return this.wndirInfo;
  }
  /**
   * 设置属性wndirInfo的值.
   * @param value wndirInfo的值。
   */
  public void setWndirInfo(java.lang.String value) {
    this.wndirInfo = value;
  }
  /**
   * 返回属性wnlvlInfo的值.
   * @return wnlvlInfo的值。
   */
  public java.lang.String getWnlvlInfo() {
    return this.wnlvlInfo;
  }
  /**
   * 设置属性wnlvlInfo的值.
   * @param value wnlvlInfo的值。
   */
  public void setWnlvlInfo(java.lang.String value) {
    this.wnlvlInfo = value;
  }
  /**
   * 返回属性othInfo的值.
   * @return othInfo的值。
   */
  public java.lang.String getOthInfo() {
    return this.othInfo;
  }
  /**
   * 设置属性othInfo的值.
   * @param value othInfo的值。
   */
  public void setOthInfo(java.lang.String value) {
    this.othInfo = value;
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
   * 返回MdlTblWth的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getWthCd());
    buf.append(",");
    buf.append(this.getObtnDt());
    buf.append(",");
    buf.append(this.getWthDt());
    buf.append(",");
    buf.append(this.getAreaNm());
    buf.append(",");
    buf.append(this.getWthInfo());
    buf.append(",");
    buf.append(this.getTmprInfo());
    buf.append(",");
    buf.append(this.getWndirInfo());
    buf.append(",");
    buf.append(this.getWnlvlInfo());
    buf.append(",");
    buf.append(this.getOthInfo());
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
    if (MdlTblWth.WTH_CD.equals(key)) {
      ret = this.getWthCd();
    }
    if (MdlTblWth.OBTN_DT.equals(key)) {
      ret = this.getObtnDt();
    }
    if (MdlTblWth.WTH_DT.equals(key)) {
      ret = this.getWthDt();
    }
    if (MdlTblWth.AREA_NM.equals(key)) {
      ret = this.getAreaNm();
    }
    if (MdlTblWth.WTH_INFO.equals(key)) {
      ret = this.getWthInfo();
    }
    if (MdlTblWth.TMPR_INFO.equals(key)) {
      ret = this.getTmprInfo();
    }
    if (MdlTblWth.WNDIR_INFO.equals(key)) {
      ret = this.getWndirInfo();
    }
    if (MdlTblWth.WNLVL_INFO.equals(key)) {
      ret = this.getWnlvlInfo();
    }
    if (MdlTblWth.OTH_INFO.equals(key)) {
      ret = this.getOthInfo();
    }
    if (MdlTblWth.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblWth.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblWth.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblWth.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblWth.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblWth.UPD_VW_ID.equals(key)) {
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
    if (MdlTblWth.WTH_CD.equals(key)) {
      this.setWthCd((java.lang.String) value);
    }
    if (MdlTblWth.OBTN_DT.equals(key)) {
      this.setObtnDt((java.lang.String) value);
    }
    if (MdlTblWth.WTH_DT.equals(key)) {
      this.setWthDt((java.lang.String) value);
    }
    if (MdlTblWth.AREA_NM.equals(key)) {
      this.setAreaNm((java.lang.String) value);
    }
    if (MdlTblWth.WTH_INFO.equals(key)) {
      this.setWthInfo((java.lang.String) value);
    }
    if (MdlTblWth.TMPR_INFO.equals(key)) {
      this.setTmprInfo((java.lang.String) value);
    }
    if (MdlTblWth.WNDIR_INFO.equals(key)) {
      this.setWndirInfo((java.lang.String) value);
    }
    if (MdlTblWth.WNLVL_INFO.equals(key)) {
      this.setWnlvlInfo((java.lang.String) value);
    }
    if (MdlTblWth.OTH_INFO.equals(key)) {
      this.setOthInfo((java.lang.String) value);
    }
    if (MdlTblWth.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblWth.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblWth.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblWth.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblWth.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblWth.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
