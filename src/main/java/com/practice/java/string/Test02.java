package com.practice.java.string;

//immutability

public class Test02 {
    public static void main(String[] args) {

        String st1 = new String("Hyderabad");
        st1.toUpperCase();
        System.out.println(st1);

        System.out.println("=========================");


        String st2 = new String("Hyderabad");
        String st3 = st2.toUpperCase();
        System.out.println(st2);
        System.out.println(st3);
    }
}
