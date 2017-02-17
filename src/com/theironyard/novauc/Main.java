package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Building WillisTower = new Building();

        WillisTower.setNameOfCity("Chicago");
        WillisTower.setMayorName ("Rahm Emanuel");
        WillisTower.setPopulation(2700000);
        WillisTower.setYearEstablished (1837);
        WillisTower.setPopulationIncreasedLastYear (false);

        System.out.println("WillisTower's city is " + WillisTower.getNameOfCity());
        System.out.println("The Mayor of Chicago is " + WillisTower.getMayorName());
        System.out.println("The population of Chicago is " + WillisTower.getPopulation());
        System.out.println("The Year Chicago was established was " + WillisTower.getYearEstablished());
        System.out.println("PopulationIncreasedLastYear for Chicago is "+ WillisTower.isPopulationIncreasedLastYear());

        City Chicago = new City();

        Chicago.setNameOfCity ("Chicago");
        Chicago.setMayorName ("Rahm Emanuel");
        Chicago.setPopulation (2700000);
        Chicago.setYearEstablished (1837);
        Chicago.setPopulationIncreasedLastYear (false);

        System.out.println("The legal name of this city is " + Chicago.getNameOfCity());
        System.out.println("The Mayor of Chicago is " + Chicago.getMayorName());
        System.out.println("The population of Chicago is " + Chicago.getPopulation());
        System.out.println("The Year Chicago was established was " + Chicago.getYearEstablished());
        System.out.println("PopulationIncreasedLastYear for Chicago is "+ Chicago.isPopulationIncreasedLastYear());

        Computer MacBook = new Computer();

        MacBook.setOperatingSystem ("Mac OS X");
        MacBook.setBuiltBy ("Apple");
        MacBook.setRAMinGB (8.0);
        MacBook.setProcessorSpeedinGHz (2.9);
        MacBook.setSolidStateDrive (true);

        System.out.println("The Operating System of the MacBook is " + MacBook.getOperatingSystem());
        System.out.println("The MacBook was built by " + MacBook.getBuiltBy());
        System.out.println("The MacBook RAM in GB is " + MacBook.getRAMinGB());
        System.out.println("The processor speed for the MacBook in GHz is " + MacBook.getProcessorSpeedinGHz());
        System.out.println("The MacBook has a solid state hard drive? " + MacBook.isSolidStateDrive());

        SpaceCraft SpaceShuttle = new SpaceCraft ();

        SpaceShuttle.setCountry("America");
        SpaceShuttle.setName("Discovery");
        SpaceShuttle.setOperational(false);
        SpaceShuttle.setFuelMaximumCapacity(1000);
        SpaceShuttle.setFastestSpeed(28000);

        System.out.println("Space Shuttle's country of origin is: " + SpaceShuttle.getCountry());
        System.out.println("name is " + SpaceShuttle.getName());
        System.out.println("Space Shuttle: isOperational? " + SpaceShuttle.isOperational());
        System.out.println("Maximum Fuel Capacity: " + SpaceShuttle.getFuelMaximumCapacity());
        System.out.println("Fastest Speed Achievable is: " + SpaceShuttle.getFastestSpeed());

        Vehicle FastCars = new Vehicle ();

        FastCars.setMake("Mustang");
        FastCars.setModel("Ford");
        FastCars.setYear(2009);
        FastCars.setColor("Gray");
        FastCars.setClassicCar(true);

        System.out.println("FastCars make is: " + FastCars.getMake());
        System.out.println("FastCars model is: " + FastCars.getModel());
        System.out.println("FastCars year is " + FastCars.getYear());
        System.out.println("FastCars color is " + FastCars.getColor());
        System.out.println("isClassicCar is " + FastCars.isClassicCar());

    }
}
