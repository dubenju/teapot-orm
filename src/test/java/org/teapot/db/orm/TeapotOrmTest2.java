package org.teapot.db.orm;

import org.teapot.db.orm.mdl.Condition;
import org.teapot.db.orm.mdl.MdlTblTest;
import org.teapot.db.orm.mdl.Orderby;
import org.teapot.db.orm.util.UModelConstant;
import org.teapot.db.TeapotDb;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Savepoint;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TeapotOrmTest2 {

  /**
   * main.
   * @param args 参数
   */
  public static void main(String[] args) {
    try {
      TeapotOrm.INSTANCE.getTableInfo();
      testCrud();
//      testTran();
//      testIn();
//      testLike();
//      testNotNull();
      testBetween();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 独自事务的CRUD测试.
   * @throws Exception 处理过程中发生的异常。
   */
  public static void testCrud() throws Exception {
    int cnt = 0;
    /* Read */
    List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    /* Delete */
    Condition conditionDelete = new Condition();
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, conditionDelete);

    MdlTblTest testa = new MdlTblTest();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBit(false);
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2f);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56"));
    long st = System.currentTimeMillis();
    testa.setTestDatetime(new Timestamp(st));
    testa.setCreateDate(new Date(st));
    testa.setCreateTime(new Time(st));
    testa.setUpdateDate(new Date(st));
    testa.setUpdateTime(new Time(st));
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblTest testb = new MdlTblTest();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBit(true);
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6f);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56"));
    st = System.currentTimeMillis();
    testb.setTestDatetime(new Timestamp(st));
    testb.setCreateDate(new Date(st));
    testb.setCreateTime(new Time(st));
    testb.setUpdateDate(new Date(st));
    testb.setUpdateTime(new Time(st));
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblTest testc = new MdlTblTest();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBit(true);
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66f);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566"));
    st = System.currentTimeMillis();
    testc.setTestDatetime(new Timestamp(st));
    testc.setCreateDate(new Date(st));
    testc.setCreateTime(new Time(st));
    testc.setUpdateDate(new Date(st));
    testc.setUpdateTime(new Time(st));
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert);
//    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  a);
    System.out.println("Inserted count" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      System.out.println(mdl);
    }

    List<MdlTblTest> dataUpdate = new ArrayList<MdlTblTest>();
    dataUpdate.add(testc);
    Condition conditionUpdate = new Condition();
    conditionUpdate.where(MdlTblTest.TEST_ID, Condition.EQUAL, "997");
    /* Update */
    cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate, dataUpdate);
//    cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate, c);
    System.out.println("Updated count" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      System.out.println(mdl);
    }

    /* Delete */
    Condition conditionDel = new Condition();
    conditionDel.where(MdlTblTest.TEST_ID, Condition.EQUAL, "998");
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, conditionDel);
    System.out.println("Deleted count=" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      System.out.println(mdl);
    }
  }

  /**
   * 事务测试.
   */
  public static void testTran() {
    int cnt = 0;
    Connection conn = null;
    Savepoint savepoint = null;
    try {
      conn = TeapotDb.getInstance().getConnection();
      // 将自动提交设置为 false，
      //若设置为 true 则数据库将会把每一次数据更新认定为一个事务并自动提交
      conn.setAutoCommit(false);

      /* Read */
      List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
          MdlTblTest.TBL_TEST, MdlTblTest.class, null, null, conn);
      for (MdlTblTest mdl : list) {
        // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
        // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
        System.out.println(mdl);
      }

      /* Delete */
      Condition conditionDelete = new Condition();
      cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, conditionDelete, conn);

      MdlTblTest testa = new MdlTblTest();
      testa.setTestId("997");
      testa.setTestName("testa");
      testa.setTestBit(false);
      testa.setTestBlob(new byte[0]);
      testa.setTestDouble(1.3d);
      testa.setTestFloat(1.2f);
      testa.setTestTinyint(126);
      testa.setTestInt(12345L);
      testa.setTestDecimal(new BigDecimal("1234.56"));
      long st = System.currentTimeMillis();
      testa.setTestDatetime(new Timestamp(st));
      testa.setCreateDate(new Date(st));
      testa.setCreateTime(new Time(st));
      testa.setUpdateDate(new Date(st));
      testa.setUpdateTime(new Time(st));
      testa.setUpdateUserId("testa");
      testa.setUpdateScreenId("testORMa");

      MdlTblTest testb = new MdlTblTest();
      testb.setTestId("998");
      testb.setTestName("testb");
      testb.setTestBit(true);
      testb.setTestBlob(null);
      testb.setTestDouble(3.4d);
      testb.setTestFloat(5.6f);
      testb.setTestTinyint(12);
      testb.setTestInt(22345L);
      testb.setTestDecimal(new BigDecimal("2234.56"));
      st = System.currentTimeMillis();
      testb.setTestDatetime(new Timestamp(st));
      testb.setCreateDate(new Date(st));
      testb.setCreateTime(new Time(st));
      testb.setUpdateDate(new Date(st));
      testb.setUpdateTime(new Time(st));
      testb.setUpdateUserId("testb");
      testb.setUpdateScreenId("testORMb");

      MdlTblTest testc = new MdlTblTest();
      testc.setTestId("996");
      testc.setTestName("test6");
      testc.setTestBit(true);
      testc.setTestBlob(null);
      testc.setTestDouble(3.46d);
      testc.setTestFloat(5.66f);
      testc.setTestTinyint(126);
      testc.setTestInt(22346L);
      testc.setTestDecimal(new BigDecimal("2234.566"));
      st = System.currentTimeMillis();
      testc.setTestDatetime(new Timestamp(st));
      testc.setCreateDate(new Date(st));
      testc.setCreateTime(new Time(st));
      testc.setUpdateDate(new Date(st));
      testc.setUpdateTime(new Time(st));
      testc.setUpdateUserId("testc");
      testc.setUpdateScreenId("testORMc");

      List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
      dataInsert.add(testa);
      dataInsert.add(testb);
      /* Create */
      cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert, conn);
