package com.practice.java.literal;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("Main Method Started...");
        m1();
        System.out.println("Main Method Ended...");
    }
    public static void m1(){
        System.out.println("m1 Method Started...");
        m2();
        System.out.println("m1 Method Ended...");
    }
    public static void m2(){
        int x = 100;
        System.out.println("I am m2 method: "+ x);
    }
}
