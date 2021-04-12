package controller;

import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        Customer customer1 = new Customer("Jakub", "Fik", "Kraków");
        Customer customer2 = new Customer("Szymon", "Wydra", "Hiszpania");
        Customer customer3 = new Customer("Alicja", "Janik", "Częstochowa");

        Trip trip = new Trip(LocalDate.now(), LocalDate.now(), "Częstochowa", BigDecimal.ONE);
        AbroadTrip abroadTrip = new AbroadTrip(LocalDate.now(), LocalDate.now(), "Dąbrowa Górnicza", BigDecimal.TEN, BigDecimal.TEN);
        DomesticTrip domesticTrip = new DomesticTrip(LocalDate.now(), LocalDate.now(), "Sanok", BigDecimal.valueOf(1000),BigDecimal.valueOf(500));

        customer1.setTrip(domesticTrip);
        customer2.setTrip(abroadTrip);
        customer3.setTrip(trip);

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);

        System.out.println(travelOffice.getCustomersInfo());
    }
}

