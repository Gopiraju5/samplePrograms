package com.practice.java.literal;

public class Method01 {
    // instance method
    void m1(){
        System.out.println("This is m1 method: ");
    }
    // static method
    static void m2(){
        System.out.println("This is m2 method: ");
    }

    public static void main(String[] args) {
        Method01 m = new Method01();
        m.m1();
        Method01.m2();
        m2();
    }
}
