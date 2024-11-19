package com.solidmetal.dto;

import com.solidmetal.enums.SubscriptionStatus;
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
    private String customerId;
    private SubscriptionStatus status;
    private String comments;
    private String productCode;
    private String productName;
    private String partnerCode;
    private String partnerName;


    @Override
    public String toString() {
        return "SubscriptionDTO{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", customerId='" + customerId + '\'' +
                ", status=" + status +
                ", comments='" + comments + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", partnerCode='" + partnerCode + '\'' +
                ", partnerName='" + partnerName + '\'' +
                '}';
    }
}
