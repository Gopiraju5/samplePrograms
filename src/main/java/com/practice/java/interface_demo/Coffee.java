package com.practice.java.interface_demo;

public class Coffee implements HotDrink {
    @Override
    public void prepare() {
        System.out.println("Preparing Coffee");
    }
}
