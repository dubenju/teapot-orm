package org.teapot.db.orm;

import org.teapot.db.orm.mdl.MdlColumn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Wrapper;

public class DefConv implements IConv {
  private static volatile DefConv instance;

  @Override
  public Object conv2Mdl(MdlColumn column, java.sql.Wrapper wrap, IKeyValue obj)
      throws SQLException {
    ResultSet rs = (ResultSet) wrap;
    if ("java.lang.Long".equals(column.getTypeNameJava())) {
      obj.set(column.getTableName() + "." + column.getColumnName(),
          rs.getLong(column.getColumnName()));
    } else {
      obj.set(column.getTableName() + "." + column.getColumnName(),
          rs.getObject(column.getColumnName()));
    }
    return null;
  }

  @Override
  public IConv getInstance() {
    if (DefConv.instance == null) {
      synchronized (DefConv.class) {
        if (DefConv.instance == null) {
          DefConv.instance = new DefConv();
        }
      }
    }
    return DefConv.instance;
  }

  @Override
  public Object conv2Db(Wrapper wrap, int index, MdlColumn col, IKeyValue obj)
      throws SQLException {
    PreparedStatement stmt = (PreparedStatement) wrap;
    stmt.setObject(index,
        obj.get(col.getTableName() + "." + col.getColumnName()));
    return null;
  }

}
