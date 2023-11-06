package org.example.entities;

import lombok.*;

@Data
public class Person<T> {

    private T role;
    private String name;
    private Integer age;
    private String email;
}
