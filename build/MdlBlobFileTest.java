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

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 表blob_file的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:56.900 +0900自动生成的。
 */
public class MdlBlobFileTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "BLOB_FILE", MdlBlobFile.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlBlobFile() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性blobFileId的值的测试方法.
   */
  @Test
  public void testGetBlobFileId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileId = new java.lang.String("blobFileId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, blobFileId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性blobFileId的值与设定内容一致：", blobFileId,
        mdl.getBlobFileId());
  }

  /**
   * 设置属性blobFileId的值的测试方法.
   */
  @Test
  public void testSetBlobFileId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileId = new java.lang.String("blobFileId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBlobFileId(blobFileId);

    //(B-2)
    Assert.assertEquals("设置属性blobFileId的值与设定内容一致：", blobFileId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性blobFileName的值的测试方法.
   */
  @Test
  public void testGetBlobFileName() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileName = new java.lang.String("blobFileName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, blobFileName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性blobFileName的值与设定内容一致：", blobFileName,
        mdl.getBlobFileName());
  }

  /**
   * 设置属性blobFileName的值的测试方法.
   */
  @Test
  public void testSetBlobFileName() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileName = new java.lang.String("blobFileName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBlobFileName(blobFileName);

    //(B-2)
    Assert.assertEquals("设置属性blobFileName的值与设定内容一致：", blobFileName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性blobFileType的值的测试方法.
   */
  @Test
  public void testGetBlobFileType() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileType = new java.lang.String("blobFileType");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileType"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, blobFileType);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性blobFileType的值与设定内容一致：", blobFileType,
        mdl.getBlobFileType());
  }

  /**
   * 设置属性blobFileType的值的测试方法.
   */
  @Test
  public void testSetBlobFileType() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileType = new java.lang.String("blobFileType");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileType"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBlobFileType(blobFileType);

    //(B-2)
    Assert.assertEquals("设置属性blobFileType的值与设定内容一致：", blobFileType,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性blobFileSize的值的测试方法.
   */
  @Test
  public void testGetBlobFileSize() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.math.BigDecimal blobFileSize = new java.math.BigDecimal("2017.1011");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileSize"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, blobFileSize);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性blobFileSize的值与设定内容一致：", blobFileSize,
        mdl.getBlobFileSize());
  }

  /**
   * 设置属性blobFileSize的值的测试方法.
   */
  @Test
  public void testSetBlobFileSize() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.math.BigDecimal blobFileSize = new java.math.BigDecimal("2017.10111");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileSize"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBlobFileSize(blobFileSize);

    //(B-2)
    Assert.assertEquals("设置属性blobFileSize的值与设定内容一致：", blobFileSize,
        (java.math.BigDecimal) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性blobFileData的值的测试方法.
   */
  @Test
  public void testGetBlobFileData() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    byte[] blobFileData = new byte[] {0x31};

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileData"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, blobFileData);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性blobFileData的值与设定内容一致：", blobFileData,
        mdl.getBlobFileData());
  }

  /**
   * 设置属性blobFileData的值的测试方法.
   */
  @Test
  public void testSetBlobFileData() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    byte[] blobFileData = new byte[] {0x32};

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("blobFileData"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setBlobFileData(blobFileData);

    //(B-2)
    Assert.assertEquals("设置属性blobFileData的值与设定内容一致：", blobFileData,
        (byte[]) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createDate的值的测试方法.
   */
  @Test
  public void testGetCreateDate() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String createDate = new java.lang.String("createDate");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("createDate"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, createDate);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性createDate的值与设定内容一致：", createDate,
        mdl.getCreateDate());
  }

  /**
   * 设置属性createDate的值的测试方法.
   */
  @Test
  public void testSetCreateDate() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String createDate = new java.lang.String("createDate");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateDate(createDate);

    //(B-2)
    Assert.assertEquals("设置属性createDate的值与设定内容一致：", createDate,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createTime的值的测试方法.
   */
  @Test
  public void testGetCreateTime() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String createTime = new java.lang.String("createTime");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("createTime"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, createTime);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性createTime的值与设定内容一致：", createTime,
        mdl.getCreateTime());
  }

  /**
   * 设置属性createTime的值的测试方法.
   */
  @Test
  public void testSetCreateTime() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String createTime = new java.lang.String("createTime");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("createTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCreateTime(createTime);

    //(B-2)
    Assert.assertEquals("设置属性createTime的值与设定内容一致：", createTime,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateDate的值的测试方法.
   */
  @Test
  public void testGetUpdateDate() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateDate = new java.lang.String("updateDate");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateDate"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateDate);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateDate的值与设定内容一致：", updateDate,
        mdl.getUpdateDate());
  }

  /**
   * 设置属性updateDate的值的测试方法.
   */
  @Test
  public void testSetUpdateDate() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateDate = new java.lang.String("updateDate");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateDate"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateDate(updateDate);

    //(B-2)
    Assert.assertEquals("设置属性updateDate的值与设定内容一致：", updateDate,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateTime的值的测试方法.
   */
  @Test
  public void testGetUpdateTime() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateTime = new java.lang.String("updateTime");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateTime"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateTime);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateTime的值与设定内容一致：", updateTime,
        mdl.getUpdateTime());
  }

  /**
   * 设置属性updateTime的值的测试方法.
   */
  @Test
  public void testSetUpdateTime() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateTime = new java.lang.String("updateTime");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateTime"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateTime(updateTime);

    //(B-2)
    Assert.assertEquals("设置属性updateTime的值与设定内容一致：", updateTime,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateUserId的值的测试方法.
   */
  @Test
  public void testGetUpdateUserId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateUserId = new java.lang.String("updateUserId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateUserId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateUserId的值与设定内容一致：", updateUserId,
        mdl.getUpdateUserId());
  }

  /**
   * 设置属性updateUserId的值的测试方法.
   */
  @Test
  public void testSetUpdateUserId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateUserId = new java.lang.String("updateUserId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateUserId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateUserId(updateUserId);

    //(B-2)
    Assert.assertEquals("设置属性updateUserId的值与设定内容一致：", updateUserId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性updateScreenId的值的测试方法.
   */
  @Test
  public void testGetUpdateScreenId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("updateScreenId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, updateScreenId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性updateScreenId的值与设定内容一致：", updateScreenId,
        mdl.getUpdateScreenId());
  }

  /**
   * 设置属性updateScreenId的值的测试方法.
   */
  @Test
  public void testSetUpdateScreenId() throws Exception {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("updateScreenId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setUpdateScreenId(updateScreenId);

    //(B-2)
    Assert.assertEquals("设置属性updateScreenId的值与设定内容一致：", updateScreenId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }

  /**
   * 返回MdlTblTest的字符串表示形式的测试方法.
   */
  @Test
  public void testToString() {
    MdlBlobFile mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlBlobFile();
    stringBuffer = new StringBuffer();
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null,");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    MdlBlobFile mdlAllCol = new MdlBlobFile();

    mdl = new MdlBlobFile();
    java.lang.String blobFileId = new java.lang.String("blobFileId");
    mdl.setBlobFileId(blobFileId);
    mdlAllCol.setBlobFileId(blobFileId);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getBlobFileId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String blobFileName = new java.lang.String("blobFileName");
    mdl.setBlobFileName(blobFileName);
    mdlAllCol.setBlobFileName(blobFileName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBlobFileName());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String blobFileType = new java.lang.String("blobFileType");
    mdl.setBlobFileType(blobFileType);
    mdlAllCol.setBlobFileType(blobFileType);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBlobFileType());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.math.BigDecimal blobFileSize = new java.math.BigDecimal("2017.10111");
    mdl.setBlobFileSize(blobFileSize);
    mdlAllCol.setBlobFileSize(blobFileSize);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBlobFileSize());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    byte[] blobFileData = new byte[] {0x32};
    mdl.setBlobFileData(blobFileData);
    mdlAllCol.setBlobFileData(blobFileData);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getBlobFileData());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setCreateDate(createDate);
    mdlAllCol.setCreateDate(createDate);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCreateDate());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setCreateTime(createTime);
    mdlAllCol.setCreateTime(createTime);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCreateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setUpdateDate(updateDate);
    mdlAllCol.setUpdateDate(updateDate);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdateDate());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setUpdateTime(updateTime);
    mdlAllCol.setUpdateTime(updateTime);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setUpdateUserId(updateUserId);
    mdlAllCol.setUpdateUserId(updateUserId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdateUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlBlobFile();
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setUpdateScreenId(updateScreenId);
    mdlAllCol.setUpdateScreenId(updateScreenId);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getUpdateScreenId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getBlobFileId()
        + "," + mdlAllCol.getBlobFileName()
        + "," + mdlAllCol.getBlobFileType()
        + "," + mdlAllCol.getBlobFileSize()
        + "," + mdlAllCol.getBlobFileData()
        + "," + mdlAllCol.getCreateDate()
        + "," + mdlAllCol.getCreateTime()
        + "," + mdlAllCol.getUpdateDate()
        + "," + mdlAllCol.getUpdateTime()
        + "," + mdlAllCol.getUpdateUserId()
        + "," + mdlAllCol.getUpdateScreenId()
        + "", mdlAllCol.toString());
  }


  /**
   * 通过键名获取值的测试方法.
   */
  @Test
  public void testGetValueByKey() {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileId = new java.lang.String("blobFileId");
    mdl.setBlobFileId(blobFileId);
    java.lang.String blobFileName = new java.lang.String("blobFileName");
    mdl.setBlobFileName(blobFileName);
    java.lang.String blobFileType = new java.lang.String("blobFileType");
    mdl.setBlobFileType(blobFileType);
    java.math.BigDecimal blobFileSize = new java.math.BigDecimal("2017.10111");
    mdl.setBlobFileSize(blobFileSize);
    byte[] blobFileData = new byte[] {0x32};
    mdl.setBlobFileData(blobFileData);
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setCreateDate(createDate);
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setCreateTime(createTime);
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setUpdateDate(updateDate);
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setUpdateTime(updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setUpdateUserId(updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setUpdateScreenId(updateScreenId);

    Assert.assertEquals(mdl.getBlobFileId(),
        mdl.getValueByKey(MdlBlobFile.BLOB_FILE_ID));
    Assert.assertEquals(mdl.getBlobFileName(),
        mdl.getValueByKey(MdlBlobFile.BLOB_FILE_NAME));
    Assert.assertEquals(mdl.getBlobFileType(),
        mdl.getValueByKey(MdlBlobFile.BLOB_FILE_TYPE));
    Assert.assertEquals(mdl.getBlobFileSize(),
        mdl.getValueByKey(MdlBlobFile.BLOB_FILE_SIZE));
    Assert.assertEquals(mdl.getBlobFileData(),
        mdl.getValueByKey(MdlBlobFile.BLOB_FILE_DATA));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey(MdlBlobFile.CREATE_DATE));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey(MdlBlobFile.CREATE_TIME));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey(MdlBlobFile.UPDATE_DATE));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey(MdlBlobFile.UPDATE_TIME));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey(MdlBlobFile.UPDATE_USER_ID));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey(MdlBlobFile.UPDATE_SCREEN_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlBlobFile mdl = new MdlBlobFile();
    java.lang.String blobFileId = new java.lang.String("blobFileId");
    mdl.setValueByKey(MdlBlobFile.BLOB_FILE_ID, blobFileId);
    java.lang.String blobFileName = new java.lang.String("blobFileName");
    mdl.setValueByKey(MdlBlobFile.BLOB_FILE_NAME, blobFileName);
    java.lang.String blobFileType = new java.lang.String("blobFileType");
    mdl.setValueByKey(MdlBlobFile.BLOB_FILE_TYPE, blobFileType);
    java.math.BigDecimal blobFileSize = new java.math.BigDecimal("2017.10111");
    mdl.setValueByKey(MdlBlobFile.BLOB_FILE_SIZE, blobFileSize);
    byte[] blobFileData = new byte[] {0x32};
    mdl.setValueByKey(MdlBlobFile.BLOB_FILE_DATA, blobFileData);
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setValueByKey(MdlBlobFile.CREATE_DATE, createDate);
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setValueByKey(MdlBlobFile.CREATE_TIME, createTime);
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setValueByKey(MdlBlobFile.UPDATE_DATE, updateDate);
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setValueByKey(MdlBlobFile.UPDATE_TIME, updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setValueByKey(MdlBlobFile.UPDATE_USER_ID, updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setValueByKey(MdlBlobFile.UPDATE_SCREEN_ID, updateScreenId);

    Assert.assertEquals(mdl.getBlobFileId(),
        mdl.getValueByKey( MdlBlobFile.BLOB_FILE_ID ));
    Assert.assertEquals(mdl.getBlobFileName(),
        mdl.getValueByKey( MdlBlobFile.BLOB_FILE_NAME ));
    Assert.assertEquals(mdl.getBlobFileType(),
        mdl.getValueByKey( MdlBlobFile.BLOB_FILE_TYPE ));
    Assert.assertEquals(mdl.getBlobFileSize(),
        mdl.getValueByKey( MdlBlobFile.BLOB_FILE_SIZE ));
    Assert.assertEquals(mdl.getBlobFileData(),
        mdl.getValueByKey( MdlBlobFile.BLOB_FILE_DATA ));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey( MdlBlobFile.CREATE_DATE ));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey( MdlBlobFile.CREATE_TIME ));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey( MdlBlobFile.UPDATE_DATE ));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey( MdlBlobFile.UPDATE_TIME ));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey( MdlBlobFile.UPDATE_USER_ID ));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey( MdlBlobFile.UPDATE_SCREEN_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlBlobFileTest.class.getDeclaredMethods();
    Method[] methods = MdlBlobFile.class.getDeclaredMethods();
    ArrayList<Method> error = new ArrayList<Method>();

    HashMap<String, String> map = new HashMap<String, String>();
    for (Method method : testMethods) {
      System.out.println("测试方法：" + method);
      String name = method.getName();
      if (name.startsWith("test")) {
        map.put(name, name.substring(5));
      }
    }
    for (Method method : methods) {
      System.out.print("方法：" + method);
      if (((method.getModifiers() & Modifier.PUBLIC) != 0)
          || ((method.getModifiers() & Modifier.PROTECTED) != 0)) {
        String name = method.getName();

        String testName = "test" + name.substring(0, 1).toUpperCase() + name.substring(1);
        String check = map.get(testName);
        System.out.println(" " + check);
        if (check == null || check.length() <= 0) {
          error.add(method);
        }
      }
    }
    if (error.size() > 0) {
      Assert.fail("请追加对于方法「" + error + "」的测试方法！");
    }
  }
}
