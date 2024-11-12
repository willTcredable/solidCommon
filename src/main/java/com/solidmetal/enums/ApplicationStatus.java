package com.solidmetal.enums;

public enum ApplicationStatus {
    PROCESSING,
    ACCEPTED,
    REJECTED,
    PENDING,
    DISBURSEMENT_REQUEST,
    FAILED;

    private ApplicationStatus() {
    }
}