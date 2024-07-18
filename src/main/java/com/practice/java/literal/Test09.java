package com.practice.java.literal;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        int big = 0;

        if (a>b && a>c){
            big = a;
        } else if (b>a && b>c) {
            big = b;
        }else {
            big = c;
        }
        System.out.println("The big number is: " + big);
    }
}
