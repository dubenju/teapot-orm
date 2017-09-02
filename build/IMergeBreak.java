package org.teapot.db.orm.util.keybreakmany;

// Core Java
import java.util.List;

public interface IMergeBreak {
  public Object mergeBreak(List transactions, String[] breakKeys, IMergeBreakProcs procs,
      Object param) throws Exception;

  public Object mergeBreakTypeCheck(List transactions, String[] breakKeys, IMergeBreakProcs procs,
      Object param) throws Exception;
}