package com.practice.java.literal;

public class Method07 {

    // instance variable
    int x = 100;
    int y = 200;

    // local variable
    void add(int a, int b){
        System.out.println(x+y);
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Method07 mf = new Method07();
        mf.add(1000, 2000);
    }
}
