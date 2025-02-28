package com.solidmetal.events;

import com.solidmetal.enums.ApplicationStatus;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class ExtensionCreatedOutbound extends CreditOutbound {

    private BigDecimal extensionAmount;
    private String accountNumber;
    private ApplicationStatus status;
    private String transactionId;
    private String description;
    private String externalTransactionId;
    private String bankPartner;
}
