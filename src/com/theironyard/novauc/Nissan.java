package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Nissan {
    String type;
    String drive;
    int doors;
    String fuel;
    int passengers;

    public Nissan(String type, String drive, int doors, String fuel, int passengers) {
        this.type = type;
        this.drive = drive;
        this.doors = doors;
        this.fuel = fuel;
        this.passengers = passengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        if (drive.equals("2wheeldrive")) {
            this.drive = drive;

        } else {

            System.out.println("Not a valid drive type");
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;


    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
