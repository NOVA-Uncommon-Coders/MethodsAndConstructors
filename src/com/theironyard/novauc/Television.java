package com.theironyard.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class Television {
    String brand;
    boolean color;
    String material;
    int width;
    int lentgh;

    public Television(String brand, boolean color, String material, int width, int lentgh) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.width = width;
        this.lentgh = lentgh;
    }

    public String getBrand() {
        return brand;



    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLentgh() {
        return lentgh;
    }

    public void setLentgh(int lentgh) {
        this.lentgh = lentgh;
    }
}

