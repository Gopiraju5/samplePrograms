package com.practice.java.oops;

public class Student02 {

    int rollNumber;
    String studentName;

    public void setStudentData(){
        rollNumber = 110;
        studentName = "Gopi Raju";
    }

    public void showStudentData(){
        System.out.println(rollNumber);
        System.out.println(studentName);
    }

    public static void main(String[] args) {
        Student02 s2 = new Student02();
        s2.showStudentData();
        s2.setStudentData();
        s2.showStudentData();
    }
}
