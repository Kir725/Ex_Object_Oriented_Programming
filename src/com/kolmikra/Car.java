package com.kolmikra;

public class Car {
    private double distanceTraveled;
    private double fuel;
    private double fuelConsumption;

    public Car(double distanceTraveled, double fuel, double fuelConsumption) {
        this.distanceTraveled = distanceTraveled;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void move(double distance) {
        distanceTraveled += distance;
        fuel -= distance * fuelConsumption;
    }

    public void refuel(double fuel) {
        this.fuel += fuel;
    }

    public double getAllWay() {
        return distanceTraveled;
    }

    public double getFuelLevel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distanceTraveled=" + distanceTraveled +
                ", fuel=" + fuel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
