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



    @Override
    public String toString() {
        return name + " " +
                lastName + ", adress: " +
                adress;
    }
}
