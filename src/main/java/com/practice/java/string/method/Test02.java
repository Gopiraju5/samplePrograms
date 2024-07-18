package com.practice.java.string.method;

// public String concat(String st)

public class Test02 {
    public static void main(String[] args) {

        String st1 = "Sai";
        String st2 = "Ram";
        String st3 = st1.concat(st2);
        System.out.println("String after concatenation: " + st3);

        System.out.println("======================");

        String st4 = "Mahindra";
        String st5 = "Motors";
        String st6 = st4 + st5;
        System.out.println("String after concatenation: " + st6);

        System.out.println("=======================");

        String st7 = "Good";
        System.out.println(st7.concat("Technology"));
    }
}
