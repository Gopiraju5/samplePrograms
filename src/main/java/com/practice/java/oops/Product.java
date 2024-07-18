package com.practice.java.oops;

import java.util.Scanner;

public class Product {

    int productId;
    String productName;

    public void setProductData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Product Id: ");
        productId = sc.nextInt();

        System.out.println("Enter the Product Name: ");
        productName = sc.nextLine();
        productName = sc.nextLine();
        sc.close();
    }
    public void getProductData(){
        System.out.println("Product is: "+productId);
        System.out.println("Product Name is: "+productName);
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.getProductData();
        p1.setProductData();
        p1.getProductData();
    }
}
