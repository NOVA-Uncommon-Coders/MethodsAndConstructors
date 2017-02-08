package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {

        //Residence
        Residence townhouse = new Residence("Townhouse", 1000.00, 3,  true,  true);
        System.out.println("Passed townhouse");

        Residence hut = new Residence();

        Residence apartment = new Residence("Apartment", 700.23, 8, true, true);
        System.out.println("Passed apartment");

        Residence singleFamilyHome = new Residence("singleFamilyHome", 1400.55, 2, true, false);
        System.out.println("Passed singleFamilyHome");

        //Food
        Food spaghetti = new Food("Italian", "delivery", false, 3, true);
        System.out.println("Passed spaghetti");

        //Pet
        Pet cat = new Pet("cat", 4, true, 12.6, "grey");
        System.out.println("Passed pet");

        //Car
        Car ferrari = new Car();

        Car tesla = new Car(987654.99, 5.98, "orange", 'R', true );
        System.out.println("Passed car");

        //Clothes
        Clothes jacket = new Clothes(true, 40, 17.4444, "blue", false);
        System.out.println("Passed jacket");

        //TVShows
        TVShows workaholics = new TVShows(true, false, 23.22, 798, "comedy central");
        System.out.println("Passed workaholics");




    }
}
