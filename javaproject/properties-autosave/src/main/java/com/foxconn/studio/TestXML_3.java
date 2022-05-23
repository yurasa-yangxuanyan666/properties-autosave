package com.foxconn.studio;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author 杨辉
 */
public class TestXML_3 {
    public static void main(String[] args) throws DocumentException {
        InputStream is = TestXML_3.class.getClassLoader().getResourceAsStream("test5.xml");
        SAXReader sax = new SAXReader();
        Document doc = sax.read(is);
        Element root = doc.getRootElement();
//        获取所有的禽兽
//        List<Element> list = root.selectNodes("beast");
//        list.forEach(s -> System.out.println(s));
//        获取所有学生的名字
//        List<Element> list = root.selectNodes("student/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获取所有的名字，忽略所有的层级和位置
//        List<Element> list = root.selectNodes("//name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得第一个学生
//        List<Element> list = root.selectNodes("student[1]/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得最后一个学生
//        List<Element> list = root.selectNodes("student[last()]/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得前两个学生
//        List<Element> list = root.selectNodes("student[position()<3]/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得带有type属性的学生
//        List<Element> list = root.selectNodes("student[@type]/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得type属性等于cc的学生
//        List<Element> list = root.selectNodes("student[@type='cc']/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得年龄大于11的学生
//        List<Element> list = root.selectNodes("student[age>11]/name");
//        list.forEach(s -> System.out.println(s.getData()));
//        获得倒数第二的学生
        List<Element> list = root.selectNodes("student[last()-1]/name");
        list.forEach(s -> System.out.println(s.getData()));
    }
}
