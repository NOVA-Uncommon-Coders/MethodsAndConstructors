package com.theironyard.novauc;

/**
 * Created by JacobP on 2/7/17.
 */
public class Property {
    double askingPrice;
    String propertyType;
    double lotSize;
    int numBaths;
    int numBeds;

    public Property(double askingPrice, String propertyType, double lotSize) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        numBaths = 0;
        numBeds = 0;
    }

    public Property(double askingPrice, String propertyType, double lotSize, int numBaths, int numBeds)
    {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }
    public String toString()
    {
        return "Asking price: $" + askingPrice +
                "\nProperty Type: " + propertyType +
                "\nLot Size: " + lotSize +
                "\nNumber of baths: " + numBaths +
                "\nNumber of beds: "+ numBeds;






    }




    }
