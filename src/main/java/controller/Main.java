package controller;

import model.AbroadTrip;
import model.DomesticTrip;
import model.Trip;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Trip trip = new Trip(LocalDate.now(), LocalDate.now(), "Częstochowa", BigDecimal.ONE);
        System.out.println(trip);
        AbroadTrip abroadTrip = new AbroadTrip(LocalDate.now(), LocalDate.now(), "Dąbrowa Górnicza", BigDecimal.TEN, BigDecimal.TEN);
        System.out.println(abroadTrip);
        DomesticTrip domesticTrip = new DomesticTrip(LocalDate.now(), LocalDate.now(), "Sanok", BigDecimal.valueOf(1000),BigDecimal.valueOf(500));
        System.out.println(domesticTrip);
    }
}

