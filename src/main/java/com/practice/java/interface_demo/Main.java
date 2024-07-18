package com.practice.java.interface_demo;

public class Main {
    public static void main(String[] args) {
        Restaurant.createObject(new Tea());
        Restaurant.createObject(new Coffee());
        Restaurant.createObject(new Boost());
    }
}
