package org.example.mcDonalds.service;

import org.example.mcDonalds.DTOs.CustomersDto;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.Food;
import org.example.mcDonalds.exceptions.FoodScarcityException;
import org.example.mcDonalds.serviceImpl.DriveThruServiceImpl;

import java.util.List;
@FunctionalInterface
public interface DriveThruService {
    void serveFunction() throws FoodScarcityException;

}
