package com.spring.data.service;

import com.spring.data.entity.Merchant;
import com.spring.data.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements IMerchantService {
    @Autowired
    private IMerchantRepository merchantRepository;

    public MerchantServiceImpl() {
    }

    public MerchantServiceImpl(IMerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    @Override
    public Merchant findById(int id) {
        return merchantRepository.findById(id);
    }

    @Override
//    @Transactional
    public List<Merchant> getSortedByNeedToPay() {
        return merchantRepository.getSortedByNeedToPay();
    }
}
