package com.theironyard.novauc;

/**
 * Created by peter on 2/7/17.
 */
public class TVShows {
    boolean comedy;
    boolean news;
    double lengthMins;
    int channel;
    String network;

    TVShows() {
        System.out.println("TVShows empty");
    }

    TVShows(boolean comedy, boolean news, double lengthMins, int channel, String network) {
        this.comedy = comedy;
        this.news = news;
        this.lengthMins = lengthMins;
        this.channel = channel;
        this.network = network;
        System.out.println("TVShows passed the variables");
    }

    double getLengthMins() {
        return lengthMins;
    }

    void setLengthMins(double lengthMins) {

        if (lengthMins > 29) {
            this.lengthMins = lengthMins;
        } else {
            System.out.println("Short");
        }


    }
}
