package com.spring.data.service;

import com.spring.data.entity.Customer;

public interface ICustomerService {

    Customer findById(int id);
    void save(Customer customer);
    boolean remove(int id);
    boolean remove(Customer customer);
}
