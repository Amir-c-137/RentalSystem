package org.example;
import java.util.*;
public class Book extends Item {

    private String author;
    private int pages;
    private boolean isAvailable;

    public Book(String title, String genre, Date releaseDate, String author, int pages, int ID) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.author = author;
        this.pages = pages;
        this.id = ID;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getID() {
        return id;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getPages() {
        return pages;
    }
}
