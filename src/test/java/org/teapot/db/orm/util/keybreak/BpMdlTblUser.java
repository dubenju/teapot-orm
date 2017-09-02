package org.teapot.db.orm.util.keybreak;

import org.teapot.db.orm.Formatter;
import org.teapot.db.orm.mdl.MdlTblUser;

import java.util.ArrayList;
import java.util.List;

public class BpMdlTblUser extends AbstractBreakProcedure {

  private String[] brkKeys = {
      Formatter.INSTANCE.fmtFun(MdlTblUser.USER_ID)
  };
  private List<MdlTblUser> result;
  private MdlTblUser user;
  private int cnt;

  @Override
  public String[] getBreakKeys() {
    return this.brkKeys;
  }

  @Override
  public void init(Object param) {
    this.result = new ArrayList<MdlTblUser>();
    this.user = null;
    this.cnt = 0;
  }

  @Override
  public void doContinue(Object tra) {
    MdlTblUser obj = (MdlTblUser) tra;
    if (this.user == null) {
      this.user = obj;
    }
    this.cnt ++;
//    this.result.add(obj);
  }

  /**
   * doBreak.
   */
  public void doBreakTblUserUserId() {
    System.out.println("doBreak");
    this.user.setAppliStDt(String.valueOf(this.cnt));
    this.result.add(this.user);
    this.user = null;
    this.cnt = 0;
  }

  @Override
  public void doEnd() {
  }

  @Override
  public Object fin() {
//    System.out.println(this.result);
    return this.result;
  }

}
