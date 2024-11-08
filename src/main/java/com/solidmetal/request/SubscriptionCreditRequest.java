package com.solidmetal.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class SubscriptionCreditRequest {

    private String customerNumber;
    private String productCode;
    private String productName;
    private String partnerCode;
    private String partnerName;
    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
    private LocalDateTime creditScoreCheckDate;
}
