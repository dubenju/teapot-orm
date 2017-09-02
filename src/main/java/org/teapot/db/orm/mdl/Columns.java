package org.teapot.db.orm.mdl;

import java.util.ArrayList;

/**
 * field list.
 * @author DBJ
 *
 */
public class Columns implements IClause {
  public static final int ALL = 1;
  public static final int DISTINCT = 2;

  private int opt = Columns.ALL;
  private ArrayList<Column> columns = new ArrayList<Column>();

  public Columns() {
    this(Columns.ALL);
  }

  /**
   *  Columns.
   * @param option 选项。
   */
  public Columns(int option) {
    if (option < 1 || option > 2) {
      opt = Columns.ALL;
    } else {
      opt = option;
    }
  }

  /**
   * getColumns.
   * @return 字段
   */
  public String getColumns() {
    StringBuffer buf = new StringBuffer();
    buf.append(this.opt == Columns.DISTINCT ? " DISTINCT " : " ALL ");
    int max  = this.columns.size();
    if (max == 0) {
      buf.append(" * ");
    }
    for (int idx = 0; idx < max; ) {
      buf.append(this.columns.get(idx));
      idx ++;
      if (idx < max) {
        buf.append(", ");
      }
    }
    return buf.toString();
  }

  public Columns add(String col) {
    this.columns.add(new Column(col));
    return this;
  }

  public Columns add(String col, String ali) {
    this.columns.add(new Column(col, ali));
    return this;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.getColumns();
  }
}
