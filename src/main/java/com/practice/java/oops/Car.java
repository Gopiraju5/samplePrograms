package com.practice.java.oops;

public class Car {
    int carId;
    String carName;
    int carWheels;
    int carSeats;

    public void setCarData(int carId, String carName, int carWheels, int carSeats){
        this.carId = carId;
        this.carName = carName;
        this.carWheels = carWheels;
        this.carSeats = carSeats;
    }

    public void getCarData(){
        System.out.println("Car id is: "+ carId);
        System.out.println("Car name is: "+ carName);
        System.out.println("Car wheels is: "+ carWheels);
        System.out.println("Car seats is: "+ carSeats);
    }
}
