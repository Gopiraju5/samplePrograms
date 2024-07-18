package com.practice.java.literal;

public class Method02 {

    void m1(int a, char r){
        System.out.println("This is m1 method:");
        System.out.println(a);
        System.out.println(r);
    }

    static void m2(String st, double d){
        System.out.println("This is m2 method: ");
        System.out.println(st);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Method02 md = new Method02();
        md.m1(10, 'F');
        System.out.println("----------------");
        Method02.m2("Sai", 15.20);
    }
}
