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
 * 表tbl_cmmdt的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:59.773 +0900自动生成的。
 */
public class MdlTblCmmdt implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_CMMDT. */
  public static final String TBL_CMMDT = "TBL_CMMDT";
  /** 字段：STORE_ID. */
  public static final String STORE_ID = "TBL_CMMDT.STORE_ID";
  /** 字段：CMMDT_ID. */
  public static final String CMMDT_ID = "TBL_CMMDT.CMMDT_ID";
  /** 字段：APPLI_ST_DT. */
  public static final String APPLI_ST_DT = "TBL_CMMDT.APPLI_ST_DT";
  /** 字段：APPLI_ED_DT. */
  public static final String APPLI_ED_DT = "TBL_CMMDT.APPLI_ED_DT";
  /** 字段：CMMDT_NM. */
  public static final String CMMDT_NM = "TBL_CMMDT.CMMDT_NM";
  /** 字段：CMMDT_UPRIC. */
  public static final String CMMDT_UPRIC = "TBL_CMMDT.CMMDT_UPRIC";
  /** 字段：CMMDT_UNT. */
  public static final String CMMDT_UNT = "TBL_CMMDT.CMMDT_UNT";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_CMMDT.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_CMMDT.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_CMMDT.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_CMMDT.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_CMMDT.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_CMMDT.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblCmmdt.STORE_ID,
    MdlTblCmmdt.CMMDT_ID,
    MdlTblCmmdt.APPLI_ST_DT,
    MdlTblCmmdt.APPLI_ED_DT,
    MdlTblCmmdt.CMMDT_NM,
    MdlTblCmmdt.CMMDT_UPRIC,
    MdlTblCmmdt.CMMDT_UNT,
    MdlTblCmmdt.FST_CRT_DT,
    MdlTblCmmdt.FST_CRT_TM,
    MdlTblCmmdt.RNT_UPD_DT,
    MdlTblCmmdt.RNT_UPD_TM,
    MdlTblCmmdt.UPD_USER_ID,
    MdlTblCmmdt.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblCmmdt.APPLI_ST_DT,
    MdlTblCmmdt.CMMDT_ID,
    MdlTblCmmdt.STORE_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblCmmdt.TBL_CMMDT;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String storeId;
  private java.lang.String cmmdtId;
  private java.lang.String appliStDt;
  private java.lang.String appliEdDt;
  private java.lang.String cmmdtNm;
  private java.math.BigDecimal cmmdtUpric;
  private java.lang.String cmmdtUnt;
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
  public MdlTblCmmdt() {
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
   * 返回属性cmmdtId的值.
   * @return cmmdtId的值。
   */
  public java.lang.String getCmmdtId() {
    return this.cmmdtId;
  }
  /**
   * 设置属性cmmdtId的值.
   * @param value cmmdtId的值。
   */
  public void setCmmdtId(java.lang.String value) {
    this.cmmdtId = value;
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
   * 返回属性cmmdtNm的值.
   * @return cmmdtNm的值。
   */
  public java.lang.String getCmmdtNm() {
    return this.cmmdtNm;
  }
  /**
   * 设置属性cmmdtNm的值.
   * @param value cmmdtNm的值。
   */
  public void setCmmdtNm(java.lang.String value) {
    this.cmmdtNm = value;
  }
  /**
   * 返回属性cmmdtUpric的值.
   * @return cmmdtUpric的值。
   */
  public java.math.BigDecimal getCmmdtUpric() {
    return this.cmmdtUpric;
  }
  /**
   * 设置属性cmmdtUpric的值.
   * @param value cmmdtUpric的值。
   */
  public void setCmmdtUpric(java.math.BigDecimal value) {
    this.cmmdtUpric = value;
  }
  /**
   * 返回属性cmmdtUnt的值.
   * @return cmmdtUnt的值。
   */
  public java.lang.String getCmmdtUnt() {
    return this.cmmdtUnt;
  }
  /**
   * 设置属性cmmdtUnt的值.
   * @param value cmmdtUnt的值。
   */
  public void setCmmdtUnt(java.lang.String value) {
    this.cmmdtUnt = value;
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
   * 返回MdlTblCmmdt的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getStoreId());
    buf.append(",");
    buf.append(this.getCmmdtId());
    buf.append(",");
    buf.append(this.getAppliStDt());
    buf.append(",");
    buf.append(this.getAppliEdDt());
    buf.append(",");
    buf.append(this.getCmmdtNm());
    buf.append(",");
    buf.append(this.getCmmdtUpric());
    buf.append(",");
    buf.append(this.getCmmdtUnt());
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
    if (MdlTblCmmdt.STORE_ID.equals(key)) {
      ret = this.getStoreId();
    }
    if (MdlTblCmmdt.CMMDT_ID.equals(key)) {
      ret = this.getCmmdtId();
    }
    if (MdlTblCmmdt.APPLI_ST_DT.equals(key)) {
      ret = this.getAppliStDt();
    }
    if (MdlTblCmmdt.APPLI_ED_DT.equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (MdlTblCmmdt.CMMDT_NM.equals(key)) {
      ret = this.getCmmdtNm();
    }
    if (MdlTblCmmdt.CMMDT_UPRIC.equals(key)) {
      ret = this.getCmmdtUpric();
    }
    if (MdlTblCmmdt.CMMDT_UNT.equals(key)) {
      ret = this.getCmmdtUnt();
    }
    if (MdlTblCmmdt.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblCmmdt.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblCmmdt.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblCmmdt.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblCmmdt.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblCmmdt.UPD_VW_ID.equals(key)) {
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
    if (MdlTblCmmdt.STORE_ID.equals(key)) {
      this.setStoreId((java.lang.String) value);
    }
    if (MdlTblCmmdt.CMMDT_ID.equals(key)) {
      this.setCmmdtId((java.lang.String) value);
    }
    if (MdlTblCmmdt.APPLI_ST_DT.equals(key)) {
      this.setAppliStDt((java.lang.String) value);
    }
    if (MdlTblCmmdt.APPLI_ED_DT.equals(key)) {
      this.setAppliEdDt((java.lang.String) value);
    }
    if (MdlTblCmmdt.CMMDT_NM.equals(key)) {
      this.setCmmdtNm((java.lang.String) value);
    }
    if (MdlTblCmmdt.CMMDT_UPRIC.equals(key)) {
      this.setCmmdtUpric((java.math.BigDecimal) value);
    }
    if (MdlTblCmmdt.CMMDT_UNT.equals(key)) {
      this.setCmmdtUnt((java.lang.String) value);
    }
    if (MdlTblCmmdt.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblCmmdt.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblCmmdt.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblCmmdt.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblCmmdt.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblCmmdt.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
