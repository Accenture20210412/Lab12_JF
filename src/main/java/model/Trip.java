package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Trip {
    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destiny;
    private BigDecimal price;

    public Trip(LocalDate startOfTrip, LocalDate endOfTrip, String destiny, BigDecimal price) {
        this.startOfTrip = startOfTrip;
        this.endOfTrip = endOfTrip;
        this.destiny = destiny;
        this.price = price;
    }

    public LocalDate getStartOfTrip() {
        return startOfTrip;
    }

    public void setStartOfTrip(LocalDate startOfTrip) {
        this.startOfTrip = startOfTrip;
    }

    public LocalDate getEndOfTrip() {
        return endOfTrip;
    }

    public void setEndOfTrip(LocalDate endOfTrip) {
        this.endOfTrip = endOfTrip;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(startOfTrip, trip.startOfTrip) && Objects.equals(endOfTrip, trip.endOfTrip) && Objects.equals(destiny, trip.destiny) && Objects.equals(price, trip.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startOfTrip, endOfTrip, destiny, price);
    }

    @Override
    public String toString() {
        return  "Trip to: " + destiny +
                ", date: " + startOfTrip +
                " - " + endOfTrip +
                ", cost: " + this.getPrice() +
                "$";
    }
}
