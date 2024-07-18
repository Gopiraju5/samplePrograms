package com.practice.java.inheritance;

import java.util.Scanner;

public class Trainer {

    public static void viewStudentProfile(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Id: ");
        int id = sc.nextInt();

        if (id == student.getStudentNo()) {
            System.out.println(student);
        } else {
            System.out.println("Id is not available");
        }
    }
}
