package com.theironyard.novauc;

/**
 * Created by octavio on 2/7/17.
 */
public class Wealth {
    String Occupation;
    String Company;
    int yearsEmployed;
    int salary;
    boolean loveJob;

    public Wealth(String occupation, String company, int yearsEmployed, int salary, boolean loveJob) {
        Occupation = occupation;
        Company = company;
        this.yearsEmployed = yearsEmployed;
        this.salary = salary;
        this.loveJob = loveJob;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getYearsEmployed() {
        return yearsEmployed;
    }

    public void setYearsEmployed(int yearsEmployed) {
        this.yearsEmployed = yearsEmployed;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        if (salary > 100000) {
            System.out.println("That's a lot of money!");
        }
    }

    public boolean isLoveJob() {
        return loveJob;
    }

    public void setLoveJob(boolean loveJob) {
        this.loveJob = loveJob;
    }

}
