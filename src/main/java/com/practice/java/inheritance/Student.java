package com.practice.java.inheritance;

public class Student {

    private int studentNo;
    private String studentName;
    private long studentPhoneNumber;

    public Student(int studentNo, String studentName, long studentPhoneNumber) {
        super();
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String toString() {
        return "Student {studentNo = " + studentNo +
                " , studentName = " + studentName +
                " , studentPhoneNumber = " + studentPhoneNumber +
                "}";
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }
}
