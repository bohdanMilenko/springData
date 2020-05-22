package com.spring.data.repository;

import com.spring.data.entity.Merchant;
import org.intellij.lang.annotations.Language;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MerchantRepoImpl implements  IMerchantRepository{

    @PersistenceContext
    private EntityManager em;

    public MerchantRepoImpl() {
    }

    @Override
    public Merchant findById(int id) {
        Merchant merchant = em.find(Merchant.class, id);
        return merchant;
    }

    @Override

    public List<Merchant> getSortedByNeedToPay() {
        @Language("SQL")
        String queryText = "SELECT m FROM Merchant m ORDER BY m.needToSend";
        TypedQuery<Merchant> query = em.createQuery(queryText, Merchant.class);
        return query.getResultList();
    }
}
