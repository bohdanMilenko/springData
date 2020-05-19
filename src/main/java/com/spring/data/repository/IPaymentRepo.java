package com.spring.data.repository;

import com.spring.data.entity.Payment;
import com.spring.data.entity.dto.Result;

import java.util.List;

public interface IPaymentRepo {

    public Payment findById(int id);
    public List<Result> getPaymentReport();
}
