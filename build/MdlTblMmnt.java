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
 * 表tbl_mmnt的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:01.272 +0900自动生成的。
 */
public class MdlTblMmnt implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_MMNT. */
  public static final String TBL_MMNT = "TBL_MMNT";
  /** 字段：USER_ID. */
  public static final String USER_ID = "TBL_MMNT.USER_ID";
  /** 字段：FRND_ID. */
  public static final String FRND_ID = "TBL_MMNT.FRND_ID";
  /** 字段：OPRT_TYPE. */
  public static final String OPRT_TYPE = "TBL_MMNT.OPRT_TYPE";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_MMNT.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_MMNT.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_MMNT.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_MMNT.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_MMNT.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_MMNT.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblMmnt.USER_ID,
    MdlTblMmnt.FRND_ID,
    MdlTblMmnt.OPRT_TYPE,
    MdlTblMmnt.FST_CRT_DT,
    MdlTblMmnt.FST_CRT_TM,
    MdlTblMmnt.RNT_UPD_DT,
    MdlTblMmnt.RNT_UPD_TM,
    MdlTblMmnt.UPD_USER_ID,
    MdlTblMmnt.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblMmnt.FRND_ID,
    MdlTblMmnt.USER_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblMmnt.TBL_MMNT;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String userId;
  private java.lang.String frndId;
  private java.lang.String oprtType;
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
  public MdlTblMmnt() {
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
   * 返回属性frndId的值.
   * @return frndId的值。
   */
  public java.lang.String getFrndId() {
    return this.frndId;
  }
  /**
   * 设置属性frndId的值.
   * @param value frndId的值。
   */
  public void setFrndId(java.lang.String value) {
    this.frndId = value;
  }
  /**
   * 返回属性oprtType的值.
   * @return oprtType的值。
   */
  public java.lang.String getOprtType() {
    return this.oprtType;
  }
  /**
   * 设置属性oprtType的值.
   * @param value oprtType的值。
   */
  public void setOprtType(java.lang.String value) {
    this.oprtType = value;
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
   * 返回MdlTblMmnt的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getUserId());
    buf.append(",");
    buf.append(this.getFrndId());
    buf.append(",");
    buf.append(this.getOprtType());
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
    if (MdlTblMmnt.USER_ID.equals(key)) {
      ret = this.getUserId();
    }
    if (MdlTblMmnt.FRND_ID.equals(key)) {
      ret = this.getFrndId();
    }
    if (MdlTblMmnt.OPRT_TYPE.equals(key)) {
      ret = this.getOprtType();
    }
    if (MdlTblMmnt.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblMmnt.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblMmnt.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblMmnt.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblMmnt.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblMmnt.UPD_VW_ID.equals(key)) {
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
    if (MdlTblMmnt.USER_ID.equals(key)) {
      this.setUserId((java.lang.String) value);
    }
    if (MdlTblMmnt.FRND_ID.equals(key)) {
      this.setFrndId((java.lang.String) value);
    }
    if (MdlTblMmnt.OPRT_TYPE.equals(key)) {
      this.setOprtType((java.lang.String) value);
    }
    if (MdlTblMmnt.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblMmnt.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblMmnt.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblMmnt.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblMmnt.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblMmnt.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
