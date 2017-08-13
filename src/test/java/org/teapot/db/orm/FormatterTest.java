package org.teapot.db.orm;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

public class FormatterTest {

  @Test
  public void testValues() {
  }

  @Test
  public void testValueOf() {
  }

  @Test
  public void testFmtVar() {
    Assert.assertNull(Formatter.INSTANCE.fmtVar(null));
    Assert.assertEquals("", Formatter.INSTANCE.fmtVar(""));
    Assert.assertEquals("a", Formatter.INSTANCE.fmtVar("a"));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmtVar("a_b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtVar("_b"));
    Assert.assertEquals("b", Formatter.INSTANCE.fmtVar("b_"));
    Assert.assertEquals("", Formatter.INSTANCE.fmtVar("__"));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmtVar("a__b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtVar("__b"));
    Assert.assertEquals("b", Formatter.INSTANCE.fmtVar("b__"));

    Assert.assertEquals("a", Formatter.INSTANCE.fmtVar("A"));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmtVar("A_B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtVar("_B"));
    Assert.assertEquals("b", Formatter.INSTANCE.fmtVar("B_"));
    Assert.assertEquals("", Formatter.INSTANCE.fmtVar("__"));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmtVar("A__B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtVar("__B"));
    Assert.assertEquals("b", Formatter.INSTANCE.fmtVar("B__"));
  }

  @Test
  public void testFmtFun() {
    Assert.assertNull(Formatter.INSTANCE.fmtFun(null));
    Assert.assertEquals("", Formatter.INSTANCE.fmtFun(""));
    Assert.assertEquals("A", Formatter.INSTANCE.fmtFun("a"));
    Assert.assertEquals("AB", Formatter.INSTANCE.fmtFun("a_b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("_b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("b_"));
    Assert.assertEquals("", Formatter.INSTANCE.fmtFun("__"));
    Assert.assertEquals("AB", Formatter.INSTANCE.fmtFun("a__b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("__b"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("b__"));

    Assert.assertEquals("A", Formatter.INSTANCE.fmtFun("A"));
    Assert.assertEquals("AB", Formatter.INSTANCE.fmtFun("A_B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("_B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("B_"));
    Assert.assertEquals("", Formatter.INSTANCE.fmtFun("__"));
    Assert.assertEquals("AB", Formatter.INSTANCE.fmtFun("A__B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("__B"));
    Assert.assertEquals("B", Formatter.INSTANCE.fmtFun("B__"));
  }

  @Test
  public void testFmt() {
    Assert.assertNull(Formatter.INSTANCE.fmt(null, null, 0));
    Assert.assertEquals("", Formatter.INSTANCE.fmt("", null, 0));
    Assert.assertEquals("", Formatter.INSTANCE.fmt("", null, 1));
    Assert.assertEquals("", Formatter.INSTANCE.fmt("", "", 1));
    Assert.assertEquals("a", Formatter.INSTANCE.fmt("a", "", 1));
    Assert.assertEquals("", Formatter.INSTANCE.fmt("", "0", -1));
    Assert.assertEquals("", Formatter.INSTANCE.fmt("", "0", 0));
    Assert.assertEquals("0", Formatter.INSTANCE.fmt("", "0", 1));
    Assert.assertEquals("00", Formatter.INSTANCE.fmt("", "0", 2));
    Assert.assertEquals("a", Formatter.INSTANCE.fmt("a", "0", -1));
    Assert.assertEquals("a", Formatter.INSTANCE.fmt("a", "0", 0));
    Assert.assertEquals("a", Formatter.INSTANCE.fmt("a", "0", 1));
    Assert.assertEquals("0a", Formatter.INSTANCE.fmt("a", "0", 2));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmt("aB", "0", -1));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmt("aB", "0", 0));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmt("aB", "0", 1));
    Assert.assertEquals("aB", Formatter.INSTANCE.fmt("aB", "0", 2));
    Assert.assertEquals("0aB", Formatter.INSTANCE.fmt("aB", "0", 3));
  }

  @Test
  public void testUpper() {
    Assert.assertEquals(null, Formatter.INSTANCE.upper(null));
    Assert.assertEquals("A", Formatter.INSTANCE.upper("a"));
    Assert.assertEquals("B", Formatter.INSTANCE.upper("B"));
  }

  @Test
  public void testLower() {
    Assert.assertEquals(null, Formatter.INSTANCE.lower(null));
    Assert.assertEquals("a", Formatter.INSTANCE.lower("a"));
    Assert.assertEquals("b", Formatter.INSTANCE.lower("B"));
  }

  /**
   * 检查是否有遗漏.
   */
  @AfterClass
  public static void checkAll() {
    Method[] testMethods = FormatterTest.class.getDeclaredMethods();
    Method[] methods = Formatter.class.getDeclaredMethods();
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
