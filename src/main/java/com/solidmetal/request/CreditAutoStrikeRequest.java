package com.solidmetal.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class CreditAutoStrikeRequest extends CreditRequest {

    private String customerId;
    private BigDecimal cashInAmount;
    private BigDecimal outstandingLoanAmount;
    private String conversationId;

}
