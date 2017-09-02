package org.teapot.db.orm.mdl;

public class ColumnsTest2 {

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    System.out.println(new Columns().getColumns());

    Columns cols = new Columns();
    cols.add(MdlTblMsg.USER_ID);
    cols.add("COUNT(*)", "CNT");
    System.out.println(cols.getColumns());

  }

}
