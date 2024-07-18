package com.practice.java.interface_demo;

public interface Vehicle {

    public void run();

    public void horn();

    default void digitalMeter() {
        System.out.println("Digital Meter");
    }
}
