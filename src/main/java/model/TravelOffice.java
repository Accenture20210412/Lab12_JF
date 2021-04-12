package model;

import java.util.Arrays;

public class TravelOffice {
    Customer[] customers = new Customer[2];

    public void addCustomer(Customer customer) {
        if(customers[customers.length-1] != null){
            Customer[] auxiliaryTable = customers;
            customers = new Customer[customers.length * 2];
        }
        for (Customer i : customers) {
            if (i == null) {
                i = customer;
                break;
            }
        }
    }

    public Customer[] getCustomers() {
        return customers;
    }


    public String getCustomersInfo(){
        StringBuilder result = new StringBuilder();
        result.append("Klienci Biura: \n");
        for (Customer i : customers) {
            if(i != null) {
                result.append(i.toString());
            }
        }
        return result.toString();
    }
}
