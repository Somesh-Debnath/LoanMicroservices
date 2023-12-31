package com.loanplansmicroservice.baseinterestrateservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseInterestRatesDto {
    private String LoanType;
    private float BaseInterestRate;
}
