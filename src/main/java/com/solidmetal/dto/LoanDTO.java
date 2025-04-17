package com.solidmetal.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.solidmetal.constants.Utils;
import com.solidmetal.enums.LoanStatus;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class LoanDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createdAt;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updatedAt;
    private String accountNumber;
    private String customerId;

    private Long productCode;
    private String partnerCode;
    private String productName;
    private String partnerName;
    private LoanStatus status;

    private String currency;

    private BigDecimal balance;
    private BigDecimal disbursedAmount;
    private BigDecimal paidAmount;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastTransactionDate;

    private BigDecimal interestAmount;
    private BigDecimal provisioningAmount;
    private BigDecimal penaltyAmount;
    private BigDecimal taxAmount;

    private String externalTransactionId;

    private int duration;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime loanStartDate;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime loanEndDate;

    private String bankPartner;

    private BigDecimal eligibleAmount;
    private BigDecimal score;

    private String tenorCode;

    private List<RepaymentDTO> repayments = new ArrayList<>();

    private List<PenaltyDTO> penalties = new ArrayList<>();

    private BigDecimal interestRate;
    private BigDecimal provisioningRate;

    private String conversationId;
    private String timestamp;
    private String channel;


    @Override
    public String toString() {
        return "LoanDTO{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", accountNumber='" + accountNumber + '\'' +
                ", customerId='" + customerId + '\'' +
                ", productCode=" + productCode +
                ", partnerCode='" + partnerCode + '\'' +
                ", productName='" + productName + '\'' +
                ", partnerName='" + partnerName + '\'' +
                ", status=" + status +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", disbursedAmount=" + disbursedAmount +
                ", paidAmount=" + paidAmount +
                ", lastTransactionDate=" + lastTransactionDate +
                ", interestAmount=" + interestAmount +
                ", provisioningAmount=" + provisioningAmount +
                ", penaltyAmount=" + penaltyAmount +
                ", taxAmount=" + taxAmount +
                ", externalTransactionId='" + externalTransactionId + '\'' +
                ", duration=" + duration +
                ", loanStartDate=" + loanStartDate +
                ", loanEndDate=" + loanEndDate +
                ", bankPartner='" + bankPartner + '\'' +
                ", eligibleAmount=" + eligibleAmount +
                ", score=" + score +
                ", tenorCode='" + tenorCode + '\'' +
                ", repayments=" + repayments +
                ", penalties=" + penalties +
                ", interestRate=" + interestRate +
                ", provisioningRate=" + provisioningRate +
                ", conversationId='" + conversationId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
