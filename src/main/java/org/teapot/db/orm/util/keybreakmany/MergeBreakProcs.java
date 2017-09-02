package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.util.keybreak.AbstractBreakProcedure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


/**
 * To support default continue method, some attributes methods become more open to be extended.
 */
public abstract class MergeBreakProcs extends AbstractBreakProcedure
    implements IMergeBreakProcs, IKeyBreakMany {

  private static final String continueMethodPrefix = "doContinue";

  /**
   *  Accesible from inside the same package.
   */
  //private
  Method[] continueMethods;

  protected void initContinueMethods() {
    Method[] methods = getClass().getMethods();

    int numberOfContinueMethods = 0;

    for (int i = 0; i < methods.length ; i ++ ) {
      if (  methods[i].getName().startsWith(continueMethodPrefix)
              && methods[i].getName().length() != continueMethodPrefix.length()) {
        numberOfContinueMethods ++;
      }
    }
    continueMethods = new Method[numberOfContinueMethods];
    //System.out.println("number of continue methods: " + numberOfContinueMethods);

    for (int i = 0; i < methods.length ; i ++ ) {
      if (  methods[i].getName().startsWith(continueMethodPrefix)
              && methods[i].getName().length() != continueMethodPrefix.length()) {
        String suffix = methods[i].getName().substring(continueMethodPrefix.length());
        //System.out.println(methods[i].getName() + "/" + suffix);
        continueMethods[Integer.parseInt(suffix)] = methods[i];
      }
    }
  }

  private Method[] getContinueMethods() {
    return this.continueMethods;
  }

  /**
   * Overwriting doContinue() method for merged collection/wrapped tra
   * - To avoid user class overwriting this method by mistake, this method
   *   is set to final.
   */
  public final void doContinue(Object tra) {
    int index    = ((IWrapper)tra).getIndex();
    Object naked = ((IWrapper)tra).getNaked();

    Object[] args = new Object[1];
    args[0] = naked;

    Method[] continueMethods = getContinueMethods();
    Method method = continueMethods[index];
    try {
      method.invoke(this, args);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
  }

  /**
   * Overwriting doFirstRecord() method for merged collection
   * - To avoid user class overwriting this method by mistake, this method
   *   is set to final.
   */
  public final void doFirstRecord(Object tra, Object param) {
    Object naked = ((IWrapper)tra).getNaked();

    doFirstNakedRecord( naked, param );
  }

  public void doFirstNakedRecord(Object naked, Object param) {
      // default implementation. Overwrite this method if you wish
  }

  /**
   * Overwritting the following two methods to keep them as protected
   * not public.
   */
  protected void setParam(Object param) {
//      super.setParam(param);
  }

  public void setKeys(List<String> keys) {
    super.setKeys(keys);
  }

}