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
 * 表tbl_media的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:40:00.929 +0900自动生成的。
 */
public class MdlTblMedia implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:TBL_MEDIA. */
  public static final String TBL_MEDIA = "TBL_MEDIA";
  /** 字段：MEDIA_TYPE. */
  public static final String MEDIA_TYPE = "TBL_MEDIA.MEDIA_TYPE";
  /** 字段：MEDIA_ID. */
  public static final String MEDIA_ID = "TBL_MEDIA.MEDIA_ID";
  /** 字段：APPLI_ST_DT. */
  public static final String APPLI_ST_DT = "TBL_MEDIA.APPLI_ST_DT";
  /** 字段：APPLI_ED_DT. */
  public static final String APPLI_ED_DT = "TBL_MEDIA.APPLI_ED_DT";
  /** 字段：MEDIA_CONT. */
  public static final String MEDIA_CONT = "TBL_MEDIA.MEDIA_CONT";
  /** 字段：FST_CRT_DT. */
  public static final String FST_CRT_DT = "TBL_MEDIA.FST_CRT_DT";
  /** 字段：FST_CRT_TM. */
  public static final String FST_CRT_TM = "TBL_MEDIA.FST_CRT_TM";
  /** 字段：RNT_UPD_DT. */
  public static final String RNT_UPD_DT = "TBL_MEDIA.RNT_UPD_DT";
  /** 字段：RNT_UPD_TM. */
  public static final String RNT_UPD_TM = "TBL_MEDIA.RNT_UPD_TM";
  /** 字段：UPD_USER_ID. */
  public static final String UPD_USER_ID = "TBL_MEDIA.UPD_USER_ID";
  /** 字段：UPD_VW_ID. */
  public static final String UPD_VW_ID = "TBL_MEDIA.UPD_VW_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlTblMedia.MEDIA_TYPE,
    MdlTblMedia.MEDIA_ID,
    MdlTblMedia.APPLI_ST_DT,
    MdlTblMedia.APPLI_ED_DT,
    MdlTblMedia.MEDIA_CONT,
    MdlTblMedia.FST_CRT_DT,
    MdlTblMedia.FST_CRT_TM,
    MdlTblMedia.RNT_UPD_DT,
    MdlTblMedia.RNT_UPD_TM,
    MdlTblMedia.UPD_USER_ID,
    MdlTblMedia.UPD_VW_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlTblMedia.APPLI_ST_DT,
    MdlTblMedia.MEDIA_ID,
    MdlTblMedia.MEDIA_TYPE
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlTblMedia.TBL_MEDIA;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String mediaType;
  private java.lang.String mediaId;
  private java.lang.String appliStDt;
  private java.lang.String appliEdDt;
  private byte[] mediaCont;
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
  public MdlTblMedia() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性mediaType的值.
   * @return mediaType的值。
   */
  public java.lang.String getMediaType() {
    return this.mediaType;
  }
  /**
   * 设置属性mediaType的值.
   * @param value mediaType的值。
   */
  public void setMediaType(java.lang.String value) {
    this.mediaType = value;
  }
  /**
   * 返回属性mediaId的值.
   * @return mediaId的值。
   */
  public java.lang.String getMediaId() {
    return this.mediaId;
  }
  /**
   * 设置属性mediaId的值.
   * @param value mediaId的值。
   */
  public void setMediaId(java.lang.String value) {
    this.mediaId = value;
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
   * 返回属性mediaCont的值.
   * @return mediaCont的值。
   */
  public byte[] getMediaCont() {
    return this.mediaCont;
  }
  /**
   * 设置属性mediaCont的值.
   * @param value mediaCont的值。
   */
  public void setMediaCont(byte[] value) {
    this.mediaCont = value;
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
   * 返回MdlTblMedia的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getMediaType());
    buf.append(",");
    buf.append(this.getMediaId());
    buf.append(",");
    buf.append(this.getAppliStDt());
    buf.append(",");
    buf.append(this.getAppliEdDt());
    buf.append(",");
    buf.append(this.getMediaCont());
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
    if (MdlTblMedia.MEDIA_TYPE.equals(key)) {
      ret = this.getMediaType();
    }
    if (MdlTblMedia.MEDIA_ID.equals(key)) {
      ret = this.getMediaId();
    }
    if (MdlTblMedia.APPLI_ST_DT.equals(key)) {
      ret = this.getAppliStDt();
    }
    if (MdlTblMedia.APPLI_ED_DT.equals(key)) {
      ret = this.getAppliEdDt();
    }
    if (MdlTblMedia.MEDIA_CONT.equals(key)) {
      ret = this.getMediaCont();
    }
    if (MdlTblMedia.FST_CRT_DT.equals(key)) {
      ret = this.getFstCrtDt();
    }
    if (MdlTblMedia.FST_CRT_TM.equals(key)) {
      ret = this.getFstCrtTm();
    }
    if (MdlTblMedia.RNT_UPD_DT.equals(key)) {
      ret = this.getRntUpdDt();
    }
    if (MdlTblMedia.RNT_UPD_TM.equals(key)) {
      ret = this.getRntUpdTm();
    }
    if (MdlTblMedia.UPD_USER_ID.equals(key)) {
      ret = this.getUpdUserId();
    }
    if (MdlTblMedia.UPD_VW_ID.equals(key)) {
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
    if (MdlTblMedia.MEDIA_TYPE.equals(key)) {
      this.setMediaType((java.lang.String) value);
    }
    if (MdlTblMedia.MEDIA_ID.equals(key)) {
      this.setMediaId((java.lang.String) value);
    }
    if (MdlTblMedia.APPLI_ST_DT.equals(key)) {
      this.setAppliStDt((java.lang.String) value);
    }
    if (MdlTblMedia.APPLI_ED_DT.equals(key)) {
      this.setAppliEdDt((java.lang.String) value);
    }
    if (MdlTblMedia.MEDIA_CONT.equals(key)) {
      this.setMediaCont((byte[]) value);
    }
    if (MdlTblMedia.FST_CRT_DT.equals(key)) {
      this.setFstCrtDt((java.lang.String) value);
    }
    if (MdlTblMedia.FST_CRT_TM.equals(key)) {
      this.setFstCrtTm((java.lang.String) value);
    }
    if (MdlTblMedia.RNT_UPD_DT.equals(key)) {
      this.setRntUpdDt((java.lang.String) value);
    }
    if (MdlTblMedia.RNT_UPD_TM.equals(key)) {
      this.setRntUpdTm((java.lang.String) value);
    }
    if (MdlTblMedia.UPD_USER_ID.equals(key)) {
      this.setUpdUserId((java.lang.String) value);
    }
    if (MdlTblMedia.UPD_VW_ID.equals(key)) {
      this.setUpdVwId((java.lang.String) value);
    }
  }
}
