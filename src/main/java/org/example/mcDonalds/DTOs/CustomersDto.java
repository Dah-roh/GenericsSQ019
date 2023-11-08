package org.example.mcDonalds.DTOs;

import lombok.Data;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.Food;

import java.math.BigDecimal;

@Data
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
