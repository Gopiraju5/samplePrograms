package com.practice.java.literal;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the any Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("It is Zero");
        } else if (num>0){
            System.out.println("It Is Positive Number");
        }else {
            System.out.println("It is Negative Number");
        }
        sc.close();
    }
}
