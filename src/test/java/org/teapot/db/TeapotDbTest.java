package org.teapot.db;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class TeapotDbTest {

  @Test
  public void testGetInstance() {
    // 单实例
    Assert.assertSame(TeapotDb.getInstance(), TeapotDb.getInstance());
  }

  @Test
  public void testInit() {
    TeapotDb.getInstance().init();
  }

  @Test
  public void testGetConnection() {
    Connection dbConn = TeapotDb.getInstance().getConnection();
    Assert.assertNotNull(dbConn);
    try {
      Assert.assertFalse(dbConn.isClosed());
      TeapotDb.getInstance().releaseConnection(dbConn);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testReleaseConnection() {
    Connection dbConn = TeapotDb.getInstance().getConnection();
    try {
      TeapotDb.getInstance().releaseConnection(dbConn);
      Assert.assertTrue(dbConn.isClosed());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testGetDbType() {
    TeapotDb.getInstance().init();
    Assert.assertEquals("sqlite", TeapotDb.getInstance().getDbType());
  }


  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = TeapotDbTest.class.getDeclaredMethods();
    Method[] methods = TeapotDb.class.getDeclaredMethods();
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
//      System.out.print(Modifier.toString(method.getModifiers()));
      System.out.print("方法：" + method);
      if (((method.getModifiers() & Modifier.PUBLIC) != 0)
          || ((method.getModifiers() & Modifier.PROTECTED) != 0)) {
        String name = method.getName();
//        System.out.print(" " + name);

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
