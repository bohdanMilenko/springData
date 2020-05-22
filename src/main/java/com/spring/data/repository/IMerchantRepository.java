package com.spring.data.repository;

import com.spring.data.entity.Merchant;

import java.util.List;

public interface IMerchantRepository {

    public Merchant findById(int id);
    public List<Merchant> getSortedByNeedToPay();
}
