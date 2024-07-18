package com.practice.java;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        System.out.println("Enter a three digit number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rem = num % 10;

        System.out.println("The Reverse is : " + rem);

        num = num / 10;
        rem = num % 10;
        System.out.println(rem);
        num = num / 10;
        System.out.println(num);
    }
}
