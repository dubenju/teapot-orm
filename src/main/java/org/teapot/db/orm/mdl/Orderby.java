package org.teapot.db.orm.mdl;

import org.teapot.db.orm.util.UModelConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * order clause
 * ORDER BY 子句.
 * @author DBJ
 *
 */
public class Orderby implements IClause {
  /*
   * ORDER BY { column-Name | ColumnPosition | Expression }
   *     [ ASC | DESC ]
   *     [ NULLS FIRST | NULLS LAST ] mysql 没有这功能
   *
   *     [ , column-Name | ColumnPosition | Expression
   *     [ ASC | DESC ]
   *     [ NULLS FIRST | NULLS LAST ]
   *     ] *
   */
  private ArrayList<OptOrder> orderby = new ArrayList<OptOrder>();

  public Orderby(String col) {
    this(col, UModelConstant.SORT_ASC);
  }

  public Orderby(String col, int orde) {
    this.orderby.add(new OptOrder(col, orde));
  }

  public Orderby asc(String col) {
    this.orderby.add(new OptOrder(col, UModelConstant.SORT_ASC));
    return this;
  }

  public Orderby dsc(String col) {
    this.orderby.add(new OptOrder(col, UModelConstant.SORT_DSC));
    return this;
  }

  /**
   * order.
   * @param col 字段名
   * @return 自身
   * @deprecated 建议使用asc dsc.
   */
  public Orderby order(String col) {
    this.orderby.add(new OptOrder(col));
    return this;
  }

  /**
   * order.
   * @param col 字段名
   * @param orde 排序
   * @return 自身
   * @deprecated 建议使用asc dsc.
   */
  public Orderby order(String col, int orde) {
    this.orderby.add(new OptOrder(col, orde));
    return this;
  }

  public List<OptOrder> orderby() {
    return this.orderby;
  }
}
