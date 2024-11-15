package com.solidmetal.request;

import com.solidmetal.enums.LoanStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CreditLoanRequest extends CreditRequest {

    private BigDecimal loanAmount;
    private BigDecimal score;
    private BigDecimal eligibleAmount;
    private String accountNumber;
    private LoanStatus status;
    private String tenorCode;
    private BigDecimal disbursedAmount;
    private String transactionId;
    private String description;
    private LocalDateTime completedAt;
    private String externalTransactionId;
    private String conversationId;
    private String bankPartner;

    private int duration;

    private LocalDateTime loanStartDate;
    private LocalDateTime loanEndDate;

    private String currency;

    private BigDecimal balance;
    private BigDecimal paidAmount;

    private LocalDateTime lastTransactionDate;

    private BigDecimal interestAmount;
    private BigDecimal provisioningAmount;
    private BigDecimal penaltyAmount;
    private BigDecimal taxAmount;

    private BigDecimal interestRate;
    private BigDecimal provisioningRate;
}
