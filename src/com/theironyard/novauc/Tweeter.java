package com.theironyard.novauc;

/**
 * Created by octavio on 2/7/17.
 */
public class Tweeter {
    String text;
    String username;
    int timestamp;
    boolean isPrivate;
    boolean lessthan140Charcters;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isLessthan140Charcters() {
        return lessthan140Charcters;
    }

    public void setLessthan140Charcters(boolean lessthan140Charcters) {
        this.lessthan140Charcters = lessthan140Charcters;
    }
}
