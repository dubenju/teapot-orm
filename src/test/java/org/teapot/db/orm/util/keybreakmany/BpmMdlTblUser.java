package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.mdl.MdlTblMsg;
import org.teapot.db.orm.mdl.MdlTblUser;
import org.teapot.db.orm.One2One;

import java.util.ArrayList;
import java.util.List;

public class BpmMdlTblUser extends MergeBreakProcs {

  private String[] breakKeys = {
      "UserId", MdlTblUser.USER_ID, MdlTblMsg.USER_ID,
      "Ymd", MdlTblUser.APPLI_ST_DT, MdlTblMsg.PUB_DT
  };
  private List<One2One> result;
  private MdlTblUser user;
  private int cnt;
  private MdlTblMsg msg;
  private int cnt2;

  @Override
  public String[] getBreakKeys() {
    return this.breakKeys;
  }

  @Override
  public void init(Object param) {
    this.result = new ArrayList<One2One>();
    this.user = null;
    this.cnt = 0;
  }

  /**
   * doContinue0.
   * @param tra Object
   */
  public void doContinue0(Object tra) {
    MdlTblUser obj = (MdlTblUser) tra;
    if (this.user == null) {
      this.user = obj;
    }
    this.cnt ++;
  }

  /**
   * doContinue1.
   * @param tra Object tra
   */
  public void doContinue1(Object tra) {
    MdlTblMsg obj = (MdlTblMsg) tra;
    if (this.msg == null) {
      this.msg = obj;
    }
    this.cnt2 ++;
  }
  /**
   * doBreakUserId.
   */
  public void doBreakUserId() {
    System.out.println("①------- doBreak");
    if (this.user != null) {
      this.user.setUpdUserId(String.valueOf(this.cnt));
    }
    if (this.msg != null) {
      this.msg.setUpdUserId(String.valueOf(this.cnt2));
    }
    this.result.add(new One2One(this.user, this.msg));

    this.user = null;
    this.cnt = 0;
    this.msg = null;
    this.cnt2 = 0;
  }

  public void doBreakYmd() {
    System.out.println("②------- doBreakYmd");
  }

  @Override
  public void doEnd() {
  }

  @Override
  public Object fin() {
    return this.result;
  }

}
