/*
 * Copyright (C) 2017 dubenju@126.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teapot.db.orm;

import org.teapot.db.orm.mdl.Condition;
import org.teapot.db.orm.mdl.MdlColumn;
import org.teapot.db.orm.mdl.MdlIndex;
import org.teapot.db.orm.mdl.MdlPrimaryKey;
import org.teapot.db.orm.mdl.MdlTable;
import org.teapot.db.orm.mdl.OptOrder;
import org.teapot.db.orm.util.UModel;
import org.teapot.db.orm.util.UModelConstant;
import org.teapot.db.TeapotDb;
import org.teapot.db.TypeJavaDb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;



/**
 * 对象关系映射类。
 * @author dubenju@126.com
 */
public enum TeapotOrm {
  INSTANCE;
  private Map<String, MdlTable> tblInfo = new ConcurrentHashMap<String, MdlTable>();

  /**
   * getTableNamePattern.
   * @param meta DatabaseMetaData
   * @return String
   * @throws SQLException 处理过程中发生的异常。
   */
  private String getTableNamePattern(DatabaseMetaData meta)
      throws SQLException {
    String prod = meta.getDatabaseProductName();
    if (prod.equalsIgnoreCase("mysql")) {
      int major = meta.getDriverMajorVersion();
      if (major == 6) {
        return "%";
      }
    }
    return null;
  }

