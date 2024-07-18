package com.practice.java.literal;

public class Test08 {
    public static void main(String[] args) {

        int a = 15;
        int b = 12;
        int c = 18;

        int big = 0;

        if (a > b) { // outer if condition
            if (a > c) { // nested if condition
                big = a;
            } else {
                big = c;
            }
        } else {
            if (b > c) {
                big = b;
            }else {
                big = c;
            }
        }
        System.out.println("The big number is: "+ big);
    }
}
