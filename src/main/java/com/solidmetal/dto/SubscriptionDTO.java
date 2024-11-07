package com.solidmetal.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SubscriptionDTO implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String customerNumber;
    private SubscriptionStatus status;
    private String comments;
    private String productCode;
    private String productName;
    private String partnerCode;
    private String partnerName;
}
