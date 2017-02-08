package com.theironyard.novauc;

/**
 * Created by JacobP on 2/8/17.
 */
public class Movie {
    String movieTitle;
    String director;
    String rating;
    int year;
    int runTime;
    public Movie(String title, String director, String rating, int year, int runTime) {
        this.movieTitle = title;
        this.director = director;
        this.rating = rating;
        this.year = year;
        this.runTime = runTime;

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String value) {
        movieTitle = value;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String value) {
        director = value;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String value) {
        rating = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        year = value;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int value) {
        if (runTime < 0 && runTime > 300) {
            this.runTime = runTime;

        } else {
            System.out.println("Not a valid runTime");
        }

    }
    public String toString() {
        return "Movie title: " + movieTitle +
                "\n Director: " + director +
                "\n Rating: " + rating +
                "\n Year: " + year +
                "\n Total runtime: " + runTime;
    }

    }



