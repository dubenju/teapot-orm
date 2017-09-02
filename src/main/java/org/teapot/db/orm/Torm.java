package org.teapot.db.orm;

/**
 * Torm.
 * 因为是单实例，所以在这个类中不能存储线程的信息。
 * 为此，引入Context的话，显着有些累赘。
 * 做成抽象类，在pojo中的话，pojo就不单纯了。
 * @author DBJ
 *
 */
public class Torm {
  private static volatile Torm INSTANCE;

  private Torm() {

  }

  /**
   * getInstance.
   * @return Torm
   */
  public static Torm getInstance() {
    if (Torm.INSTANCE == null) {
      synchronized (Torm.class) {
        if (Torm.INSTANCE == null) {
          Torm.INSTANCE = new Torm();
        }
      }
    }
    return Torm.INSTANCE;
  }

  /**
   * select.
   * @param args String[]
   * @return Torm
   */
  public static Torm select(String... args) {
    System.out.println("SELECT");
    for (int i = 0, size = args.length; i < size; i ++) {
      String arg = args[i];
      System.out.println("arg=" + arg);
    }

    return Torm.getInstance();
  }

  public Torm from() {
    System.out.println(" FROM ");
    return Torm.getInstance();
  }
}
