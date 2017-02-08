package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class Food {
    String type;
    String source;
    boolean tasty;
    int amount;
    boolean sauce;

    Food() {
        System.out.println("empty food");
    }

    Food(String type, String source, boolean tasty, int amount, boolean sauce) {
        this.type = type;
        this.source = source;
        this.tasty = tasty;
        this.amount = amount;
        this.sauce = sauce;
        System.out.println("Food pass the variables");
    }
    int getAmount() {
        return amount;
    }

    void setAmount(int amount) {

        if (amount < 4) {
            this.amount = amount;
        } else {
            System.out.println("Not enough");
        }


    }


}
