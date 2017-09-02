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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class AbstractBreakProcedure implements IKeyBreak, IBreakProcedure {
  private int idxOfTra = 0;
  private List<?> transaction = null;
  private String breakMethodPrefix = null;
  private Method[] breakMethods = null;
  private Object param;
  protected List<String> breakKeys;
  private int total = 1;

  @Override
  public void doFirstRecord() {
    doFirstRecord( getTransaction(), this.param );
  }

  public void doFirstRecord(Object tra , Object param) {
  }

  @Override
  public void doContinue() {
    doContinue( getTransaction() );
  }

  @Override
  public void doBreak(int idx) {
    System.out.println("----- idx=" + idx);
    Object[] args = {};

    if (breakMethods == null) {
      System.out.println("----- ----- initBreakMethods");
      initBreakMethods();
//      print();
    }

    try {
      breakMethods[idx - 1].invoke(this, args);
    } catch (IllegalAccessException | IllegalArgumentException
            | InvocationTargetException e) {
      e.printStackTrace();
    }
  }

//  public void print() {
//    for (int i = 0; i < this.breakMethods.length;i ++) {
//      System.out.println(this.breakMethods[i].getName());
//    }
//  }
  /**
   * 设置Transaction
   * @param transaction Transaction
   * @see org.teapot.db.orm.util.keybreak.IKeyBreak#setTransaction(java.util.List)
   */
  @Override
  public void setTransaction(List<?> transaction) {
    this.transaction = transaction;
  }

  /**
   * 读取Transaction.
   * @return 读取Transaction
   * @see org.teapot.db.orm.util.keybreak.IKeyBreak#readTransaction()
   */
  @Override
  public Object readTransaction() {
    if (transaction == null
        || transaction.size() == 0
        || transaction.size() == idxOfTra) {
      return null;
    }
    return transaction.get(idxOfTra++);
  }

  /**
   * 读取下一个Transaction.
   * @return 下一个Transaction
   * @see org.teapot.db.orm.util.keybreak.IKeyBreak#readNextTransaction()
   */
  @Override
  public Object readNextTransaction() {
    if (transaction == null
        || transaction.size() < 2
        || transaction.size() <= idxOfTra) {
      return null;
    }
    return transaction.get(idxOfTra);
  }

  /**
   * 重置.
   * @see org.teapot.db.orm.util.keybreak.IKeyBreak#reset()
   */
  @Override
  public void reset() {
    this.idxOfTra = 0;
    this.transaction = null;
    this.breakMethods = null;
    this.breakMethodPrefix = null;
  }

  /**
   * 获取Transaction.
   * @return Transaction
   */
  protected Object getTransaction() {
    if (transaction == null || transaction.size() == 0) {
      return null;
    }
    if ( idxOfTra == 0) {
      return transaction.get(0);
    }
    return transaction.get(idxOfTra - 1); // since idx was moved forward by one after read()
  }

  /**
   * 获取Break方法前缀.
   * @return Break方法前缀
   */
  protected String getBreakMethodPrefix() {
    if (breakMethodPrefix == null) {
      breakMethodPrefix = "doBreak";
    }

    return breakMethodPrefix;
  }

  protected void initBreakMethods() {
    Method[] methods = getClass().getMethods();

    getBreakMethodPrefix();

    int numberOfBreakMethods = 0;

    for (int i = 0; i < methods.length ; i ++ ) {
      if (methods[i].getName().startsWith(breakMethodPrefix)
          && methods[i].getName().length() != breakMethodPrefix.length()) {
        numberOfBreakMethods ++;
      }
    }
    breakMethods = new Method[numberOfBreakMethods];
    System.out.println("number of break methods: " + numberOfBreakMethods);

    int idj = 0;
    for (int i = 0; i < methods.length ; i ++ ) {
      if ( methods[i].getName().startsWith(breakMethodPrefix)
          && methods[i].getName().length() != breakMethodPrefix.length()) {
//                String suffix = methods[i].getName().substring(breakMethodPrefix.length());
//                System.out.println(methods[i].getName() + "/" + suffix);
//                try {
//                    breakMethods[(new Integer(suffix)).intValue() - 1] = methods[i];
//                } catch (NumberFormatException nfx) {
//                    System.out.println("----- ----- NumberFormatException" + suffix);
//                }
        breakMethods[idj++] = methods[i];
      }
    }

    sortMethods(breakMethods);
  }

  private void sortMethods(Method[] breakMethods) {

    Method[] sorted = new Method[this.getBreakKeys().length / this.total];

    for (int i = 0; i < breakMethods.length ; i ++) {
      Method method = breakMethods[i];
      System.out.println("[::sortMethods]" + method.getName());
      int level = getLevel( method.getName() );
      sorted[level - 1] = method;
    }
    setBreakMethods( sorted );
  }

  /**
   * setBreakMethods.
   * @param breakMethods Method[]
   */
  protected void setBreakMethods(Method[] breakMethods) {
    this.breakMethods = breakMethods;

    //System.out.println("setBreakMethods()");
    for (int i = 0; i < breakMethods.length ; i ++) {
      Method breakMethod = ((Method) breakMethods[i]);
      String methodName;
      // Could be null if child class overwrite this method.
      if ( breakMethod == null ) {
        methodName = "NOT DEFINED";
      } else {
        methodName = breakMethod.getName();
      }
      System.out.println(this.getClass().getName() + "Idx:" + i + " Name: " + methodName );
    }
  }

  /**
   * getLevel.
   * @param methodName String
   * @return int
   *//*
  protected int getLevel(String methodName) {
    String prefix = getBreakMethodPrefix();
    String nameOfBreak = methodName.substring( prefix.length(), methodName.length() );

    //System.out.println("name of Break: " + nameOfBreak);
    for (int i = 0; i < this.breakKeys.size() ; i ++) {
      String key = (String) this.breakKeys.get(i);
//      String key2 = key.replaceAll("\\.", "_");
      System.out.println("[AbstractBreakProcedure]" + nameOfBreak + "<=>" + key);
      if ( nameOfBreak.equals(key) ) {
        //System.out.println("Break Level " + (i+1)
        //  + ":" + nameOfBreak );
        return i + 1;
      }
    }
    System.out.println("[AbstractBreakProcedure Error] Expected callback method is one of doBreak"
        + this.getBreakKeys().toString() );
    System.out.println("[AbstractBreakProcedure Error] But declared method is " + methodName );
    return -1;
  } */
  protected int getLevel(String methodName) {
    String prefix = getBreakMethodPrefix();
    String nameOfBreak = methodName.substring( prefix.length(), methodName.length() );

    //System.out.println("name of Break: " + nameOfBreak);
    for (int i = total - 1; i < this.breakKeys.size() ; i += total) {
      String key = (String) this.breakKeys.get(i);
//      String key2 = key.replaceAll("\\.", "_");
      System.out.println("[AbstractBreakProcedure]" + nameOfBreak + "<=>" + key);
      if ( nameOfBreak.equals(key) ) {
        System.out.println("Break Level " + (i + 1) + ":" + nameOfBreak );
        return i / total + 1;
      }
    }
    System.out.println("[AbstractBreakProcedure Error] Expected callback method is one of doBreak"
        + this.getBreakKeys().toString() );
    System.out.println("[AbstractBreakProcedure Error] But declared method is " + methodName );
    return -1;
  }

  /**
   * 设值Break键名.
   * @param brKeys Break键名
   */
  public void setKeys(List<String> brKeys) {
    this.breakKeys = brKeys;
  }


  /**
   * @see org.teapot.db.orm.util.keybreakmany.IKeyBreakMany#setTotal(int)
   */
  @Override
  public void setTotal(int total) {
    this.total = total;
  }

  public int getTotal() {
    return this.total;
  }

}
