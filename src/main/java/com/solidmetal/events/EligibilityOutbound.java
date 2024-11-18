package com.solidmetal.events;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class EligibilityOutbound extends CreditOutbound {

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
}
