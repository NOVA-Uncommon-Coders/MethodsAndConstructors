package com.theironyard.novauc;

/**
 * Created by macbookpro on 2/7/17.
 */
public class Book {
    boolean nonfiction;
    String topic;
    String title;
    String author;
    int copyright;

    public Book(boolean nonfiction, String topic, String title, String author, int copyright) {
        this.nonfiction = nonfiction;
        this.topic = topic;
        this.title = title;
        this.author = author;
        this.copyright = copyright;

    }

    public boolean isNonfiction() {
        return nonfiction;
    }

    public void setNonfiction(boolean nonfiction) {
        this.nonfiction = nonfiction;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright) {
        if ( copyright < 2017) {
            this.copyright = copyright;
        }
    }
}
