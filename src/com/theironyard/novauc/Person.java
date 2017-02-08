package com.theironyard.novauc;

/**
 * Created by macbookpro on 2/7/17.
 */
public class Person {

    String name;
    boolean famous;
    int age;
    String nationality;
    String profession;

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, boolean famous, int age, String nationality, String profession) {
        this.name = name;
        this.famous = famous;
        this.age = age;
        this.nationality = nationality;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFamous() {
        return famous;
    }

    public void setFamous(boolean famous) {
        this.famous = famous;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
