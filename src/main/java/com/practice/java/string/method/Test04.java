package com.practice.java.string.method;

// public boolean equalsIgnoreCase(String st)

public class Test04 {

    public static void main(String[] args) {
        String username = args[0];
        if (username.equalsIgnoreCase("Raviinfotech")) {
            System.out.println("Welcome to Raviinfotech channel");
        } else {
            System.out.println("Sorry! wrong username /Password");
        }
    }
}
