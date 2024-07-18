package com.practice.java.interface_demo;

public class Main01 {
    public static void main(String[] args) {

        Vehicle v1;

        v1 = new Car01();
        v1.run();
        v1.horn();
        v1.digitalMeter();

        v1 = new Bike();
        v1.run();
        v1.horn();
    }
}
