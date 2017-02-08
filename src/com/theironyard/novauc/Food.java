package com.theironyard.novauc;

/**
 * Created by macbookpro on 2/7/17.
 */
public class Food {
    boolean prepared;
    int serving;
    int calories;
    boolean plant;
    boolean animal;

    public Food(int calories) {
        this.calories = calories;
    }

    public Food(boolean prepared, int serving, int calories, boolean plant, boolean animal) {
        this.prepared = prepared;
        this.serving = serving;
        this.calories = calories;
        this.plant = plant;
        this.animal = animal;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 1600) {
            this.calories = calories;
        }
    }

    public boolean isPlant() {
        return plant;
    }

    public void setPlant(boolean plant) {
        this.plant = plant;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }
}
