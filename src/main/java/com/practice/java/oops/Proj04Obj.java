package com.practice.java.oops;


class Employee {
    String name = "Sai";
    int age = 20;
    int marks = 40;
    float points = 12.5f;

    public void bad() {
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
        System.out.println("My marks is = " + marks);
        System.out.println("My points is = " + points);
    }
}

public class Proj04Obj {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.bad();
    }
}
