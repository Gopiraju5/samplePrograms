package com.practice.java.literal;

class D{
    String s1 = "Gopi";
}

class F extends D{
    String s1 = "Raju";
    public static void m2(){
//        System.out.println(s1);
//        System.out.println(this.s1);
//        System.out.println(super.s1);
    }
}

public class Constructor09 {
    public static void main(String[] args) {
        F f1 = new F();
        f1.m2();
    }
}
