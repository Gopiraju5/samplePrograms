package com.practice.java.literal;

// Method Calling
public class Method06 {
    void m1() {
        m2();
        System.out.println("m1 method: ");
    }

    void m2() {
        m3(52.02);
        System.out.println("m2 method: ");
    }

    void m3(double d) {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        Method06 mf = new Method06();
        mf.m1();
    }
}
