package com.theironyard.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class Cookie {
    String type;
    String name;
    boolean isSweet;
    String maker;
    int size;


    public Cookie(String type, String name, boolean isSweet, String maker, int size) {
        this.type = type;
        this.name = name;
        this.isSweet = isSweet;
        this.maker = maker;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
