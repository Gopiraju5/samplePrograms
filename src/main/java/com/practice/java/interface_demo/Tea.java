package com.practice.java.interface_demo;

public class Tea implements HotDrink {
    @Override
    public void prepare() {
        System.out.println("Preparing Tea");
    }
}
