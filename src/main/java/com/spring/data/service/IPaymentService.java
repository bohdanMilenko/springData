package com.spring.data.service;

import com.spring.data.entity.Payment;
import com.spring.data.entity.dto.Result;

import java.util.List;

public interface IPaymentService {

    public Payment findById(int id);
    public List<Result> getPaymentReport();
}
