package com.theironyard.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class Sock {
    boolean isDirty;
    String type;
    String color;
    int length;
    boolean isWool;

    public Sock(boolean isDirty, String type, String color, int length, boolean isWool) {
        this.isDirty = isDirty;
        this.type = type;
        this.color = color;
        this.length = length;


        this.isWool = isWool;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {

        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWool() {
        return isWool;
    }

    public void setWool(boolean wool) {
        isWool = wool;
    }
}
