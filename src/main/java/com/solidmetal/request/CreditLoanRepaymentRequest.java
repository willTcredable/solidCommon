package com.solidmetal.request;

import com.solidmetal.enums.RecoveryType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CreditLoanRepaymentRequest extends CreditRequest {

    private String externalTransactionId;
    private String conversationId;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private RecoveryType recoveryType;
    private String accountNumber;
}
