package org.teapot.db.orm.util.keybreakmany;

import org.teapot.db.orm.IKeyValue;

public interface IWrapper {
  public int getIndex();

  public IKeyValue getNaked();
}
