package com.solidmetal.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CreditSubscriptionRequest extends CreditRequest {

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
    private LocalDateTime creditScoreCheckDate;
}
