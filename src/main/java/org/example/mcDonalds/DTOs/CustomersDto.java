package org.example.mcDonalds.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.ObjectMapper;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.Food;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CustomersDto {
    private Long customersId;
    private BigDecimal foodPrice;
    private Food foodOrdered;

    public CustomersDto(Customer customer, Food food) {
        this.customersId = customer.getCustomerId();
        this.foodPrice = food.getPrice();
        this.foodOrdered = food;
    }
}