//      cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  a, conn);
      System.out.println("Inserted count" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null, conn);
      for (MdlTblTest mdl : list) {
        System.out.println(mdl);
      }
      savepoint = conn.setSavepoint("TBL_TEST_INSERT_SavePoint");

      List<MdlTblTest> dataUpdate = new ArrayList<MdlTblTest>();
      dataUpdate.add(testc);
      Condition conditionUpdate = new Condition();
      conditionUpdate.where(MdlTblTest.TEST_ID, Condition.EQUAL, "997");
      /* Update */
      cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate, dataUpdate, conn);
//      cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate, c, conn);
      System.out.println("Updated count" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null, conn);
      for (MdlTblTest mdl : list) {
        System.out.println(mdl);
      }

      /* Delete */
      Condition conditionDel = new Condition();
      conditionDel.where(MdlTblTest.TEST_ID, Condition.EQUAL, "996");
      cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, conditionDel, conn);
      System.out.println("Deleted count=" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblTest.TBL_TEST, MdlTblTest.class, null, null, conn);
      for (MdlTblTest mdl : list) {
        System.out.println(mdl);
      }

      // 提交事务
      conn.commit();
    } catch (SQLException sqle) {
      try {
        if (savepoint == null) {
          // 发生异常，回滚在本事务中的操做
          conn.rollback();
//          // 事务回滚：转账的两步操作完全撤销
//          conn.close();
//          conn = null;
        } else {
          // exception occurred in inserting into Logs table
          // we can ignore it by rollback to the savepoint
          conn.rollback(savepoint);
          // lets commit now
          conn.commit();
        }
      } catch (SQLException ignore) {
        ignore.printStackTrace();
      }
      sqle.printStackTrace();
    }  finally {
      if (conn != null) {
        try {
          conn.setAutoCommit(true);
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  /**
   * IN 条件测试.
   */
  public static void testIn() throws Exception {
    int cnt = 0;
    /* Delete */
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, null);

    MdlTblTest testa = new MdlTblTest();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBit(false);
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2f);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56"));
    long st = System.currentTimeMillis();
    testa.setTestDatetime(new Timestamp(st));
    testa.setCreateDate(new Date(st));
    testa.setCreateTime(new Time(st));
    testa.setUpdateDate(new Date(st));
    testa.setUpdateTime(new Time(st));
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblTest testb = new MdlTblTest();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBit(true);
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6f);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56"));
    st = System.currentTimeMillis();
    testb.setTestDatetime(new Timestamp(st));
    testb.setCreateDate(new Date(st));
    testb.setCreateTime(new Time(st));
    testb.setUpdateDate(new Date(st));
    testb.setUpdateTime(new Time(st));
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblTest testc = new MdlTblTest();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBit(true);
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66f);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566"));
    st = System.currentTimeMillis();
    testc.setTestDatetime(new Timestamp(st));
    testc.setCreateDate(new Date(st));
    testc.setCreateTime(new Time(st));
    testc.setUpdateDate(new Date(st));
    testc.setUpdateTime(new Time(st));
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    dataInsert.add(testc);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert);
    System.out.println(cnt);

    /* Read */
    List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    Condition condition = new Condition();
