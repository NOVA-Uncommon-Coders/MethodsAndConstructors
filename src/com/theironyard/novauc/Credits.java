package com.theironyard.novauc;

/**
 * Created by Eric on 2/7/17.
 */
public class Credits {
    String cash;
    int amount;
    String greeting;
    int creditsMax;
    boolean empty;

    public Credits(String cash, int amount, String greeting, int creditsMax, boolean empty) {
        this.cash = cash;
        this.amount = amount;
        this.greeting = greeting;
        this.creditsMax = creditsMax;
        this.empty = empty;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;}


    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }


    public int getCreditsMax() {
        return creditsMax;
    }

    public void setCreditsMax(int creditsMax) {
        this.creditsMax = creditsMax;
    }


    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;

        if (empty == true) {
            this.empty = true;
        } else {
            System.out.println("You have " + this.amount + "of credits");


        }
    }
}