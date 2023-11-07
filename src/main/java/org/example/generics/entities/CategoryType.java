package org.example.generics.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CategoryType {
    private Long id;
    private String referenceNumber;
    private LocalDate expiryDate;
    private LocalDate productionDate;
}
