package com.loanplansmicroservice.baseinterestrateservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loanplansmicroservice.baseinterestrateservice.entity.BaseInterestRates;


public interface BaseInterestRatesRepository extends JpaRepository<BaseInterestRates, Integer> {
    
}
