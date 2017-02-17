package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class Vehicle {
    String make;
    String model;
    int year;
    String color;
    boolean isClassicCar;

    public Vehicle() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2008 && year < 2010) {
            this.year = year;
        } else {
            System.out.println("Not a valid year");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClassicCar() {
        return isClassicCar;
    }

    public void setClassicCar(boolean classicCar) {
        isClassicCar = classicCar;
    }

    public Vehicle(String make, String model, int year, String color, boolean isClassicCar) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isClassicCar = isClassicCar;


    }
}
