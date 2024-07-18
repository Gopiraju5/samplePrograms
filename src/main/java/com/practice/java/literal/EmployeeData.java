package com.practice.java.literal;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int num = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Employee Id: " + num);
        System.out.println("Employee Name: " + name);
    }
}
