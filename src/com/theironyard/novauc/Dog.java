package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Dog {
    String name;
    String color;
    int Age;
    int Legs;
    boolean HowlsAtMoon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getLegs() {
        return Legs;
    }

    public void setLegs(int legs) {
        Legs = legs;
    }

    public boolean isHowlsAtMoon() {

        if (howls == false)
        return HowlsAtMoon;
    }

    public void setHowlsAtMoon(boolean howlsAtMoon) {
        HowlsAtMoon = howlsAtMoon;
    }

    public Dog(String name, String color, int age, int legs, boolean howlsAtMoon) {
        this.name = name;
        this.color = color;
        Age = age;
        Legs = legs;
        HowlsAtMoon = howlsAtMoon;


    }
}
