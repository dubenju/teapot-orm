package org.teapot.db.orm.mdl;

import org.teapot.db.orm.IConv;

import java.sql.Connection;

public class Query implements IClause{

  private String sqlCmd;

  /**
   * Query.
   * @param sql String
   * @param cond Condition
   * @param conv IConv
   * @param con Connection
   */
  public Query(String sql, Condition cond, IConv conv, Connection con) {
    this.sqlCmd = sql;
  }


  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.sqlCmd;
  }

//  /**
//   * go.
//   * @return 数据。
//   */
//  public <T extends IKeyValue> List<T> go() {
//    long time1 = 0;
//    long time2 = 0;
//    List<T> result = new ArrayList<T>();
//    PreparedStatement stmt = null;
//    ResultSet rs = null;
//    try {
//      stmt = this.conn.prepareStatement(sqlCmd);
//      if (this.condition != null) {
//        List<?> values = this.condition.getValues();
//        System.out.println("条件字段的个数：" + values.size());
//        int id3 = 0;
//        int maxLength = values.size();
//        stmt.setObject(maxLength, null);
//        while (id3 < maxLength) {
//          Object value = (Object) values.get(id3);
//          id3 ++;
//          stmt.setObject(id3, value);
//        }
//      }
//
//      time1 = System.currentTimeMillis();
//      rs = stmt.executeQuery();
//      time2 = System.currentTimeMillis();
//      while (rs.next()) {
//        T obj = null;
//        try {
//          // Test test = (Test)Class.forname("org.example.Test").newInstance();
//          obj = (T) cls.newInstance();
//        } catch (InstantiationException e1) {
//          e1.printStackTrace();
//        } catch (IllegalAccessException e1) {
//          e1.printStackTrace();
//        }
//        for (int i = 0; i < maxLen; i ++) {
//          MdlColumn column = cols.get(i);
//          this.iconv.conv2Mdl(column, rs, obj);
//        }
//
//        result.add(obj);
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//      throw e;
//    } finally {
//      if (rs != null) {
//        try {
//          rs.close();
//        } catch (SQLException e) {
//          e.printStackTrace();
//        }
//      }
//      if (stmt != null) {
//        try {
//          stmt.close();
//        } catch (SQLException e) {
//          e.printStackTrace();
//        }
//      }
//    }
//    return result;
//  }
}
