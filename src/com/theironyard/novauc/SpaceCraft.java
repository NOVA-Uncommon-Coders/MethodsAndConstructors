package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class SpaceCraft {
    private String country;
    private String name;
    private int fastestspeed;
    private int fuelMaximumCapacity;
    private boolean isOperational;

    public SpaceCraft() {
    }

    public String getCountry() {
        return country; }
    public void setCountry(String country) {
        this.country = country; }

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public int getFastestSpeed() {
        return fastestspeed; }
    public void setFastestSpeed(int fastestspeed) {

        if (fastestspeed > 26000 && fastestspeed < 35000) {
            this.fastestspeed = fastestspeed;
        } else {
            System.out.println("Not a valid speed");
        }
    }

    public int getFuelMaximumCapacity() {
        return fuelMaximumCapacity; }
    public void setFuelMaximumCapacity(int fuelMaximumCapacity) {
        this.fuelMaximumCapacity = fuelMaximumCapacity; }

    public boolean isOperational() {
        return isOperational; }
    public void setOperational(boolean operational) {
        isOperational = operational; }

    public SpaceCraft(String country, String name, int fastestSpeed, int fuelMaximumCapacity, boolean isOperational) {

        this.country = country;
        this.name = name;
        this.fastestspeed = fastestSpeed;
        this.fuelMaximumCapacity = fuelMaximumCapacity;
        this.isOperational = isOperational;
    }
}
