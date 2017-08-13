package org.teapot.db.orm;

import org.teapot.db.orm.mdl.Condition;
import org.teapot.db.orm.mdl.MdlTblSqlite;
import org.teapot.db.TeapotDb;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeapotOrmTest3 {

  /**
   * main.
   *
   * @param args
   *          参数
   */
  public static void main(String[] args) {
    try {
      testCrud();
      // testTran();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 独自事务的CRUD测试.
   *
   * @throws Exception
   *           处理过程中发生的异常。
   */
  public static void testCrud() throws Exception {
    int cnt = 0;
    /* Read */
    List<MdlTblSqlite> list = TeapotOrm.INSTANCE.select(
        MdlTblSqlite.TBL_SQLITE, MdlTblSqlite.class, null, null);
    for (MdlTblSqlite mdl : list) {
      // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07
      // 20:20:20.0,,
      // 2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
      System.out.println(mdl);
    }

    /* Delete */
    Condition conditionDelete = new Condition();
    cnt = TeapotOrm.INSTANCE.delete(MdlTblSqlite.TBL_SQLITE, conditionDelete);

    MdlTblSqlite testa = new MdlTblSqlite();
    testa.setTestId("997");
    testa.setTestName("testa");
    testa.setTestBlob(new byte[0]);
    testa.setTestDouble(1.3d);
    testa.setTestFloat(1.2d);
    testa.setTestTinyint(126);
    testa.setTestInt(12345L);
    testa.setTestDecimal(new BigDecimal("1234.56").doubleValue());
    long st = System.currentTimeMillis();
    testa.setTestDatetime(st);
    testa.setCreateDate(st);
    testa.setCreateTime(st);
    testa.setUpdateDate(st);
    testa.setUpdateTime(st);
    testa.setUpdateUserId("testa");
    testa.setUpdateScreenId("testORMa");

    MdlTblSqlite testb = new MdlTblSqlite();
    testb.setTestId("998");
    testb.setTestName("testb");
    testb.setTestBlob(null);
    testb.setTestDouble(3.4d);
    testb.setTestFloat(5.6d);
    testb.setTestTinyint(12);
    testb.setTestInt(22345L);
    testb.setTestDecimal(new BigDecimal("2234.56").doubleValue());
    st = System.currentTimeMillis();
    testb.setTestDatetime(st);
    testb.setCreateDate(st);
    testb.setCreateTime(st);
    testb.setUpdateDate(st);
    testb.setUpdateTime(st);
    testb.setUpdateUserId("testb");
    testb.setUpdateScreenId("testORMb");

    MdlTblSqlite testc = new MdlTblSqlite();
    testc.setTestId("996");
    testc.setTestName("test6");
    testc.setTestBlob(null);
    testc.setTestDouble(3.46d);
    testc.setTestFloat(5.66d);
    testc.setTestTinyint(126);
    testc.setTestInt(22346L);
    testc.setTestDecimal(new BigDecimal("2234.566").doubleValue());
    st = System.currentTimeMillis();
    testc.setTestDatetime(st);
    testc.setCreateDate(st);
    testc.setCreateTime(st);
    testc.setUpdateDate(st);
    testc.setUpdateTime(st);
    testc.setUpdateUserId("testc");
    testc.setUpdateScreenId("testORMc");

    List<MdlTblSqlite> dataInsert = new ArrayList<MdlTblSqlite>();
    dataInsert.add(testa);
    dataInsert.add(testb);
    /* Create */
    cnt = TeapotOrm.INSTANCE.insert(MdlTblSqlite.TBL_SQLITE, dataInsert);
    // cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST, a);
    System.out.println("Inserted count" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
        MdlTblSqlite.class, null, null);
    for (MdlTblSqlite mdl : list) {
      System.out.println(mdl);
    }

    List<MdlTblSqlite> dataUpdate = new ArrayList<MdlTblSqlite>();
    dataUpdate.add(testc);
    Condition conditionUpdate = new Condition();
    conditionUpdate.addWhere(MdlTblSqlite.TEST_ID, Condition.EQUAL, "997");
    /* Update */
    cnt = TeapotOrm.INSTANCE.update(MdlTblSqlite.TBL_SQLITE, conditionUpdate,
        dataUpdate);
    // cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate, c);
    System.out.println("Updated count" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
        MdlTblSqlite.class, null, null);
    for (MdlTblSqlite mdl : list) {
      System.out.println(mdl);
    }

    /* Delete */
    Condition conditionDel = new Condition();
    conditionDel.addWhere(MdlTblSqlite.TEST_ID, Condition.EQUAL, "998");
    cnt = TeapotOrm.INSTANCE.delete(MdlTblSqlite.TBL_SQLITE, conditionDel);
    System.out.println("Deleted count=" + cnt);
    list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
        MdlTblSqlite.class, null, null);
    for (MdlTblSqlite mdl : list) {
      System.out.println(mdl);
    }
  }
  /**
   * 事务测试.
   */
  public static void testTran() {
    int cnt = 0;
    Connection conn = null;
    try {
      conn = TeapotDb.getInstance().getConnection();
      // 将自动提交设置为 false，
      // 若设置为 true 则数据库将会把每一次数据更新认定为一个事务并自动提交
      conn.setAutoCommit(false);

      /* Read */
      List<MdlTblSqlite> list = TeapotOrm.INSTANCE.select(
          MdlTblSqlite.TBL_SQLITE, MdlTblSqlite.class, null, null, conn);
      for (MdlTblSqlite mdl : list) {
        // 999,系统管理,true,[B@5c5a1b69,1.2,2.3,100,200,300,400,2016-06-07
        // 20:20:20.0,,2016-06-07,20:20:20,2016-06-07,20:20:20,admin,init
        System.out.println(mdl);
      }

      /* Delete */
      Condition conditionDelete = new Condition();
      cnt = TeapotOrm.INSTANCE.delete(MdlTblSqlite.TBL_SQLITE, conditionDelete,
          conn);

      MdlTblSqlite testa = new MdlTblSqlite();
      testa.setTestId("997");
      testa.setTestName("testa");
      testa.setTestBlob(new byte[0]);
      testa.setTestDouble(1.3d);
      testa.setTestFloat(1.2d);
      testa.setTestTinyint(126);
      testa.setTestInt(12345L);
      testa.setTestDecimal(new BigDecimal("1234.56").doubleValue());
      long st = System.currentTimeMillis();
      testa.setTestDatetime(st);
      testa.setCreateDate(st);
      testa.setCreateTime(st);
      testa.setUpdateDate(st);
      testa.setUpdateTime(st);
      testa.setUpdateUserId("testa");
      testa.setUpdateScreenId("testORMa");

      MdlTblSqlite testb = new MdlTblSqlite();
      testb.setTestId("998");
      testb.setTestName("testb");
      testb.setTestBlob(null);
      testb.setTestDouble(3.4d);
      testb.setTestFloat(5.6d);
      testb.setTestTinyint(12);
      testb.setTestInt(22345L);
      testb.setTestDecimal(new BigDecimal("2234.56").doubleValue());
      st = System.currentTimeMillis();
      testb.setTestDatetime(st);
      testb.setCreateDate(st);
      testb.setCreateTime(st);
      testb.setUpdateDate(st);
      testb.setUpdateTime(st);
      testb.setUpdateUserId("testb");
      testb.setUpdateScreenId("testORMb");

      MdlTblSqlite testc = new MdlTblSqlite();
      testc.setTestId("996");
      testc.setTestName("test6");
      testc.setTestBlob(null);
      testc.setTestDouble(3.46d);
      testc.setTestFloat(5.66d);
      testc.setTestTinyint(126);
      testc.setTestInt(22346L);
      testc.setTestDecimal(new BigDecimal("2234.566").doubleValue());
      st = System.currentTimeMillis();
      testc.setTestDatetime(st);
      testc.setCreateDate(st);
      testc.setCreateTime(st);
      testc.setUpdateDate(st);
      testc.setUpdateTime(st);
      testc.setUpdateUserId("testc");
      testc.setUpdateScreenId("testORMc");

      List<MdlTblSqlite> dataInsert = new ArrayList<MdlTblSqlite>();
      dataInsert.add(testa);
      dataInsert.add(testb);
      /* Create */
      cnt = TeapotOrm.INSTANCE
          .insert(MdlTblSqlite.TBL_SQLITE, dataInsert, conn);
      // cnt = TeapotOrm.INSTANCE.insert(MdlTblTest.TBL_TEST, a, conn);
      System.out.println("Inserted count" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
          MdlTblSqlite.class, null, null, conn);
      for (MdlTblSqlite mdl : list) {
        System.out.println(mdl);
      }

      List<MdlTblSqlite> dataUpdate = new ArrayList<MdlTblSqlite>();
      dataUpdate.add(testc);
      Condition conditionUpdate = new Condition();
      conditionUpdate.addWhere(MdlTblSqlite.TEST_ID, Condition.EQUAL, "997");
      /* Update */
      cnt = TeapotOrm.INSTANCE.update(MdlTblSqlite.TBL_SQLITE, conditionUpdate,
          dataUpdate, conn);
      // cnt = TeapotOrm.INSTANCE.update(MdlTblTest.TBL_TEST, conditionUpdate,
      // c, conn);
      System.out.println("Updated count" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
          MdlTblSqlite.class, null, null, conn);
      for (MdlTblSqlite mdl : list) {
        System.out.println(mdl);
      }

      /* Delete */
      Condition conditionDel = new Condition();
      conditionDel.addWhere(MdlTblSqlite.TEST_ID, Condition.EQUAL, "996");
      cnt = TeapotOrm.INSTANCE.delete(MdlTblSqlite.TBL_SQLITE, conditionDel,
          conn);
      System.out.println("Deleted count=" + cnt);
      list = TeapotOrm.INSTANCE.select(MdlTblSqlite.TBL_SQLITE,
          MdlTblSqlite.class, null, null, conn);
      for (MdlTblSqlite mdl : list) {
        System.out.println(mdl);
      }

      // 提交事务
      conn.commit();
    } catch (SQLException sqle) {
      try {
        // 发生异常，回滚在本事务中的操做
        conn.rollback();
        // 事务回滚：转账的两步操作完全撤销
        conn.close();
        conn = null;
      } catch (Exception ignore) {
        ignore.printStackTrace();
      }
      sqle.printStackTrace();
    } finally {
      if (conn != null) {
        try {
          TeapotDb.getInstance().releaseConnection(conn);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
