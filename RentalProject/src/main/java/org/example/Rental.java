package org.example;
import java.util.*;
public class Rental {
    private Movie rentedMovie;
    private Customer rentingCustomer;
    private Date rentalDate;
    private Date returnDate;
    private int rentalID;

    public Rental(Movie movie, Customer customer, int id) {
        this.rentedMovie = movie;
        this.rentingCustomer = customer;
        this.rentalID = id;
        this.rentalDate = new Date();
    }

    public int getId() {
        return rentalID;
    }

    public Movie getMovie() {
        return rentedMovie;
    }

    public Customer getCustomer() {
        return rentingCustomer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setrentalDate(Date rentalDate){
        this.rentalDate = rentalDate;}
    public void setReturnDate(Date date) {
        this.returnDate = date;
    }

    /* public double calculateLateFee() {
        long daysLate = (returnDate.getTime() - rentalDate.getTime()) / (1000 * 60 * 60 * 24);
        double lateFee = daysLate * rentedMovie.getLateFee();
        return lateFee > 0 ? lateFee : 0.0; // Late fee cannot be negative
    }
    */
}

