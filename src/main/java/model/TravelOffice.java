package model;

import java.util.Arrays;

public class TravelOffice {
    Customer[] customers = new Customer[2];

    public void addCustomer(Customer customer) {
        if(customers[customers.length-1] != null){
            Customer[] auxiliaryTable = customers;
            customers = new Customer[customers.length * 2];
            for (int i = 0; i < auxiliaryTable.length ; i++) {
                customers[i] = auxiliaryTable[i];
            }
        }
        for (int i=0; i < customers.length; i++) {
            if(customers[i] == null) {
                customers[i] = customer;
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
                result.append(i + "\n");
            }
        }
        return result.toString();
    }
}
