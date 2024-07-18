package com.practice.java.oops;

import java.net.Socket;

public class Student01 {

    String regNo;
    String name;
    int marks;
    double height;

    public void talk(){
        System.out.println("My RegNo is: " + regNo);
        System.out.println("My Name is: " + name);
        System.out.println("My Marks is: " + marks);
        System.out.println("My Height is: " + height);
    }

    public void writeExam(){
        System.out.println(name +"writes exam on Monday");
    }

    public static void main(String[] args) {
        Student01 std = new Student01();
        std.regNo = "STU100235";
        std.name = "Ram Prasad";
        std.marks = 20;
        std.height = 5.2;
        std.writeExam();

        System.out.println("========================");

        Student01 stu = new Student01();
        stu.regNo = "SW23651";
        stu.name = "Swathi";
        stu.marks = 90;
        stu.height = 2.2;
        stu.writeExam();
    }
}
