package com.kolmikra;

public class Tests {

    public static void main(String[] args) {
        Point point = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(point + "\n");

        Car car = new Car(0.0, 60, 8);
        car.move(5);
        System.out.println(car.getFuelLevel());
        car.refuel(60);
        System.out.println(car.getFuelLevel());
        System.out.println(car.getAllWay());
    }
}
