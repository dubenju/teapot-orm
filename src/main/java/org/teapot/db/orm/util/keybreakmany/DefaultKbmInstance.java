package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.util.keybreak.DefaultKbInstance;
import org.teapot.db.orm.util.UModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefaultKbmInstance extends DefaultKbInstance {
  public <T extends IKeyValue> Object runBreak(List<List<T>> transactions,
      IMergeBreakProcs procs, Object param) {
    return mergeBreak( transactions, procs, param, false);
  }

  private <T extends IKeyValue> Object mergeBreak(List<List<T>> transactions,
      IMergeBreakProcs procs, Object param, boolean typeCheck) {

    int total = transactions.size() + 1;
    ((IKeyBreakMany) procs).setTotal(total);

    // merge a set of collections into one
    List<IKeyValue> transaction = mergeTransactions(transactions);

    System.out.println(this.getClass().getName() + "----- getBreakKeys");
    String[] breakKeys = ((IKeyBreakMany) procs).getBreakKeys();

    // sort the merged collection by break keys and the order of collection
    sort(transaction, breakKeys, total, typeCheck);

    List<String> reversedKeys = UModel.toList(breakKeys);

    /*
     * Initialization doContinue methods in procs object
     */
    ((MergeBreakProcs)procs).initContinueMethods();

    /*
     * Storing breakKeys into procedure object to handle break methods,
     * whose suffix is name(of key) not level (of break)
     */
    ((MergeBreakProcs)procs).setKeys(reversedKeys);

    /*
     * For safety, setParam/Result() is declared as protected not public.
     * Therefore casting proc object to the absract class not interface,
     * which requires public methods in it.
     */
    ((MergeBreakProcs)procs).setParam(param);

//    super.runBreak(transaction, breakKeys, procs );
    super.runBreak(transaction, procs, param);

    // Finishing control break procedure. (Finall invoke of callback methods)
    return procs.fin();

  }

  /**
   * 把参与Break处理的数据进行打包.
   * @param transactions 参与Break处理的数据
   * @return 打包后的数据
   */
  private <T extends IKeyValue> List<IKeyValue> mergeTransactions(List<List<T>> transactions) {
    List<IKeyValue> merged = new ArrayList<IKeyValue>();

    for (int index = 0; index < transactions.size(); index ++) {
      List<T> tran = transactions.get(index);
      for (int i = 0; i < tran.size(); i++) {
        IKeyValue naked = tran.get(i);
        // Wrapping an element in list by Wrapp class with index info
        Wrapper wrap = new Wrapper(index, naked);
        // Collection all elments in multiple lists into one
        merged.add(wrap);
      }
    }
    return merged;
  }

  private void sort(List<IKeyValue> merged, String[] breakKeys, int total, boolean typeCheck) {
    // Initialize a comparator specialized to wrapping object
    WrappingComparator<IKeyValue> comp;
    if ( typeCheck ) {
      comp = new WrappingTypeCheckComparator<IKeyValue>( breakKeys );
    } else {
      comp = new WrappingComparator<IKeyValue>(breakKeys, total);
    }

    // execute sort with java.util.Collectons
    Collections.sort(merged, comp);
  }

  /**
   * To wrap elements in Vector to handle multiple doContine[0,1,...n] methods.
   *  Implement IObjectModel interface mulit-type comparation
   */
  private class Wrapper implements IWrapper, IKeyValue {
    private int index;
    private IKeyValue naked;
//    private boolean isWarned = false;

    private Wrapper(int index, IKeyValue naked) {
      this.index = index;
      this.naked = naked;
    }
    // ************* Implementing IWrapper interface ****************** //

    public int getIndex() {
      return this.index;
    }

    public IKeyValue getNaked() {
      return this.naked;
    }

    public Object get(String key) {
      try {
        IKeyValue om = (IKeyValue)getNaked();
        return om.get( key );
      } catch ( ClassCastException cce ) {
//        if ( !this.isWarned ) {
//          System.out.println("[MergeBreakFrame][Warning] Implement IObjectModel interface at "
//                  + getNaked().getClass().getName() );
//        }
//        this.isWarned = true;
//        IKeyValue om = (IKeyValue) getNaked();
//        return om.getSortKey( key );
      }
      return null;
    }

    public IKeyValue set(String key, Object value) {
      return this;
    }
  }
}
