package org.example;
import java.util.*;
public class RentalStore {
    ArrayList<Customer> customers;
    ArrayList<Movie> movies;
    ArrayList<Rental> rentals;

    public RentalStore() {
        this.movies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public void register(Customer customer) {
        customers.add(customer);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public ArrayList<Movie> getAvailableMovies() {

        ArrayList<Movie> availableMovies = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isAvailable() == true)
                availableMovies.add(movies.get(i));
        }
        return availableMovies;
    }

/*
    @Override
    public String toString() {
        return "RentalStore{" +
                "movies=" + movies +
                '}';
    }
*/
    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void rentMovie(Movie movie, Customer customer) {
        int MovieIndex = movies.indexOf(movie);
        if (movies.get(MovieIndex).isAvailable() == true){
        movies.get(MovieIndex).setAvailable(false);
        int id = movies.get(movies.indexOf(movie)).getId() + customers.get(customers.indexOf(customer)).getId();
        Rental rental = new Rental(movie, customer, id);
        Date tempDate = new Date();
        rental.setrentalDate(tempDate);
        rentals.add(rental);}
    }

    public void returnMovie(Movie movie, Customer customer) {
        int TempMovieIndex = movies.indexOf(movie);
        movies.get(TempMovieIndex).setAvailable(true);
        int id = movies.get(movies.indexOf(movie)).getId() + customers.get(customers.indexOf(customer)).getId();
        int RentalIndex = -1;
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).getId() == (id)) {
                RentalIndex = i;
                break;
            }
        }
        if (RentalIndex != -1) {
            Date tempDate = new Date();
            rentals.get(RentalIndex).setReturnDate(tempDate);
        }
    }

    public Customer getCustomerById(int id) {
        int CustomerIndex = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (id == (customers.get(i).getId())) {
                CustomerIndex = i;
                break;
            }
        }
        if (CustomerIndex !=-1)
            return customers.get(CustomerIndex);
        return null;
    }

    public Movie getMovieById(int id){
        int MovieIndex = -1; //because it does not exist
        for (int i=0 ;  i<movies.size() ; i++){
            if (id==(movies.get(i).getId())){
                MovieIndex = i;
                break;
            }
        }
        if (MovieIndex !=-1)
            return movies.get(MovieIndex);
        return null;
    }


}

