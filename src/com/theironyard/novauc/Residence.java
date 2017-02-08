package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Residence {
    String type;
    double size;
    int floors;
    boolean balcony;
    boolean shared;

    Residence() {

        System.out.println("Residence Empty");
    }

    Residence(String type, double size, int floors, boolean balcony, boolean shared) {
        this.type = type;
        this.size = size;
        this.floors = floors;
        this.balcony = balcony;
        this.shared = shared;
        System.out.println("Residence pass the variables");

    }

    int getFloors() {
        return floors;
    }

    void setFloors(int floors) {

        if (floors > 4) {
            this.floors = floors;
        }
        else {
            System.out.println("NOT AN APARTMENT");
        }
    }
}
