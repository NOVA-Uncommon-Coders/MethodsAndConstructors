package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Clothes {
    boolean top;
    int size;
    double length;
    String color;
    boolean folded;

    Clothes() {
        System.out.println("Clothes empty");
    }

    Clothes(boolean top, int size, double length, String color, boolean folded) {
        this.top = top;
        this.size = size;
        this.length = length;
        this.color = color;
        this.folded = folded;
        System.out.println("Clothes passed the variables");
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {

        if (size > 10) {
            this.size = size;
        } else {
            System.out.println("Tiny!");
        }


    }
}
