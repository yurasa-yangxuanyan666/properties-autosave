package com.foxconn.studio;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author 杨辉
 */
public class TestXML_1 {
    public static void main(String[] args) throws DocumentException {
//        1.加载xml文件到jvm中，形成数据流
        InputStream is = TestXML_1.class.getClassLoader().getResourceAsStream("test4.xml");
//        2.创建解析对象
        SAXReader sax = new SAXReader();
//        3.获得整个文档对象（整个xml文件）,将数据流转换为一个文档对象
        Document doc = sax.read(is);
//        4.获得根元素
        Element root = doc.getRootElement();
//        5.获得该元素下的所有子元素
        List<Element> list = root.elements();

        System.out.println(list.size());

//        list.forEach(s -> System.out.println(s));
//        list.forEach(System.out::println);
//        for (Element e1:list){
////            System.out.println(el.getName());
//            List<Element> list2 = e1.elements();
//            for (Element e2:list2){
//                System.out.println(e2.getName()+":"+e2.getData());
//            }
//        }
        for (Element e1:list){
            Attribute type = e1.attribute("type");
            System.out.println(type.getValue());
        }
    }
}
