package com.solidmetal.enums;

public enum ReportType {

    DISBURSEMENT,
    REPAYMENT,
    SUBSCRIPTION,
    REVENUE_PERFORMANCE,
    NONE;

    private ReportType() {
    }

    public static ReportType fromString(String name) {
        try {
            if (name != null) {
                return ReportType.valueOf(name.toUpperCase());
            }
        } catch (IllegalArgumentException e) {
            // Enum not found
        }
        return NONE;
    }
}
