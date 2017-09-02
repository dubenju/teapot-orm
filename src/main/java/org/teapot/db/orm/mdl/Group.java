package org.teapot.db.orm.mdl;

import java.util.ArrayList;

public class Group implements IClause {
  private ArrayList<String> cols = new ArrayList<String>();
  /*
   * GROUP BY
   * {
   *     column-Name [ , column-Name ]*
   * |
   *     ROLLUP ( column-Name [ , column-Name ]* )
   * }
   *
   * MYSQL
     *     [GROUP BY {col_name | expr | position}
     *       [ASC | DESC], ... [WITH ROLLUP]]
   */
  public Group(String col) {
    this.cols.add(col);
  }

  public Group by(String col) {
    this.cols.add(col);
    return this;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    int max = this.cols.size();
    int idx = 0;
    while (idx < max) {
      buf.append(this.cols.get(idx));
      idx ++;
      if (idx < max) {
        buf.append(",");
      }
    }
    return buf.toString();
  }
}
