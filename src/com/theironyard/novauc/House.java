package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class House {
    String name;
    String color;
    int residents;
    int rooms;
    boolean IsRotting;

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

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms >1)
        this.rooms = rooms;
    }

    public boolean isRotting() {
        return IsRotting;
    }

    public void setRotting(boolean rotting) {
        IsRotting = rotting;
    }

    public House(String name, String color, int residents, int rooms, boolean isRotting) {
        this.name = name;
        this.color = color;
        this.residents = residents;
        this.rooms = rooms;
        IsRotting = isRotting;

    }
}
