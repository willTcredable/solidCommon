package com.solidmetal.dto;

import com.solidmetal.enums.TransactionType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PenaltyDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private BigDecimal amount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private LocalDateTime transactionDate;

    private TransactionType activity;

    private String externalTransactionId;

    private String conversationId;
    private String timestamp;
    private String channel;

    private BigDecimal balance;

    private Long loanId;

    private String transactionId;
    private BigDecimal penaltyRate;
    private String accountNumber;


    @Override
    public String toString() {
        return "PenaltyDTO{" +
                "id=" + id +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", transactionDate=" + transactionDate +
                ", activity=" + activity +
                ", externalTransactionId='" + externalTransactionId + '\'' +
                ", conversationId='" + conversationId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", channel='" + channel + '\'' +
                ", balance=" + balance +
                ", loanId=" + loanId +
                ", transactionId='" + transactionId + '\'' +
                ", penaltyRate=" + penaltyRate +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
