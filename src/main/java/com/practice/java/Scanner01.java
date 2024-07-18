package com.practice.java;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.next();
        System.out.println("Your name is: " + name);
    }
}
