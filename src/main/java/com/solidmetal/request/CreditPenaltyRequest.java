package com.solidmetal.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CreditPenaltyRequest extends CreditRequest {

    private String externalTransactionId;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private String accountNumber;
}
