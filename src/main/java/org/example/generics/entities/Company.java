package org.example.generics.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Company <B>{
    private String name;
    private B categoryType;
    private LocalDate founded;
    private Integer noOfEmployees;


}
