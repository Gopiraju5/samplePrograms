package com.practice.java.inheritance;

public class Sub extends Super {

    public Sub(){
        super(100, 200);
    }

    public void showData(){
        System.out.println("x value is: "+ getX());
        System.out.println("y value is: "+ getY());
    }
}
