package org.example.mcDonalds.serviceImpl;

import org.example.mcDonalds.DTOs.CustomersDto;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.CustomerComparator;
import org.example.mcDonalds.entities.Food;
import org.example.mcDonalds.service.DriveThruService;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DriveThruServiceImpl implements DriveThruService<Customer, Food, CustomersDto>{


    //private static fields for storing List of foods,
    // List of customerDTO(as orderLeaflets) and
    //customer priority Queue. Being "private static" will make these fields
    private static List<Food> listOfOrderedFoods = new ArrayList<>();
    private static List<CustomersDto> customersDTOs = new ArrayList<>();
    private static PriorityQueue<Customer> orderingQueue = new PriorityQueue<>();
    private static PriorityQueue<Customer> comparatorQueue = new PriorityQueue<>(new CustomerComparator());

    @Override
    public CustomersDto addCustomersToQueue(Customer customer, CustomersDto customersDto) {
        System.out.println("Adding customers to queue...");
        orderingQueue.add(customer);
        customersDTOs.add(customersDto);
        return customersDto;
    }

    @Override
    public CustomersDto addCustomerToComparatorQueue(Customer customer, CustomersDto customersDto) {
        System.out.println("Adding customers to queue...");
        comparatorQueue.add(customer);
        customersDTOs.add(customersDto);
        return customersDto;
    }

    @Override
    public List<Food> addFood(Food food) {
        System.out.println("Adding food to menu...");
        listOfOrderedFoods.add(food);
        return listOfOrderedFoods;
    }


    @Override
    public void serveCustomersOrders() {
        while(!orderingQueue.isEmpty()){
            Customer customer = orderingQueue.poll();
            CustomersDto customersDto = customersDTOs.stream()
                    .filter(customersDto1 -> customersDto1.getCustomersId()
                            .equals(customer.getCustomerId()))
                    .toList().get(0);
            System.out.println("Getting customer order...");
            if (!listOfOrderedFoods.contains(customersDto.getFoodOrdered())){
                System.out.println("Customer with ID: " +
                        ""+customer.getCustomerId()+" could not get the "
                        + customer.getFoodOrdered()
                        +" pack! Due to food shortage for "+customersDto.getFoodOrdered());
            }
            else {
                System.out.println("Customer with ID: " +
                        "" + customer.getCustomerId() + " just received a "
                        + customer.getFoodOrdered() + " pack!");
                listOfOrderedFoods.remove(customersDto.getFoodOrdered());
            }
            customersDTOs.remove(customersDto);
        }
    }

    public void serveCustomersOrdersWithComparator() {
        while(!comparatorQueue.isEmpty()){
            Customer customer = comparatorQueue.poll();
            CustomersDto customersDto = customersDTOs.stream()
                    .filter(customersDto1 -> customersDto1.getCustomersId()
                            .equals(customer.getCustomerId()))
                    .toList().get(0);
            System.out.println("Getting customer order...");
            if (!listOfOrderedFoods.contains(customersDto.getFoodOrdered())){
                System.out.println("Customer with ID: " +
                        ""+customer.getCustomerId()+" could not get the "
                        + customer.getFoodOrdered()
                        +" pack! Due to food shortage for "+customersDto.getFoodOrdered());
            }
            else {
                System.out.println("Customer with ID: " +
                        "" + customer.getCustomerId() + " just received a "
                        + customer.getFoodOrdered() + " pack!");
                listOfOrderedFoods.remove(customersDto.getFoodOrdered());
            }
            customersDTOs.remove(customersDto);
        }
    }
}
