package com.theironyard.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class Tree {
    String type;
    boolean isAlive;
    String location;
    int length;
    boolean isGreen;

    public Tree(String type, boolean isAlive, String location, int length, boolean isGreen) {
        this.type = type;
        this.isAlive = isAlive;
        this.location = location;
        this.length = length;
        this.isGreen = isGreen;
    }

    public String getType() {
        return type;


    }

    public void setType(String type) {
        this.type = type;
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }
}
