package com.theironyard.novauc;

/**
 * Created by octavio on 2/7/17.
 */
public class Car {
    String brand;
    String model;
    int horsepower;
    boolean originalOwner;
    boolean moreThan100K;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
        if (horsepower > 250) {
            System.out.println("Wow, that's a lot of horsepower dude!");
        }
    }

    public boolean isOriginalOwner() {
        return originalOwner;
    }

    public void setOriginalOwner(boolean originalOwner) {
        this.originalOwner = originalOwner;
    }

    public boolean isMoreThan100K() {
        return moreThan100K;
    }

    public void setMoreThan100K(boolean moreThan100K) {
        this.moreThan100K = moreThan100K;
    }
}
