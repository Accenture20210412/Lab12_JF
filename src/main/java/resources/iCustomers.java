package resources;

import model.Customer;

public interface iCustomers {

    void addCustomer(Customer customer);

    void removeCustomer();

    String getCustomersInfo();
}
