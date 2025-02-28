package com.solidmetal.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CustomerWalletDTO {

    private String currency;
    private String walletType;
    private BigDecimal balance;
    private BigDecimal fundsInClearance;
    private BigDecimal frozen;
    private String uniqueId;
    private BigDecimal totalDebit;
    private BigDecimal totalCredit;
    private String isPrimary;
    private String code;
    private String msisdn;
}
