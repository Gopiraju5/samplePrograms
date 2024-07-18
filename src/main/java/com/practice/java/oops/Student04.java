package com.practice.java.oops;

public class Student04 {

    int studentId;
    String studentName;
    String studentAddress;
    static String collageName = "Narayana";
    static String coursesName = "JEEE-MAIN";

    public void setStudent04Data(int roll, String name, String address){
        studentId = roll;
        studentName = name;
        studentAddress = address;
    }

    public void getStudent04Data(){
        System.out.println("Student id is: "+ this.studentId);
        System.out.println("Student name is: "+ this.studentName);
        System.out.println("Student address is: "+ this.studentAddress);
        System.out.println("College name is: "+ Student04.collageName);
        System.out.println("Courses name is: "+ Student04.coursesName);
    }
}
