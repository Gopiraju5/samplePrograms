package com.practice.java.array;

public class Array02 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-------------");

        for (int x : numbers){
            System.out.println(x);
        }
    }
}
