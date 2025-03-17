package com.solidmetal.enums;

public enum Status {
    CREATED,
    UAT,
    PENDING_APPROVAL,
    INACTIVE,
    ACTIVE,
    REJECTED,
    REQUEST_APPROVAL,
    APPROVED,
    SUCCESS,
    FAILED;

    private Status() {
    }
}