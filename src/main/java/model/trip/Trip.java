package model.trip;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor

public class Trip {

    private String uniqueName;
    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destiny;
    private BigDecimal price;


    @Override
    public String toString() {
        return  "Trip to: " + destiny +
                ", date: " + startOfTrip +
                " - " + endOfTrip +
                ", cost: " + this.getPrice() +
                "$";
    }
}
