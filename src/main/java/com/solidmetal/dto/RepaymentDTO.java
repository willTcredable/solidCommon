package com.solidmetal.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.solidmetal.constants.Utils;
import com.solidmetal.enums.TransactionType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RepaymentDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private BigDecimal amount;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createdAt;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updatedAt;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime transactionDate;

    private TransactionType activity;

    private String externalTransactionId;

    private String conversationId;
    private String timestamp;
    private String channel;

    private String accountNumber;

    private BigDecimal balance;

    private Long productCode;
    private String partnerCode;
    private String productName;
    private String partnerName;

    private String customerId;

    @Override
    public String toString() {
        return "RepaymentDTO{" +
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
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
