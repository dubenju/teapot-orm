package org.teapot.db.orm;

import org.teapot.db.orm.mdl.MdlColumn;

import java.sql.SQLException;

public interface IConv {
  public IConv getInstance();

  public Object conv2Mdl(MdlColumn col, java.sql.Wrapper rs, IKeyValue obj) throws SQLException ;

  public Object conv2Db( java.sql.Wrapper rs, int index, MdlColumn col, IKeyValue obj)
      throws SQLException ;
}
