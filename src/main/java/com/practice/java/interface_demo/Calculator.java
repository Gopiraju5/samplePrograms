package com.practice.java.interface_demo;

public interface Calculator {

    public void sum(int x, int y);

    public void sub(int x1, int y1);

    public void multiple(int x2, int y2);

    public void div(int x3, int y3);
}

class Developer implements Calculator {

    @Override
    public void sum(int x, int y) {
        System.out.println("Sum is: " + (x+y));
    }

    @Override
    public void sub(int x1, int y1) {
        System.out.println("Sub is: " + (x1-y1));
    }

    @Override
    public void multiple(int x2, int y2) {
        System.out.println("Multiple is: " + (x2*y2));
    }

    @Override
    public void div(int x3, int y3) {
        System.out.println("Division is: " + (x3/y3));
    }

    public static void main(String[] args) {
        Calculator c1 = new Developer();
        c1.sum(10, 20);
        c1.sub(20, 10);
        c1.multiple(10, 20);
        c1.div(10, 2);
    }
}
