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

package org.teapot.db.orm.util.keybreak;

import org.teapot.db.orm.IKeyValue;
import org.teapot.db.orm.util.keybreakmany.IWrapper;
import org.teapot.db.orm.util.UModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultKbInstance {
  /**
   * runBreak.
   * @param transaction Transaction
   * @param proc 回调函数
   * @param arg 参数
   * @param <T> 类型
   * @return 结果
   */
  @SuppressWarnings("unchecked")
  public <T extends IKeyValue> Object runBreak(List<T> transaction, IBreakProcedure proc,
      Object arg) {
    System.out.println(this.getClass().getName() + "----- reset");
    ((IKeyBreak) proc).reset();

    /* MAIN-RTN */
    // PROG-INIT
    System.out.println(this.getClass().getName() + "----- init");
    proc.init(arg);
    // READ-TR
    // Object tr = transaction.get(0);

    System.out.println(this.getClass().getName() + "----- getBreakKeys");
    String[] abreakKeys = ((IKeyBreak) proc).getBreakKeys();
    List<String> breakKeys = UModel.toList(abreakKeys);
    ((IKeyBreak) proc).setKeys(breakKeys);
    breakKeys = Arrays.asList(abreakKeys);
    int total = ((IKeyBreak) proc).getTotal();

    System.out.println(this.getClass().getName() + "----- setTransaction");
    ((IKeyBreak)proc).setTransaction(transaction);

    Object tra = null;
    Object traNext = null;

    int keySize = breakKeys.size() / total;
    boolean isFirstRecord = true;

    List<Comparable<?>> nextKeys = new ArrayList<Comparable<?>>(keySize);
    for (int i = 0; i < keySize; i ++) {
      nextKeys.add(i, "");
    }

    LBL_KEYBREAK_LOOP: for (;;) {
      System.out.println(this.getClass().getName() + "----- readTransaction");
      tra = ((IKeyBreak) proc).readTransaction();
      if (tra == null) {
          System.out.println(this.getClass().getName() + "----- doEnd");
          proc.doEnd();
          break LBL_KEYBREAK_LOOP;
      } else if (isFirstRecord) {
        System.out.println(this.getClass().getName() + "----- doFirstRecord");
        proc.doFirstRecord();
        isFirstRecord = false;
      }

      System.out.println(this.getClass().getName() + "----- readNextTransaction");
      traNext = ( (IKeyBreak) proc).readNextTransaction();
      if (traNext != null) {
        for (int i = 0; i < keySize ; i++) {
          Comparable<?> val = null;
          int idxTraNext = 0;
          if (traNext instanceof IWrapper) {
            idxTraNext = ((IWrapper) traNext).getIndex() + 1;
          }
          String brKey = breakKeys.get(i * total + idxTraNext);
          System.out.println(this.getClass().getName() + "--- set for next ---" + brKey);
          try {
            val = (Comparable<?>)((IKeyValue) traNext).get( brKey );
          } catch ( ClassCastException cce ) {
            cce.printStackTrace();
          }
          if ( val == null ) {
            val = "";
          }
          nextKeys.set(i, val);
        } // for
      } else {
        for (int i = 0; i < keySize ; i++) {
          nextKeys.set( i, "" );
        }
      }

      LBL_KEYBREAK_COMP: for (int i = 0 ; i < keySize ; i ++) {
        int idxtra = 0;
        if (tra instanceof IWrapper) {
          idxtra = ((IWrapper) tra).getIndex() + 1;
        }
        String brKey = breakKeys.get(i * total + idxtra);
        System.out.print(this.getClass().getName() + "----bKey:" + brKey);

        @SuppressWarnings("rawtypes")
        Comparable v1 = null;;
        try {
          v1 = (Comparable<?>)((IKeyValue)tra).get( brKey );
        } catch ( ClassCastException cce ) {
          cce.printStackTrace();
        }

        Comparable<?> v2 = (Comparable<?>) nextKeys.get(i);

        if ( v1 == null ) {
          v1 = "";
        }
        System.out.print("v1:" + v1 + "_vs_v2:" + v2);

        int comp = 0;
        try {
          comp = v1.compareTo( v2 );
        } catch ( ClassCastException cce ) {
          if ( v2 == "" ) {
            comp = 1;
          }
        }

        System.out.println(" comp=" + comp);
        if (comp < 0 ) {
          System.out.println(this.getClass().getName() + "----- doContinue");
          proc.doContinue(); // call doContinue before doBreak
          if ( keySize == 1) {
            System.out.println(this.getClass().getName() + "----- doBreak");
            proc.doBreak(1);
          } else {
            System.out.println(this.getClass().getName() + "----- doBreak i=" + i);
            for (int j = 1; j < keySize - i + 1 ; j ++) {
              proc.doBreak(j);
            }
          }
          break LBL_KEYBREAK_COMP;
        } else if (comp > 0 ) {
          System.out.println(this.getClass().getName() + "----- doContinue");
          proc.doContinue(); // call doContinue before doBreak

          if ( keySize == 1) {
            System.out.println(this.getClass().getName() + "----- doBreak");
            proc.doBreak(1);
          } else {
            System.out.println(this.getClass().getName() + "----- doBreak");
            for (int j = 1; j < keySize - i + 1; j ++) {
              proc.doBreak(j);
            }
          }

          if ( nextKeys.get(i) == null ) {
            System.out.println(this.getClass().getName() + "----- doEnd");
            proc.doEnd();
            break LBL_KEYBREAK_LOOP;
          }
          break LBL_KEYBREAK_COMP; // check the following transaction
        } else {
          /* comp = 0 */
          if (i == keySize - 1) {
            System.out.println(this.getClass().getName() + "----- doContinue");
            proc.doContinue();
            break LBL_KEYBREAK_COMP; // check the following transaction
          }
        }
      } // LBL_KEYBREAK_COMP
      System.out.println();
      } // LBL_KEYBREAK_LOOP

    System.out.println(this.getClass().getName() + "----- fin");
    return proc.fin();
  }
}
