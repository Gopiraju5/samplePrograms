package com.practice.java.oops;

public class WatchmanDemo {
    public static void main(String[] args) {
        Watchman wat = new Watchman();

        wat.setWatchmanData("WM0001", "Gopi Raju", 30000, 3.4);
        wat.calculationWatchmanGrade();
        System.out.println(wat);
    }
}
