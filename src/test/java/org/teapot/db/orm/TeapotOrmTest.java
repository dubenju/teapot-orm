package org.teapot.db.orm;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

public class TeapotOrmTest {

  @Test
  public void testGetTableInfo() {
    TeapotOrm.INSTANCE.getTableInfo();
  }

  @Test
  public void testGetTable() {
    TeapotOrm.INSTANCE.getTable(null);
    TeapotOrm.INSTANCE.getTable("");
    TeapotOrm.INSTANCE.getTable("a");
  }

  @Test
  public void testInsert() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testSelect() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testUpdate() {
    Assert.fail("Not yet implemented");
  }

  @Test
  public void testDelete() {
    Assert.fail("Not yet implemented");
  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = TeapotOrmTest.class.getDeclaredMethods();
    Method[] methods = TeapotOrm.class.getDeclaredMethods();
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
