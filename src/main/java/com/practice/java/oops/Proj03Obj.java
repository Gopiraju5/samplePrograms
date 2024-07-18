package com.practice.java.oops;

//By using a method argument

class Student {
    String name;
    int age;
    int marks;

    public void bad(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void bad01() {
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
        System.out.println("My marks is = " + marks);
    }
}

public class Proj03Obj {
    public static void main(String[] args) {
        Student std = new Student();
        std.bad("Gopi", 20, 10);
        std.bad01();
    }
}
