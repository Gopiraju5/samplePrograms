package com.practice.java.interface_demo;

public class Bike implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is Running");
    }

    @Override
    public void horn() {
        System.out.println("PEER PEER");
    }
}
