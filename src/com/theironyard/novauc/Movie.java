package com.theironyard.novauc;

/**
 * Created by octavio on 2/7/17.
 */
public class Movie {
        String title;
        String genre;
        String countryOrigin;
        int rating;
        String watchAgain;

    public Movie(String title, String genre, String countryOrigin, int rating, String watchAgain) {
        this.title = title;
        this.genre = genre;
        this.countryOrigin = countryOrigin;
        this.rating = rating;
        this.watchAgain = watchAgain;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public String getCountryOrigin() { return countryOrigin; }

    public void setCountryOrigin(String countryOrigin) { this.countryOrigin = countryOrigin; }

    public int getRating() { return rating; }

    public void setRating(int rating) {
        this.rating = rating;
        if (rating < 20) {
            System.out.println("The movie sucks!!!");
        }
    }

    public String getWatchAgain() { return watchAgain; }

    public void setWatchAgain(String watchAgain) {this.watchAgain = watchAgain; }

}
