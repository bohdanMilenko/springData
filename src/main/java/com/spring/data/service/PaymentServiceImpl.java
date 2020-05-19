package com.spring.data.service;

import com.spring.data.entity.Payment;
import com.spring.data.entity.dto.Result;
import com.spring.data.repository.IPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class PaymentServiceImpl implements  IPaymentService{

    @Autowired
    IPaymentRepo paymentRepo;

    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);


    @Override
    public Payment findById(int id) {
        logger.info("Getting by id "+ id);
        return paymentRepo.findById(id);
    }

    @Override
    public List<Result> getPaymentReport() {
        return paymentRepo.getPaymentReport();
    }
}
