package org.example.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Company {
    private String name;
    private LocalDate founded;
    private Integer noOfEmployees;


}
