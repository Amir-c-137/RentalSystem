package org.example;
import  java.util.*;
public class Movie extends Item{
    private String director;
    private ArrayList<String> cast = new ArrayList<>();
    private boolean IsAvailable;

    public Movie(String title, String genre, String director, ArrayList <String> cast, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.id = id;
        this.IsAvailable = true; // movie is IsAvailable for rent by default
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return IsAvailable;
    }

    public void setAvailable(boolean CurrentStatus) {
        IsAvailable = CurrentStatus;
    }

}
