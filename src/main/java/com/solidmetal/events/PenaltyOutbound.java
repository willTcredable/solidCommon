package com.solidmetal.events;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class PenaltyOutbound extends CreditOutbound {

    private String externalTransactionId;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private String accountNumber;
}
