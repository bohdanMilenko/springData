package com.spring.data.service;

import com.spring.data.entity.Customer;
import com.spring.data.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    ICustomerRepo customerRepo;

    public CustomerService(ICustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    @Transactional
    public boolean remove(int id) {
        return false;
    }

    @Override
    @Transactional
    public boolean remove(Customer customer) {
        return false;
    }

    @Override
    @Transactional
    public boolean updateCustomerAddress(int id, String address) {
        Customer customerToUpdate = findById(id);
        if(customerToUpdate!=null){
            customerToUpdate.setAddress(address);
            return customerRepo.update(customerToUpdate);
        }else {
            return false;
        }
    }
}
