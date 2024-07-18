package com.practice.java.literal;

public class Test04 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        x %= y;// short hand operator x = x%y
        System.out.println("x = " + x);
    }
}
