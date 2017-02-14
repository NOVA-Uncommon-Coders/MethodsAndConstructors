package com.theironyard.novauc;

/**
 * Created by jerieshasmith on 2/7/17.
 */
public class Dog {
    String name;
    String breed;
    int age;
    String color;
    int weight;


    public Dog(String name, String breed, int age, String color, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int num = 100;
        if (num != 100)
            System.out.println("Old Dog");

        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

