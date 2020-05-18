package com.spring.data.service;

import com.spring.data.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements  IPaymentService{

    @Autowired
    IPaymentService paymentService;


    @Override
    public Payment findById(int id) {
        return paymentService.findById(id);
    }
}
