package com.solidmetal.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
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

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime loanStartDate;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime loanEndDate;

    private String currency;

    private BigDecimal balance;
    private BigDecimal paidAmount;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastTransactionDate;

    private BigDecimal interestAmount;
    private BigDecimal provisioningAmount;
    private BigDecimal penaltyAmount;
    private BigDecimal taxAmount;
}
