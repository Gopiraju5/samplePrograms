package com.practice.java.literal;

import java.util.Scanner;

public class ReadCompleteName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();
        System.out.println("Your Name is: " + name);
    }
}
