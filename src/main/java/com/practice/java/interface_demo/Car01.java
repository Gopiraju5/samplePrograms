package com.practice.java.interface_demo;

public class Car01 implements Vehicle {
    @Override
    public void run() {
        System.out.println("Car is Running");
    }

    @Override
    public void horn() {
        System.out.println("POP POP");
    }

    @Override
    public void digitalMeter() {
        System.out.println("Car is having Digital Meter");
    }
}
