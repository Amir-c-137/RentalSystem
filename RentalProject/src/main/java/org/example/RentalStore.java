package org.example;

import java.util.ArrayList;

public class RentalStore {
    public static ArrayList<Item> itemList = new ArrayList<>();
    public static ArrayList<Movie> movieList = new ArrayList<>();
    public static ArrayList<Game> gameList = new ArrayList<>();
    public static ArrayList<Book> bookList = new ArrayList<>();
    public static ArrayList<Rental> rentalList = new ArrayList<>();
    public static ArrayList<Customer> members = new ArrayList<>();

    public static void register(Customer customer) {
        members.add(customer);
    }

    public static void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public static void addGame(Game game) {
        gameList.add(game);
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static void removeMovie(Movie movie) {
        if (movie.isAvailable == true)
            movieList.remove(movie);
        else {
            System.out.println("it's not available");
        }
    }

    public static void getAvailableMovies() {
        System.out.println("this is the list of available movies you can rent : ");
        int i = 1;
        for (Movie movie : movieList) {
            if (movie.isAvailable == true)
                System.out.println(
                        i + ". " + movie.title + " by " + movie.director + " and the genre is " + movie.genre);
            i++;
        }
    }

    public static void getAvailableGames() {
        System.out.println("this is the list of available Games you can rent : ");
        int i = 1;
        for (Game game : gameList) {
            if (game.isAvailable == true)
                System.out.println(
                        i + ". " + game.title + " by " + game.publisher + " and the genre is " + game.genre);
            i++;
        }
    }

    public static void getAvailableBooks() {
        System.out.println("this is the list of available Books you can rent : ");
        int i = 1;
        for (Book book : bookList) {
            if (book.isAvailable == true)
                System.out.println(
                        i + ". " + book.title + " by " + book.author + " and the genre is " + book.genre);
            i++;
        }
    }

    public static void rentItem(Item item, Customer customer) {
        String ID = Long.toString(item.ID) + Long.toString(customer.ID);
        long castID = Long.parseLong(ID);
        if (item.isAvailable == true) {
            Rental rental = new Rental(item, customer, castID);
            rentalList.add(rental);
            customer.addRent(rental);
            System.out.println(item.getTitle() + " rented successfully");
        }
        else{
            System.out.println("this item : \""+item.title+"\" has been rented by another person.");
        }
    }

    public static void returnMovie(Rental rental) {
        Item tempItem = rental.item;
        tempItem.isAvailable = true;
    }

    public static Customer getCustomerById(long ID) {
        Customer tempCustomer = null;
        Boolean doesExist = false;
        for (Customer temp : members) {
            if (temp.ID == ID) {
                tempCustomer = temp;
                doesExist = true;
            }
        }
        if (!doesExist) {
            System.out.println("there is no user with this specific ID");
        } else {
            System.out.println("user name is " + tempCustomer.name);
            System.out.println("user email is " + tempCustomer.email);
            System.out.println("user phone is " + tempCustomer.phone);
            tempCustomer.getRentals();
        }
        return tempCustomer;
    }

    public static Movie getMovieById(long ID) {
        Movie tempMovie = null;
        Boolean doesExist = false;
        for (Movie temp : movieList) {
            if (temp.ID == ID) {
                tempMovie = temp;
                doesExist = true;
            }
        }
        if (!doesExist) {
            System.out.println("there is no movie with this specific ID");
        } else {
            System.out.println("movie title is " + tempMovie.title);
            System.out.println("movie director is " + tempMovie.director);
            System.out.println("movie genre is " + tempMovie.genre);
            System.out.println("movie cast is " + tempMovie.cast);
        }
        return tempMovie;
    }

}
