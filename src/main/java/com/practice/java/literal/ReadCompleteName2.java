package com.practice.java.literal;

import java.util.Scanner;

public class ReadCompleteName2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Full Name: ");
        String name = sc.nextLine();
        System.out.println("Your Full Name Is: " + name);
    }
}
