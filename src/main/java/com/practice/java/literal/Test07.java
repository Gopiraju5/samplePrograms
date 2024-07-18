package com.practice.java.literal;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current Reading:");
        int cur_read = sc.nextInt();

        System.out.println("Enter Previous Reading:");
        int pre_read = sc.nextInt();

        int nc = cur_read - pre_read;
        System.out.println("Your Number of call for this month is:" + nc);

        double bill = 0.0;
        if (nc <= 100){
            bill = 360;
        } else if (nc <= 250) {
            bill = 360 + (nc-100)*1.0;
        } else if (nc > 250) {
            bill = 360 + 150 + (nc-250)*1.2;
        }
        System.out.println("The bill is:" + bill);
    }
}
