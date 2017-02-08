package com.theironyard.novauc;

import java.util.Currency;

/**
 * Created by peter on 2/7/17.
 */
public class Car {
    double cost;
    double horsePower;
    String color;
    char model;
    boolean fourDoors;

    Car() {
        System.out.println("Car empty");
    }

    Car(double cost, double horsePower, String color, char model, boolean fourDoors) {
        this.cost = cost;
        this.horsePower = horsePower;
        this.color = color;
        this.model = model;
        this.fourDoors = fourDoors;
        System.out.println("Car passed the variables");
    }

    double getCost() {
        return cost;
    }

    void setCost(double cost) {

        if (cost < 30000) {
            this.cost = cost;
        } else {
            System.out.println("Expensive!");
        }


    }

}