  /**
   * 通过MetaData获取表信息.
   * @return 表信息。
   */
  public List<MdlTable> getTableInfo() {
    System.out.println("------------------getTableInfo():" + tblInfo);
    Connection conn = null;
    List<MdlTable> tables = new ArrayList<MdlTable>();
    try {
      TeapotDb.getInstance().init();

      // connect to the 'sample' database
      conn = TeapotDb.getInstance().getConnection();
      DatabaseMetaData dbmd = conn.getMetaData();
      System.out.println(dbmd);

      String namePattern = getTableNamePattern(dbmd);
      System.out.println("namePattern=" + namePattern);

      String catalog = conn.getCatalog();
      System.out.println("catalog=" + catalog);

      System.out.println("namePattern=" + namePattern);
      System.out.println("数据库已知的用户: " + dbmd.getUserName());
      System.out.println("数据库的系统函数的逗号分隔列表: " + dbmd.getSystemFunctions());
      System.out.println("数据库的时间和日期函数的逗号分隔列表: " + dbmd.getTimeDateFunctions());
      System.out.println("数据库的字符串函数的逗号分隔列表: " + dbmd.getStringFunctions());
      String schema = conn.getSchema();
      System.out.println("schema=" + schema);
      System.out.println("数据库供应商用于 'schema' 的首选术语: " + dbmd.getSchemaTerm());
      System.out.println("数据库URL: " + dbmd.getURL());
      System.out.println("是否允许只读:" + dbmd.isReadOnly());
      System.out.println("数据库的产品名称:" + dbmd.getDatabaseProductName());
      System.out.println("数据库的版本:" + dbmd.getDatabaseProductVersion());
      System.out.println("驱动程序的名称:" + dbmd.getDriverName());
      System.out.println("驱动程序的版本:" + dbmd.getDriverVersion());

      // 获取表信息
      ResultSet rs = dbmd.getTables(catalog, schema, namePattern, new String[] { "TABLE", "VIEW" });
      while (rs.next()) {
        String tblcat  = rs.getString("TABLE_CAT"); // 表类别(可为null)表所在的编目(可能为空)
        // 表模式（可能为空）,在oracle中获取的是命名空间,其它数据库未知 表所在的模式(可能为空)
        String tblsch  = rs.getString("TABLE_SCHEM");
        String name    = rs.getString("TABLE_NAME");// 表名
        // 表类型,典型的类型是 "TABLE"、"VIEW"、"SYSTEM TABLE"、"GLOBAL TEMPORARY"、
        // "LOCAL TEMPORARY"、"ALIAS" 和 "SYNONYM"。
        String tbltype = rs.getString("TABLE_TYPE");
        String remarks = rs.getString("REMARKS");// 表备注
        String typecat = rs.getString("TYPE_CAT"); // 编目类型(may be null)
        String typesch = rs.getString("TYPE_SCHEM"); // 模式类型(may be null)
        String typenam = rs.getString("TYPE_NAME"); // 类型名称(may be null)
        // name of the designated "identifier" column of a typed table (may be null)
        String srcolnm = rs.getString("SELF_REFERENCING_COL_NAME");
        // specifies how values in SELF_REFERENCING_COL_NAME are created.
        String refg    = rs.getString("REF_GENERATION");

        MdlTable tbl = new MdlTable();
        tbl.setTableCat(tblcat);
        tbl.setTypeSchem(tblsch);
        tbl.setTableName(name);
        tbl.setTableType(tbltype);
        tbl.setRemarks(remarks);
        tbl.setTypeCat(typecat);
        tbl.setTypeSchem(typesch);
        tbl.setTypeName(typenam);
        tbl.setSelfReferencingColName(srcolnm);
        tbl.setRefGeneration(refg);

        tables.add(tbl);
      }
      rs.close();

      for (MdlTable tname : tables) {
        ArrayList<MdlColumn> cols = new ArrayList<MdlColumn>();
        // 获取表列信息
        rs = dbmd.getColumns(catalog, schema, tname.getTableName(), "%");
        while (rs.next()) {
          String tableCat      = rs.getString("TABLE_CAT");
          String tableSchem    = rs.getString("TABLE_SCHEM");
          String tableName     = rs.getString("TABLE_NAME");
          String columnName    = rs.getString("COLUMN_NAME");
          String dataType      = rs.getString("DATA_TYPE");
          String typeName      = rs.getString("TYPE_NAME");
          String columnSize    = rs.getString("COLUMN_SIZE");
          String bufferLength    = rs.getString("BUFFER_LENGTH");
          String decimalDigits   = rs.getString("DECIMAL_DIGITS");
          String numPrecRadix   = rs.getString("NUM_PREC_RADIX");
          String snullable      = rs.getString("NULLABLE");
          String remarks      = rs.getString("REMARKS");
          String columnDef     = rs.getString("COLUMN_DEF");
          String sqlDataType    = rs.getString("SQL_DATA_TYPE");
          String sqlDatetimeSub   = rs.getString("SQL_DATETIME_SUB");
          String charOctetLength  = rs.getString("CHAR_OCTET_LENGTH");
          String ordinalPosition   = rs.getString("ORDINAL_POSITION");
          String isNullable    = rs.getString("IS_NULLABLE");

          String scopeCatalog = null;
//          try {
//            scope_catalog    = rs.getString("SCOPE_CATALOG");
//          } catch (SQLException ex) {
//            scope_catalog = rs.getString("SCOPE_CATLOG");
//          }
          String scopeSchema     = rs.getString("SCOPE_SCHEMA");
          String scopeTable    = rs.getString("SCOPE_TABLE");
          String sourceDataType   = rs.getString("SOURCE_DATA_TYPE");
          String isAutoincrement   = rs.getString("IS_AUTOINCREMENT");
          String isGeneratedcolumn = rs.getString("IS_GENERATEDCOLUMN");

          MdlColumn col = new MdlColumn();
          col.setTableCat(tableCat);
          col.setTableSchem(tableSchem);
          col.setTableName(tableName.toUpperCase());
          col.setColumnName(columnName.toUpperCase());
          // col.setColumnName(table_name.toUpperCase() + "." + column_name.toUpperCase());
          col.setDataType(dataType);
          col.setTypeName(typeName);
          col.setTypeNameJava(
              TypeJavaDb.getTypeJava(TeapotDb.getInstance().getDbType()).getJavaType(typeName));
          col.setColumnSize(columnSize);
          col.setBufferLength(bufferLength);
          col.setDecimalDigits(decimalDigits);
          col.setNumPrecRadix(numPrecRadix);
          col.setNullable(snullable);
          col.setRemarks(remarks);
          col.setColumnDef(columnDef);
          col.setSqlDataType(sqlDataType);
          col.setSqlDatetimeSub(sqlDatetimeSub);
          col.setCharOctetLength(charOctetLength);
          col.setOrdinalPosition(Formatter.INSTANCE.fmt(ordinalPosition, "0", 5));
          col.setIsNullable(isNullable);
          col.setScopeCatalog(scopeCatalog);
          col.setScopeSchema(scopeSchema);
          col.setScopeTable(scopeTable);
          col.setSourceDataType(sourceDataType);
          col.setIsAutoincrement(isAutoincrement);
          col.setIsGeneratedcolumn(isGeneratedcolumn);
          cols.add(col);
        }
        rs.close();
        ArrayList<OptOrder> keys = new ArrayList<OptOrder>();
        keys.add(new OptOrder(MdlColumn.ORDINAL_POSITION));
        UModel.sort(cols, keys);
        tname.setColmuns(cols);

        ArrayList<MdlPrimaryKey> prmKeys = new ArrayList<MdlPrimaryKey>();
        // 获取表主键信息
        rs = dbmd.getPrimaryKeys(catalog, schema, tname.getTableName());
        while (rs.next()) {
          String tblcat  = rs.getString("TABLE_CAT");
          String tblsch  = rs.getString("TABLE_SCHEM");
          String tblname = rs.getString("TABLE_NAME");
          String idName  = rs.getString("COLUMN_NAME");
          String kseq  = rs.getString("KEY_SEQ");
          String pkname  = rs.getString("PK_NAME");
          MdlPrimaryKey pk = new MdlPrimaryKey();
          pk.setTableCat(tblcat);
          pk.setTableSchem(tblsch);
          pk.setTableName(tblname);
          pk.setColumnName(idName.toUpperCase());
          pk.setKeySeq(Formatter.INSTANCE.fmt(kseq, "0", 5));
          pk.setPkName(pkname);
          prmKeys.add(pk);
        }
        rs.close();
        ArrayList<OptOrder> skeys = new ArrayList<OptOrder>();
        keys.add(new OptOrder(MdlPrimaryKey.KEY_SEQ));
        UModel.sort(prmKeys, skeys);
        tname.setPrimaryKeys(prmKeys);

        ArrayList<MdlIndex> idxs = new ArrayList<MdlIndex>();
        // 获取表索引信息
        rs = dbmd.getIndexInfo(catalog, schema, tname.getTableName(), true, true);
        while (rs.next()) {
          String tableCat    = rs.getString("TABLE_CAT");
          String tableSchem    = rs.getString("TABLE_SCHEM");
          String tableName     = rs.getString("TABLE_NAME");
          String nonUnique     = rs.getString("NON_UNIQUE");
          String indexQualifier  = rs.getString("INDEX_QUALIFIER");
          String indexName     = rs.getString("INDEX_NAME");
          String type       = rs.getString("TYPE");
          String ordinalPosition = rs.getString("ORDINAL_POSITION");
          String columnName    = rs.getString("COLUMN_NAME");
          String ascOrDesc    = rs.getString("ASC_OR_DESC");
          String cardinality    = rs.getString("CARDINALITY");
          String pages      = rs.getString("PAGES");
          String filterCondition = rs.getString("FILTER_CONDITION");

          MdlIndex idx = new MdlIndex();
          idx.setTableCat(tableCat);
          idx.setTableSchem(tableSchem);
          idx.setTableName(tableName);
          idx.setNonUnique(nonUnique);
          idx.setIndexQualifier(indexQualifier);
          idx.setIndexName(indexName);
          idx.setType(type);
          idx.setOrdinalPosition(ordinalPosition);
          idx.setColumnName(columnName);
          idx.setAscOrDesc(ascOrDesc);
          idx.setCardinality(cardinality);
          idx.setPages(pages);
          idx.setFilterCondition(filterCondition);
          idxs.add(idx);
        }
        tname.setIndexs(idxs);

        this.tblInfo.put(tname.getTableName().toUpperCase(), tname);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      //closing the connections and resultset
      // roll back any changes to the database made by this sample
      // conn.rollback();
      // disconnect from the 'sample' database
      if (conn != null ) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return tables;
  }
  /**
   * 获取指定对象表的信息.
   * @param str 对象表。
   * @return 对象表的信息。
   */
  public MdlTable getTable(String str) {
    if (str == null || str.length() <= 0) {
      return null;
    }
    MdlTable tbl = this.tblInfo.get(str.toUpperCase());
    if (tbl == null) {
      getTableInfo();
    }
    tbl = this.tblInfo.get(str);
    return tbl;
  }
//  /**
//   * 获取表对应的Bean类名。
//   * @param tableName 表名
//   * @return Bean类名
//   */
//  public String getTblMdl(String tableName) {
//    Formatter fmt = Formatter.INSTANCE;
//    return "org.teapot.db.orm.mdl.Mdl" + fmt.fmtFun(tableName);
//  }

  /*
   * Create
   */
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int insert(String tableName, IKeyValue data) throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    Connection conn = null;
    PreparedStatement stmt = null;

    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    for (int i = 0; i < max; i ++) {
      buf.append("?");
      if (i < (max - 1)) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sql);

      IKeyValue obj = data;
      System.out.println("insert:" + obj);
      for (int idx = 0; idx < tblInfo.getColmuns().size(); idx ++) {
        MdlColumn col = tblInfo.getColmuns().get(idx);
        stmt.setObject(idx + 1, obj.getValueByKey(col.getTableName() + "." + col.getColumnName()));
      }

      result += stmt.executeUpdate();
      conn.commit();

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {
      if (rs != null ) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null ) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (conn != null ) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param conn 数据库连接。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int insert(String tableName, IKeyValue data, Connection conn) throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }

    PreparedStatement stmt = null;

    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    for (int i = 0; i < max; i ++) {
      buf.append("?");
      if (i < (max - 1)) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      stmt = conn.prepareStatement(sql);

      IKeyValue obj = data;
      System.out.println("insert:" + obj);
      for (int idx = 0; idx < tblInfo.getColmuns().size(); idx ++) {
        MdlColumn col = tblInfo.getColmuns().get(idx);
        stmt.setObject(idx + 1, obj.getValueByKey(col.getTableName() + "." + col.getColumnName()));
      }

      result += stmt.executeUpdate();

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }

  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param <T> 实现接口IKeyValue的类。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data) throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    Connection conn = null;
    PreparedStatement stmt = null;

    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    for (int i = 0; i < max; i ++) {
      buf.append("?");
      if (i < (max - 1)) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sql);

