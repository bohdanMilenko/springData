package com.spring.data.repository;

import com.spring.data.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PaymentRepoImpl implements IPaymentRepo{

    @PersistenceContext
    EntityManager em;

    public PaymentRepoImpl() {
    }

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class,id);
    }
}
