package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Table {

    int legs;
    int screws;
    String woodColor;
    String woodType;
    boolean mahogany;
    boolean oak;

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Table(String woodType) {
        this.woodType = woodType;
    }

    public Table(int legs, int screws, String woodColor, boolean mahogany, boolean oak) {
        this.legs = legs;
        this.screws = screws;
        this.woodColor = woodColor;
        this.mahogany = mahogany;
        this.oak = oak;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isOak() {

        if(woodColor==red);
        return oak;
    }

    public void setOak(boolean oak) {
        this.oak = oak;
    }

    public void changeWoodType(){
        woodType = woodColor.equals("yellow") ? "oak":"mahogany";
    }
}

