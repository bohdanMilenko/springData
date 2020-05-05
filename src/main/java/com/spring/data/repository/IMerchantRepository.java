package com.spring.data.repository;

import com.spring.data.entity.Merchant;

public interface IMerchantRepository {

    public Merchant findById(int id);
}
