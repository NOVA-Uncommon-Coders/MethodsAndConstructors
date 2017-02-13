package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Comedian {
    int age;
    int height;
    String name;
    String jokes;
    boolean laughs;

    public Comedian(int age, int height, String name, String jokes, boolean laughs) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.jokes = jokes;
        this.laughs = laughs;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJokes() {

        return jokes;
    }

    public void setJokes(String jokes) {
        this.jokes = jokes;
    }

    public boolean isLaughs() {
        return laughs;
    }

    public void setLaughs (boolean laughs){
        if(this.laughs == true){
            System.out.println("HAHAHAH");
        }
    }
}


