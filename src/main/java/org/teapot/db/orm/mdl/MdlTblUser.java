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

import org.teapot.db.orm.Formatter;
import org.teapot.db.orm.IKeyValue;

import java.io.Serializable;

/**
 * 表tbl_user的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/29 20:54:52.628 +0900自动生成的。
 */
public class MdlTblUser
    implements Serializable, IKeyValue, Comparable<MdlTblUser> {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_USER. */
  public static final String TBL_USER = "TBL_USER";
  /** 字段：USER_ID. */
  public static final String USER_ID = "TBL_USER.USER_ID";
  /** 字段：APPLI_ST_DT. */
  public static final String APPLI_ST_DT = "TBL_USER.APPLI_ST_DT";
  /** 字段：APPLI_ED_DT. */
  public static final String APPLI_ED_DT = "TBL_USER.APPLI_ED_DT";
  /** 字段：USER_ACNT. */
  public static final String USER_ACNT = "TBL_USER.USER_ACNT";
  /** 字段：USER_NNM. */
  public static final String USER_NNM = "TBL_USER.USER_NNM";
  /** 字段：USER_EML. */
  public static final String USER_EML = "TBL_USER.USER_EML";
  /** 字段：PST_CD. */
  public static final String PST_CD = "TBL_USER.PST_CD";
  /** 字段：CNTCT_ADDR. */
  public static final String CNTCT_ADDR = "TBL_USER.CNTCT_ADDR";
  /** 字段：USER_FNM. */
  public static final String USER_FNM = "TBL_USER.USER_FNM";
  /** 字段：CNTCT_PHN. */
  public static final String CNTCT_PHN = "TBL_USER.CNTCT_PHN";
  /** 字段：IDCRD_NO. */
  public static final String IDCRD_NO = "TBL_USER.IDCRD_NO";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_USER.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_USER.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_USER.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_USER.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_USER.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_USER.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblUser.USER_ID,
    MdlTblUser.APPLI_ST_DT,
    MdlTblUser.APPLI_ED_DT,
    MdlTblUser.USER_ACNT,
    MdlTblUser.USER_NNM,
    MdlTblUser.USER_EML,
    MdlTblUser.PST_CD,
    MdlTblUser.CNTCT_ADDR,
    MdlTblUser.USER_FNM,
    MdlTblUser.CNTCT_PHN,
    MdlTblUser.IDCRD_NO,
    MdlTblUser.FST_CRT_DT,
    MdlTblUser.FST_CRT_TM,
    MdlTblUser.RNT_UPD_DT,
    MdlTblUser.RNT_UPD_TM,
    MdlTblUser.UPD_USER_ID,
    MdlTblUser.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblUser.APPLI_ST_DT,
    MdlTblUser.USER_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblUser.TBL_USER;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String userId;
  private java.lang.String appliStDt;
  private java.lang.String appliEdDt;
  private java.lang.String userAcnt;
  private java.lang.String userNnm;
  private java.lang.String userEml;
  private java.lang.String pstCd;
  private java.lang.String cntctAddr;
  private java.lang.String userFnm;
  private java.lang.String cntctPhn;
  private java.lang.String idcrdNo;
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
  public MdlTblUser() {
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
   * 返回属性userAcnt的值.
   * @return userAcnt的值。
   */
  public java.lang.String getUserAcnt() {
    return this.userAcnt;
  }
  /**
   * 设置属性userAcnt的值.
   * @param value userAcnt的值。
   */
  public void setUserAcnt(java.lang.String value) {
    this.userAcnt = value;
  }
  /**
   * 返回属性userNnm的值.
   * @return userNnm的值。
   */
  public java.lang.String getUserNnm() {
    return this.userNnm;
  }
  /**
   * 设置属性userNnm的值.
   * @param value userNnm的值。
   */
  public void setUserNnm(java.lang.String value) {
    this.userNnm = value;
  }
  /**
   * 返回属性userEml的值.
   * @return userEml的值。
   */
  public java.lang.String getUserEml() {
    return this.userEml;
  }
  /**
   * 设置属性userEml的值.
   * @param value userEml的值。
   */
  public void setUserEml(java.lang.String value) {
    this.userEml = value;
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
   * 返回属性cntctAddr的值.
   * @return cntctAddr的值。
   */
  public java.lang.String getCntctAddr() {
    return this.cntctAddr;
  }
  /**
   * 设置属性cntctAddr的值.
   * @param value cntctAddr的值。
   */
  public void setCntctAddr(java.lang.String value) {
    this.cntctAddr = value;
  }
  /**
   * 返回属性userFnm的值.
   * @return userFnm的值。
   */
  public java.lang.String getUserFnm() {
    return this.userFnm;
  }
  /**
   * 设置属性userFnm的值.
   * @param value userFnm的值。
   */
  public void setUserFnm(java.lang.String value) {
    this.userFnm = value;
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
   * 返回属性idcrdNo的值.
   * @return idcrdNo的值。
   */
  public java.lang.String getIdcrdNo() {
    return this.idcrdNo;
  }
  /**
   * 设置属性idcrdNo的值.
   * @param value idcrdNo的值。
   */
  public void setIdcrdNo(java.lang.String value) {
    this.idcrdNo = value;
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
   * 返回MdlTblUser的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getUserId());
    buf.append(",");
    buf.append(this.getAppliStDt());
    buf.append(",");
    buf.append(this.getAppliEdDt());
    buf.append(",");
    buf.append(this.getUserAcnt());
    buf.append(",");
    buf.append(this.getUserNnm());
    buf.append(",");
    buf.append(this.getUserEml());
    buf.append(",");
    buf.append(this.getPstCd());
    buf.append(",");
    buf.append(this.getCntctAddr());
    buf.append(",");
    buf.append(this.getUserFnm());
    buf.append(",");
    buf.append(this.getCntctPhn());
    buf.append(",");
    buf.append(this.getIdcrdNo());
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

    buf.append(",");
    buf.append(this.getClass().getName());
    return buf.toString();
  }

  /**
   * 通过键名获取值.
   * 当指定的键名不存在的时候，返回null。
   * @return Object 对应键名值。
   */
  @Override
  public Object get(String key) {
    Object ret = null;
    if (MdlTblUser.USER_ID.equals(key)) {
      ret = this.getUserId();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.USER_ID).equals(key)) {
      ret = this.getUserId();
    }
    if (MdlTblUser.APPLI_ST_DT.equals(key)) {
      ret = this.getAppliStDt();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.APPLI_ST_DT).equals(key)) {
      ret = this.getAppliStDt();
    }
    if (MdlTblUser.APPLI_ED_DT.equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.APPLI_ED_DT).equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (MdlTblUser.USER_ACNT.equals(key)) {
      ret = this.getUserAcnt();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.USER_ACNT).equals(key)) {
      ret = this.getUserAcnt();
    }
    if (MdlTblUser.USER_NNM.equals(key)) {
      ret = this.getUserNnm();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.USER_NNM).equals(key)) {
      ret = this.getUserNnm();
    }
    if (MdlTblUser.USER_EML.equals(key)) {
      ret = this.getUserEml();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.USER_EML).equals(key)) {
      ret = this.getUserEml();
    }
    if (MdlTblUser.PST_CD.equals(key)) {
      ret = this.getPstCd();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.PST_CD).equals(key)) {
      ret = this.getPstCd();
    }
    if (MdlTblUser.CNTCT_ADDR.equals(key)) {
      ret = this.getCntctAddr();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.CNTCT_ADDR).equals(key)) {
      ret = this.getCntctAddr();
    }
    if (MdlTblUser.USER_FNM.equals(key)) {
      ret = this.getUserFnm();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.USER_FNM).equals(key)) {
      ret = this.getUserFnm();
    }
    if (MdlTblUser.CNTCT_PHN.equals(key)) {
      ret = this.getCntctPhn();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.CNTCT_PHN).equals(key)) {
      ret = this.getCntctPhn();
    }
    if (MdlTblUser.IDCRD_NO.equals(key)) {
      ret = this.getIdcrdNo();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.IDCRD_NO).equals(key)) {
      ret = this.getIdcrdNo();
    }
    if (MdlTblUser.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.FST_CRT_DT).equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblUser.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.FST_CRT_TM).equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblUser.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.RNT_UPD_DT).equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblUser.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.RNT_UPD_TM).equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblUser.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.UPD_USER_ID).equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblUser.UPD_VW_ID.equals(key)) {
      ret = this.getUpdVwId();
    }
    if (Formatter.INSTANCE.fmtFun(MdlTblUser.UPD_VW_ID).equals(key)) {
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
  public IKeyValue set(String key, Object value) {
    if (MdlTblUser.USER_ID.equals(key)) {
      this.setUserId((java.lang.String) value);
    }
    if (MdlTblUser.APPLI_ST_DT.equals(key)) {
      this.setAppliStDt((java.lang.String) value);
    }
    if (MdlTblUser.APPLI_ED_DT.equals(key)) {
      this.setAppliEdDt((java.lang.String) value);
    }
    if (MdlTblUser.USER_ACNT.equals(key)) {
      this.setUserAcnt((java.lang.String) value);
    }
    if (MdlTblUser.USER_NNM.equals(key)) {
      this.setUserNnm((java.lang.String) value);
    }
    if (MdlTblUser.USER_EML.equals(key)) {
      this.setUserEml((java.lang.String) value);
    }
    if (MdlTblUser.PST_CD.equals(key)) {
      this.setPstCd((java.lang.String) value);
    }
    if (MdlTblUser.CNTCT_ADDR.equals(key)) {
      this.setCntctAddr((java.lang.String) value);
    }
    if (MdlTblUser.USER_FNM.equals(key)) {
      this.setUserFnm((java.lang.String) value);
    }
    if (MdlTblUser.CNTCT_PHN.equals(key)) {
      this.setCntctPhn((java.lang.String) value);
    }
    if (MdlTblUser.IDCRD_NO.equals(key)) {
      this.setIdcrdNo((java.lang.String) value);
    }
    if (MdlTblUser.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblUser.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblUser.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblUser.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblUser.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblUser.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
    return this;
  }

  /**
   * 比较两个对象是否相等.
   * @param   anObject   the reference object with which to compare.
   * @return  {@code true} if this object is the same as the obj
   *          argument; {@code false} otherwise.
   */
  @Override
  public boolean equals(Object anObject) {
    if (this == anObject) {
      return true;
    }
    if (anObject instanceof MdlTblUser) {
      return this.compareTo((MdlTblUser) anObject) == 0;
    }
    return super.equals(anObject);
  }

  /**
   * 比较大小.
   * @param anotherMdlTblUser   the {@code MdlTblUser} to be compared.
   * @return  the value {@code 0} if the argument MdlTblUser is equal to
   *          this MdlTblUser; a value less than {@code 0} if this MdlTblUser
   *          is lexicographically less than the MdlTblUser argument; and a
   *          value greater than {@code 0} if this MdlTblUser is
   *          lexicographically greater than the MdlTblUser argument.
   */
  @Override
  public int compareTo(MdlTblUser anotherMdlTblUser) {
    int result = 0;
    if (anotherMdlTblUser == null) {
      result = 1;
      return result;
    }
    if (this.getAppliStDt() == null) {
      if (anotherMdlTblUser.getAppliStDt() != null) {
        result = -1;
        return result;
      }
    }
    if (this.getAppliStDt() != null) {
      if (anotherMdlTblUser.getAppliStDt() == null) {
        result = 1;
        return result;
      }
    }
    result = this.getAppliStDt().compareTo(anotherMdlTblUser.getAppliStDt());
    if (result != 0) {
      return result;
    }
    if (this.getUserId() == null) {
      if (anotherMdlTblUser.getUserId() != null) {
        result = -1;
        return result;
      }
    }
    if (this.getUserId() != null) {
      if (anotherMdlTblUser.getUserId() == null) {
        result = 1;
        return result;
      }
    }
    result = this.getUserId().compareTo(anotherMdlTblUser.getUserId());
    if (result != 0) {
      return result;
    }

    return result;
  }
}
