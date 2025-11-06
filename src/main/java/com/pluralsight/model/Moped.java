package com.pluralsight.model;

import java.util.ArrayList;

public class Moped extends Vehicle {
    private boolean hasKickstand;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, boolean hasKickstand) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.hasKickstand = hasKickstand;
    }
}

