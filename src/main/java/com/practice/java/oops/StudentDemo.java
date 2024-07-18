package com.practice.java.oops;

public class StudentDemo {
    public static void main(String[] args) {
        Student04 mahesh = new Student04();
        mahesh.setStudent04Data(1,"Mahesh Kumar", "SR Nagar");
        mahesh.getStudent04Data();

        System.out.println("=====================");

        Student04 priya = new Student04();
        priya.setStudent04Data(2, "Hema Priya", "Visakhapatnam");
        priya.getStudent04Data();

        System.out.println("=======================");

        Student04 yesu = new Student04();
        yesu.setStudent04Data(3, "Yesu Babu", "Chirala");
        yesu.getStudent04Data();
    }
}
