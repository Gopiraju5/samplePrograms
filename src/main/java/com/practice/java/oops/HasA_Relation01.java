package com.practice.java.oops;

public class HasA_Relation01 {
    public static void main(String[] args) {
        Institute ins = new Institute("INS10001", "NT", "Java");

        Staff s1 = new Staff("ST20001", "Swathi", 20000.00, ins);
        System.out.println(s1);

        Staff s2 = new Staff("ST20002", "Hema", 25000.00, ins);
        System.out.println(s2);
    }
}
