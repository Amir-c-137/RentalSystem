package org.example;
import java.util.*;
public class Game extends Item {
    private String platform;
    private boolean isAvailable;

    public Game(String title, String genre, Date releaseDate, String platform, int Id) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = Id;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
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
}


