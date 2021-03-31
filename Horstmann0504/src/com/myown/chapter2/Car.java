package com.myown.chapter2;

public class Car {
    private double fuel = 0.0;
    private double xPos = 0.0;
    private double consumption = 1.0;

    public Car(double fuel, double xPos, double consumption) {
        this.fuel = fuel;
        this.xPos = xPos;
        this.consumption = consumption;
    }

//    public double getFuel() {
//        return fuel;
//    }
//
//    public double getxPos() {
//        return xPos;
//    }

    public void drive(double miles) {
        if (fuel >= 0.15 * miles) {
            xPos += miles;
            fuel -= consumption * miles;
        } else {
            System.out.println("Not Enough Fuel");
        }
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
    }

    public void printState() {
        System.out.println("Fuel: " + fuel + " gallons, Distance: " + xPos + " miles");
    }

}
