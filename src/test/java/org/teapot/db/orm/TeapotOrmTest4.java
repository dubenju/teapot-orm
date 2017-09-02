package org.teapot.db.orm;

import org.teapot.db.orm.mdl.Columns;
import org.teapot.db.orm.mdl.Condition;
import org.teapot.db.orm.mdl.From;
import org.teapot.db.orm.mdl.Group;
import org.teapot.db.orm.mdl.Hav;
import org.teapot.db.orm.mdl.IClause;
import org.teapot.db.orm.mdl.MdlTblTest;
import org.teapot.db.orm.mdl.Orderby;
import org.teapot.db.orm.mdl.Query;

import java.sql.SQLException;

public class TeapotOrmTest4 {

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    /* select * from table where condition order by */
    IClause cols = new Columns()
        .add(MdlTblTest.TEST_ID)
        .add("COUNT(*)", "COUNT");
    IClause from = new From(MdlTblTest.TBL_TEST, "");
    IClause cond = new Condition()
        .where(MdlTblTest.TEST_ID, Condition.LIKE, "%9%");
    IClause groupby = new Group(MdlTblTest.TEST_ID);
    IClause having = new Hav();
    IClause orderby = new Orderby(MdlTblTest.TEST_ID);

    try {
      Query query = TeapotOrm.INSTANCE.select(
          MdlTblTest.TBL_TEST, MdlTblTest.class, cols, from, cond, groupby, having, orderby);
      System.out.println(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
