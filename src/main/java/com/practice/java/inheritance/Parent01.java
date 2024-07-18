package com.practice.java.inheritance;

public class Parent01 {

    public Parent01() {
        super();
        System.out.println("No Argument of Parent Method");
    }

    public Parent01(int y) {
        this();
        System.out.println("Parameterized constructor of Parent Class is: "+ y);
    }
}
