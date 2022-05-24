package com.foxconn.yanghui;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefilectionTest {
    //反射之前，对于Person类的操作
    @Test
    public void test1(){
        Person p1 = new Person(15,"tom");
        p1.name="yh";
        System.out.println(p1.toString());
        p1.show();
    }
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class clazz = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(int.class,String.class);

        Object obj = cons.newInstance(15, "yh");
        Person p=(Person) obj;
        System.out.println(p.toString());
        //2.通过反射，调用对象制定的属性、方法
        Field name = clazz.getDeclaredField("name");
        name.set(p,"wy");
        System.out.println(p.toString());
        //3.调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        System.out.println("============================");
        //4.通过反射，可以调用Person类的私有结构的.
        Constructor cons1 = clazz.getDeclaredConstructor(int.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);
    }

}
