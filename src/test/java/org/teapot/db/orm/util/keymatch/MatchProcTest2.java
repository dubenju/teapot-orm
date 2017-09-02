package org.teapot.db.orm.util.keymatch;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.One2One;

import java.util.List;

public class MatchProcTest2 extends AbmKeyMatchWrap {

  @Override
  protected boolean doMatch(Object recOfTransaction, Object recOfMaster,
      Object param) throws Exception {
    System.out.println("MA:" + recOfMaster);
    System.out.println("TR:" + recOfTransaction);
    One2One o2o = new One2One((IKeyValue) recOfMaster, (IKeyValue) recOfTransaction);
    @SuppressWarnings("unchecked")
    List<One2One> result = (List<One2One>) param;
    result.add(o2o);
    return false;
  }

  @Override
  protected void doTraOnly(Object recOfTransaction, Object param)
      throws Exception {


  }

  @Override
  protected void doMasOnly(Object recOfMaster, Object param)
      throws Exception {


  }

  @Override
  protected void doMismatch(Object recOfTransaction,
      Object recOfMaster, Object param) throws Exception {


  }

}
