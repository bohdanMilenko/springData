package com.spring.data.repository;

import com.spring.data.entity.Merchant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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


}
