package org.example.service;

import org.example.generics.entities.Company;


import java.util.List;

public interface DefaultService<P, C> {

    P addNewData(P p);
    P removeData(P p);
    C editData(C c);
    Company removeCompanyData(Company company);
    List<String> addStrings(String words);

}
