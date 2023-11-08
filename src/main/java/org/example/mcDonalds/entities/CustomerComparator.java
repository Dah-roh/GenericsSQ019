package org.example.mcDonalds.entities;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o2.getFoodOrdered().ordinal()>o1.getFoodOrdered().ordinal()){
            return 1;
        } else if (o2.getFoodOrdered().ordinal()<o1.getFoodOrdered().ordinal()) {
            return -1;
        }
        return 0;
    }
}
