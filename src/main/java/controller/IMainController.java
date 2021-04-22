package controller;

import model.Customer;
import model.trip.Trip;

import java.time.LocalDate;

public interface IMainController {

    void addCustomer(Customer customer);

    void removeCustomer(String name);

    void signUp(Customer customer, Trip trip);

    /**
     * Decyzja o dodatkowej opcji wypisania customera z wycieczki
     * @param customer
     * @param trip
     */
    void signOut(Customer customer, Trip trip);

    void displayCustomers();

    void addTrip(Trip trip);

    void findTripByName(String name);

    void findTripLater(LocalDate date);

    void findTripByDestination(String destiny);

}
