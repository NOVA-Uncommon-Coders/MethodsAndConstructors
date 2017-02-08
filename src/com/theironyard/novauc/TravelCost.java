package com.theironyard.novauc;

/**
 * Created by JacobP on 2/7/17.
 */
public class TravelCost {
    int distance;
    double mpg;
    double pricePerGallon;
    double lodgingCost;
    double totalCost;


    public TravelCost(int distance, double mpg, double pricePerGallon, double lodgingCost, double totalCost) {
        this.distance = distance;
        this.mpg = mpg;
        this.pricePerGallon = pricePerGallon;
        this.lodgingCost = lodgingCost;
        this.totalCost = totalCost;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        if (pricePerGallon < 0 && pricePerGallon > 50) {
            this.pricePerGallon = pricePerGallon;

        } else {
            System.out.println("Not a valid price");
        }
    }

    public double getLodgingCost() {
        return lodgingCost;
    }

    public void setLodgingCost(double lodgingCost) {
        this.lodgingCost = lodgingCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getDistance() {

        return distance;


    }

    public void setDistance(int distance) {
        this.distance = distance;
    }







}
