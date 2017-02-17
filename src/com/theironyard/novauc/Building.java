package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class Building {
    private String nameOfCity;
    private String mayorName;
    private int population;
    private int yearEstablished;
    private boolean populationIncreasedLastYear;

    public Building() {

    }

    public String getNameOfCity() {
        return nameOfCity; }
    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity; }

    public String getMayorName() {
        return mayorName; }
    public void setMayorName(String mayorName) {
        this.mayorName = mayorName; }

    public int getPopulation() {
        return population; }

    public void setPopulation(int population) {

        if (population > 2600000 && population < 2800000) {
            this.population = population;
        } else {
            System.out.println("Not a valid population #");
        }
    }

    public int getYearEstablished() {
        return yearEstablished; }
    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished; }

    public boolean isPopulationIncreasedLastYear() {
        return populationIncreasedLastYear; }
    public void setPopulationIncreasedLastYear(boolean populationIncreasedLastYear) {
        this.populationIncreasedLastYear = populationIncreasedLastYear; }

    public Building(String nameOfCity, String mayorName, int population, int yearEstablished, boolean populationIncreasedLastYear) {

        this.nameOfCity = nameOfCity;
        this.mayorName = mayorName;
        this.population = population;
        this.yearEstablished = yearEstablished;
        this.populationIncreasedLastYear = populationIncreasedLastYear;
    }
}
