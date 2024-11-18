package com.solidmetal.request;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreditEligibilityRequest extends CreditRequest {

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
}
