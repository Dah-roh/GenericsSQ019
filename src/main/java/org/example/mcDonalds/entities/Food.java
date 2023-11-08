package org.example.mcDonalds.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mcDonalds.enums.MealPack;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Food {
    private String name;
    private MealPack mealPackCategory;
    private BigDecimal price;

    public final static BigDecimal BUFFET_PRICE = new BigDecimal(10000);
    public final static BigDecimal DELUXE_PRICE = new BigDecimal(5000);
    public final static BigDecimal STANDARD_PRICE = new BigDecimal(3500);
}
