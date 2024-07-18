package com.practice.java.literals;

public class CharacterLiteral {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 97;
        System.out.println(ch1+" , "+ch2);

        int i1 = 'A';
        System.out.println(i1);

        char ch3 = 63;
        char ch4 = 64;
        char ch5 = 1;
        System.out.println(ch3+" , "+ch4+" , "+ch5);


        char ch6 = 65535;
        char ch7 = 0Xadd;
        System.out.println(ch6+" , "+ch7);

        char ch8 = '\u0001';
        char ch9 = '\uffff';
        char ch10 = '\u0041';
        char ch11 = '\u0061';
        System.out.println(ch8+" , "+ch9+" , "+ch10+" , "+ch11);

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.println("c1 = "+c1+" , c2 = "+c2+" , c3 = "+c3);

        char c = '\n';
        System.out.println(c);
    }
}
