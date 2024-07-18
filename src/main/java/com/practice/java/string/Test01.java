package com.practice.java.string;

//Three ways to create the string object

public class Test01 {
    public static void main(String[] args) {

        String st1 = "Hello Gopi";
        System.out.println(st1);

        System.out.println("==================");

        String st2 = new String("Hello Raju");
        System.out.println(st2);

        System.out.println("================");

        char[] ch1 = {'G', 'O', 'P', 'I'};
        System.out.println(ch1);

        System.out.println("==================");


        String st4 = "Leela Sankar";
        System.out.println(st4);

        System.out.println("========================");

        String st5 = new String("Gopi Krishna");
        System.out.println(st5);

        System.out.println("=========================");

        char[] ch2 = {'L', 'E', 'E', 'L', 'A'};
        System.out.println(ch2);
    }
}
