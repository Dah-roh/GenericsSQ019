package org.example.service;

import org.example.generics.entities.Company;


import java.util.List;

@FunctionalInterface
public interface DefaultService {

//    P addNewData(P p);
//    P removeData(P p);
//    C editData(C c);
//    Company removeCompanyData(Company company);
    List<String> addStrings(String words);

}
