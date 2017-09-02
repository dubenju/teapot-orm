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

package org.teapot.db.orm;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.teapot.db.orm.mdl.MdlTable;
import org.teapot.db.orm.util.UTeapot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * 对象关系映射代码及测试代码的自动生成类。
 * @author dubenju@126.com
 * @since 0.0.1
 */
public class TeapotOrmGen {

  /**
   * 自动生成的入口方法.
   * @param args 参数 不需要指定。
   * @since 0.0.1
   */
  public static void main(String[] args) {
    /*
     * @since 0.0.2
     * 2017/08/15
     * 由于在ant执行时发生了路径错误，改由参数传入。
     * 在参数没有指定的时候，才使用默认的这个。
     * [java] java.io.FileNotFoundException:
     * file:\D:\git\teapot-orm\lib\teapot-orm-0.0.2.jar!\org\teapot\db\orm\
     * ..\..\..\..\..\conf\Teapot_ORM.properties
     */
    String path = UTeapot.getPath(TeapotOrmGen.class);

    // TODO:999.从参数传入时的考虑。
    String propFile = path + "../../../../../conf/Teapot_ORM.properties";
//    if (args.length > 0) {
//      propFile = args[0];
//    }
    System.out.println("使用的Properties File是:" + propFile);

    // 取得的数据应该共享，以减少IO。
    Properties prop = new Properties();//属性集合对象
    // 当前目录>conf>class
    try {
      // 属性文件流
      FileInputStream fis = new FileInputStream(propFile);
      // 将属性文件流装载到Properties对象中
      prop.load(fis);
      // 关闭流
      fis.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    String inputType     = prop.getProperty("teapot.orm.generate.from");
    String xmlFile       = prop.getProperty("teapot.orm.generate.xmlfile");
    String outputDir     = prop.getProperty("teapot.orm.generate.outputdir");
    String outputTestDir = prop.getProperty("teapot.orm.generate.test.outputdir");
    String strPackage    = prop.getProperty("teapot.orm.generate.package");
    String stTable       = prop.getProperty("teapot.orm.generate.table");

    System.out.println("teapot.orm.generate.from=" + inputType);
    System.out.println("teapot.orm.generate.xmlfile=" + xmlFile);
    System.out.println("teapot.orm.generate.outputdir=" + outputDir);
    System.out.println("teapot.orm.generate.test.outputdir=" + outputTestDir);
    System.out.println("teapot.orm.generate.package=" + strPackage);
    System.out.println("teapot.orm.generate.table=" + stTable);

    // TODO:999.从参数传入时的考虑。
    String outputPath = outputDir + "/" + strPackage.replaceAll("\\.", "/") + "/";
    if (".".equals(outputDir.substring(0,  1))) {
      outputPath = path + "../../../../../" + outputPath;
    }
    String outputTestPath = outputTestDir + "/" + strPackage.replaceAll("\\.", "/") + "/";
    if (".".equals(outputTestDir.substring(0,  1))) {
      outputTestPath = path + "../../../../../" + outputTestPath;
    }
    System.out.println("outputPath=" + outputPath);
    System.out.println("outputTestPath=" + outputTestPath);
    File srcPath = new File(outputPath);
    File tstPath = new File(outputTestPath);
    if (srcPath.exists() == false) {
      srcPath.mkdirs();
    }
    if (tstPath.exists() == false) {
      tstPath.mkdirs();
    }

    /* *************************************************************
     * Get List
     * *************************************************************/
    List<MdlTable> list = null;
    HashMap<String, MdlTable> map = new HashMap<String, MdlTable>();
//    if ("database".equals(inputType)) {
//      // TODO:999.从参数传入时的考虑。
//      list = TeapotOrm.INSTANCE.getTableInfo();
//    }
    if ("xml".equals(inputType)) {
      // TODO:999.从参数传入时的考虑。
      String xmlFullPath = xmlFile;
      if (".".equals(xmlFullPath.substring(0,  1))) {
        xmlFullPath = path + "../../../../../" + xmlFile;
      }
      list = TeapotOrmXml.readXmlFile(xmlFullPath);
      for (MdlTable mtb : list) {
        map.put(mtb.getTableName().toUpperCase(), mtb);
      }
    }
    System.out.println(list != null ? list.size() : 0);

    /* *************************************************************
     * Set Velocity
     * *************************************************************/
    // TODO:999.从参数传入时的考虑。
    Velocity.setProperty("file.resource.loader.path", path + "../../../../../templates");
    Velocity.init();
    VelocityContext context = new VelocityContext();
    Formatter fmt = Formatter.INSTANCE;
    context.put("fmtter", fmt);
    context.put("pkg", strPackage);

    /* *************************************************************
     * Write By Table
     * *************************************************************/
    String[] tables = stTable.split(",");
    for (String strTable : tables) {
      MdlTable tbl = null;
      if ("xml".equals(inputType)) {
        tbl = map.get(strTable.toUpperCase());
      } else {
        tbl = TeapotOrm.INSTANCE.getTable(strTable.toUpperCase());
      }
      System.out.println(tbl);
      if (tbl == null) {
        System.out.println("[ERROR!]PLEASE CHECK YOUR TABLE ID IN THE MAP UNDER UPPER["
            + strTable + "].");
        /*
         * 2017/08/15
         * 为了能在ant判断出失败，追加了状态值的处理。
         */
        System.exit(1);
        return ;
      }

      context.put("table", tbl);
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z");
      String strDt = format.format(cal.getTime());
      context.put("genDtTm", strDt);

      Template tmplate = Velocity.getTemplate("model_table.vm", "UTF8");
      StringWriter writer = new StringWriter();
      tmplate.merge(context, writer);

      /* 写入Txt文件 */
      // 相对路径，如果没有则要建立一个新的output。txt文件
      File writename = new File(outputPath + "Mdl" + fmt.fmtFun(tbl.getTableName()) + ".java");
      try {
        writename.createNewFile(); // 创建新文件
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
        out.write(writer.toString()); // \r\n即为换行
        out.flush(); // 把缓存区内容压入文件
        out.close(); // 最后记得关闭文件
      } catch (IOException e) {
        e.printStackTrace();
      }


      Template tmplatetest = Velocity.getTemplate("model_table_test.vm", "UTF8");
      StringWriter writertest = new StringWriter();
      tmplatetest.merge(context, writertest);

      /* 写入Txt文件 */
      // 相对路径，如果没有则要建立一个新的output。txt文件
      File writenametest = new File(
          outputTestPath + "Mdl" + fmt.fmtFun(tbl.getTableName()) + "Test.java");
      try {
        writenametest.createNewFile(); // 创建新文件
        BufferedWriter out = new BufferedWriter(new FileWriter(writenametest));
        out.write(writertest.toString()); // \r\n即为换行
        out.flush(); // 把缓存区内容压入文件
        out.close(); // 最后记得关闭文件
      } catch (IOException e) {
        e.printStackTrace();
      }
    } // for

    System.out.println("自动生成处理结束。");
  }
}
