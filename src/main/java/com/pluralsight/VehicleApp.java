package com.pluralsight;

import com.pluralsight.model.Car;
import com.pluralsight.model.Moped;
import com.pluralsight.model.Trunk;
import com.pluralsight.model.Wheel;

import java.util.ArrayList;

public class VehicleApp {
    public static void main(String[] args) {
        Moped moped = new Moped("Blue", 1, 0, 5, new ArrayList<Wheel>(), true);
        moped.setColor("Green");

        System.out.println(moped.getColor());

        Car car = new Car("Green", 4, 5, 16, new ArrayList<Wheel>(), new Trunk());
        car.setColor("orange");
        car.setFuelCapacity(16);

        System.out.println("The color of the car is " + car.getColor() + " The fuel capacity is " + car.getFuelCapacity());

//        SemiTruck truck = new SemiTruck();
//        System.out.println(truck);
//
//        Hovercraft hovercraft = new Hovercraft();
//        System.out.println(hovercraft);
    }
}
