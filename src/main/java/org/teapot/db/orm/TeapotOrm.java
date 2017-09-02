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

import org.teapot.db.orm.mdl.Columns;
import org.teapot.db.orm.mdl.Condition;
import org.teapot.db.orm.mdl.From;
import org.teapot.db.orm.mdl.Group;
import org.teapot.db.orm.mdl.Hav;
import org.teapot.db.orm.mdl.IClause;
import org.teapot.db.orm.mdl.MdlColumn;
import org.teapot.db.orm.mdl.MdlIndex;
import org.teapot.db.orm.mdl.MdlPrimaryKey;
import org.teapot.db.orm.mdl.MdlTable;
import org.teapot.db.orm.mdl.OptOrder;
import org.teapot.db.orm.mdl.Orderby;
import org.teapot.db.orm.mdl.Query;
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
 *
 * <p>
 * 使用枚举代码显得不够简洁，改为单实例。(2017/08/31)
 * @author dubenju@126.com
 * @since 0.0.1
 */
public enum TeapotOrm {
  INSTANCE;

  private Map<String, MdlTable> tblInfo = new ConcurrentHashMap<String, MdlTable>();
  private IConv idefConv = new DefConv();

  /**
   * getTableNamePattern.
   * @param meta DatabaseMetaData
   * @return String
   * @throws SQLException 处理过程中发生的异常。
   * @since 0.0.1
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
   * @since 0.0.1
   */
  public List<MdlTable> getTableInfo() {
    System.out.println("------------------getTableInfo():" + tblInfo);
    Connection conn = null;
    List<MdlTable> tables = new ArrayList<MdlTable>();
    try {
//      TeapotDb.getInstance().init();

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
      String schema = null;
      /* 在DBCP的时候取不到  */
//      String schema = conn.getSchema();
//      System.out.println("schema=" + schema);
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
        UModel.sort(cols, new Orderby(MdlColumn.ORDINAL_POSITION).orderby());
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

        UModel.sort(prmKeys, new Orderby(MdlPrimaryKey.KEY_SEQ).orderby());
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
      try {
        TeapotDb.getInstance().releaseConnection(conn);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return tables;
  }

  /**
   * 获取指定对象表的信息.
   * @param str 对象表。
   * @return 对象表的信息。
   * @since 0.0.1
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
   * @since 0.0.1
   */
  public int insert(String tableName, IKeyValue data) throws SQLException {
    return this.insert(tableName, data, this.idefConv);
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param iconv 变换处理
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.2
   */
  public int insert(String tableName, IKeyValue data, IConv iconv) throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    long startTime = 0;
    Connection conn = null;

    try {
      startTime = System.currentTimeMillis();
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      result = insert(tableName, data, iconv, conn);

      conn.commit();

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {
      if (conn != null ) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("insert:" + data);
    System.out.println("★★★★★insert处理耗时" + (endTime - startTime) + "毫秒。");
    return result;
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param conn 数据库连接。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.1
   */
  public int insert(String tableName, IKeyValue data, Connection conn) throws SQLException {
    return this.insert(tableName, data, this.idefConv, conn);
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param iconv 变换处理
   * @param conn 数据库连接。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.2
   */
  public int insert(String tableName, IKeyValue data, IConv iconv, Connection conn)
      throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;

    PreparedStatement stmt = null;
    ResultSet rs = null;

    startTime = System.currentTimeMillis();
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    int id1 = 0;
    while (id1 < max) {
      buf.append("?");
      id1 ++;
      if (id1 < max) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      stmt = conn.prepareStatement(sql);

      time3 = System.currentTimeMillis();
      IKeyValue obj = data;
      stmt.setObject(max, null);
      int idx = 0;
      while (idx < max) {
        MdlColumn col = tblInfo.getColmuns().get(idx);
        idx ++;
//        stmt.setObject(idx, obj.getValueByKey(col.getTableName() + "." + col.getColumnName()));
        iconv.conv2Db(stmt, idx, col, obj);
      }

      time1 = System.currentTimeMillis();
      result += stmt.executeUpdate();
      time2 = System.currentTimeMillis();

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
    long endTime = System.currentTimeMillis();
    System.out.println("insert:" + data);
    System.out.println("★★★★★insert处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
    return result;
  }

  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param <T> 实现接口IKeyValue的类。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.1
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data) throws SQLException {
    return this.insert(tableName, data, this.idefConv);
  }
  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param <T> 实现接口IKeyValue的类。
   * @param iconv 变换处理
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.2
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data, IConv iconv)
      throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    long startTime = 0;

    Connection conn = null;

    startTime = System.currentTimeMillis();

    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      result = insert(tableName, data, conn, iconv);

      conn.commit();

    } catch (SQLException e) {
      conn.rollback();
      e.printStackTrace();
      throw e;
    } finally {

      if (conn != null) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★insert处理耗时" + (endTime - startTime) + "毫秒。");
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
   * @since 0.0.1
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data, Connection conn)
      throws SQLException {
    return insert(tableName, data, conn, this.idefConv);
  }

  /**
   * 向表插入数据.
   * @param tableName 表。
   * @param data 数据。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return 插入件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.1
   */
  public <T extends IKeyValue> int insert(String tableName, List<T> data, Connection conn,
      IConv iconv) throws SQLException {
    int result = 0;
    if (data == null) {
      return result;
    }
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;

    PreparedStatement stmt = null;
    ResultSet rs = null;

    startTime = System.currentTimeMillis();
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    buf.append("INSERT INTO ");
    buf.append(tableName);
    buf.append(" VALUES( ");
    int max = tblInfo.getColmuns().size();
    int id1 = 0;
    while (id1 < max) {
      buf.append("?");
      id1 ++;
      if (id1 < max) {
        buf.append(", ");
      }
    }
    buf.append(");");

    String sql = buf.toString();
    try {
      stmt = conn.prepareStatement(sql);

      time3 = System.currentTimeMillis();
      for (int index = 0, maxSize = data.size(); index < maxSize; index ++) {
        IKeyValue obj = data.get(index);
        System.out.println("insert:" + obj);
        int idx = 0;
        while (idx < max) {
          MdlColumn col = tblInfo.getColmuns().get(idx);
          idx ++;
          stmt.setObject(idx,
              obj.get(col.getTableName() + "." + col.getColumnName()));
        }
        stmt.addBatch();
      }
      time1 = System.currentTimeMillis();
      int[] irecs = stmt.executeBatch();
      time2 = System.currentTimeMillis();

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
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★insert处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
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
   * @return Query。
   * @since TeapotORM 0.0.1
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby) {
    return this.select(tableName, cls, condition, orderby, this.idefConv);
  }
  /**
   * 从表中检索数据.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param <T> 实现接口IKeyValue的类。
   * @param iconv 变换处理
   * @return Query。
   * @since TeapotORM 0.0.2
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby, IConv iconv) {
    long startTime = 0;
    List<T> result = new ArrayList<T>();
    //
    Connection conn = null;

    startTime = System.currentTimeMillis();
    try {
      conn = TeapotDb.getInstance().getConnection();
      result = select(tableName, cls, condition, orderby, iconv, conn);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {

      if (conn != null) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★select处理耗时" + (endTime - startTime) + "毫秒。");
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
   * @return Query。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since TeapotORM 0.0.1
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby, Connection conn) throws SQLException {
    return this.select(tableName, cls, condition, orderby, this.idefConv, conn);
  }
  /**
   * 从表中检索数据.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param iconv 变换处理
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return Query。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public <T extends IKeyValue> List<T> select(String tableName, Class<T> cls, Condition condition,
      List<OptOrder> orderby, IConv iconv, Connection conn) throws SQLException {

    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    List<T> result = new ArrayList<T>();
    //
    PreparedStatement stmt = null;
    ResultSet rs = null;

    startTime = System.currentTimeMillis();
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    /* SELECT */
    buf.append("SELECT ");
    List<MdlColumn> cols = tblInfo.getColmuns();
    int maxLen = cols.size();
    int id1 = 0;
    while (id1 < maxLen) {
      MdlColumn column = cols.get(id1);
      buf.append(column.getColumnName());
      id1 ++;
      if (id1 < maxLen) {
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
      int id2 = 0;
      int maxSize = orderby.size();
      while (id2 < maxSize) {
        OptOrder odr = orderby.get(id2);
        buf.append(odr.getCloumn());
        if (odr.getOrder() == UModelConstant.SORT_DSC) {
          buf.append(" DESC ");
        } else {
          buf.append(" ASC ");
        }
        id2 ++;
        if (id2 < maxSize) {
          buf.append(",");
        }
      }
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      stmt = conn.prepareStatement(sqlCmd);

      time3 = System.currentTimeMillis();
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        int id3 = 0;
        int maxLength = values.size();
        while (id3 < maxLength) {
          Object value = (Object) values.get(id3);
          id3 ++;
          stmt.setObject(id3, value);
        }
      }
      time1 = System.currentTimeMillis();
      rs = stmt.executeQuery();
      time2 = System.currentTimeMillis();
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
          iconv.conv2Mdl(column, rs, obj);
//          System.out.println("TeapotOrm::ColumnName" + column.getColumnName()
//              + ",JavaType=" + column.getTypeNameJava());
//          if ("java.lang.Long".equals(column.getTypeNameJava())) {
//            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
//                rs.getLong(column.getColumnName()));
//          } else {
//            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
//                rs.getObject(column.getColumnName()));
//          }
        }

        result.add(obj);
      }
    } catch (SQLException e) {
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
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★select处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
    return result;
  }


  /**
   * 从表中检索数据.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param clauses 子句。
   * @param <T> 实现接口IKeyValue的类。
   * @return Query。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since TeapotORM 0.0.2
   */
  public <T extends IKeyValue> Query select(String tableName, Class<T> cls, IClause... clauses)
      throws SQLException {

//    long startTime = 0;
//    long time1 = 0;
//    long time2 = 0;
//    long time3 = 0;
//    List<T> result = new ArrayList<T>();
    //
//    PreparedStatement stmt = null;
//    ResultSet rs = null;

//    startTime = System.currentTimeMillis();

    /*
     * Mysql
     * SELECT
     *     [ALL | DISTINCT | DISTINCTROW ]
     *       [HIGH_PRIORITY]
     *       [STRAIGHT_JOIN]
     *       [SQL_SMALL_RESULT] [SQL_BIG_RESULT] [SQL_BUFFER_RESULT]
     *       [SQL_CACHE | SQL_NO_CACHE] [SQL_CALC_FOUND_ROWS]
     *     select_expr [, select_expr ...]
     *     [FROM table_references
     *       [PARTITION partition_list]
     *     [WHERE where_condition]
     *     [GROUP BY {col_name | expr | position}
     *       [ASC | DESC], ... [WITH ROLLUP]]
     *     [HAVING where_condition]
     *     [ORDER BY {col_name | expr | position}
     *       [ASC | DESC], ...]
     *     [LIMIT {[offset,] row_count | row_count OFFSET offset}]
     *     [PROCEDURE procedure_name(argument_list)]
     *     [INTO OUTFILE 'file_name'
     *         [CHARACTER SET charset_name]
     *         export_options
     *       | INTO DUMPFILE 'file_name'
     *       | INTO var_name [, var_name]]
     *     [FOR UPDATE | LOCK IN SHARE MODE]]
     */
    Columns colus = null;
    From from = null;
    Condition condition = null;
    Group grpby = null;
    Hav hav = null;
    Orderby ordby = null;
    int ida = 0;
    int maa = clauses.length;
    while (ida < maa) {
      IClause clause = clauses[ida];
      if (clause instanceof Columns) {
        colus = (Columns) clause;
      }
      if (clause instanceof From) {
        from = (From) clause;
      }
      if (clause instanceof Condition && !(clause instanceof Hav)) {
        condition = (Condition) clause;
      }
      if (clause instanceof Group) {
        grpby = (Group) clause;
      }
      if (clause instanceof Hav) {
        hav = (Hav) clause;
      }
      if (clause instanceof Orderby) {
        ordby = (Orderby) clause;
      }
      ida ++;
    }
    System.out.println("SELECT ITEM:" + colus);
    System.out.println("FROM:" + from);
    System.out.println("WHERE:" + condition);
    System.out.println("GROUPBY:" + grpby);
    System.out.println("ORDERBY:" + ordby);


    StringBuffer buf = new StringBuffer();
    /*
     * SELECT [ DISTINCT | ALL ] SelectItem [ , SelectItem ]*
     * FROM clause
     * [ WHERE clause ]
     * [ GROUP BY clause ]
     * [ HAVING clause ]
     * [ ORDER BY clause ]
     * [ result offset clause ]
     * [ fetch first clause ]
     * SelectItem:
     *
     * {
     *     * |
     *     { table-Name | correlation-Name } .* |
     *     Expression [AS Simple-column-Name ]
     * }
     */
    buf.append("SELECT ");
    if (colus == null) {
      MdlTable tblInfo = getTable(tableName);
      System.out.println(tblInfo);
      List<MdlColumn> cols = tblInfo.getColmuns();
      int maxLen = cols.size();
      int id1 = 0;
      while (id1 < maxLen) {
        MdlColumn column = cols.get(id1);
        buf.append(column.getColumnName());
        id1 ++;
        if (id1 < maxLen) {
          buf.append(",");
        }
      }
    } else {
      buf.append(colus);
    }

    /*
     * FROM TableExpression [ , TableExpression ] *
     */
    buf.append(" FROM ");
    if (from == null) {
      buf.append(tableName);
    } else {
      buf.append(from);
    }

    /*
     * WHERE Boolean expression
     */
    if (condition != null) {
      buf.append(condition);
    }

    /*
     *     [GROUP BY {col_name | expr | position}
     *       [ASC | DESC], ... [WITH ROLLUP]]
     */
    if (grpby != null) {
      buf.append(" GROUP BY ");
      buf.append(grpby);
    }

    if (hav != null) {
      buf.append(" HAVING ");
      buf.append(hav);
    }
    /*
     * ORDER BY { column-Name | ColumnPosition | Expression }
     * [ ASC | DESC ]
     * [ NULLS FIRST | NULLS LAST ]
     * [ , column-Name | ColumnPosition | Expression
     * [ ASC | DESC ]
     * [ NULLS FIRST | NULLS LAST ]
     * ] *
     */
    if (ordby != null) {
      List<OptOrder> orderby = ordby.orderby();
      int maxSize = orderby.size();
      System.out.println("orderby size" + maxSize);
      if (maxSize > 0) {
        buf.append(" ORDER BY ");
        int id2 = 0;
        while (id2 < maxSize) {
          OptOrder odr = orderby.get(id2);
          buf.append(odr.getCloumn());
          if (odr.getOrder() == UModelConstant.SORT_DSC) {
            buf.append(" DESC ");
          } else {
            buf.append(" ASC ");
          }
          id2 ++;
          if (id2 < maxSize) {
            buf.append(",");
          }
        }
      }
    }

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);
    return new Query(sqlCmd, condition, null, null);
  }

  /**
   * 从表中检索数据【悲观锁】.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @return 数据。
   * @since TeapotORM 0.0.2
   */
  public <T extends IKeyValue> List<T> select4update(String tableName, Class<T> cls,
      Condition condition, List<OptOrder> orderby, Connection conn) {
    return this.select4update(tableName, cls, condition, orderby, this.idefConv, conn);
  }
  /**
   * 从表中检索数据【悲观锁】.
   * @param tableName 表。
   * @param cls 返回集合元素的类名。
   * @param condition 条件。
   * @param orderby 排序。
   * @param iconv 变换处理
   * @param conn 数据库连接。

   * @param <T> 实现接口IKeyValue的类。
   * @return 数据。
   * @since TeapotORM 0.0.2
   */
  public <T extends IKeyValue> List<T> select4update(String tableName, Class<T> cls,
      Condition condition, List<OptOrder> orderby, IConv iconv, Connection conn) {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    List<T> result = new ArrayList<T>();
    //
    PreparedStatement stmt = null;
    ResultSet rs = null;

    startTime = System.currentTimeMillis();
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);

    StringBuffer buf = new StringBuffer();
    /* SELECT */
    buf.append("SELECT ");
    List<MdlColumn> cols = tblInfo.getColmuns();
    int maxLen = cols.size();
    int id1 = 0;
    while (id1 < maxLen) {
      MdlColumn column = cols.get(id1);
      buf.append(column.getColumnName());
      id1 ++;
      if (id1 < maxLen) {
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
      int id2 = 0;
      int maxSize = orderby.size();
      while (id2 < maxSize) {
        OptOrder odr = orderby.get(id2);
        buf.append(odr.getCloumn());
        if (odr.getOrder() == UModelConstant.SORT_DSC) {
          buf.append(" DESC ");
        } else {
          buf.append(" ASC ");
        }
        id2 ++;
        if (id2 < maxSize) {
          buf.append(",");
        }
      }
    }
    buf.append("  FOR UPDATE ");

    String sqlCmd = buf.toString();
    System.out.println("sqlCmd=" + sqlCmd);

    try {
      stmt = conn.prepareStatement(sqlCmd);

      time3 = System.currentTimeMillis();
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        int id3 = 0;
        int maxLength = values.size();
        while (id3 < maxLength) {
          Object value = (Object) values.get(id3);
          id3 ++;
          stmt.setObject(id3, value);
        }
      }

      time1 = System.currentTimeMillis();
      rs = stmt.executeQuery();
      time2 = System.currentTimeMillis();
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
          iconv.conv2Mdl(column, rs, obj);
//          System.out.println("TeapotOrm::ColumnName" + column.getColumnName()
//              + ",JavaType=" + column.getTypeNameJava());
//          if ("java.lang.Long".equals(column.getTypeNameJava())) {
//            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
//                rs.getLong(column.getColumnName()));
//          } else {
//            obj.setValueByKey(column.getTableName() + "." + column.getColumnName(),
//                rs.getObject(column.getColumnName()));
//          }
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
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★select处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
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
   * @since 0.0.1
   */
  public int update(String tableName, Condition condition, IKeyValue data) throws SQLException {
    return this.update(tableName, condition, data, this.idefConv);
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param iconv 变换处理
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.2
   */
  public int update(String tableName, Condition condition, IKeyValue data, IConv iconv)
      throws SQLException {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    int result = 0;
    Connection conn = null;
    PreparedStatement stmt = null;

    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    int idj = 0;
    while (idj < max) {
      buf.append(tblInfo.getColmuns().get(idj).getColumnName());
      buf.append("= ? ");
      idj ++;
      if (idj < max) {
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

      time3 = System.currentTimeMillis();
//      IKeyValue dat = data;
      int idx = 0;
      // SET
      for (int j = 0; j < max; j ++) {
        MdlColumn col = tblInfo.getColmuns().get(j);
//        Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
        idx ++;
//        stmt.setObject(idx, value);
        iconv.conv2Db(stmt, idx, col, data);
      }

      // WHERE
      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        for (int id3 = 0, maxSize = values.size(); id3 < maxSize; id3 ++) {
          Object value = (Object) values.get(id3);
          idx ++;
          stmt.setObject(idx, value);
        }
      }
      time1 = System.currentTimeMillis();
      result += stmt.executeUpdate();
      time2 = System.currentTimeMillis();

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
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★update处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
    return result;
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param conn 数据库连接。
   * @return 更新件数。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since 0.0.1
   */
  public int update(String tableName, Condition condition, IKeyValue data, Connection conn)
      throws SQLException {
    return this.update(tableName, condition, data, conn, this.idefConv);
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param conn 数据库连接。
   * @param iconv 变换处理
   * @return 更新件数。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since 0.0.2
   */
  public int update(String tableName, Condition condition, IKeyValue data, Connection conn,
      IConv iconv) throws SQLException {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    int result = 0;
    PreparedStatement stmt = null;

    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    for (int j = 0; j < max; ) {
      buf.append(tblInfo.getColmuns().get(j).getColumnName());
      buf.append("= ? ");
      j ++;
      if (j < max) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();

    try {
      stmt = conn.prepareStatement(sqlCmd);

      time3 = System.currentTimeMillis();
//      IKeyValue dat = data;
      int idx = 0;
      // SET
      stmt.setObject(max, null);
      for (int j = 0; j < max; j ++) {
        MdlColumn col = tblInfo.getColmuns().get(j);
//        Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
        idx ++;
//        stmt.setObject(idx, value);
        iconv.conv2Db(stmt, idx, col, data);
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

      time1 = System.currentTimeMillis();
      result += stmt.executeUpdate();
      time2 = System.currentTimeMillis();
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
    long endTime = System.currentTimeMillis();
    System.out.println("sqlCmd=" + sqlCmd);
    System.out.println("★★★★★update处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
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
   * @since 0.0.1
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data)
      throws SQLException {
    return this.update(tableName, condition, data, this.idefConv);
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param <T> 实现接口IKeyValue的类。
   * @param iconv 变换处理
   * @return 更新件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.2
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data,
      IConv iconv) throws SQLException {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    int result = 0;
    Connection conn = null;
    PreparedStatement stmt = null;

    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    int idj = 0;
    while (idj < max) {
      buf.append(tblInfo.getColmuns().get(idj).getColumnName());
      buf.append("= ? ");
      idj ++;
      if (idj < max) {
        buf.append(", ");
      }
    }

    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);
      stmt = conn.prepareStatement(sqlCmd);

      time3 = System.currentTimeMillis();
      for (int idz = 0, maxSize = data.size(); idz < maxSize; idz ++) {
        IKeyValue dat = data.get(idz);
        int idx = 0;
        // SET
        stmt.setObject(max, null);
        for (int j = 0; j < max; j ++) {
          MdlColumn col = tblInfo.getColmuns().get(j);
//          Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
          idx ++;
//          stmt.setObject(idx, value);
          iconv.conv2Db(stmt, idx, col, dat);
        }

        // WHERE
        if (condition != null) {
          List<?> values = condition.getValues();
          System.out.println("条件字段的个数：" + values.size());
          for (int j = 0, maxLength = values.size(); j < maxLength; j ++) {
            Object value = (Object) values.get(j);
            idx ++;
            stmt.setObject(idx, value);
          }
        }
        stmt.addBatch();
      } // for
      time1 = System.currentTimeMillis();
      int[] irecs = stmt.executeBatch();
      time2 = System.currentTimeMillis();
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
    long endTime = System.currentTimeMillis();
    System.out.println("sqlCmd=" + sqlCmd);
    System.out.println("★★★★★update处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
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
   * @throws SQLException 返回处理过程中发生的异常。
   * @since 0.0.1
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data,
      Connection conn) throws SQLException {
    return this.update(tableName, condition, data, conn, this.idefConv);
  }
  /**
   * 向表中更新数据.
   * @param tableName 表。
   * @param condition 条件。
   * @param data 更新数据。
   * @param conn 数据库连接。
   * @param <T> 实现接口IKeyValue的类。
   * @param iconv 变换处理
   * @return 更新件数。
   * @throws SQLException 返回处理过程中发生的异常。
   * @since 0.0.2
   */
  public <T extends IKeyValue> int update(String tableName, Condition condition, List<T> data,
      Connection conn, IConv iconv) throws SQLException {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    int result = 0;
    PreparedStatement stmt = null;

    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    /* UPDATE */
    buf.append("UPDATE ");
    buf.append(tableName);
    /* SET */
    buf.append(" SET ");
    MdlTable tblInfo = getTable(tableName);
    System.out.println(tblInfo);
    int max = tblInfo.getColmuns().size();
    int idz = 0;
    while (idz < max) {
      buf.append(tblInfo.getColmuns().get(idz).getColumnName());
      buf.append("= ? ");
      idz ++;
      if (idz < max) {
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

      time3 = System.currentTimeMillis();
      for (int ida = 0, maxSize = data.size(); ida < maxSize; ida ++) {
        IKeyValue dat = data.get(ida);
        int idx = 0;
        // SET
        stmt.setObject(max, null);
        for (int j = 0; j < max; j ++) {
          MdlColumn col = tblInfo.getColmuns().get(j);
//          Object value = dat.getValueByKey(col.getTableName() + "." + col.getColumnName());
          idx ++;
//          stmt.setObject(idx, value);
          iconv.conv2Db(stmt, idx, col, dat);
        }

        // WHERE
        if (condition != null) {
          List<?> values = condition.getValues();
//          System.out.println("条件字段的个数：" + values.size());
          for (int j = 0, maxLength = values.size(); j < maxLength; j ++) {
            Object value = (Object) values.get(j);
            idx ++;
            stmt.setObject(idx, value);
          }
        }
        stmt.addBatch();
      } // for
      time1 = System.currentTimeMillis();
      int[] irecs = stmt.executeBatch();
      time2 = System.currentTimeMillis();
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
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★update处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒），addBatch耗时" + (time1 - time3) + "毫秒");
    return result;
  }

  /**
   * 从表中删除数据.
   * @param tableName 表。
   * @param condition 数据。
   * @return 删除件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.1
   */
  public int delete(String tableName, Condition condition) throws SQLException {
    long startTime = 0;
    int result = 0;
    Connection conn = null;

    startTime = System.currentTimeMillis();
    try {
      conn = TeapotDb.getInstance().getConnection();
      conn.setAutoCommit(false);

      result = delete(tableName, condition, conn);

      conn.commit();
    } catch (SQLException ex) {
      conn.rollback();
      ex.printStackTrace();
      throw ex;
    } finally {
      //finally block used to close resources

      try {
        if (conn != null) {
          TeapotDb.getInstance().releaseConnection(conn);
        }
      } catch (SQLException se) {
        se.printStackTrace();
      } // end finally try
    } //end try
    long endTime = System.currentTimeMillis();
    System.out.println("★★★★★delete处理耗时" + (endTime - startTime) + "毫秒。");
    /* SQL准备(31ms)=获取连接(15ms)+PreparedStatement(16ms) */
    return result;
  }

  /**
   * 从表中删除数据.
   * @param tableName 表。
   * @param condition 数据。
   * @param conn 数据库连接。
   * @return 删除件数。
   * @throws SQLException 返回处理过程中的异常。
   * @since 0.0.1
   */
  public int delete(String tableName, Condition condition, Connection conn) throws SQLException {
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    int result = 0;
    PreparedStatement stmt = null;

    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    /* DELETE FROM */
    buf.append("DELETE FROM ");
    buf.append(tableName);
    /* WHERE */
    if (condition != null) {
      buf.append(condition);
    }

    String sqlCmd = buf.toString();
    try {
      stmt = conn.prepareStatement(sqlCmd);

      if (condition != null) {
        List<?> values = condition.getValues();
        System.out.println("条件字段的个数：" + values.size());
        int idx = 0;
        int maxSize = values.size();
        stmt.setObject(maxSize, null);
        while (idx < maxSize) {
          Object value = (Object) values.get(idx);
          idx ++;
          stmt.setObject(idx, value);
        }
      }
      time1 = System.currentTimeMillis();
      result = stmt.executeUpdate();
      time2 = System.currentTimeMillis();
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
    long endTime = System.currentTimeMillis();
    System.out.println("sqlCmd=" + sqlCmd);
    System.out.println("★★★★★delete处理耗时" + (endTime - startTime) + "毫秒。(其中：SQL准备："
        + (time1 - startTime) + "毫秒，SQL执行：" + (time2 - time1) + "毫秒，SQL执行后："
        + (endTime - time2) + "毫秒）");
    return result;
  }
}
