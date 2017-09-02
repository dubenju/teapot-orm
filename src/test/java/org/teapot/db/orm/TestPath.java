package org.teapot.db.orm;

public class TestPath {

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    System.out.println("user.dir path: " + System.getProperty("user.dir"));
    System.out.println("path: " + TeapotOrmGen.class.getResource(""));
    // null
    System.out.println("path: " + TeapotOrmGen.class.getResource("./"));
    System.out.println("path: " + TeapotOrmGen.class.getClassLoader().getResource(""));
    System.out.println("path: " + ClassLoader.getSystemResource(""));
    System.out.println("path: " + Thread.currentThread().getContextClassLoader().getResource(""));
  }

}
