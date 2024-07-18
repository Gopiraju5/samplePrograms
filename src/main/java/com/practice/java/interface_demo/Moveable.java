package com.practice.java.interface_demo;

public interface Moveable {

    int speed = 120;
    void move();
}

class Car implements Moveable {

    @Override
    public void move() {
        System.out.println("Running with Audi Car");
    }

    public static void main(String[] args) {
        System.out.println("Car Speeed is: " + Moveable.speed);
        Moveable m1 = new Car();
        m1.move();
    }
}
