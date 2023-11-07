package org.example.serviceImp;

import org.example.generics.entities.Company;
import org.example.generics.entities.Person;
import org.example.service.DefaultService;

import java.util.List;

public class AdministrativeServiceImpl implements DefaultService<Company, Person> {

    @Override
    public Company addNewData(Company company) {
        return null;
    }

    @Override
    public Company removeData(Company company) {
        return null;
    }

    @Override
    public Person editData(Person person) {
        return null;
    }

    @Override
    public Company removeCompanyData(Company company) {
        return null;
    }

    @Override
    public List<String> addStrings(String words) {
        return null;
    }
}