      for (IKeyValue obj : data) {
        System.out.println("insert:" + obj);
        for (int idx = 0; idx < tblInfo.getColmuns().size(); idx ++) {
          MdlColumn col = tblInfo.getColmuns().get(idx);
          stmt.setObject(idx + 1,
              obj.getValueByKey(col.getTableName() + "." + col.getColumnName()));
        }
        stmt.addBatch();
      }
      int[] irecs = stmt.executeBatch();
      for (int k : irecs) {
        result += k;
      }
      conn.commit();

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (conn != null) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data, Connection conn)
      throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }

    PreparedStatement stmt = null;

    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    for (int i = 0; i < max; i ++) {
      buf.append("?");
      if (i < (max - 1)) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      stmt = conn.prepareStatement(sql);

      for (IKeyValue obj : data) {
        System.out.println("insert:" + obj);
        for (int idx = 0; idx < tblInfo.getColmuns().size(); idx ++) {
          MdlColumn col = tblInfo.getColmuns().get(idx);
          stmt.setObject(idx + 1,
              obj.getValueByKey(col.getTableName() + "." + col.getColumnName()));
        }
        stmt.addBatch();
      }
      int[] irecs = stmt.executeBatch();
      for (int k : irecs) {
        result += k;
      }

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }

  /*
   * Read
   */
  /**
   * 从表中检索数据.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param <T> 实现接口IKeyValue的类。
   * @return 数据。
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby) {
    List<T> result = new ArrayList<T>();
    //
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    /* SELECT */
    buf.append("SELECT ");
    List<MdlColumn> cols = tblInfo.getColmuns();
    int maxLen = cols.size();
    for (int i = 0; i < maxLen; i ++) {
      MdlColumn column = cols.get(i);
      buf.append(column.getColumnName());
      if (i < (maxLen - 1)) {
        buf.append(",");
      }
    }
    /* FROM */
    buf.append(" FROM ");
    buf.append(tableName);
    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    /* ORDER BY */
    if (orderby != null) {
      buf.append(" ORDER BY ");
      for (int i = 0; i < orderby.size(); i ++ ) {
        OptOrder odr = orderby.get(i);
        buf.append(odr.getCloumn());
        if (odr.getOrder() == UModelConstant.SORT_DSC) {
          buf.append(" DESC ");
        } else {
          buf.append(" ASC ");
        }
        if (i < (orderby.size() - 1)) {
          buf.append(",");
        }
      }
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);
//    Class<?> c = null;
//    try {
//      c = Class.forName(getTblMdl(tableName));
//    } catch (ClassNotFoundException e1) {
//      e1.printStackTrace();
//    }

    try {
      conn = TeapotDb.getInstance().getConnection();
      stmt = conn.prepareStatement(sqlCmd);
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int i = 0; i < values.size(); i ++) {
          Object value = (Object) values.get(i);
          stmt.setObject((i + 1), value);
        }
      }
      rs = stmt.executeQuery();
      while (rs.next()) {
        T obj = null;
        try {
          obj = (T) cls.newInstance();
        } catch (InstantiationException e1) {
          e1.printStackTrace();
        } catch (IllegalAccessException e1) {
          e1.printStackTrace();
        }
        for (int i = 0; i < maxLen; i ++) {
          MdlColumn column = cols.get(i);
          System.out.println("TeapotOrm::ColumnName" + column.getColumnName()
              + ",JavaType=" + column.getTypeNameJava());
          if ("java.lang.Long".equals(column.getTypeNameJava())) {
            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
                rs.getLong(column.getColumnName()));
          } else {
            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
                rs.getObject(column.getColumnName()));
          }
        }

        result.add(obj);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (conn != null) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }
  /**
   * 从表中检索数据.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return 数据。
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby, Connection conn) {
    List<T> result = new ArrayList<T>();
    //
    PreparedStatement stmt = null;
    ResultSet rs = null;
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    /* SELECT */
    buf.append("SELECT ");
    List<MdlColumn> cols = tblInfo.getColmuns();
    int maxLen = cols.size();
    for (int i = 0; i < maxLen; i ++) {
      MdlColumn column = cols.get(i);
      buf.append(column.getColumnName());
      if (i < (maxLen - 1)) {
        buf.append(",");
      }
    }
    /* FROM */
    buf.append(" FROM ");
    buf.append(tableName);
    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    /* ORDER BY */
    if (orderby != null) {
      buf.append(" ORDER BY ");
      for (int i = 0; i < orderby.size(); i ++ ) {
        OptOrder odr = orderby.get(i);
        buf.append(odr.getCloumn());
        if (odr.getOrder() == UModelConstant.SORT_DSC) {
          buf.append(" DESC ");
        } else {
          buf.append(" ASC ");
        }
        if (i < (orderby.size() - 1)) {
          buf.append(",");
        }
      }
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);
//    Class<?> c = null;
//    try {
//      c = Class.forName(getTblMdl(tableName));
//    } catch (ClassNotFoundException e1) {
//      e1.printStackTrace();
//    }

    try {
      stmt = conn.prepareStatement(sqlCmd);
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int i = 0; i < values.size(); i ++) {
          Object value = (Object) values.get(i);
          stmt.setObject((i + 1), value);
        }
      }
      rs = stmt.executeQuery();
      while (rs.next()) {
        T obj = null;
        try {
          obj = (T) cls.newInstance();
        } catch (InstantiationException e1) {
          e1.printStackTrace();
        } catch (IllegalAccessException e1) {
          e1.printStackTrace();
        }
        for (int i = 0; i < maxLen; i ++) {
          MdlColumn column = cols.get(i);
          System.out.println("TeapotOrm::ColumnName" + column.getColumnName()
              + ",JavaType=" + column.getTypeNameJava());
          if ("java.lang.Long".equals(column.getTypeNameJava())) {
            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
                rs.getLong(column.getColumnName()));
          } else {
            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
                rs.getObject(column.getColumnName()));
          }
        }

        result.add(obj);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    return result;
  }

  /*
   * Update
   */
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int update(String tableName, Condition condition, IKeyValue data) throws SQLException {
    int result = 0;
    Connection conn = null;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    for (int j = 0; j < max; j ++) {
      buf.append(tblInfo.getColmuns().get(j).getColumnName());
      buf.append("= ? ");
      if (j < (max - 1)) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sqlCmd);

      IKeyValue dat = data;
      int idx = 0;
      // SET
      for (int j = 0; j < max; j ++) {
        MdlColumn col = tblInfo.getColmuns().get(j);
        Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
        idx ++;
        stmt.setObject(idx, value);
      }

      // WHERE
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int j = 0; j < values.size(); j ++) {
          Object value = (Object) values.get(j);
          idx ++;
          stmt.setObject(idx, value);
        }
      }
      result += stmt.executeUpdate();

      conn.commit();
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
      try {
        if (conn != null) {
          TeapotDb.getInstance().releaseConnection(conn);
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // end finally try
    } //end try
    return result;
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param conn 数据库连接。
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int update(String tableName, Condition condition, IKeyValue data, Connection conn)
      throws SQLException {
    int result = 0;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    for (int j = 0; j < max; j ++) {
      buf.append(tblInfo.getColmuns().get(j).getColumnName());
      buf.append("= ? ");
      if (j < (max - 1)) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      stmt = conn.prepareStatement(sqlCmd);

      IKeyValue dat = data;
      int idx = 0;
      // SET
      for (int j = 0; j < max; j ++) {
        MdlColumn col = tblInfo.getColmuns().get(j);
        Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
        idx ++;
        stmt.setObject(idx, value);
      }

      // WHERE
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int j = 0; j < values.size(); j ++) {
          Object value = (Object) values.get(j);
          idx ++;
          stmt.setObject(idx, value);
        }
      }

      result += stmt.executeUpdate();
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
    } //end try
    return result;
  }

  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param <T> 实现接口IKeyValue的类。
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data)
      throws SQLException {
    int result = 0;
    Connection conn = null;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    for (int j = 0; j < max; j ++) {
      buf.append(tblInfo.getColmuns().get(j).getColumnName());
      buf.append("= ? ");
      if (j < (max - 1)) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sqlCmd);

      for (IKeyValue dat : data) {
        int idx = 0;
        // SET
        for (int j = 0; j < max; j ++) {
          MdlColumn col = tblInfo.getColmuns().get(j);
          Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
          idx ++;
          stmt.setObject(idx, value);
        }

        // WHERE
        if (condition != null) {
          List<?> values = condition.getValues();
          System.out.println("条件字段的个数：" + values.size());
          for (int j = 0; j < values.size(); j ++) {
            Object value = (Object) values.get(j);
            idx ++;
            stmt.setObject(idx, value);
          }
        }
        stmt.addBatch();
      } // for
      int[] irecs = stmt.executeBatch();

      conn.commit();
      for (int k : irecs) {
        result += k;
      }
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
      try {
        if (conn != null) {
          TeapotDb.getInstance().releaseConnection(conn);
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // end finally try
    } //end try
    return result;
  }

  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data,
      Connection conn) throws SQLException {
    int result = 0;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    for (int j = 0; j < max; j ++) {
      buf.append(tblInfo.getColmuns().get(j).getColumnName());
      buf.append("= ? ");
      if (j < (max - 1)) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      stmt = conn.prepareStatement(sqlCmd);

      for (IKeyValue dat : data) {
        int idx = 0;
        // SET
        for (int j = 0; j < max; j ++) {
          MdlColumn col = tblInfo.getColmuns().get(j);
          Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
          idx ++;
          stmt.setObject(idx, value);
        }

        // WHERE
        if (condition != null) {
          List<?> values = condition.getValues();
          System.out.println("条件字段的个数：" + values.size());
          for (int j = 0; j < values.size(); j ++) {
            Object value = (Object) values.get(j);
            idx ++;
            stmt.setObject(idx, value);
          }
        }
        stmt.addBatch();
      } // for
      int[] irecs = stmt.executeBatch();

      for (int k : irecs) {
        result += k;
      }
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
    } //end try
    return result;
  }

  /**
   * 从表中删除数据.
   * @param tableName 表。
   * @param condition 数据。
   * @return 删除件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int delete(String tableName, Condition condition) throws SQLException {
    int result = 0;
    Connection conn = null;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* DELETE FROM */
    buf.append("DELETE FROM ");
    buf.append(tableName);
    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);
    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sqlCmd);

      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int i = 0; i < values.size(); i ++) {
          Object value = (Object) values.get(i);
          stmt.setObject((i + 1), value);
        }
      }
      result = stmt.executeUpdate();

      conn.commit();
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
      try {
        if (conn != null) {
          TeapotDb.getInstance().releaseConnection(conn);
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // end finally try
    } //end try
    return result;
  }

  /**
   * 从表中删除数据.
   * @param tableName 表。
   * @param condition 数据。
   * @param conn 数据库连接。
   * @return 删除件数。
   * @throws SQLException 返回处理过程中的异常。
   */
  public int delete(String tableName, Condition condition, Connection conn) throws SQLException {
    int result = 0;
    PreparedStatement stmt = null;
    StringBuffer buf = new StringBuffer();
    /* DELETE FROM */
    buf.append("DELETE FROM ");
    buf.append(tableName);
    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);
    try {
      stmt = conn.prepareStatement(sqlCmd);

      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int i = 0; i < values.size(); i ++) {
          Object value = (Object) values.get(i);
          stmt.setObject((i + 1), value);
        }
      }
      result = stmt.executeUpdate();
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // do nothing
    } //end try
    return result;
  }
}
