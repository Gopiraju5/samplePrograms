package com.practice.java.literal;

public class Circle {
    public static double getAreaOfCircle(int radius){
        if (radius <= 0){
            return -1;
        }else {
            final double PI = 3.14;
            double areaOfCircle = PI*radius*radius;
            return areaOfCircle;
        }
    }
}
