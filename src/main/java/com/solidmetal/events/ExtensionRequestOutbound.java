package com.solidmetal.events;

import com.solidmetal.enums.ApplicationStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class ExtensionRequestOutbound extends CreditOutbound {

    private BigDecimal loanAmount;
    private BigDecimal extensionAmount;
    private String accountNumber;
    private String transactionId;
    private LocalDateTime completedAt;
    private BigDecimal extensionRate;
    private ApplicationStatus status;
    private LocalDateTime dueDate;
}
