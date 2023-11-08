package org.example.mcDonalds.service;

import org.example.mcDonalds.DTOs.CustomersDto;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.Food;

import java.util.List;

public interface DriveThruService<C, F, D> {
    D addCustomersToQueue(C customer, D customersDto);

    D addCustomerToComparatorQueue(C customer, D customersDto);

    List<F> addFood(F food);
    void serveCustomersOrders();

}
