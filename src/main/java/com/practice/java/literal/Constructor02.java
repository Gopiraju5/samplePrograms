package com.practice.java.literal;

public class Constructor02 {

    Constructor02(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Constructor02 con1 = new Constructor02();
        Constructor02 con2 = new Constructor02();
        Constructor02 con3 = new Constructor02();
        Constructor02 con4 = new Constructor02();
    }
}
