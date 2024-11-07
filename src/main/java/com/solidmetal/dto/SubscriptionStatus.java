package com.solidmetal.dto;

public enum SubscriptionStatus {

    SUBSCRIBED,
    UNSUBSCRIBED,
    REQUEST_UNSUBSCRIBED,
    REQUEST_SUBSCRIPTION,
    CLIENT,
    ACTIVE,
    INACTIVE,
    SUSPENDED,
    FAILED;

    private SubscriptionStatus() {
    }
}
