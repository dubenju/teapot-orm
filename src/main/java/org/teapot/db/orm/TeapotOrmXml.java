package org.teapot.db.orm;

import org.teapot.db.orm.mdl.MdlColumn;
import org.teapot.db.orm.mdl.MdlTable;
import org.teapot.db.TeapotDb;
import org.teapot.db.TypeJavaDb;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

public class TeapotOrmXml {

  public static void main(String[] args) {
    writeXml();

  }

  /**
   * 通过XML读取表信息.
   * @param fileName XML
   * @return 表信息
   * @since 0.0.1
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

  /**
   * writeXml.
   */
  public static void writeXml() {
    List<MdlTable> list = TeapotOrm.INSTANCE.getTableInfo();
    if (list == null) {
      return ;
    }
    int max = list.size();
    try {

      DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

      // root elements
      Document doc = docBuilder.newDocument();
      Element rootElement = doc.createElement("database");
      doc.appendChild(rootElement);

      Attr reattr = doc.createAttribute("name");
      reattr.setValue("default");
      rootElement.setAttributeNode(reattr);

      for (int idx = 0; idx < max; idx ++) {
        MdlTable mdlTable = list.get(idx);
        // table elements
        Element table = doc.createElement("table");
        rootElement.appendChild(table);

        // set attribute to table element
        Attr attr = doc.createAttribute("name");
        attr.setValue(mdlTable.getTableName());
        table.setAttributeNode(attr);

        // shorten way
        // table.setAttribute("id", "1");

        List<MdlColumn> mdlColumns = mdlTable.getColmuns();
        if (mdlColumns != null) {
          int may = mdlColumns.size();
          for (int idy = 0; idy < may; idy ++) {
            MdlColumn mdlColumn = mdlColumns.get(idy);
            System.out.println(mdlColumn);
            // column elements
            Element column = doc.createElement("column");
            // column.appendChild(doc.createTextNode("yong"));
            table.appendChild(column);

            // set attribute to column element
            Attr attrName = doc.createAttribute("name");
            attrName.setValue(mdlColumn.getColumnName());
            column.setAttributeNode(attrName);

            // set attribute to column element
            Attr attrType = doc.createAttribute("type");
            attrType.setValue(mdlColumn.getTypeName());
            column.setAttributeNode(attrType);

            // set attribute to column element
            Attr attrSize = doc.createAttribute("size");
            attrSize.setValue(mdlColumn.getColumnSize());
            column.setAttributeNode(attrSize);

            // set attribute to column element
            Attr attrRequired = doc.createAttribute("required");
            attrRequired.setValue(String.valueOf("NO".equals(mdlColumn.getIsNullable())));
            column.setAttributeNode(attrRequired);

            // primaryKey
          }
        }
      }

      // write the content into xml file
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      // 换行和缩进，默认是没有的。
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

      DOMSource source = new DOMSource(doc);
      StreamResult result = new StreamResult(new File("./file.xml"));
      StreamResult resultc =  new StreamResult(System.out);

      // Output to console for testing
      // StreamResult result = new StreamResult(System.out);

      transformer.transform(source, result);
      transformer.transform(source, resultc);

      System.out.println("File saved!");

    } catch (ParserConfigurationException pce) {
      pce.printStackTrace();
    } catch (TransformerException tfe) {
      tfe.printStackTrace();
    }
  }
}
