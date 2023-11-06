package org.example;

import org.example.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //TODO:I don't understand the lombok
    //TODO:I don't know how to use the localdate effectively
    public static void main(String[] args) {
        Person<Role> person = new Person<>();
        person.setRole(Role.STUDENT);
        person.setAge(12);
        person.setName("Francis");
        Person<String> person1 = new Person<>();
        person1.setRole("Janitor");

        List<List<Object>> listOfString = new ArrayList<>();
        listOfString.add(List.of("1"));
        System.out.println("Hello world!");
    }
}