package com.theironyard.novauc;

/**
 * Created by jerieshasmith on 2/7/17.
 */
public class House {
    String material;
    String color;
    int address;
    int length;
    boolean isBrick;

    public House(String material, String color, int address, int length, boolean isBrick) {
        this.material = material;
        this.color = color;
        this.address = address;
        this.length = length;
        this.isBrick = isBrick;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isBrick() {
        return isBrick;
    }

    public void setBrick(boolean brick) {
        isBrick = brick;
    }
}
