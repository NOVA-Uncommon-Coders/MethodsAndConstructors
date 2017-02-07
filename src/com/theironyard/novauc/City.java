package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */

public class City {

    String NameOfCity;
    String MayorName;
    int population;
    int yearEstablished;
    boolean PopulationIncreasedLastYear;


    public String getNameOfCity() {
            return NameOfCity; }

        public void setNameOfCity(String nameOfCity) {
            NameOfCity = nameOfCity; }

        public String getMayorName() {
            return MayorName; }

        public void setMayorName(String mayorName) {
            MayorName = mayorName; }

        public int getPopulation() {
            return population; }

        public void setPopulation(int population) {
            this.population = population; }

        public int getYearEstablished() {
            return yearEstablished; }

        public void setYearEstablished(int yearEstablished) {
            this.yearEstablished = yearEstablished; }

        public boolean isPopulationIncreasedLastYear() {
            return PopulationIncreasedLastYear; }

        public void setPopulationIncreasedLastYear(boolean populationIncreasedLastYear) {
            PopulationIncreasedLastYear = populationIncreasedLastYear; }

    public City(String nameOfCity, String mayorName, int population, int yearEstablished, boolean populationIncreasedLastYear) {
        NameOfCity = nameOfCity;
        MayorName = mayorName;
        this.population = population;
        this.yearEstablished = yearEstablished;
        PopulationIncreasedLastYear = populationIncreasedLastYear;
    }
}
