package com.theironyard.novauc;

/**
 * Created by souporman on 2/7/17.
 */
public class Sodas {
    String name;
    int calories;
    int servingSize;
    boolean healthy=true;
    int rating;
    boolean caffineFree=false;

    public Sodas() {
    }

    public Sodas(String name, int calories, int servingSize, int rating, boolean caffineFree) {
        this.name = name;
        this.calories = calories;
        this.servingSize = servingSize;
        this.rating = rating;
        this.caffineFree = caffineFree;
    }

    public boolean isCaffineFree() {
        return caffineFree;
    }

    public void setCaffineFree(boolean caffineFree) {
        this.caffineFree = caffineFree;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating>=0&&rating<=10)
            this.rating = rating;
        else
            System.out.println("You have entered a rating not inside parameters: 0-thru-10");
    }

    public boolean isHealthy(int calories,int servingSize) {
        if(calories*servingSize>1000)
            healthy=false;
        return healthy;
    }


    public int getServingSize() {

        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getCalories() {

        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
