package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Pet {
    String type;
    int numLegs;
    boolean Legs;
    double weight;
    String color;

    Pet() {
        System.out.println("Empty pet");
    }

    Pet(String type, int numLegs, boolean Legs, double weight, String color) {
        this.type = type;
        this.numLegs = numLegs;
        this.Legs = Legs;
        this.weight = weight;
        this.color = color;
        System.out.println("Pet pass the variables");
    }

    double getWeight() {
        return weight;
    }

    void setWeight(double weight) {

        if (weight < 50) {
            this.weight = weight;
        } else {
            System.out.println("Small pet");
        }


    }
}
