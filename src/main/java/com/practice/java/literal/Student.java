package com.practice.java.literal;

public class Student {

    // Properties
    String name;
    String regNo;
    double height;

    // behaviour
    public void talk() {
        System.out.println("My Name is: " + name);
        System.out.println("My Registration Number is: " + regNo);
        System.out.println("My Height is: " + height);
    }
    public void writeExam(){
        System.out.println(name +"Write Exam on Monday");
    }

    public static void main(String[] args) {
        Student raj = new Student();
        // initializing the object properties

        raj.regNo = "RGN10001";
        raj.name = "Raju Kumar";
        raj.height = 5.5;

        raj.talk();
        raj.writeExam();

        System.out.println("------------");

        Student priya = new Student();
        priya.regNo = "RGN10002";
        priya.name = "Priya Sai";
        priya.height = 5.6;

        priya.talk();
        priya.writeExam();
    }
}
