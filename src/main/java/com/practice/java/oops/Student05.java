package com.practice.java.oops;

import java.util.Date;
import java.util.Scanner;

public class Student05 {

    private int student05Id;
    private String student05Name;
    private double student05Fees;
    // HAS-A Relation
    private Date dateOfJoining;

    public Student05(int student05Id, String student05Name, double student05Fees, Date dateOfJoining) {
        super();
        this.student05Id = student05Id;
        this.student05Name = student05Name;
        this.student05Fees = student05Fees;
        this.dateOfJoining = dateOfJoining;
    }

    public static Student05 getStudent05Object() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter Student Fees: ");
        double fees = sc.nextDouble();

        Date d = new Date();
        return new Student05(id, name, fees, d);
    }

    public String toString() {
        return "Student {studentId = " + student05Id +
                " , studentName = " + student05Name +
                " , studentFees = " + student05Fees +
                " , dateOfJoining = " + dateOfJoining + " }";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many object we want: ");
        int noOfObjects = sc.nextInt();

        for (int i = 1; i <= noOfObjects; i++){
            Student05 object = Student05.getStudent05Object();
            System.out.println(object);
        }
    }
}
