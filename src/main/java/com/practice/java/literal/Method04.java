package com.practice.java.literal;

public class Method04 {
    void m1(){
        System.out.println("This method is m1: ");
    }
    void m1(int a){
        System.out.println("This method is m2: ");
    }

    public static void main(String[] args) {
        Method04 md = new Method04();
        md.m1();
    }
}
/*java: method m1() is already defined in class com.practice.java.literal.Method04*/