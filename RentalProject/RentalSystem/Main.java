package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        RentalStore rentalStore = new RentalStore();

        Customer customer1 = new Customer("mammad" , "hello@gmail.com" , "09111234567" , "tehran" , 2222);
        rentalStore.register(customer1);

        Customer customer2 = new Customer("amir" , "bye@gmail.com" , "09117654321" , "sari" , 6565);
        rentalStore.register(customer2);

        List actorsList = Arrays.asList("kelashehshgar poli" , "ziarati"
                                         , "Ali" , "izad" , "maryam");
        ArrayList<String> actors = new ArrayList<>();
        actors.addAll(actorsList);
        Date date = new Date();

        Movie FirstMovie = new Movie("The lord of the rings" , "fantasy" , "jackson" , actors , date , 111);
        rentalStore.addMovie(FirstMovie);

        Movie SecondMovie = new Movie("fight club" , "action" , "fincher" , actors , date , 1234);
        rentalStore.addMovie(SecondMovie);

        Movie ThirdMovie = new Movie("the dark knight" , "super hero" , "nolan" , actors , date , 911);
        rentalStore.addMovie(ThirdMovie);
/*
        System.out.println(rentalStore.getAvailableMovies());
        rentalStore.rentMovie(SecondMovie, customer1);
        System.out.println(rentalStore.getAvailableMovies());
        rentalStore.returnMovie(SecondMovie, customer1);
        System.out.println(rentalStore.getAvailableMovies());

        System.out.println(rentalStore.getCustomerById(2222));

        System.out.println(rentalStore.getMovieById(911));

        System.out.println(rentalStore.getRentals().get(0).getRentalDate());
        System.out.println(rentalStore.getRentals().get(0).getReturnDate());

        rentalStore.removeMovie(FirstMovie);
        System.out.println(rentalStore.getAvailableMovies());
        */
    }
}