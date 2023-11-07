package org.example.generics.entities;

import lombok.*;

@Data
public class Person<T> {

    private T id;
    private T amount;
    private String name;
    private Integer age;
    private String email;
}
