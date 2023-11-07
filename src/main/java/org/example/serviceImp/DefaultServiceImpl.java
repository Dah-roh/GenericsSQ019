package org.example.serviceImp;

import org.example.generics.entities.Company;
import org.example.generics.entities.Person;
import org.example.service.DefaultService;

import java.util.Comparator;
import java.util.List;

public class DefaultServiceImpl implements DefaultService<Person, Company>, Comparator<Person> {


    @Override
    public Person addNewData(Person person) {
        return null;
    }

    @Override
    public Person removeData(Person person) {
        return null;
    }

    @Override
    public Company editData(Company company) {
        return null;
    }

    @Override
    public Company removeCompanyData(Company company) {
        return null;
    }

    @Override
    public List<String> addStrings(String s) {
        return null;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
