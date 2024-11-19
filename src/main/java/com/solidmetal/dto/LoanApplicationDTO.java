package com.solidmetal.dto;

import com.solidmetal.enums.ApplicationStatus;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class LoanApplicationDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String customerId;

    private String accountNumber;
    private BigDecimal loanAmount;

    private String productName;
    private String productCode;
    private String partnerCode;
    private String partnerName;

    private String tenorCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private ApplicationStatus status;

    private BigDecimal score;
    private BigDecimal eligibleAmount;

    private BigDecimal disbursedAmount;
    private String transactionId;
    private String description;

    private LocalDateTime completedAt;

    private String externalTransactionId;

    private String conversationId;
    private String timestamp;
    private String channel;

    private String bankPartner;

    private String currency;


    @Override
    public String toString() {
        return "LoanApplicationDTO{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", loanAmount=" + loanAmount +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", partnerCode='" + partnerCode + '\'' +
                ", partnerName='" + partnerName + '\'' +
                ", tenorCode='" + tenorCode + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", status=" + status +
                ", score=" + score +
                ", eligibleAmount=" + eligibleAmount +
                ", disbursedAmount=" + disbursedAmount +
                ", transactionId='" + transactionId + '\'' +
                ", description='" + description + '\'' +
                ", completedAt=" + completedAt +
                ", externalTransactionId='" + externalTransactionId + '\'' +
                ", conversationId='" + conversationId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", channel='" + channel + '\'' +
                ", bankPartner='" + bankPartner + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
