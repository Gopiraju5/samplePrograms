package com.practice.java.literal;

class Employee{}
class Course{}
class Truck{}
class Drive{}
public class Method03 {

    void m1(Employee emp, Course cur){
        System.out.println("This is m1 method: ");
    }
    static void m2(Truck tr, Drive dr){
        System.out.println("This is m2 method: ");
    }

    public static void main(String[] args) {
        Method03 md = new Method03();
        Employee employee = new Employee();
        Course c = new Course();
//        md.m1(employee, c);   or
        md.m1(new Employee(), new Course());

        Truck t = new Truck();
        Drive d = new Drive();
//        Method03.m2(t, d);  or
/**
 *
 */
        Method03.m2(new Truck(), new Drive());
    }
}
