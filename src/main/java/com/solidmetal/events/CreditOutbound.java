package com.solidmetal.events;

import lombok.Data;

@Data
public class CreditOutbound {

    private String customerId;
    private String productCode;
    private String productName;
    private String partnerCode;
    private String partnerName;
    private String conversationId;
    private String timestamp;
    private String channel;
}
