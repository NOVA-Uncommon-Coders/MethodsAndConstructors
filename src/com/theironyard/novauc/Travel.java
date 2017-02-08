package com.theironyard.novauc;

/**
 * Created by macbookpro on 2/7/17.
 */
public class Travel {
    String continent;
    String capital;
    int cost;
    String methodOfTravel;
    boolean domestic;

    public Travel(String continent, String capital, int cost, String methodOfTravel, boolean domestic) {
        this.continent = continent;
        this.capital = capital;
        this.cost = cost;
        this.methodOfTravel = methodOfTravel;
        this.domestic = domestic;
    }

    public Travel(int cost) {
        this.cost = cost;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        }

    }

    public String getMethodOfTravel() {
        return methodOfTravel;
    }

    public void setMethodOfTravel(String methodOfTravel) {
        this.methodOfTravel = methodOfTravel;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }
}
