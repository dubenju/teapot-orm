package org.teapot.db.orm.mdl;

import java.util.ArrayList;

public class From implements IClause {
  private ArrayList<Table> tables = new ArrayList<Table>();

  public From(String tbl) {
    this(tbl, tbl);
  }

  public From(String tbl, String als) {
    this.tables.add(new Table(tbl, als));
  }

  public From inner(String tbl, String als) {
    this.tables.add(new Table(tbl, als));
    return this;
  }

  public From left(String tbl, String als) {
    this.tables.add(new Table(tbl, als));
    return this;
  }

  public From right(String tbl, String als) {
    this.tables.add(new Table(tbl, als));
    return this;
  }

  public From full(String tbl, String als) {
    this.tables.add(new Table(tbl, als));
    return this;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    int max = this.tables.size();
    int idx = 0;
    while (idx < max) {
      buf.append(this.tables.get(idx));
      idx ++;
    }
    return buf.toString();
  }
}
