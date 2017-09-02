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
 * 表tbl_msg的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:01.615 +0900自动生成的。
 */
public class MdlTblMsg implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_MSG. */
  public static final String TBL_MSG = "TBL_MSG";
  /** 字段：USER_ID. */
  public static final String USER_ID = "TBL_MSG.USER_ID";
  /** 字段：PUB_DT. */
  public static final String PUB_DT = "TBL_MSG.PUB_DT";
  /** 字段：PUB_TM. */
  public static final String PUB_TM = "TBL_MSG.PUB_TM";
  /** 字段：RECV_USER_ID. */
  public static final String RECV_USER_ID = "TBL_MSG.RECV_USER_ID";
  /** 字段：MSG_CONT. */
  public static final String MSG_CONT = "TBL_MSG.MSG_CONT";
  /** 字段：DEL_FLG. */
  public static final String DEL_FLG = "TBL_MSG.DEL_FLG";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_MSG.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_MSG.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_MSG.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_MSG.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_MSG.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_MSG.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblMsg.USER_ID,
    MdlTblMsg.PUB_DT,
    MdlTblMsg.PUB_TM,
    MdlTblMsg.RECV_USER_ID,
    MdlTblMsg.MSG_CONT,
    MdlTblMsg.DEL_FLG,
    MdlTblMsg.FST_CRT_DT,
    MdlTblMsg.FST_CRT_TM,
    MdlTblMsg.RNT_UPD_DT,
    MdlTblMsg.RNT_UPD_TM,
    MdlTblMsg.UPD_USER_ID,
    MdlTblMsg.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblMsg.PUB_DT,
    MdlTblMsg.PUB_TM,
    MdlTblMsg.RECV_USER_ID,
    MdlTblMsg.USER_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblMsg.TBL_MSG;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String userId;
  private java.lang.String pubDt;
  private java.lang.String pubTm;
  private java.lang.String recvUserId;
  private java.lang.String msgCont;
  private java.lang.String delFlg;
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
  public MdlTblMsg() {
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
   * 返回属性pubDt的值.
   * @return pubDt的值。
   */
  public java.lang.String getPubDt() {
    return this.pubDt;
  }
  /**
   * 设置属性pubDt的值.
   * @param value pubDt的值。
   */
  public void setPubDt(java.lang.String value) {
    this.pubDt = value;
  }
  /**
   * 返回属性pubTm的值.
   * @return pubTm的值。
   */
  public java.lang.String getPubTm() {
    return this.pubTm;
  }
  /**
   * 设置属性pubTm的值.
   * @param value pubTm的值。
   */
  public void setPubTm(java.lang.String value) {
    this.pubTm = value;
  }
  /**
   * 返回属性recvUserId的值.
   * @return recvUserId的值。
   */
  public java.lang.String getRecvUserId() {
    return this.recvUserId;
  }
  /**
   * 设置属性recvUserId的值.
   * @param value recvUserId的值。
   */
  public void setRecvUserId(java.lang.String value) {
    this.recvUserId = value;
  }
  /**
   * 返回属性msgCont的值.
   * @return msgCont的值。
   */
  public java.lang.String getMsgCont() {
    return this.msgCont;
  }
  /**
   * 设置属性msgCont的值.
   * @param value msgCont的值。
   */
  public void setMsgCont(java.lang.String value) {
    this.msgCont = value;
  }
  /**
   * 返回属性delFlg的值.
   * @return delFlg的值。
   */
  public java.lang.String getDelFlg() {
    return this.delFlg;
  }
  /**
   * 设置属性delFlg的值.
   * @param value delFlg的值。
   */
  public void setDelFlg(java.lang.String value) {
    this.delFlg = value;
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
   * 返回MdlTblMsg的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getUserId());
    buf.append(",");
    buf.append(this.getPubDt());
    buf.append(",");
    buf.append(this.getPubTm());
    buf.append(",");
    buf.append(this.getRecvUserId());
    buf.append(",");
    buf.append(this.getMsgCont());
    buf.append(",");
    buf.append(this.getDelFlg());
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
  public Object get(String key) {
    Object ret = null;
    if (MdlTblMsg.USER_ID.equals(key)) {
      ret = this.getUserId();
    }
    if (MdlTblMsg.PUB_DT.equals(key)) {
      ret = this.getPubDt();
    }
    if (MdlTblMsg.PUB_TM.equals(key)) {
      ret = this.getPubTm();
    }
    if (MdlTblMsg.RECV_USER_ID.equals(key)) {
      ret = this.getRecvUserId();
    }
    if (MdlTblMsg.MSG_CONT.equals(key)) {
      ret = this.getMsgCont();
    }
    if (MdlTblMsg.DEL_FLG.equals(key)) {
      ret = this.getDelFlg();
    }
    if (MdlTblMsg.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblMsg.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblMsg.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblMsg.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblMsg.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblMsg.UPD_VW_ID.equals(key)) {
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
    if (MdlTblMsg.USER_ID.equals(key)) {
      this.setUserId((java.lang.String) value);
    }
    if (MdlTblMsg.PUB_DT.equals(key)) {
      this.setPubDt((java.lang.String) value);
    }
    if (MdlTblMsg.PUB_TM.equals(key)) {
      this.setPubTm((java.lang.String) value);
    }
    if (MdlTblMsg.RECV_USER_ID.equals(key)) {
      this.setRecvUserId((java.lang.String) value);
    }
    if (MdlTblMsg.MSG_CONT.equals(key)) {
      this.setMsgCont((java.lang.String) value);
    }
    if (MdlTblMsg.DEL_FLG.equals(key)) {
      this.setDelFlg((java.lang.String) value);
    }
    if (MdlTblMsg.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblMsg.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblMsg.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblMsg.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblMsg.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblMsg.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
    return this;
  }
}
