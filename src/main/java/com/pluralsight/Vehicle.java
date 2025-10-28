package com.pluralsight;

import java.util.ArrayList;

public class Vehicle {

        private String color;
        private int numberOfPassengers;
        private int cargoCapacity;
        private int fuelCapacity;
        private ArrayList<Integer> wheels = new ArrayList<>();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public ArrayList<Integer> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Integer> wheels) {
        this.wheels = wheels;
    }
}
