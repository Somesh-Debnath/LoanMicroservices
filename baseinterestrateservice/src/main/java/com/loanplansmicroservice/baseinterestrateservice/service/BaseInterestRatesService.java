package com.loanplansmicroservice.baseinterestrateservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanplansmicroservice.baseinterestrateservice.entity.BaseInterestRates;
import com.loanplansmicroservice.baseinterestrateservice.repository.BaseInterestRatesRepository;


@Service
public class BaseInterestRatesService implements IBaseInterestRatesService{
@Autowired
    private BaseInterestRatesRepository baseInterestRatesRepository;
    
    public BaseInterestRatesService(BaseInterestRatesRepository baseInterestRatesRepository) {
        super();
        this.baseInterestRatesRepository = baseInterestRatesRepository;
    }
    @Override
    public List<BaseInterestRates> getAllBaseInterestRates() {
       return baseInterestRatesRepository.findAll();
    }
    // @Override
    // public BaseInterestRates createBaseInterestRates(BaseInterestRates baseInterestRates) {
    //     return baseInterestRatesRepository.save(baseInterestRates);
    // }
}
