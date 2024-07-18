package com.practice.java.literal;

public class Construction05 {

    Construction05(){
        super();
        System.out.println("Constructor");
//        super();
    }

    public static void main(String[] args) {
        Construction05 con = new Construction05();
        System.out.println(con);
    }
}
