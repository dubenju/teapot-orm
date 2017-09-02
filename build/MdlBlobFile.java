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
 * 表blob_file的JavaBean类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:56.900 +0900自动生成的。
 */
public class MdlBlobFile implements Serializable, IKeyValue {

  private static final long serialVersionUID = 1L;
  /*
   * 常量定义
   */
  /** 表的名称:BLOB_FILE. */
  public static final String BLOB_FILE = "BLOB_FILE";
  /** 字段：BLOB_FILE_ID. */
  public static final String BLOB_FILE_ID = "BLOB_FILE.BLOB_FILE_ID";
  /** 字段：BLOB_FILE_NAME. */
  public static final String BLOB_FILE_NAME = "BLOB_FILE.BLOB_FILE_NAME";
  /** 字段：BLOB_FILE_TYPE. */
  public static final String BLOB_FILE_TYPE = "BLOB_FILE.BLOB_FILE_TYPE";
  /** 字段：BLOB_FILE_SIZE. */
  public static final String BLOB_FILE_SIZE = "BLOB_FILE.BLOB_FILE_SIZE";
  /** 字段：BLOB_FILE_DATA. */
  public static final String BLOB_FILE_DATA = "BLOB_FILE.BLOB_FILE_DATA";
  /** 字段：CREATE_DATE. */
  public static final String CREATE_DATE = "BLOB_FILE.CREATE_DATE";
  /** 字段：CREATE_TIME. */
  public static final String CREATE_TIME = "BLOB_FILE.CREATE_TIME";
  /** 字段：UPDATE_DATE. */
  public static final String UPDATE_DATE = "BLOB_FILE.UPDATE_DATE";
  /** 字段：UPDATE_TIME. */
  public static final String UPDATE_TIME = "BLOB_FILE.UPDATE_TIME";
  /** 字段：UPDATE_USER_ID. */
  public static final String UPDATE_USER_ID = "BLOB_FILE.UPDATE_USER_ID";
  /** 字段：UPDATE_SCREEN_ID. */
  public static final String UPDATE_SCREEN_ID = "BLOB_FILE.UPDATE_SCREEN_ID";
  /* 字段 */
  /** 所有字段名数组. */
  public static final String[] COLUMNS = {
    MdlBlobFile.BLOB_FILE_ID,
    MdlBlobFile.BLOB_FILE_NAME,
    MdlBlobFile.BLOB_FILE_TYPE,
    MdlBlobFile.BLOB_FILE_SIZE,
    MdlBlobFile.BLOB_FILE_DATA,
    MdlBlobFile.CREATE_DATE,
    MdlBlobFile.CREATE_TIME,
    MdlBlobFile.UPDATE_DATE,
    MdlBlobFile.UPDATE_TIME,
    MdlBlobFile.UPDATE_USER_ID,
    MdlBlobFile.UPDATE_SCREEN_ID
  };
  /* 主键  */
  /** 所有主键字段名数组. */
  public static final String[] PRIKEYS = {
    MdlBlobFile.BLOB_FILE_ID
  };

  /**
   * 获取表的名称.
   * @return 表的名称。
   */
  public static String getTblName() {
    return MdlBlobFile.BLOB_FILE;
  }

  /* *************************************************
   * 变量定义
   * *************************************************/
  private java.lang.String blobFileId;
  private java.lang.String blobFileName;
  private java.lang.String blobFileType;
  private java.math.BigDecimal blobFileSize;
  private byte[] blobFileData;
  private java.lang.String createDate;
  private java.lang.String createTime;
  private java.lang.String updateDate;
  private java.lang.String updateTime;
  private java.lang.String updateUserId;
  private java.lang.String updateScreenId;

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数.
   */
  public MdlBlobFile() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性blobFileId的值.
   * @return blobFileId的值。
   */
  public java.lang.String getBlobFileId() {
    return this.blobFileId;
  }
  /**
   * 设置属性blobFileId的值.
   * @param value blobFileId的值。
   */
  public void setBlobFileId(java.lang.String value) {
    this.blobFileId = value;
  }
  /**
   * 返回属性blobFileName的值.
   * @return blobFileName的值。
   */
  public java.lang.String getBlobFileName() {
    return this.blobFileName;
  }
  /**
   * 设置属性blobFileName的值.
   * @param value blobFileName的值。
   */
  public void setBlobFileName(java.lang.String value) {
    this.blobFileName = value;
  }
  /**
   * 返回属性blobFileType的值.
   * @return blobFileType的值。
   */
  public java.lang.String getBlobFileType() {
    return this.blobFileType;
  }
  /**
   * 设置属性blobFileType的值.
   * @param value blobFileType的值。
   */
  public void setBlobFileType(java.lang.String value) {
    this.blobFileType = value;
  }
  /**
   * 返回属性blobFileSize的值.
   * @return blobFileSize的值。
   */
  public java.math.BigDecimal getBlobFileSize() {
    return this.blobFileSize;
  }
  /**
   * 设置属性blobFileSize的值.
   * @param value blobFileSize的值。
   */
  public void setBlobFileSize(java.math.BigDecimal value) {
    this.blobFileSize = value;
  }
  /**
   * 返回属性blobFileData的值.
   * @return blobFileData的值。
   */
  public byte[] getBlobFileData() {
    return this.blobFileData;
  }
  /**
   * 设置属性blobFileData的值.
   * @param value blobFileData的值。
   */
  public void setBlobFileData(byte[] value) {
    this.blobFileData = value;
  }
  /**
   * 返回属性createDate的值.
   * @return createDate的值。
   */
  public java.lang.String getCreateDate() {
    return this.createDate;
  }
  /**
   * 设置属性createDate的值.
   * @param value createDate的值。
   */
  public void setCreateDate(java.lang.String value) {
    this.createDate = value;
  }
  /**
   * 返回属性createTime的值.
   * @return createTime的值。
   */
  public java.lang.String getCreateTime() {
    return this.createTime;
  }
  /**
   * 设置属性createTime的值.
   * @param value createTime的值。
   */
  public void setCreateTime(java.lang.String value) {
    this.createTime = value;
  }
  /**
   * 返回属性updateDate的值.
   * @return updateDate的值。
   */
  public java.lang.String getUpdateDate() {
    return this.updateDate;
  }
  /**
   * 设置属性updateDate的值.
   * @param value updateDate的值。
   */
  public void setUpdateDate(java.lang.String value) {
    this.updateDate = value;
  }
  /**
   * 返回属性updateTime的值.
   * @return updateTime的值。
   */
  public java.lang.String getUpdateTime() {
    return this.updateTime;
  }
  /**
   * 设置属性updateTime的值.
   * @param value updateTime的值。
   */
  public void setUpdateTime(java.lang.String value) {
    this.updateTime = value;
  }
  /**
   * 返回属性updateUserId的值.
   * @return updateUserId的值。
   */
  public java.lang.String getUpdateUserId() {
    return this.updateUserId;
  }
  /**
   * 设置属性updateUserId的值.
   * @param value updateUserId的值。
   */
  public void setUpdateUserId(java.lang.String value) {
    this.updateUserId = value;
  }
  /**
   * 返回属性updateScreenId的值.
   * @return updateScreenId的值。
   */
  public java.lang.String getUpdateScreenId() {
    return this.updateScreenId;
  }
  /**
   * 设置属性updateScreenId的值.
   * @param value updateScreenId的值。
   */
  public void setUpdateScreenId(java.lang.String value) {
    this.updateScreenId = value;
  }

