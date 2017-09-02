package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.IKeyValue;

import java.util.Comparator;

/**
 *  This wrapper class takes care of comparing Non-String values.
 *
 */
public class WrappingComparator<T> implements Comparator<T> {
  private String[] sortKeys = null;
  private int total = 0;

  public WrappingComparator() {
  }

  public WrappingComparator(String[] sortKeys, int total) {
    this.sortKeys = sortKeys;
    this.total = total;
  }

  protected void setSortKeys(String[]  sortKeys) {
    this.sortKeys = sortKeys;
  }

  protected String[] getSortKeys() {
    return this.sortKeys;
  }

  /**
   * compare.
   *  Use <code>Comparable</code> interface through ITypeCheckSortable
   *  instead of <code>String</code> class through IRetailSortable.
   *  [Warning!][Critical Assumption]
   *   1. A class implementing IRetailSortable also implements
   *      ITypeCheckSortable like OM classes.
   *   2. A target object implements <code>Comparable</code> interface.
   *
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public int compare(Object o1, Object o2) {
    System.out.println(this.total);
    IWrapper w1 = (IWrapper) o1;
    IWrapper w2 = (IWrapper) o2;

    /*
     * To share this comparator with non-String value
     * the following cast becomes deprecated.
     *
     */

    IKeyValue r1;
    IKeyValue r2;
    try {
      r1 = (IKeyValue) w1.getNaked();
      r2 = (IKeyValue) w2.getNaked();
    } catch ( ClassCastException cce ) {
      //System.out.println("[WrappingComparator][INFO] "
      //+ w1.getNaked().getClass().getName() + " does NOT implement ITypeCheckSortable.");
      return compare( w1, w2 );
    }
    int idxw1 = w1.getIndex();
    int idxw2 = w2.getIndex();

    int comp = 0;
    // Examine sort(break) keys fileds first
    for (int i = 0; i < (this.sortKeys.length / this.total); i ++) {
      System.out.print(i + "," + idxw1 + "," + r1 + "," + sortKeys[i * this.total + idxw1 + 1]);
      System.out.println("<=>" + i + "," + idxw2 + "," + r2 + ","
          + sortKeys[i * this.total + idxw2 + 1]);
      Comparable c1 = (Comparable) r1.get(sortKeys[i * this.total + idxw1 + 1]);
      Comparable c2 = (Comparable) r2.get(sortKeys[i * this.total + idxw2 + 1]);

      comp = c1.compareTo( c2 );
      if  (comp !=  0) {
        return comp;
      }
    }

    // Then compare the order of lists given
    return w1.getIndex() - w2.getIndex();
  }

  /**
   * For Classes, which implemnent only <code>IRetailSortable</code>.
   * @param w1 IWrapper
   * @param w2 IWrapper
   * @return int
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  private int compare(IWrapper w1, IWrapper w2) {
    IKeyValue  r1 = (IKeyValue)w1.getNaked();
    IKeyValue  r2 = (IKeyValue)w2.getNaked();

    int comp = 0;

    // Examine sort(break) keys fileds first
    for (int i = 0; i < sortKeys.length; i ++) {
      Comparable c1 = (Comparable) r1.get((String)sortKeys[i]);
      Comparable c2 = (Comparable) r2.get((String)sortKeys[i]);

      comp = c1.compareTo( c2 );
      if  (comp !=  0) {
        return comp;
      }
    }

    // Then compare the order of lists given
    return w1.getIndex() - w2.getIndex();
  }
}