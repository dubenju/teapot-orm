package org.teapot.db.orm.util.keybreakmany;

// Core Java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// MAST
import zh.com.microtools.turbine.base.java.lang.System;
import zh.com.microtools.turbine.base.modules.objects.model.IObjectModel;

// MASTRETAIL
import zh.com.microtools.turbine.core.services.RetailCollections;
import zh.com.microtools.turbine.core.services.sort.ITypeCheckSortable;
import zh.com.microtools.turbine.core.services.controlbreak.extension.CBreakFrameWithParam;
import zh.com.microtools.turbine.core.services.load.IRetailSortable;

public class MergeBreakFrame extends CBreakFrameWithParam
implements IMergeBreak
{
    public Object mergeBreakTypeCheck(List transactions, String[] breakKeys,
            IMergeBreakProcs procs, Object param) throws Exception
            {
        return mergeBreak( transactions, breakKeys, procs, param, true);
            }

    public Object mergeBreak(List transactions, String[] breakKeys,
            IMergeBreakProcs procs, Object param) throws Exception
            {
        return mergeBreak( transactions, breakKeys, procs, param, false);
            }

    private Object mergeBreak(List transactions, String[] breakKeys,
            IMergeBreakProcs procs, Object param, boolean typeCheck) throws Exception
            {

        // merge a set of collections into one
        List transaction = mergeTransactions(transactions);

        //System.out.println("# of merged transaction: " + transaction.size());

        // sort the merged collection by break keys and the order of collection
        sort(transaction, breakKeys, typeCheck);

        List reversedKeys = RetailCollections.toReversedList(breakKeys);

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

        super.controlBreak( transaction, breakKeys, procs );

        // Finishing control break procedure. (Finall invoke of callback methods)
        return procs.fin();

            }

    private List mergeTransactions(List transactions)
    {
        List merged = new ArrayList();

        for (int index = 0; index < transactions.size(); index++)
        {
            List v = (List)transactions.get(index);

            for (int i=0; i < v.size(); i++)
            {
                IRetailSortable naked = (IRetailSortable)v.get(i);

                // Wrapping an element in list by Wrapp class with index info
                Wrapper wrap = new Wrapper(index, naked);

                // Collection all elments in multiple lists into one
                merged.add(wrap);
            }
        }
        return merged;
    }

    private void sort(List merged, String[] breakKeys, boolean typeCheck)
    {
        // Initialize a comparator specialized to wrapping object
        WrappingComparator comp;
        if ( typeCheck )
            comp = new WrappingTypeCheckComparator( breakKeys );
        else
            comp = new WrappingComparator( breakKeys );


        // execute sort with java.util.Collectons
        Collections.sort(merged, comp);
    }

    /**
     * To wrap elements in Vector to handle multiple doContine[0,1,...n] methods.
     *
     * @since 2004/9/24
     *
     *  Implement IObjectModel interface mulit-type comparation
     */
    private class Wrapper implements IWrapper, IRetailSortable,
    ITypeCheckSortable, IObjectModel
    {
        private int index;
        private IRetailSortable naked;

        private Wrapper(int index, IRetailSortable naked)
        {
            this.index = index;
            this.naked = naked;
        }
        // ************* Implementing IWrapper interface ****************** //

        public int getIndex()
        {
            return this.index;
        }
        public IRetailSortable getNaked()
        {
            return this.naked;
        }

        // ************* Implementing IRetailSortable interface ************ //
        /*
         * This level of implementation is required since main break frame,
         * ControlBreakFrame, use this interface.
         */
        public String getSortKey(String key)
        {
            return getNaked().getSortKey(key);
        }
        public void createSortKey(String[] columns){}
        public void createSortKey(String column){}
        public void removeSortKey(String key){}


        private boolean isWarned = false;

        // ************* Implementing ITypeCheckSortable interface ************ //

        public Object getSortKeyNoType(String key)
        {
            try
            {
                ITypeCheckSortable naked = (ITypeCheckSortable)getNaked();
                return naked.getSortKeyNoType(key);
            }
            catch ( ClassCastException cce )
            {
                if ( !this.isWarned )
                    System.out.println("[MergeBreakFrame][Warning] Implement IObjectModel interface at "
                            + getNaked().getClass().getName() );
                this.isWarned = true;
                IRetailSortable om = (IRetailSortable)getNaked();
                return om.getSortKey( key );
            }
        }

        // ************* Implementing IObjectModel interface *********** //

        public Object getByName(String key)
        {
            try
            {
                IObjectModel om = (IObjectModel)getNaked();
                return om.getByName( key );
            }
            catch ( ClassCastException cce )
            {
                if ( !this.isWarned )
                    System.out.println("[MergeBreakFrame][Warning] Implement IObjectModel interface at "
                            + getNaked().getClass().getName() );
                this.isWarned = true;
                IRetailSortable om = (IRetailSortable)getNaked();
                return om.getSortKey( key );
            }
        }

        public void setByName(String key, Object value) throws Exception
        {
            // do nothing
        }
    }
}