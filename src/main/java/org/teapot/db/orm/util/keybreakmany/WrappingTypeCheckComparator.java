package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.IKeyValue;

import java.math.BigDecimal;

public class WrappingTypeCheckComparator<T> extends WrappingComparator<T> {
  public WrappingTypeCheckComparator() {
  }

  public WrappingTypeCheckComparator(String[] sortKeys) {
    super.setSortKeys( sortKeys );
  }

  /**
   * Caution !
   *  This comparator does allow null value in key field.
   */
  public int compare(Object o1, Object o2) {
    IWrapper w1 = (IWrapper)o1;
    IWrapper w2 = (IWrapper)o2;

    IKeyValue  t1 = (IKeyValue)w1.getNaked();
    IKeyValue  t2 = (IKeyValue)w2.getNaked();

    int comp = 0;

    // Examine sort(break) keys fileds first
    String[] sortKeys = super.getSortKeys();
    KEYS: for (int i = 0; i < sortKeys.length; i ++) {
        Object v1 = t1.get( sortKeys[i] );
        Object v2 = t2.get( sortKeys[i] );

        if ( v1 == null && v2 == null ) {
          continue KEYS;
        }
        if ( v1 == null ) {
          return -1;
        }
        if ( v2 == null ) {
          return 1;
        }

        // Type checking and value comparision
        if ( v1 instanceof String ) {
            comp = ((String)v1).compareTo((String)v2 );
        } else if ( v1 instanceof Integer ) {
            comp = ((Integer)v1).compareTo((Integer)v2 );
        } else if ( v1 instanceof BigDecimal ) {
            comp = ((BigDecimal)v1).compareTo((BigDecimal)v2 );
        } else {
            System.out.println("Unknown type: " + v1.getClass().getName());
        }
        if  (comp !=  0) {
            return comp;
        }
    }

    // Then compare the order of lists given
    return w1.getIndex() - w2.getIndex();
  }
}