package com.practice.java.literal;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        int radius = sc.nextInt();
        double areaOfCircle = Circle.getAreaOfCircle(radius);
        System.out.println("Area Of Circle is: " + areaOfCircle);
        sc.close();
    }
}
