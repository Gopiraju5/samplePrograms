package com.practice.java.string.method;

public class Test05 {
    public static void main(String[] args) {
        String st1 = "Hyderabad";
        String st2 = "HYDERABAD";
        String st3 = "Canada";
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st1.equalsIgnoreCase(st3));
    }
}
