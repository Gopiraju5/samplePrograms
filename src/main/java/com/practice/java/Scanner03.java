package com.practice.java;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        name = sc.nextLine();

        System.out.println("Employee Id is: " + id);
        System.out.println("Employee name is: " + name);
    }
}
