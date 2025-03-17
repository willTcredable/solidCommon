package com.solidmetal.dto;

import com.solidmetal.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private String conversationId;
    private TransactionType type;
    private String status;
    private BigDecimal amount;
    private String currency;
    private LocalDateTime timestamp;
    private String description;
}
