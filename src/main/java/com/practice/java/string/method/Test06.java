package com.practice.java.string.method;

// compare the == and equals method

public class Test06 {
    public static void main(String[] args) {
        String st1 = "Hyderabad";
        String st2 = "Hyderabad";
        String st3 = new String("Hyderabad");

        System.out.println(st1 == st2);
        System.out.println(st1 == st3);

        System.out.println("========================");

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
    }
}
