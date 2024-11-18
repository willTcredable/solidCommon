package com.solidmetal.events;

import com.solidmetal.enums.ApplicationStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class LoanApplicationOutbound extends CreditOutbound {

    private BigDecimal loanAmount;
    private BigDecimal score;
    private BigDecimal eligibleAmount;
    private String accountNumber;
    private ApplicationStatus status;
    private String tenorCode;
    private BigDecimal disbursedAmount;
    private String transactionId;
    private String description;
    private String externalTransactionId;
    private String bankPartner;
    private LocalDateTime completedAt;
}
