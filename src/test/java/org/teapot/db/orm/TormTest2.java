package org.teapot.db.orm;

public class TormTest2 {
  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    /*
     * SELECT
     *   DISTINCT COLUMN AS ALIAS
     * FROM
     *   TABLE VIEW
     * JOIN
     * ON
     * WHERE
     * GROUP BY
     * ORDER BY;
     */
    Torm.select().from();
    Torm.select().from();
    Torm.select("1").from();

  }

}
