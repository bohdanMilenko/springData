package com.spring.data.repository;

import com.spring.data.entity.Payment;
import com.spring.data.entity.dto.Result;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PaymentRepoImpl implements IPaymentRepo {

    private StringBuilder sb;

    @PersistenceContext
    EntityManager em;

    public PaymentRepoImpl() {
    }

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class, id);
    }

    @Override
    public List<Result> getPaymentReport() {
        sb = new StringBuilder();
        sb.append("SELECT new com.spring.data.entity.dto.Result");
        sb.append("(p.merchant.name, SUM(p.sumCharged), count(p)) ");
        sb.append("FROM Payment p GROUP BY p.merchant.name");
        TypedQuery<Result> query = em.createQuery(sb.toString(), Result.class);
        return query.getResultList();
    }
}
