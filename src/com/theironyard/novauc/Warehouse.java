package com.theironyard.novauc;

/**
 * Created by JacobP on 2/7/17.
 */
public class Warehouse {
    String name;
    int numForklifts;
    int numDoors;
    int numBins;
    int numMaterials;



    public Warehouse(int numForklifts, int numDoors, int numBins, int numMaterials, double size) {
        this.name = name;
        this.numForklifts = numForklifts;
        this.numDoors = numDoors;
        this.numBins = numBins;
        this.numMaterials = numMaterials;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumForklifts() {
        return numForklifts;
    }

    public void setNumForklifts(int numForklifts) {
        this.numForklifts = numForklifts;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumBins() {
        return numBins;
    }

    public void setNumBins(int numBins) {
        if (numBins < 200 && numBins > 150) {
            this.numBins= numBins;

        } else {
            System.out.println("Bin location full");
        }


    }

    public int getNumMaterials() {
        return numMaterials;
    }

    public void setNumMaterials(int numMaterials) {
        this.numMaterials = numMaterials;
    }





}
