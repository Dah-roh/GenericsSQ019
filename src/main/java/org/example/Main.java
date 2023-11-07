package org.example;

import org.example.collections.Staff;
import org.example.enums.Role;
import org.example.generics.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //TODO:I don't understand the lombok
    //TODO:I don't know how to use the localdate effectively

    //WILDCARDS/BOUNDS IN GENERICS
    public static void main(String[] args) {
        Company<? super CategoryType> ikea = new Company<>();
        Electronic tv =  new Electronic();
        tv.setModel("2001");
        Furniture ikChair = new Furniture();
        ikea.setCategoryType(ikChair);


        Person<? super Number> person = new Person<>();
        person.setId(5);
        person.setAmount(5.6);
        person.setAge(12);
        person.setName("Francis");
//        Person<String> person1 = new Person<>();
//        person1.setRole("Janitor");

        List<List<Object>> listOfString = new ArrayList<>();
        listOfString.add(List.of("1"));
        System.out.println("Hello world!");
    }
}