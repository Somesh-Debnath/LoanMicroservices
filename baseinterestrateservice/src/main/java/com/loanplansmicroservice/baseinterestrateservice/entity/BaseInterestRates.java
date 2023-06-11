package com.loanplansmicroservice.baseinterestrateservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "baseinterestrates")
public class BaseInterestRates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String LoanType;
    private float BaseInterestRate;


    // Seed the data into the BaseInterestRates table with interest rates for Home, Personal, Medical, Vehicle as 8.5, 10, 7.5, 8.0 respectively
    // create sql query
    // insert into baseinterestrates (LoanType, BaseInterestRate) values ('Home', 8.5);
    // insert into baseinterestrates (LoanType, BaseInterestRate) values ('Personal', 10);
    // insert into baseinterestrates (LoanType, BaseInterestRate) values ('Medical', 7.5);
    // insert into baseinterestrates (LoanType, BaseInterestRate) values ('Vehicle', 8.0);
    


}
