package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("So the Journey Begins");

        Tweeter me = new Tweeter();
        me.text = "I don't like Tweeter";
        me.username = "Mad Tweeter";
        me.timestamp = 8;
        me.isPrivate = false;
        me.lessthan140Charcters = true;

        System.out.println("What's in the Tweet: " + me.text);
        System.out.println("Username is: " + me.username);
        System.out.println("Timestamp is: " + me.timestamp);
        System.out.println("Is your account Private?: " + me.isPrivate);
        System.out.println("Less than 140 Characters?: " + me.lessthan140Charcters);

        System.out.println("Pimp your ride");

        Car brand = new Car();

        brand.brand = "Hyundai";
        brand.model = "Sonata";
        brand.horsepower = 250;
        brand.originalOwner = true;
        brand.moreThan100K = false;

        System.out.println("Brand: " + brand.brand);
        System.out.println("Model: " + brand.model);
        System.out.println("Horsepower is: " + brand.horsepower);
        System.out.println("Original Owner: " + brand.originalOwner);
        System.out.println("Is it more than 100K miles?: " + brand.moreThan100K);

        System.out.println("Now we get into Dirty Politics");

        PoliticalParty Affiliation = new PoliticalParty();

        Affiliation.affiliation = "Democrat";
        Affiliation.candidate = "Hilary Clinton";
        Affiliation.age = 30;
        Affiliation.american = true;
        Affiliation.arrested = false;

        System.out.println("Political Party Affiliation: " + Affiliation.affiliation);
        System.out.println("Who did you vote for?: " + Affiliation.candidate);
        System.out.println("Age you last voted?: " + Affiliation.age);
        System.out.println("American Citizenship: " + Affiliation.american);
        System.out.println("Have you ever been arrested?: " + Affiliation.arrested);

        System.out.println("This is entertainment!!!");








    }
}
