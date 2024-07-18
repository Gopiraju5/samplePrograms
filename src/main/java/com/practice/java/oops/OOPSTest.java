package com.practice.java.oops;

public class OOPSTest {
    int x = 10;

    public static void main(String[] args) {
        OOPSTest t1 = new OOPSTest();
        OOPSTest t2 = new OOPSTest();

        ++t1.x;
        --t2.x;

        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}
