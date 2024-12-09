package com.solidmetal.enums;

public enum TransactionType {

    DISBURSEMENT,
    REPAYMENT,
    NORMAL_REPAYMENT,
    AUTO_STRIKE_REPAYMENT,
    AUTO_REPAYMENT,
    PENALTY,
    DEBIT,
    CREDIT,
    NONE;

    private TransactionType() {
    }

    public static TransactionType fromString(String name) {
        try {
            if (name != null) {
                return TransactionType.valueOf(name.toUpperCase());
            }
        } catch (IllegalArgumentException e) {
            // Enum not found
        }
        return NONE;
    }
}
