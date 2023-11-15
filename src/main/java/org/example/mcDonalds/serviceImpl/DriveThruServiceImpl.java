package org.example.mcDonalds.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.example.mcDonalds.DTOs.CustomersDto;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.CustomerComparator;
import org.example.mcDonalds.entities.Food;
import org.example.mcDonalds.exceptions.FoodScarcityException;
import org.example.mcDonalds.service.DriveThruService;
import org.example.mcDonalds.service.QueueInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Logger;


public class DriveThruServiceImpl{

    private Logger logger = Logger.getGlobal();


    //private static fields for storing List of foods,
    // List of customerDTO(as orderLeaflets) and
    //customer priority Queue. Being "private static" will make these fields easily accessible within
    //this class...
    public static List<Food> listOfOrderedFoods = new ArrayList<>();
    private static List<CustomersDto> customersDTOs = new ArrayList<>();
    private static PriorityQueue<Customer> orderingQueue = new PriorityQueue<>();
    private static PriorityQueue<Customer> comparatorQueue = new PriorityQueue<>(new CustomerComparator());

    //Calling queueInterface methods here...

    public QueueInterface<CustomersDto, Customer> addCustomersToQueue = ((customer, customersDto) -> {
        System.out.println("Adding customers to queue...");
        orderingQueue.add(customer);
        customersDTOs.add(customersDto);
        return customersDto;
    });

    public QueueInterface<CustomersDto, Customer> addCustomerToComparatorQueue = ((customer, customersDto) -> {
        System.out.println("Adding customers to queue...");
        comparatorQueue.add(customer);
        customersDTOs.add(customersDto);
        return customersDto;
    });



    public List<Food> addFood(Food  food){
        System.out.println("Adding food to menu...");
        DriveThruServiceImpl.listOfOrderedFoods.add(food);
        return DriveThruServiceImpl.listOfOrderedFoods;
    }


    //DriveThruServiceImpl declarative method...
    public DriveThruService serveCustomersOrders = ()->{
        while(!orderingQueue.isEmpty()){
            Customer customer = orderingQueue.poll();
            CustomersDto customersDto = customersDTOs.stream()
                    .filter(customersDto1 -> customersDto1.getCustomersId()
                            .equals(customer.getCustomerId()))
                    .toList().get(0);
            System.out.println("Getting customer order...");
            if (!listOfOrderedFoods.contains(customersDto.getFoodOrdered())){
                throw new FoodScarcityException("Customer with ID: " +
                        ""+customer.getCustomerId()+" could not get the "
                        + customer.getFoodOrdered()
                        +" pack! Due to food shortage for "+customersDto.getFoodOrdered());
            }
            else {
                String message = "Customer with ID: " +
                        "" + customer.getCustomerId() + " just received a "
                        + customer.getFoodOrdered() + " pack!";

                logger.info(message);
                listOfOrderedFoods.remove(customersDto.getFoodOrdered());
            }
            customersDTOs.remove(customersDto);
        }
    };

    public DriveThruService serveCustomersOrdersWithComparator = ()-> {
        while (!comparatorQueue.isEmpty()) {
            Customer customer = comparatorQueue.poll();
//            CustomersDto customersDto = customersDTOs.stream()
//                    .filter(customersDto1 -> customersDto1.getCustomersId()
//                            .equals(customer.getCustomerId()))
//                    .toList().get(0);
            //below is the same as above comment
            CustomersDto customersDto1 = new CustomersDto();
            for (CustomersDto customersDTO : customersDTOs) {
                if (customersDTO.getCustomersId() == customer.getCustomerId()) {
                    customersDto1 = customersDTO;
                }
            }
            System.out.println("Getting customer order...");
            if (!listOfOrderedFoods.contains(customersDto1.getFoodOrdered())) {
                System.out.println("Customer with ID: " +
                        "" + customer.getCustomerId() + " could not get the "
                        + customer.getFoodOrdered()
                        + " pack! Due to food shortage for " + customersDto1.getFoodOrdered());
            } else {
                System.out.println("Customer with ID: " +
                        "" + customer.getCustomerId() + " just received a "
                        + customer.getFoodOrdered() + " pack!");
                listOfOrderedFoods.remove(customersDto1.getFoodOrdered());
            }
            customersDTOs.remove(customersDto1);
        }
    };

}
