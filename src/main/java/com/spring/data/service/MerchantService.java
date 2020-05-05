package com.spring.data.service;

import com.spring.data.entity.Merchant;
import com.spring.data.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService implements IMerchantService {

    //Do I need to create only a default constructor?

//    @Autowired
//    private IMerchantRepository merchantRepository;
//    Another way

    private IMerchantRepository merchantRepository;

    public MerchantService(IMerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    @Override
    public Merchant findById(int id) {
        return merchantRepository.findById(id);
    }
}
