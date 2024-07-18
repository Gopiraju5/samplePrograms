package com.practice.java.string.method;

// public boolean equals(Object obj)


public class Test03 {
    public static void main(String[] args) {

        String st1 = new String("Ravi Kumar");
        String st2 = "Ravi Kumar";

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

        System.out.println("=====================");

        String st3 = new String("Venkat");
        String st4 = "enkat";
        System.out.println(st3.equals(st4));
    }
}
