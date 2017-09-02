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

package org.teapot.db;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.teapot.db.orm.util.UTeapot;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * 与数据库相关处理的类。
 * 通过JDBC创建或释放数据库连接。
 * @author dubenju@126.com
 * @since TeapotORM 0.0.1
 */
public class TeapotDb {

  private static volatile TeapotDb INSTANCE;
  private String dbType = null;
  private String dbServer = null;
  private String dbUser = null;
  private String dbPwd = null;
  private String dbSchema = null;
  private DataSource ds = null;

  /**
   * 获取实例.
   * @return 实例（单实例）。
   * @since 0.0.1
   */
  public static TeapotDb getInstance() {
    if (TeapotDb.INSTANCE == null) {
      synchronized (TeapotDb.class) {
        if (TeapotDb.INSTANCE == null) {
          TeapotDb.INSTANCE = new TeapotDb();
          // 2017/08/15 因为接口参数发生变化，修改。
          TeapotDb.INSTANCE.init(null);
        }
      }
    }
    return TeapotDb.INSTANCE;
  }

  /**
   * 获取实例.
   * @param propFile 配置文件。
   * @return 实例（单实例）。
   * @since 0.0.2
   * @deprecated 应该使用共享的数据。
   */
  public static TeapotDb getInstance(String propFile) {
    if (TeapotDb.INSTANCE == null) {
      synchronized (TeapotDb.class) {
        if (TeapotDb.INSTANCE == null) {
          TeapotDb.INSTANCE = new TeapotDb();
          TeapotDb.INSTANCE.init(propFile);
        }
      }
    }
    return TeapotDb.INSTANCE;
  }

  /**
   * 初期化处理，从属性配置文件中获取信息并实例化驱动.
   * @param propFile配置文件。
   * @since 0.0.1
   * @since 0.0.2 2017/08/15 因为接口参数发生变化，修改。
   * @deprecated 应该使用共享的数据。
   */
  private void init(String propFile) {
    String path = UTeapot.getPath(TeapotDb.class);
    String propeFile = path + "../../../../conf/Teapot_ORM.properties";
    if (propFile != null && propFile.length() > 0) {
      propeFile = propFile;
    }
    System.out.println("Properties File:" + propeFile);
    Properties prop = new Properties();//属性集合对象
    // 当前目录>conf>class
    try {
      //属性文件流
      FileInputStream fis = new FileInputStream(propeFile);
      prop.load(fis);//将属性文件流装载到Properties对象中
      fis.close();// 关闭流
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    String driverName = prop.getProperty("teapot.database.driver");
    System.out.println("获取属性值：teapot.database.driver=" + driverName);

    dbType = prop.getProperty("teapot.database.type");
    dbServer = prop.getProperty("teapot.database.hostname");
    dbUser = prop.getProperty("teapot.database.user");
    dbPwd = prop.getProperty("teapot.database.password");
    dbSchema = prop.getProperty("teapot.database.schema");

    System.out.println("获取属性值：teapot.database.type=" + dbType);
    System.out.println("获取属性值：teapot.database.hostname=" + dbServer);
    System.out.println("获取属性值：teapot.database.user=" + dbUser);
    System.out.println("获取属性值：teapot.database.password=" + dbPwd);
    System.out.println("获取属性值：teapot.database.schema=" + dbSchema);

    try {
      Class.forName(driverName).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    try {
      ds = BasicDataSourceFactory.createDataSource(prop);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取数据库连接.
   * @return 获取的数据库连接。
   * @throws SQLException 处理过程中发生的异常。
   * @since 0.0.1
   */
  public TeapotDbConnection getConnection() throws SQLException {
//    DriverManager.setLogWriter(new PrintWriter(System.out));
    long startTime = 0;
    long time1 = 0;
    long time2 = 0;
    long time3 = 0;
    Connection conn = null;
    // jdbc:mysql://localhost/teapot?user=root&password=root&useUnicode=true&characterEncoding=utf8
    // jdbc:sqlite:test.db
    // jdbc:sqlite:C:/sqlite/testdb.sqlite
    // jdbc:odbc:TEST
    // jdbc:oracle:thin:@dbserver:1521:oracle...
    // jdbc:log4jdbc:derby://localhost:1527//db-derby-10.2.2.0-bin/databases/MyDatabase
    // jdbc:datadirect:oracle://server3:1521;User=test;Password=secret
    startTime = System.currentTimeMillis();
    StringBuffer buf = new StringBuffer();
    buf.append("jdbc:");
    buf.append(dbType);
    if (!"sqlite".equals(dbType) && !"odbc".equals(dbType)) {
      buf.append("://");
      buf.append(dbServer);
      buf.append("/");
    } else {
      buf.append(":");
    }
    buf.append(dbSchema);
    if ("mysql".equals(dbType)) {
      buf.append("?user=");
      buf.append(dbUser);
      buf.append("&password=");
      buf.append(dbPwd);
      buf.append("&useUnicode=true&characterEncoding=utf8");
    }
    try {
      time1 = System.currentTimeMillis();
//      conn = DriverManager.getConnection(buf.toString());
      //从数据源中获取数据库连接
      conn = ds.getConnection();
      time2 = System.currentTimeMillis();
      // 为了提高以后prepareStatement的速度，在此预先执行一下。
      PreparedStatement ps = conn.prepareStatement("");
      ps.close();
      time3 = System.currentTimeMillis();
    } catch (SQLException e) {
      e.printStackTrace();
      throw e;
    }
    long endTime = System.currentTimeMillis();
    System.out.println("☆☆☆☆☆getConnection处理耗时" + (endTime - startTime) + "毫秒。(其中：获取连接准备："
        + (time1 - startTime) + "毫秒，获取连接执行：" + (time2 - time1) + "毫秒，获取连接执行后："
        + (endTime - time2) + "毫秒），" + (time3 - time2) + "毫秒）");
    System.out.println();
    return new TeapotDbConnection(conn);
  }

  /**
   * 释放已经获取的数据库连接.
   * @param dbConn 数据库连接。
   * @throws SQLException 处理过程中的异常。
   * @since 0.0.1
   */
  public void releaseConnection(Object dbConn) throws SQLException {
    if (dbConn instanceof Connection) {
      ((Connection) dbConn).close();
    }
  }

  /**
   * 构造函数.
   * @since 0.0.1
   */
  private TeapotDb() {
  }

  /**
   * 返回数据库类型.
   * @return 数据库类型。
   * @since 0.0.1
   */
  public String getDbType() {
    return dbType;
  }
}
