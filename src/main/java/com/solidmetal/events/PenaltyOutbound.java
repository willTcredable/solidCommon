package com.solidmetal.events;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class PenaltyOutbound extends CreditOutbound {

    private String transactionId;
    private BigDecimal balance;
    private BigDecimal penaltyRate;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private String accountNumber;
}
