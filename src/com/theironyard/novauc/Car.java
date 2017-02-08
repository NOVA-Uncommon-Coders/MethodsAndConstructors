package com.theironyard.novauc;

/**
 * Created by macbookpro on 2/7/17.
 */
public class Car {
    String year;
    String make;
    String model;
    String engine;
    String transmission;

    public Car(String make) {
        this.make = make;
    }

    public Car(String year, String make, String model, String engine, String transmission) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.equalsIgnoreCase("honda")) {
            this.make = "Hondas are awesome";
        } else {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


}
