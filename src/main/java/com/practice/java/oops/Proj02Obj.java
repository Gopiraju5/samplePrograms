package com.practice.java.oops;

//By using a reference variable

class Person01 {
    String name;
    int age;
    int marks;

    public void good() {
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
        System.out.println("My marks is = " + marks);
    }
}

public class Proj02Obj {
    public static void main(String[] args) {

        //using object reference variables are initialized

        Person01 gopi = new Person01();
        gopi.name = "Gopi";
        gopi.age = 20;
        gopi.marks = 10;
        gopi.good();

        System.out.println("-----------");

        Person01 sita = new Person01();
        sita.name = "Sita";
        sita.age = 10;
        sita.marks = 50;
        sita.good();

        System.out.println("----------");


        Person01 mahesh = new Person01();
        mahesh.name = "Mahesh Babu";
        mahesh.age = 50;
        mahesh.marks = 85;
        mahesh.good();
    }
}
