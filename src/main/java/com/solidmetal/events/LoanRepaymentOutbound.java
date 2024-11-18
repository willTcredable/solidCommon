package com.solidmetal.events;

import com.solidmetal.enums.RecoveryType;
import com.solidmetal.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class LoanRepaymentOutbound extends CreditOutbound {

    private String externalTransactionId;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private RecoveryType recoveryType;
    private String accountNumber;
    private TransactionType activity;
}
