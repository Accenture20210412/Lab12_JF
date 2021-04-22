package model.trip;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter

public class DomesticTrip extends Trip{

    private BigDecimal selfAproachDiscount;

    public DomesticTrip(String uniqueName,
                        LocalDate startOfTrip,
                        LocalDate endOfTrip,
                        String destiny,
                        BigDecimal price,
                        BigDecimal selfAproachDiscount) {
        super(uniqueName, startOfTrip, endOfTrip, destiny, price);
        this.selfAproachDiscount = selfAproachDiscount;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", include discount (" + this.selfAproachDiscount + "$)";
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(selfAproachDiscount);
    }
}
