package com.solidmetal.dto;

import com.solidmetal.enums.RecoveryType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class AutoStrikeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String customerId;

    private BigDecimal cashInAmount;

    private BigDecimal amountToStrike;
    private String accountNumber;
    private String bankPartner;

    private RecoveryType recoveryType;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String conversationId;
    private String timestamp;
    private String channel;

    private String externalTransactionId;


    @Override
    public String toString() {
        return "AutoStrikeDTO{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", cashInAmount=" + cashInAmount +
                ", amountToStrike=" + amountToStrike +
                ", accountNumber='" + accountNumber + '\'' +
                ", bankPartner='" + bankPartner + '\'' +
                ", recoveryType=" + recoveryType +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", conversationId='" + conversationId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", channel='" + channel + '\'' +
                ", externalTransactionId='" + externalTransactionId + '\'' +
                '}';
    }
}
