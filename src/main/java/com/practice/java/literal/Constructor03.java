package com.practice.java.literal;

public class Constructor03 {

    void Constructor03(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Constructor03 con1 = new Constructor03();
        Constructor03 con2 = new Constructor03();
        con1.Constructor03();
    }
}
