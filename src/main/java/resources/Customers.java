package resources;


import lombok.Getter;
import model.Customer;

import java.util.LinkedList;
import java.util.List;

@Getter

public class Customers implements iCustomers {

    List<Customer> customers = new LinkedList<>();


    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomer(){
        customers.remove(customers);
    }

    @Override
    public String getCustomersInfo(){
        StringBuilder result = new StringBuilder();
        result.append("Klienci Biura: \n");
        for (Customer i : customers) {
            result.append(i.toString())
                    .append("\n");
            }
        return result.toString();
    }
}
