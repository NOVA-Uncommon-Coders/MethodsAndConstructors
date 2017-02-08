package com.theironyard.novauc;

/**
 * Created by kevinallen on 2/7/17.
 */
public class Boat {
    String text;
    String Username;
    boolean isSeaworthy;
    int lentgh;
    String Material;


    public String getText() {
        return text;
    }

    public Boat(String text, String username, boolean isSeaworthy, int lentgh, String material) {
        this.text = text;
        Username = username;
        this.isSeaworthy = isSeaworthy;
        this.lentgh = lentgh;
        Material = material;
    }

    public Boat(String username) {
        Username = username;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        if (username.equalsIgnoreCase("kevin")) {
            this.Username = "hey man thats my name your awesome";
        } else {
            Username = username;

        }
    }

    public boolean isSeaworthy() {
        return isSeaworthy;
    }

    public void setSeaworthy(boolean seaworthy) {
        isSeaworthy = seaworthy;
    }

    public int getLentgh() {
        return lentgh;
    }

    public void setLentgh(int lentgh) {
        this.lentgh = lentgh;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
}