  /**
   * 返回MdlBlobFile的字符串表示形式.
   * @return String 字符串表示形式。
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.getBlobFileId());
    buf.append(",");
    buf.append(this.getBlobFileName());
    buf.append(",");
    buf.append(this.getBlobFileType());
    buf.append(",");
    buf.append(this.getBlobFileSize());
    buf.append(",");
    buf.append(this.getBlobFileData());
    buf.append(",");
    buf.append(this.getCreateDate());
    buf.append(",");
    buf.append(this.getCreateTime());
    buf.append(",");
    buf.append(this.getUpdateDate());
    buf.append(",");
    buf.append(this.getUpdateTime());
    buf.append(",");
    buf.append(this.getUpdateUserId());
    buf.append(",");
    buf.append(this.getUpdateScreenId());

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
    if (MdlBlobFile.BLOB_FILE_ID.equals(key)) {
      ret = this.getBlobFileId();
    }
    if (MdlBlobFile.BLOB_FILE_NAME.equals(key)) {
      ret = this.getBlobFileName();
    }
    if (MdlBlobFile.BLOB_FILE_TYPE.equals(key)) {
      ret = this.getBlobFileType();
    }
    if (MdlBlobFile.BLOB_FILE_SIZE.equals(key)) {
      ret = this.getBlobFileSize();
    }
    if (MdlBlobFile.BLOB_FILE_DATA.equals(key)) {
      ret = this.getBlobFileData();
    }
    if (MdlBlobFile.CREATE_DATE.equals(key)) {
      ret = this.getCreateDate();
    }
    if (MdlBlobFile.CREATE_TIME.equals(key)) {
      ret = this.getCreateTime();
    }
    if (MdlBlobFile.UPDATE_DATE.equals(key)) {
      ret = this.getUpdateDate();
    }
    if (MdlBlobFile.UPDATE_TIME.equals(key)) {
      ret = this.getUpdateTime();
    }
    if (MdlBlobFile.UPDATE_USER_ID.equals(key)) {
      ret = this.getUpdateUserId();
    }
    if (MdlBlobFile.UPDATE_SCREEN_ID.equals(key)) {
      ret = this.getUpdateScreenId();
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
    if (MdlBlobFile.BLOB_FILE_ID.equals(key)) {
      this.setBlobFileId((java.lang.String) value);
    }
    if (MdlBlobFile.BLOB_FILE_NAME.equals(key)) {
      this.setBlobFileName((java.lang.String) value);
    }
    if (MdlBlobFile.BLOB_FILE_TYPE.equals(key)) {
      this.setBlobFileType((java.lang.String) value);
    }
    if (MdlBlobFile.BLOB_FILE_SIZE.equals(key)) {
      this.setBlobFileSize((java.math.BigDecimal) value);
    }
    if (MdlBlobFile.BLOB_FILE_DATA.equals(key)) {
      this.setBlobFileData((byte[]) value);
    }
    if (MdlBlobFile.CREATE_DATE.equals(key)) {
      this.setCreateDate((java.lang.String) value);
    }
    if (MdlBlobFile.CREATE_TIME.equals(key)) {
      this.setCreateTime((java.lang.String) value);
    }
    if (MdlBlobFile.UPDATE_DATE.equals(key)) {
      this.setUpdateDate((java.lang.String) value);
    }
    if (MdlBlobFile.UPDATE_TIME.equals(key)) {
      this.setUpdateTime((java.lang.String) value);
    }
    if (MdlBlobFile.UPDATE_USER_ID.equals(key)) {
      this.setUpdateUserId((java.lang.String) value);
    }
    if (MdlBlobFile.UPDATE_SCREEN_ID.equals(key)) {
      this.setUpdateScreenId((java.lang.String) value);
    }
  }
}
