package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Book {

    int pages;
    int bookmarks;
    String title;
    String text;
    boolean ThrownInFire;

    public int getPages() {


        return pages;
    }

    public void setPages(int pages) {



        this.pages = pages;

    }

    public int getBookmarks() {

            return bookmarks;}


    public void setBookmarks(int bookmarks) {
        this.bookmarks = bookmarks;
    }

    public String getTitle() {



        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isThrownInFire() {

        if (pages == 1001)

            return true;

        else return ThrownInFire;


    }

    public void setThrownInFire(boolean thrownInFire) {
        ThrownInFire = thrownInFire;
    }

    public Book(int pages, int bookmarks, String title, String text, boolean thrownInFire) {
        this.pages = pages;
        this.bookmarks = bookmarks;
        this.title = title;
        this.text = text;
        ThrownInFire = thrownInFire;





    }
}
