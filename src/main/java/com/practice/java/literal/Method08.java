package com.practice.java.literal;

public class Method08 {
    // instance variable
    int a = 10;
    int b = 5;
    void add(int a, int b){
        // local variable
        System.out.println(a+b);// local variable
        System.out.println(this.a+this.b); // instance variable
    }

    public static void main(String[] args) {
        Method08 mf = new Method08();
        mf.add(100, 200);
    }
}
