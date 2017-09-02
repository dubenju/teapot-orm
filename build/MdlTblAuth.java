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
 * 表tbl_auth的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:58.445 +0900自动生成的。
 */
public class MdlTblAuth implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_AUTH. */
  public static final String TBL_AUTH = "TBL_AUTH";
  /** 字段：USER_ID. */
  public static final String USER_ID = "TBL_AUTH.USER_ID";
  /** 字段：APPLI_ST_DT. */
  public static final String APPLI_ST_DT = "TBL_AUTH.APPLI_ST_DT";
  /** 字段：APPLI_ED_DT. */
  public static final String APPLI_ED_DT = "TBL_AUTH.APPLI_ED_DT";
  /** 字段：USER_PWD. */
  public static final String USER_PWD = "TBL_AUTH.USER_PWD";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_AUTH.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_AUTH.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_AUTH.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_AUTH.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_AUTH.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_AUTH.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblAuth.USER_ID,
    MdlTblAuth.APPLI_ST_DT,
    MdlTblAuth.APPLI_ED_DT,
    MdlTblAuth.USER_PWD,
    MdlTblAuth.FST_CRT_DT,
    MdlTblAuth.FST_CRT_TM,
    MdlTblAuth.RNT_UPD_DT,
    MdlTblAuth.RNT_UPD_TM,
    MdlTblAuth.UPD_USER_ID,
    MdlTblAuth.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblAuth.APPLI_ST_DT,
    MdlTblAuth.USER_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblAuth.TBL_AUTH;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String userId;
  private java.lang.String appliStDt;
  private java.lang.String appliEdDt;
  private java.lang.String userPwd;
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
  public MdlTblAuth() {
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
   * 返回属性userPwd的值.
   * @return userPwd的值。
   */
  public java.lang.String getUserPwd() {
    return this.userPwd;
  }
  /**
   * 设置属性userPwd的值.
   * @param value userPwd的值。
   */
  public void setUserPwd(java.lang.String value) {
    this.userPwd = value;
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
   * 返回MdlTblAuth的字符串表示形式.
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
    buf.append(this.getUserPwd());
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
    if (MdlTblAuth.USER_ID.equals(key)) {
      ret = this.getUserId();
    }
    if (MdlTblAuth.APPLI_ST_DT.equals(key)) {
      ret = this.getAppliStDt();
    }
    if (MdlTblAuth.APPLI_ED_DT.equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (MdlTblAuth.USER_PWD.equals(key)) {
      ret = this.getUserPwd();
    }
    if (MdlTblAuth.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblAuth.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblAuth.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblAuth.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblAuth.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblAuth.UPD_VW_ID.equals(key)) {
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
    if (MdlTblAuth.USER_ID.equals(key)) {
      this.setUserId((java.lang.String) value);
    }
    if (MdlTblAuth.APPLI_ST_DT.equals(key)) {
      this.setAppliStDt((java.lang.String) value);
    }
    if (MdlTblAuth.APPLI_ED_DT.equals(key)) {
      this.setAppliEdDt((java.lang.String) value);
    }
    if (MdlTblAuth.USER_PWD.equals(key)) {
      this.setUserPwd((java.lang.String) value);
    }
    if (MdlTblAuth.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblAuth.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblAuth.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblAuth.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblAuth.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblAuth.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
