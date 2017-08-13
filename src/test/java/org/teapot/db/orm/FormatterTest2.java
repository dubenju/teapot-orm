package org.teapot.db.orm;

public class FormatterTest2 {

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    System.out.println(Formatter.INSTANCE.fmtVar(null));
    System.out.println(Formatter.INSTANCE.fmtVar(""));
    System.out.println(Formatter.INSTANCE.fmtVar("a"));
    System.out.println(Formatter.INSTANCE.fmtVar("a_b"));
    System.out.println(Formatter.INSTANCE.fmtVar("_b"));
  }

}
