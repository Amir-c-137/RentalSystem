package org.example;

import java.util.Date;

public class Rental {
    public long ID;
    public Item item;
    public Customer customer;
    public Date rentalDate;
    public Date returnDate;


    public Rental(Item item, Customer customer, long ID) {
        this.ID = ID;
        this.item = item;
        this.customer = new Customer(customer.getName(), customer.getEmail(), customer.getPhone(), customer.getAddress(), customer.getID());
        item.isAvailable = false;
        this.rentalDate = new Date();
    }

    public long getID() {
        return ID;
    }

    public Item getItem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
