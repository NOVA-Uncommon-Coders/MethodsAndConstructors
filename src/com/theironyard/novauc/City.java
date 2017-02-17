package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */

public class City {

    private String NameOfCity;
    private String MayorName;
    private int population;
    private int yearEstablished;
    private boolean populationIncreasedLastYear;

    public City() {

    }


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
            populationIncreasedLastYear = populationIncreasedLastYear; }

    public City(String nameOfCity, String mayorName, int population, int yearEstablished, boolean populationIncreasedLastYear) {
        this.NameOfCity = nameOfCity;
        this.MayorName = mayorName;
        this.population = population;
        this.yearEstablished = yearEstablished;
        this.populationIncreasedLastYear = populationIncreasedLastYear;
    }
}
