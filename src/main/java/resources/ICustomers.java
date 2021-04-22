package resources;

import model.Customer;

import java.util.List;

public interface ICustomers {

    void add(Customer customer);

    void remove(Customer customer);

    String display();

    List<Customer> contain(String name);
}
