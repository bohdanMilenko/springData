package com.spring.data.repository;

import com.spring.data.entity.Customer;

public interface ICustomerRepo {

    Customer findById(int id);
    void save(Customer customer);
    boolean remove(int id);
    boolean remove(Customer customer);
}
