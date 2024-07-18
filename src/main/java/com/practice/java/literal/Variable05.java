package com.practice.java.literal;

public class Variable05 {
    static int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Variable05 va = new Variable05();
        va.x = 888;
        va.y = 999;

        Variable05 va1 = new Variable05();
        System.out.println(va1.x+"  "+ va1.y);
    }
}
