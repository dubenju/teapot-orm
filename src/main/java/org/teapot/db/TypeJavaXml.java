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

package org.teapot.db;

/**
 * 从SQL到Java数据类型映射的Sqlite个别指定类。
 * @author dubenju@126.com
 * @since 0.0.1
 */
public class TypeJavaXml extends TypeJavaDb {
  /**
   * 构造函数.
   * @since 0.0.1
   */
  protected TypeJavaXml() {
  }

  /**
   * 设置从SQL到Java数据类型的Sqlite个别映射.
   * @since 0.0.1
   */
  @Override
  protected void setup() {
    super.setup();
    setType("java.util.ArrayList<MdlColumn>", "java.util.ArrayList<MdlColumn>");
    setType("java.util.ArrayList<MdlPrimaryKey>", "java.util.ArrayList<MdlPrimaryKey>");
    setType("java.util.ArrayList<MdlIndex>", "java.util.ArrayList<MdlIndex>");
  }
}
