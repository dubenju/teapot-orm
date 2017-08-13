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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 与数据库相关处理的类。
 * 通过JDBC创建或释放数据库连接。
 * @author dubenju@126.com
 */
public class TeapotDb {

  private static volatile TeapotDb INSTANCE;
  private String dbType = null;
  private String dbServer = null;
  private String dbUser = null;
  private String dbPwd = null;
  private String dbSchema = null;

  /**
   * 获取实例.
   * @return 实例（单实例）。
   */
  public static TeapotDb getInstance() {
    if (TeapotDb.INSTANCE == null) {
      synchronized (TeapotDb.class) {
        if (TeapotDb.INSTANCE == null) {
          TeapotDb.INSTANCE = new TeapotDb();
          TeapotDb.INSTANCE.init();
        }
      }
    }
    return TeapotDb.INSTANCE;
  }

  /**
   * 初期化处理，从属性配置文件中获取信息并实例化驱动.
   */
  public void init() {
    String path = TeapotDb.class.getResource("").getPath();
    Properties prop = new Properties();//属性集合对象
    // 当前目录>conf>class
    try {
      //属性文件流
      FileInputStream fis = new FileInputStream(path + "../../../../conf/Teapot_ORM.properties");
      prop.load(fis);//将属性文件流装载到Properties对象中
      fis.close();// 关闭流
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    String driverName = prop.getProperty("teapot.database.driver");
    dbType = prop.getProperty("teapot.database.type");
    dbServer = prop.getProperty("teapot.database.hostname");
    dbUser = prop.getProperty("teapot.database.user");
    dbPwd = prop.getProperty("teapot.database.password");
    dbSchema = prop.getProperty("teapot.database.schema");

//    System.out.println("获取属性值：teapot.database.driver=" + driverName);
//    System.out.println("获取属性值：teapot.database.type=" + dbType);
//    System.out.println("获取属性值：teapot.database.hostname=" + dbServer);
//    System.out.println("获取属性值：teapot.database.user=" + dbUser);
//    System.out.println("获取属性值：teapot.database.password=" + dbPwd);
//    System.out.println("获取属性值：teapot.database.schema=" + dbSchema);

    try {
      Class.forName(driverName).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取数据库连接.
   * @return 获取的数据库连接。
   */
  public TeapotDbConnection getConnection() {
    DriverManager.setLogWriter(new PrintWriter(System.out));
    Connection conn = null;
    // jdbc:mysql://localhost/teapot?user=root&password=root&useUnicode=true&characterEncoding=utf8
    // jdbc:sqlite:test.db
    // jdbc:odbc:TEST
    // jdbc:oracle:thin:@dbserver:1521:oracle...
    // jdbc:log4jdbc:derby://localhost:1527//db-derby-10.2.2.0-bin/databases/MyDatabase
    // jdbc:datadirect:oracle://server3:1521;User=test;Password=secret
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
      conn = DriverManager.getConnection(buf.toString());
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return new TeapotDbConnection(conn);
  }

  /**
   * 释放已经获取的数据库连接.
   * @param dbConn 数据库连接。
   * @throws SQLException 处理过程中的异常。
   */
  public void releaseConnection(Object dbConn) throws SQLException {
    if (dbConn instanceof Connection) {
      ((Connection) dbConn).close();
    }
  }

  /**
   * 构造函数.
   */
  private TeapotDb() {
  }

  /**
   * 返回数据库类型.
   * @return 数据库类型。
   */
  public String getDbType() {
    return dbType;
  }
}
