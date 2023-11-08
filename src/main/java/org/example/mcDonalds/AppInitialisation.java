package org.example.mcDonalds;

import org.example.Animal;
import org.example.People;
import org.example.User;
import org.example.UserComparator;
import org.example.mcDonalds.DTOs.CustomersDto;
import org.example.mcDonalds.entities.Customer;
import org.example.mcDonalds.entities.Food;
import org.example.mcDonalds.enums.Gender;
import org.example.mcDonalds.enums.MealPack;
import org.example.mcDonalds.serviceImpl.DriveThruServiceImpl;

import java.time.LocalDateTime;
import java.util.PriorityQueue;

public class AppInitialisation {

    public static void main(String[] args) {
        Customer customer = Customer.builder().
                customerId(1l)
                .name("Vea")
                .gender(Gender.MALE)
                .timeOfOrder(LocalDateTime.now())
                .foodOrdered(MealPack.BUFFET)
                .build();
        Customer customerTwo = Customer.builder().
                customerId(2l)
                .name("Phineas")
                .gender(Gender.FEMALE)
                .timeOfOrder(LocalDateTime.now())
                .foodOrdered(MealPack.STANDARD)
                .build();
        Customer customerThree = Customer.builder().
                customerId(3l)
                .name("Garfield")
                .gender(Gender.MALE)
                .timeOfOrder(LocalDateTime.now())
                .foodOrdered(MealPack.DELUXE)
                .build();
        Customer customerFour = Customer.builder().
                customerId(4l)
                .name("Phoebos")
                .gender(Gender.MALE)
                .timeOfOrder(LocalDateTime.now())
                .foodOrdered(MealPack.STANDARD)
                .build();

        Food chickenBurger = Food.builder()
                .mealPackCategory(MealPack.BUFFET)
                .price(Food.BUFFET_PRICE)
                .name("Burger")
                .build();

        Food caesarsSalad = Food.builder()
                .mealPackCategory(MealPack.DELUXE)
                .price(Food.DELUXE_PRICE)
                .name("Salad")
                .build();

        Food parfait = Food.builder()
                .mealPackCategory(MealPack.DELUXE)
                .price(Food.DELUXE_PRICE)
                .name("Dessert")
                .build();
        CustomersDto customersDto = new CustomersDto(customer, chickenBurger);
        CustomersDto customersDto2 = new CustomersDto(customerTwo, chickenBurger);
        CustomersDto customersDto3 = new CustomersDto(customerThree, caesarsSalad);
        CustomersDto customersDto4 = new CustomersDto(customerFour, chickenBurger);

        DriveThruServiceImpl driveThruService = new DriveThruServiceImpl();
        driveThruService.addFood(chickenBurger);
        driveThruService.addFood(caesarsSalad);
        driveThruService.addFood(parfait);

        driveThruService.addCustomersToQueue(customer, customersDto);
        driveThruService.addCustomersToQueue(customerTwo, customersDto2);
        driveThruService.addCustomersToQueue(customerThree, customersDto3);
        driveThruService.addCustomersToQueue(customerFour, customersDto4);

        driveThruService.serveCustomersOrders();

//        driveThruService.addCustomerToComparatorQueue(customer, customersDto);
//        driveThruService.addCustomerToComparatorQueue(customerTwo, customersDto2);
//        driveThruService.addCustomerToComparatorQueue(customerThree, customersDto3);
//        driveThruService.addCustomerToComparatorQueue(customerFour, customersDto4);
//
//        driveThruService.serveCustomersOrdersWithComparator();


        System.out.println();
        System.out.println();

        User persons = new People();
        persons.setAge(5);
        User dog = new Animal();
        dog.setAge(6);
        PriorityQueue<User> queueOfUsers = new PriorityQueue<>(new UserComparator());
        queueOfUsers.add(dog);
        queueOfUsers.add(persons);


        while(!queueOfUsers.isEmpty()){
            System.out.println(queueOfUsers.poll());
        }
    }
}
