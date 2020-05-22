package com.spring.data.service;

import com.spring.data.entity.Merchant;

import java.util.List;

public interface IMerchantService {

    public Merchant findById(int id);
    public List<Merchant> getSortedByNeedToPay();
}