//    condition.addWhere(MdlTblTest.TEST_ID, Condition.IN, "996");
    String[] inValue = {
        "996", "997", "998"
    };
    condition.where(MdlTblTest.TEST_ID, Condition.IN, inValue);
    list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, condition, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }
  }


  /**
   * LIKE 条件测试.
   */
  public static void testLike() throws Exception {
    int cnt = 0;
    /* Delete */
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, null);

    MdlTblTest testa = new MdlTblTest();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBit(false);
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2f);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56"));
    long st = System.currentTimeMillis();
    testa.setTestDatetime(new Timestamp(st));
    testa.setCreateDate(new Date(st));
    testa.setCreateTime(new Time(st));
    testa.setUpdateDate(new Date(st));
    testa.setUpdateTime(new Time(st));
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblTest testb = new MdlTblTest();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBit(true);
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6f);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56"));
    st = System.currentTimeMillis();
    testb.setTestDatetime(new Timestamp(st));
    testb.setCreateDate(new Date(st));
    testb.setCreateTime(new Time(st));
    testb.setUpdateDate(new Date(st));
    testb.setUpdateTime(new Time(st));
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblTest testc = new MdlTblTest();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBit(true);
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66f);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566"));
    st = System.currentTimeMillis();
    testc.setTestDatetime(new Timestamp(st));
    testc.setCreateDate(new Date(st));
    testc.setCreateTime(new Time(st));
    testc.setUpdateDate(new Date(st));
    testc.setUpdateTime(new Time(st));
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    dataInsert.add(testc);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert);
    System.out.println(cnt);

    /* Read */
    List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    Condition condition = new Condition();
    condition.where(MdlTblTest.TEST_ID, Condition.LIKE, "9%7");
//    String[] inValue = {
//        "996", "997", "998"
//    };
//    condition.addWhere(MdlTblTest.TEST_ID, Condition.IN, inValue);
    list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, condition, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }
  }
  /**
   * NOT NULL 条件测试.
   */
  public static void testNotNull() throws Exception {
    int cnt = 0;
    /* Delete */
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, null);

    MdlTblTest testa = new MdlTblTest();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBit(false);
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2f);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56"));
    long st = System.currentTimeMillis();
    testa.setTestDatetime(new Timestamp(st));
    testa.setCreateDate(new Date(st));
    testa.setCreateTime(new Time(st));
    testa.setUpdateDate(new Date(st));
    testa.setUpdateTime(new Time(st));
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblTest testb = new MdlTblTest();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBit(true);
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6f);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56"));
    st = System.currentTimeMillis();
    testb.setTestDatetime(new Timestamp(st));
    testb.setCreateDate(new Date(st));
    testb.setCreateTime(new Time(st));
    testb.setUpdateDate(new Date(st));
    testb.setUpdateTime(new Time(st));
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblTest testc = new MdlTblTest();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBit(true);
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66f);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566"));
    st = System.currentTimeMillis();
    testc.setTestDatetime(new Timestamp(st));
    testc.setCreateDate(new Date(st));
    testc.setCreateTime(new Time(st));
    testc.setUpdateDate(new Date(st));
    testc.setUpdateTime(new Time(st));
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    dataInsert.add(testc);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert);
    System.out.println(cnt);

    /* Read */
    List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    Condition condition = new Condition();
//    condition.addWhere(MdlTblTest.TEST_ID, Condition.IS_NOT_NULL, null);
    condition.where(MdlTblTest.TEST_ID, Condition.IS_NULL, null);

    list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, condition, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }
  }
  /**
   * BETWEEN AND 条件测试.
   */
  public static void testBetween() throws Exception {
    int cnt = 0;
    /* Delete */
    cnt = TeapotOrm.INSTANCE.delete(MdlTblTest.TBL_TEST, null);

    MdlTblTest testa = new MdlTblTest();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBit(false);
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2f);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56"));
    long st = System.currentTimeMillis();
    testa.setTestDatetime(new Timestamp(st));
    testa.setCreateDate(new Date(st));
    testa.setCreateTime(new Time(st));
    testa.setUpdateDate(new Date(st));
    testa.setUpdateTime(new Time(st));
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblTest testb = new MdlTblTest();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBit(true);
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6f);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56"));
    st = System.currentTimeMillis();
    testb.setTestDatetime(new Timestamp(st));
    testb.setCreateDate(new Date(st));
    testb.setCreateTime(new Time(st));
    testb.setUpdateDate(new Date(st));
    testb.setUpdateTime(new Time(st));
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblTest testc = new MdlTblTest();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBit(true);
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66f);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566"));
    st = System.currentTimeMillis();
    testc.setTestDatetime(new Timestamp(st));
    testc.setCreateDate(new Date(st));
    testc.setCreateTime(new Time(st));
    testc.setUpdateDate(new Date(st));
    testc.setUpdateTime(new Time(st));
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblTest> dataInsert = new ArrayList<MdlTblTest>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    dataInsert.add(testc);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST,  dataInsert);
    System.out.println(cnt);

    /* Read */
    List<MdlTblTest> list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, null, null);
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    Condition condition = new Condition();
    String[] range = {
        "996", "997"
    };
    condition
    .where(MdlTblTest.TEST_ID, Condition.BETWEEN, range)
    .and(MdlTblTest.TEST_NAME, Condition.EQUAL, "test6")
      .or(MdlTblTest.TEST_NAME, Condition.EQUAL, "testa");

    list = TeapotOrm.INSTANCE.select(
        MdlTblTest.TBL_TEST, MdlTblTest.class, condition,
        new Orderby(MdlTblTest.TEST_ID, UModelConstant.SORT_DSC).orderby());
    for (MdlTblTest mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }
  }
}
