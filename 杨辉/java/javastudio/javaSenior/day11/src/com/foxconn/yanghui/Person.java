package com.foxconn.yanghui;

public class Person {
    private int age;
    public String name;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("你好，我是人");
    }
    private String showsNation(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }
}
