package org.example;

import java.util.ArrayList;

public class Customer {
    public long ID;
    public String name;
    public String email;
    public String phone;
    public String address;
    public ArrayList<Rental> rentals;

    public Customer(String name, String email, String phone, String address, long ID) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        rentals = new ArrayList<>();
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        System.out.println(this.name + " rent these item :");
        rentals = new ArrayList<>();
        int i = 1;
        for (Rental temp : RentalStore.rentalList) {
            if (temp.customer.ID == this.ID) {
                System.out.println(i + ". the Item : " + temp.item.title);
                i++;
            }
        }
        return rentals;
    }

    public void addRent(Rental rental) {
        if(rentals== null)
            rentals = new ArrayList<>();
        rentals.add(rental);
    }
}
