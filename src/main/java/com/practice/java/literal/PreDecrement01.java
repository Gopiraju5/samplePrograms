package com.practice.java.literal;

public class PreDecrement01 {
    public static void main(String[] args) {
        int x = 15;
        int y = --x;
        System.out.println(x+":"+y);

        System.out.println("---------------");
        int x1 = 15;
        int y1 = x1--;
        System.out.println(x1+":"+y1);
    }
}
