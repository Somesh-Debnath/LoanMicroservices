package com.loanplansmicroservice.baseinterestrateservice.service;

import java.util.List;

import com.loanplansmicroservice.baseinterestrateservice.entity.BaseInterestRates;

public interface IBaseInterestRatesService {
    /* return list of interest rates */
    List<BaseInterestRates> getAllBaseInterestRates();

    //BaseInterestRates createBaseInterestRates(BaseInterestRates baseInterestRates);
}
