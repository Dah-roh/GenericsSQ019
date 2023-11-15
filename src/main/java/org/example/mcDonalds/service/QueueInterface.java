package org.example.mcDonalds.service;

public interface QueueInterface<D, C> {

    D apply(C customer, D customersDto);

}
