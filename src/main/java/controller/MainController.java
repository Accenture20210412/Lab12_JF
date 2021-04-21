package controller;

import model.Customer;
import model.trip.Trip;
import resources.Customers;



public class MainController implements IMainController {

    private Customers customers = new Customers();

    @Override
    public void addCustomer(Customer customer) {
        customers.addCustomer(customer);
    }


    @Override
    public void removeCustomer(String name) {
//        customers.getCustomers()
//                .stream()
//                .filter(n -> n.getName().startsWith(name) ||
//                                n.getLastName().startsWith(name))
//                .
//       ;
    }
    private boolean isNameStartsWith(String name) {
        return true;
    }

    @Override
    public void signUp(Customer customer, Trip trip) {

    }

    @Override
    public void displayCustomers() {

    }
}
