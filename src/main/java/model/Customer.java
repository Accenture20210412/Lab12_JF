package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.trip.Trip;

@Data
@AllArgsConstructor

public class Customer {
    private String name;
    private String lastName;
    private String adress;
    private Trip trip;


    public Customer(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }


    @Override
    public String toString() {
        return name + " " +
                lastName + ", adress: " +
                adress + ", trip: " +
                trip;
    }
}
