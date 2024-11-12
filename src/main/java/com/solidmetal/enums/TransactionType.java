package com.solidmetal.enums;

public enum TransactionType {

    DISBURSEMENT,
    NORMAL_REPAYMENT,
    AUTO_STRIKE_REPAYMENT,
    PENALTY,
    DEBIT,
    CREDIT;

    private TransactionType() {
    }
}
