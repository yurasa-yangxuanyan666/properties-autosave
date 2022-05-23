package com.foxconn.studio;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * @author 杨辉
 */
public class TestXML_2 {
    public static void main(String[] args) throws DocumentException, IOException {
        InputStream is = TestXML_2.class.getClassLoader().getResourceAsStream("test4.xml");
        SAXReader sax = new SAXReader();
        Document doc = sax.read(is);
        Element root = doc.getRootElement();
//        创建结点
        Element student = root.addElement("student");
        Element id = student.addElement("id");
        id.setText("3");
        Element name = student.addElement("name");
        name.setText("curry");
        Element age = student.addElement("age");
        age.setText("30");
//        写入文件
        FileOutputStream out = new FileOutputStream(new File("/Users/sw/Desktop/xx.xml"));
        OutputFormat format=new OutputFormat("\t",true,"UTF-8");
        XMLWriter xw=new XMLWriter(out,format);
        xw.write(doc);
        System.out.println("写入成功");
        xw.close();
    }
}
