package com.spring.data.repository;

import com.spring.data.entity.Payment;

public interface IPaymentRepo {

    public Payment findById(int id);
}
