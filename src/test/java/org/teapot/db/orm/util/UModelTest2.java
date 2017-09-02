package org.teapot.db.orm.util;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.mdl.MdlTblMsg;
import org.teapot.db.orm.mdl.MdlTblUser;
import org.teapot.db.orm.One2One;
import org.teapot.db.orm.util.keybreak.BpMdlTblUser;
import org.teapot.db.orm.util.keybreakmany.BpmMdlTblUser;
import org.teapot.db.orm.util.keymatch.MatchProcTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UModelTest2 {

  /**
   * main.
   *
   * @param args
   *          参数
   */
  public static void main(String[] args) {
    test3();
  }

  /**
   * test1.
   */
  public static void test1() {
    List<MdlTblMsg> msgs = new ArrayList<MdlTblMsg>();
    MdlTblMsg msg = new MdlTblMsg();
    msg.setUserId("001");
    msgs.add(msg);

    List<MdlTblUser> users = new ArrayList<MdlTblUser>();
    MdlTblUser user = new MdlTblUser();
    user.setUserId("001");
    user.setUserNnm("Test001");
    users.add(user);

    HashMap<String, String> keys = new HashMap<String, String>();
    keys.put(MdlTblUser.USER_ID, MdlTblMsg.USER_ID);

    List<One2One> result = new ArrayList<One2One>();
    try {
      UModel.keyMatch(users, msgs, keys,
          null, null, new MatchProcTest2(), result);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(result);
    System.out.println("处理结束。");
  }

  /**
   * test2.
   */
  public static void test2() {
    List<MdlTblUser> users = new ArrayList<MdlTblUser>();
    MdlTblUser user = new MdlTblUser();
    user.setUserId("001");
    user.setUserNnm("Test001");
    users.add(user);
    users.add(user);
    MdlTblUser user2 = new MdlTblUser();
    user2.setUserId("002");
    user2.setUserNnm("Test002");
    users.add(user2);
    for (MdlTblUser usr : users) {
      System.out.println(usr);
    }

    @SuppressWarnings("unchecked")
    List<MdlTblUser> users2 = (List<MdlTblUser>) UModel.keyBreak(users, new BpMdlTblUser(), null);
    for (MdlTblUser usr : users2) {
      System.out.println(usr);
    }
  }

  /**
   * test32.
   */
  public static void test3() {

    MdlTblUser user = new MdlTblUser();
    user.setUserId("001");
    user.setAppliStDt("20170801");
    user.setUserNnm("Test001");
    List<IKeyValue> users = new ArrayList<IKeyValue>();
    users.add(user);
    users.add(user);
    MdlTblUser user2 = new MdlTblUser();
    user2.setUserId("002");
    user2.setAppliStDt("20170801");
    user2.setUserNnm("Test002");
    users.add(user2);
    for (IKeyValue usr : users) {
      System.out.println(usr);
    }
    List<IKeyValue> msgs = new ArrayList<IKeyValue>();
    MdlTblMsg msg = new MdlTblMsg();
    msg.setUserId("001");
    msg.setPubDt("20170801");
    msgs.add(msg);

//    String[] breakKeys = {
//        Formatter.INSTANCE.fmtFun(MdlTblUser.USER_ID)
//    };
    List<List<IKeyValue>> trans = new ArrayList<List<IKeyValue>>();
    trans.add(users);
    trans.add(msgs);

    @SuppressWarnings("unchecked")
    List<One2One> users2 = (List<One2One>)
        UModel.keyBreakMany(trans, new BpmMdlTblUser(), null);

    if (users2 != null) {
      for (One2One usr : users2) {
        System.out.println(usr);
      }
    }
  }
}
