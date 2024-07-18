package com.practice.java.literals;

public class FloatingLiterals {
    public static void main(String[] args) {
        float f1 = 2555.20F;
        System.out.println(f1);

        double d1 = 455.554d;
        double d2 = 9855.236D;
        System.out.println(d1+" "+d2);

        float f2 = 15.29F;
        float f3 = 15.25f;
        float f4 = (float) 15.25;
        System.out.println(f2+" "+f3+" "+f4);

        double d3 = 15.15;
        double d4 = 15.15d;
        double d5 = 15.15D;
        System.out.println(d3+" "+d4+" "+d5);

        double d6 = 0129.89;
        double d7 = 0167;
        System.out.println(d6+" , "+d7);

        double d8 = 0X29;
        System.out.println(d8);

        double d9 = 15e-3;
        double d10 = 15e3;
        System.out.println(d9+" , "+d10);
    }
}
