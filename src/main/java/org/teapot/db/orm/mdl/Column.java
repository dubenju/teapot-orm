package org.teapot.db.orm.mdl;

public class Column {
  private String name;
  private String alias;

  public Column(String col) {
    this(col, col);
  }

  /**
   * 构造函数.
   * @param col 字段名
   * @param ali 别名，在别名中是不能包含点的(Mysql)
   */
  public Column(String col,String ali) {
    this.name = col;
    System.out.println("别名=" + ali);
    String[] alias = ali.split("\\.");
    this.alias = alias[alias.length - 1];
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.name);
    buf.append(" AS ");
    buf.append(this.alias);
    return buf.toString();
  }
}
