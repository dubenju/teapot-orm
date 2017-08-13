package org.teapot.db;

public class TeapotDbTest2 {
  static {
//    System.out.println(Object.class.getResource("").getPath());
  }

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
//    System.out.println(Object.class.getResource("").getPath());
    System.out.println(TeapotDb.class.getResource("").getPath());
    /* IDE环境下的“user.dir”为当前工程的根目录,而当使用java脚本启动java程序时，“user.dir”是java程序启动的当前目录 */
    System.out.println("user.dir path: " + System.getProperty("user.dir"));

    System.out.println(System.getProperty("jdbc.drivers"));

  }

}
