package com.solidmetal.events;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class SubscriptionOutbound extends CreditOutbound {

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
    private LocalDateTime creditScoreCheckDate;
}
