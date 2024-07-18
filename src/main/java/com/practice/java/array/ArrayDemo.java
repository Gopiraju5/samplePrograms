package com.practice.java.array;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int x : arr){
            System.out.println(x);
        }

        System.out.println("----------------------");

        int[] arr1 = {10,20,30,40,50,60};
        for (int x : arr1){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        int[] arr2 = {100, 200, 300, 400, 500, 600};
        for (int x1 : arr2){
            System.out.println(x1);
        }

        System.out.println("--------------------");
        arr2[1]= 102;
        System.out.println("element of first index = "+ arr2[1]);

        System.out.println("----------------------");

        int[] arr3 = {10,20,30,40,50,60};
        for (int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
        System.out.println("element of first index = "+ arr[1]);
    }
}
