package org.example.mcDonalds.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mcDonalds.enums.MealPack;
import org.example.mcDonalds.enums.Gender;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Comparable<Customer>{
    private Long customerId;
    private String name;
    private Gender gender;
    private MealPack foodOrdered;
    private LocalDateTime timeOfOrder;

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(o.foodOrdered.ordinal(), this.foodOrdered.ordinal());
    }
}
