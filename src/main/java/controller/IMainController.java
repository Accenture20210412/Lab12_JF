package controller;

import model.Customer;
import model.trip.Trip;

public interface IMainController {

    void addCustomer(Customer customer);

    void removeCustomer(String name);

    void signUp(Customer customer, Trip trip);

    void displayCustomers();

}
