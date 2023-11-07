package org.example.generics.entities;

import lombok.Data;

@Data
public class Electronic extends CategoryType {
    private String watts;
    private String voltage;
    private String model;
    private String current;


}
