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

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * 从SQL到Java数据类型映射的类。
 * @author dubenju@126.com
 */
public class TypeJavaDb {

  private static volatile TypeJavaDb INSTANCE;

  private Map<String, String> typeNameJava = new ConcurrentHashMap<String, String>();
  private Map<String, TypeJavaDb> typeDb = new ConcurrentHashMap<String, TypeJavaDb>();

  /**
   * 获取实例.
   * @return 实例
   */
  public static TypeJavaDb getInstance() {
    if (TypeJavaDb.INSTANCE == null) {
      synchronized (TypeJavaDb.class) {
        if (TypeJavaDb.INSTANCE == null) {
          TypeJavaDb.INSTANCE = new TypeJavaDb();
          TypeJavaDb.INSTANCE.setup();
          if ("mysql".equalsIgnoreCase(TeapotDb.getInstance().getDbType())) {
            TypeJavaDb.INSTANCE.typeDb.put("mysql", new TypeJavaMysql());
          } else if ("sqlite".equalsIgnoreCase(TeapotDb.getInstance().getDbType())) {
            TypeJavaDb.INSTANCE.typeDb.put("sqlite", new TypeJavaSqlite());
          } else if ("xml".equalsIgnoreCase(TeapotDb.getInstance().getDbType())) {
            TypeJavaDb.INSTANCE.typeDb.put("xml", new TypeJavaXml());
          } else {
            TypeJavaDb.INSTANCE.typeDb.put("mysql", new TypeJavaMysql());
            TypeJavaDb.INSTANCE.typeDb.put("sqlite", new TypeJavaSqlite());
            TypeJavaDb.INSTANCE.typeDb.put("xml", new TypeJavaXml());
          }
        }
      }
    }
    return TypeJavaDb.INSTANCE;
  }

  /**
   * 通过数据库类型获取从SQL到Java数据类型的映射类.
   * @param type 数据库类型。
   * @return 从SQL到Java数据类型的映射类。
   */
  public static TypeJavaDb getTypeJava(String type) {
    TypeJavaDb typeJavaDb = TypeJavaDb.getInstance().typeDb.get(type);
    if (typeJavaDb == null) {
      System.out.println("WARNING!!! 由于出现了未注册的数据库类型(" + type + ")，请联系下作者追加一下。");
      typeJavaDb = TypeJavaDb.getInstance();
    }
    return typeJavaDb;
  }

  /**
   * 构造函数.
   */
  protected TypeJavaDb() {
    super();
  }

  /**
   * 通过数据库类型名称返回Java类型名称.
   * @param typeName 数据库类型名称。
   * @return Java类型名称。
   */
  public String getJavaType(String typeName) {
    if (this.typeNameJava.size() <= 0) {
      setup();
    }
    String key = typeName;
    if (key.indexOf("(") >= 0) {
      key = typeName.substring(0, typeName.indexOf("(")).trim();
    }
    return this.typeNameJava.get(key);
  }

  /**
   * 设置从SQL到Java数据类型的映射.
   */
  protected void setup() {
    setType("TINYINT", "java.lang.Integer");
    setType("SMALLINT", "java.lang.Integer");
    setType("INT", "java.lang.Long");
    setType("INTEGER", "java.lang.Long");
    setType("BIGINT", "java.lang.Long");

    setType("CHAR", "java.lang.String");
    setType("VARCHAR", "java.lang.String");
    setType("LONGVARCHAR", "java.lang.String");

    setType("BLOB", "byte[]");
    setType("BINARY", "byte[]");
    setType("VARBINARY", "byte[]");

    setType("CLOB", "java.sql.Clob");

    setType("REAL", "java.lang.Float");
    setType("DOUBLE", "java.lang.Double");
    setType("FLOAT", "java.lang.Float");

    setType("NUMERIC", "java.math.BigDecimal");
    setType("DECIMAL", "java.math.BigDecimal");

    setType("DATE", "java.sql.Date");
    setType("TIME", "java.sql.Time");
    setType("DATETIME", "java.sql.Timestamp");

    setType("BIT", "java.lang.Boolean");
    setType("Array", "java.sql.Array");
    setType("REF", "java.sql.Ref");
    setType("Struct", "java.sql.Struct");
  }

  /**
   * 设置从SQL到Java数据类型的映射的方法.
   * @param dbType 数据库类型名称。
   * @param javaClass Java类型名称。
   */
  public void setType(String dbType, String javaClass) {
    this.typeNameJava.put(dbType, javaClass);
  }
}
