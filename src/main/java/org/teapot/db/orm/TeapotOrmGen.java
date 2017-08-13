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
import org.teapot.db.orm.mdl.MdlColumn;
import org.teapot.db.orm.mdl.MdlTable;
import org.teapot.db.TeapotDb;
import org.teapot.db.TypeJavaDb;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * 对象关系映射代码及测试代码的自动生成类。
 * @author dubenju@126.com
 */
public class TeapotOrmGen {

  /**
   * 自动生成的入口方法.
   * @param args 参数 不需要指定。
   */
  public static void main(String[] args) {
    String path = TeapotOrmGen.class.getResource("").getPath();
    Properties prop = new Properties();//属性集合对象
    // 当前目录>conf>class
    try {
    //属性文件流
      FileInputStream fis = new FileInputStream(path + "../../../../../conf/Teapot_ORM.properties");
      prop.load(fis);//将属性文件流装载到Properties对象中
      fis.close();// 关闭流
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    String inputType = prop.getProperty("teapot.orm.generate.from");
    String xmlFile = prop.getProperty("teapot.orm.generate.xmlfile");
    String outputDir = prop.getProperty("teapot.orm.generate.outputdir");
    String outputTestDir = prop.getProperty("teapot.orm.generate.test.outputdir");
    String strPackage = prop.getProperty("teapot.orm.generate.package");
    String stTable = prop.getProperty("teapot.orm.generate.table");

    System.out.println("teapot.orm.generate.from=" + inputType);
    System.out.println("teapot.orm.generate.xmlfile=" + xmlFile);
    System.out.println("teapot.orm.generate.outputdir=" + outputDir);
    // System.out.println("teapot.orm.generate.outputdir=" + outputDir);
    System.out.println("teapot.orm.generate.test.outputdir=" + outputTestDir);
    System.out.println("teapot.orm.generate.package=" + strPackage);
    System.out.println("teapot.orm.generate.table=" + stTable);

    String outputPath = outputDir + "/" + strPackage.replaceAll("\\.", "/") + "/";
    if (".".equals(outputDir.substring(0,  1))) {
      outputPath = path + "../../../../../" + outputPath;
    }
    System.out.println("outputPath=" + outputPath);
    String outputTestPath = outputTestDir + "/" + strPackage.replaceAll("\\.", "/") + "/";
    if (".".equals(outputTestDir.substring(0,  1))) {
      outputTestPath = path + "../../../../../" + outputTestPath;
    }
    System.out.println("outputTestPath=" + outputTestPath);

    /*
     * Get List
     */
    List<MdlTable> list = null;
    HashMap<String, MdlTable> map = new HashMap<String, MdlTable>();
    if ("database".equals(inputType)) {
      list = TeapotOrm.INSTANCE.getTableInfo();
    }
    if ("xml".equals(inputType)) {
      String xmlFullPath = xmlFile;
      if (".".equals(xmlFullPath.substring(0,  1))) {
        xmlFullPath = path + "../../../../../" + xmlFile;
      }
      list = readXmlFile(xmlFullPath);
      for (MdlTable mtb : list) {
        map.put(mtb.getTableName().toUpperCase(), mtb);
      }
    }
    System.out.println(list.size());

    Velocity.setProperty("file.resource.loader.path", path + "../../../../../templates");
    Velocity.init();
    VelocityContext context = new VelocityContext();
    Formatter fmt = Formatter.INSTANCE;
    context.put("fmtter", fmt);
    context.put("pkg", strPackage);

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

  /**
   * 通过XML读取表信息.
   * @param fileName XML
   * @return 表信息
   */
  public static List<MdlTable> readXmlFile(String fileName) {
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    Document document = null;
    try {
      //DOM parser instance
      DocumentBuilder builder = builderFactory.newDocumentBuilder();
      //parse an XML file into a DOM tree
      document = builder.parse(new File(fileName));
    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    //get root element
    Element rootElement = document.getDocumentElement();

    List<MdlTable> result = new ArrayList<MdlTable>();
    NodeList nodeList = rootElement.getElementsByTagName("table");
    if (nodeList != null) {
      for (int i = 0 ; i < nodeList.getLength(); i ++)  {
        Element element = (Element)nodeList.item(i);
        String name = element.getAttribute("name");
        String type = element.getAttribute("type");
        System.out.println(name + "," + type);
        MdlTable mdlTable = new MdlTable();
        mdlTable.setTableName(name.toUpperCase());
        ArrayList<MdlColumn> colmuns = new ArrayList<MdlColumn>();
        NodeList subNodeList = element.getElementsByTagName("column");
        if (subNodeList != null) {
          for (int j = 0 ; j < subNodeList.getLength(); j ++)  {
            Element elem = (Element)subNodeList.item(j);
            String columnName = elem.getAttribute("name");
            String typeName = elem.getAttribute("type");
            System.out.println(columnName + "," + typeName);
            MdlColumn col = new MdlColumn();
            col.setColumnName(columnName);
            col.setTypeName(typeName);
            col.setTypeNameJava(
                TypeJavaDb.getTypeJava(TeapotDb.getInstance().getDbType()).getJavaType(typeName));
            colmuns.add(col);
          }
        }
        mdlTable.setColmuns(colmuns);
        result.add(mdlTable);
      }
    }
    return result;
  }
}
