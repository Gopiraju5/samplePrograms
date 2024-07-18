package com.practice.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Apple");
        al.add("Bat");
        al.add("Cat");
        al.add("Ball");
        al.add("Can");

        System.out.println("before sorting the elements are: ");
        System.out.println(al);

        Collections.sort(al);
        System.out.println("after sorting the elements are: ");
        System.out.println(al);
    }
}
