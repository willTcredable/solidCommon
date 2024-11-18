package com.solidmetal.events;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class AutoStrikeOutbound extends CreditOutbound {

    private String customerId;
    private BigDecimal cashInAmount;
    private BigDecimal amountToStrike;
    private String accountNumber;
    private String bankPartner;
    private String externalTransactionId;
}
