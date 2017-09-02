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
 * 表category的JavaBean类的JUnit测试类.
 * @author dubenju@126.com
 *     这份代码最初是由TeapotOrmGen于2017/08/13 15:39:57.446 +0900自动生成的。
 */
public class MdlCategoryTest {

  /**
   * 获取表的名称的测试方法.
   */
  @Test
  public void testGetTblName() {
    Assert.assertEquals("获取的表名称与设定值一致：", "CATEGORY", MdlCategory.getTblName() );
  }

  /* *************************************************
   * 构造函数
   * *************************************************/
  /**
   * 构造函数的测试方法.
   */
  @Test
  public void testMdlCategory() {
  }

  /* *************************************************
   * 方法
   * *************************************************/
  /**
   * 返回属性categoryId的值的测试方法.
   */
  @Test
  public void testGetCategoryId() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryId = new java.lang.String("categoryId");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryId"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, categoryId);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性categoryId的值与设定内容一致：", categoryId,
        mdl.getCategoryId());
  }

  /**
   * 设置属性categoryId的值的测试方法.
   */
  @Test
  public void testSetCategoryId() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryId = new java.lang.String("categoryId");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryId"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCategoryId(categoryId);

    //(B-2)
    Assert.assertEquals("设置属性categoryId的值与设定内容一致：", categoryId,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性categoryName的值的测试方法.
   */
  @Test
  public void testGetCategoryName() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryName = new java.lang.String("categoryName");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryName"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, categoryName);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性categoryName的值与设定内容一致：", categoryName,
        mdl.getCategoryName());
  }

  /**
   * 设置属性categoryName的值的测试方法.
   */
  @Test
  public void testSetCategoryName() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryName = new java.lang.String("categoryName");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryName"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCategoryName(categoryName);

    //(B-2)
    Assert.assertEquals("设置属性categoryName的值与设定内容一致：", categoryName,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性categoryOrder的值的测试方法.
   */
  @Test
  public void testGetCategoryOrder() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryOrder = new java.lang.String("categoryOrder");

    //(A-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryOrder"); //(1)
    nameField.setAccessible(true);  //(2)
    nameField.set(mdl, categoryOrder);  //(3)

    //(A-2)
    Assert.assertEquals("获取属性categoryOrder的值与设定内容一致：", categoryOrder,
        mdl.getCategoryOrder());
  }

  /**
   * 设置属性categoryOrder的值的测试方法.
   */
  @Test
  public void testSetCategoryOrder() throws Exception {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryOrder = new java.lang.String("categoryOrder");

    //(B-1)
    Field nameField = mdl.getClass().getDeclaredField("categoryOrder"); //(1)
    nameField.setAccessible(true);  //(2)
    mdl.setCategoryOrder(categoryOrder);

    //(B-2)
    Assert.assertEquals("设置属性categoryOrder的值与设定内容一致：", categoryOrder,
        (java.lang.String) nameField.get(mdl));  //(3)
  }
  /**
   * 返回属性createDate的值的测试方法.
   */
  @Test
  public void testGetCreateDate() throws Exception {
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = new MdlCategory();
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
    MdlCategory mdl = null;
    StringBuffer stringBuffer = null;
    mdl = new MdlCategory();
    stringBuffer = new StringBuffer();
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

    MdlCategory mdlAllCol = new MdlCategory();

    mdl = new MdlCategory();
    java.lang.String categoryId = new java.lang.String("categoryId");
    mdl.setCategoryId(categoryId);
    mdlAllCol.setCategoryId(categoryId);
    stringBuffer = new StringBuffer();
    stringBuffer.append(mdl.getCategoryId());
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

    mdl = new MdlCategory();
    java.lang.String categoryName = new java.lang.String("categoryName");
    mdl.setCategoryName(categoryName);
    mdlAllCol.setCategoryName(categoryName);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCategoryName());
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

    mdl = new MdlCategory();
    java.lang.String categoryOrder = new java.lang.String("categoryOrder");
    mdl.setCategoryOrder(categoryOrder);
    mdlAllCol.setCategoryOrder(categoryOrder);
    stringBuffer = new StringBuffer();
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append(mdl.getCategoryOrder());
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

    mdl = new MdlCategory();
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

    mdl = new MdlCategory();
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

    mdl = new MdlCategory();
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
    stringBuffer.append(mdl.getUpdateDate());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlCategory();
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
    stringBuffer.append(mdl.getUpdateTime());
    stringBuffer.append(",");
    stringBuffer.append("null");
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlCategory();
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
    stringBuffer.append(mdl.getUpdateUserId());
    stringBuffer.append(",");
    stringBuffer.append("null");
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());

    mdl = new MdlCategory();
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
    stringBuffer.append(mdl.getUpdateScreenId());
    Assert.assertEquals(stringBuffer.toString(), mdl.toString());
    Assert.assertEquals(mdlAllCol.getCategoryId()
        + "," + mdlAllCol.getCategoryName()
        + "," + mdlAllCol.getCategoryOrder()
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
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryId = new java.lang.String("categoryId");
    mdl.setCategoryId(categoryId);
    java.lang.String categoryName = new java.lang.String("categoryName");
    mdl.setCategoryName(categoryName);
    java.lang.String categoryOrder = new java.lang.String("categoryOrder");
    mdl.setCategoryOrder(categoryOrder);
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

    Assert.assertEquals(mdl.getCategoryId(),
        mdl.getValueByKey(MdlCategory.CATEGORY_ID));
    Assert.assertEquals(mdl.getCategoryName(),
        mdl.getValueByKey(MdlCategory.CATEGORY_NAME));
    Assert.assertEquals(mdl.getCategoryOrder(),
        mdl.getValueByKey(MdlCategory.CATEGORY_ORDER));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey(MdlCategory.CREATE_DATE));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey(MdlCategory.CREATE_TIME));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey(MdlCategory.UPDATE_DATE));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey(MdlCategory.UPDATE_TIME));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey(MdlCategory.UPDATE_USER_ID));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey(MdlCategory.UPDATE_SCREEN_ID));

  }
  /**
   * 通过键名设置值的测试方法.
   */
  @Test
  public void testSetValueByKey() {
    MdlCategory mdl = new MdlCategory();
    java.lang.String categoryId = new java.lang.String("categoryId");
    mdl.setValueByKey(MdlCategory.CATEGORY_ID, categoryId);
    java.lang.String categoryName = new java.lang.String("categoryName");
    mdl.setValueByKey(MdlCategory.CATEGORY_NAME, categoryName);
    java.lang.String categoryOrder = new java.lang.String("categoryOrder");
    mdl.setValueByKey(MdlCategory.CATEGORY_ORDER, categoryOrder);
    java.lang.String createDate = new java.lang.String("createDate");
    mdl.setValueByKey(MdlCategory.CREATE_DATE, createDate);
    java.lang.String createTime = new java.lang.String("createTime");
    mdl.setValueByKey(MdlCategory.CREATE_TIME, createTime);
    java.lang.String updateDate = new java.lang.String("updateDate");
    mdl.setValueByKey(MdlCategory.UPDATE_DATE, updateDate);
    java.lang.String updateTime = new java.lang.String("updateTime");
    mdl.setValueByKey(MdlCategory.UPDATE_TIME, updateTime);
    java.lang.String updateUserId = new java.lang.String("updateUserId");
    mdl.setValueByKey(MdlCategory.UPDATE_USER_ID, updateUserId);
    java.lang.String updateScreenId = new java.lang.String("updateScreenId");
    mdl.setValueByKey(MdlCategory.UPDATE_SCREEN_ID, updateScreenId);

    Assert.assertEquals(mdl.getCategoryId(),
        mdl.getValueByKey( MdlCategory.CATEGORY_ID ));
    Assert.assertEquals(mdl.getCategoryName(),
        mdl.getValueByKey( MdlCategory.CATEGORY_NAME ));
    Assert.assertEquals(mdl.getCategoryOrder(),
        mdl.getValueByKey( MdlCategory.CATEGORY_ORDER ));
    Assert.assertEquals(mdl.getCreateDate(),
        mdl.getValueByKey( MdlCategory.CREATE_DATE ));
    Assert.assertEquals(mdl.getCreateTime(),
        mdl.getValueByKey( MdlCategory.CREATE_TIME ));
    Assert.assertEquals(mdl.getUpdateDate(),
        mdl.getValueByKey( MdlCategory.UPDATE_DATE ));
    Assert.assertEquals(mdl.getUpdateTime(),
        mdl.getValueByKey( MdlCategory.UPDATE_TIME ));
    Assert.assertEquals(mdl.getUpdateUserId(),
        mdl.getValueByKey( MdlCategory.UPDATE_USER_ID ));
    Assert.assertEquals(mdl.getUpdateScreenId(),
        mdl.getValueByKey( MdlCategory.UPDATE_SCREEN_ID ));

  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = MdlCategoryTest.class.getDeclaredMethods();
    Method[] methods = MdlCategory.class.getDeclaredMethods();
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
