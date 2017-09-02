package org.teapot.db.orm.mdl;

public class Table {
  private String tableExpr;
  /*
   * 当使用别名时，在其他子句中就不能再使用表名了。Mysql
   */
  private String alias;

  public Table(String tbl) {
    this(tbl,  "");
  }

  public Table(String tbl, String als) {
    this.tableExpr = tbl;
    this.alias = als;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(" ");
    buf.append(this.tableExpr);
    buf.append(" ");
    buf.append(this.alias);
    buf.append(" ");
    return buf.toString();
  }
}
