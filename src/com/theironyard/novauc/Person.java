package com.theironyard.novauc;

/**
 * Created by JacobP on 2/7/17.
 */
public class Person {
    String name;
    int age;
    double height;
    double weight;
    boolean isMarried;

    public Person(String name, int age, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double value) {
        if (height < 0 && height > 80) {
            this.height = height;

        } else {
            System.out.println("Not a valid height");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double value) {
        this.weight = value;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean value) {
        isMarried = value;
    }
    public String toString() {
        return "Name: " + name +
                "\n Age: " + age +
                "\n Height: " + height +
                "\n Weight: " + weight +
                "\n Is Married: " + isMarried;
    }
}
