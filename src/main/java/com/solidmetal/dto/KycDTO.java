package com.solidmetal.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class KycDTO {

    private String date;
    private BigDecimal balance;
    private String idType;
    private String msisdn;
    private String firstName;
    private String businessName;
    private String idNumber;
    private String address;
    private String categoryCode;
    private String lastName;
    private CustomerWalletDTO[] wallets;
    private String additionalData;
    private String nationality;
    private String dob;
    private String customerId;
}

