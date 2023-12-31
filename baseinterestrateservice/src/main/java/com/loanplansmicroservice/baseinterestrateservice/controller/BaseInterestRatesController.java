package com.loanplansmicroservice.baseinterestrateservice.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanplansmicroservice.baseinterestrateservice.entity.BaseInterestRates;
import com.loanplansmicroservice.baseinterestrateservice.service.IBaseInterestRatesService;




@RequestMapping("/api")
@RestController
public class BaseInterestRatesController {
    Logger logger=LoggerFactory.getLogger(BaseInterestRatesController.class);
    @Autowired
    private IBaseInterestRatesService baseInterestRatesService;

    @GetMapping(path = "/interestrates", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<BaseInterestRates>> getAllBaseInterestRates() {
        List<BaseInterestRates> baseInterestRates = baseInterestRatesService.getAllBaseInterestRates();
        logger.info("Base Interest Rates fetched successfully");
        return new ResponseEntity<List<BaseInterestRates>>(baseInterestRates, HttpStatus.OK);
    }

    // @PostMapping(path = "/interestrate")
    // public ResponseEntity<BaseInterestRates> createBaseInterestRates(@RequestBody BaseInterestRates baseInterestRates) {
    //     BaseInterestRates newBaseInterestRates = baseInterestRatesService.createBaseInterestRates(baseInterestRates);
    //     System.out.println("newBaseInterestRates" + newBaseInterestRates);
    //     return new ResponseEntity<BaseInterestRates>(newBaseInterestRates, HttpStatus.CREATED);
    // }
}