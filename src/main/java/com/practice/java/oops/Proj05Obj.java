package com.practice.java.oops;


class Customer {
    String name;
    int age;
    int marks;
    double salary;
    float points;

    public void good() {
        System.out.println("My name is = " + name);
        System.out.println("My age is = " + age);
        System.out.println("My marks is = " + marks);
        System.out.println("My salary is = " + salary);
        System.out.println("My points is = " + points);

    }
}

public class Proj05Obj {
    public static void main(String[] args) {
        Customer cum = new Customer();

        cum.name = "Ram Krishna";
        cum.age = 30;
        cum.marks = 50;
        cum.salary = 50000.00d;
        cum.points = 20.02f;
        cum.good();
    }
}
