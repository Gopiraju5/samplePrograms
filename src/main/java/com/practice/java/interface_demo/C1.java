package com.practice.java.interface_demo;

public class C1 implements A1, B1 {
    @Override
    public void m1() {
        A1.super.m1();
        B1.super.m1();
        System.out.println("Overridden");
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m1();
    }
}
