package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class SpaceCraft {
    String country;
    String name;
    int FastestSpeed;
    int FuelMaximumCapacity;
    boolean isOperational;

    public String getCountry() {
        return country; }
    public void setCountry(String country) {
        this.country = country; }

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public int getFastestSpeed() {
        return FastestSpeed; }
    public void setFastestSpeed(int fastestSpeed) {

        if (FastestSpeed < 26,000 && FastestSpeed > 35,000){
            this.FastestSpeed = fastestSpeed;
        }
        else {
            System.out.println("Not a valid speed");
        }
    }

    public int getFuelMaximumCapacity() {
        return FuelMaximumCapacity; }
    public void setFuelMaximumCapacity(int fuelMaximumCapacity) {
        FuelMaximumCapacity = fuelMaximumCapacity; }

    public boolean isOperational() {
        return isOperational; }
    public void setOperational(boolean operational) {
        isOperational = operational; }

    public SpaceCraft(String country, String name, int fastestSpeed, int fuelMaximumCapacity, boolean isOperational) {

        this.country = country;
        this.name = name;
        this.FastestSpeed = fastestSpeed;
        this.FuelMaximumCapacity = fuelMaximumCapacity;
        this.isOperational = isOperational;
    }
}
