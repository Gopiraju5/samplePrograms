package com.practice.java.literal;

public class Test12 {
    public static void main(String[] args) {
        int z = 5;
        // logical OR
        if (++z > 5 || ++z > 6){
            z++;
        }
        System.out.println(z);

        System.out.println("---------------");

        z = 5;
        // boolean OR
        if(++z > 5 | ++z > 6){
            z++;
        }
        System.out.println(z);
    }
}
