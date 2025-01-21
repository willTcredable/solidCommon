package com.solidmetal.enums;

public enum ErrorCodes {

    // General Codes
    SUCCESS("0", "Success"),
    FAILED_TO_GET_RESPONSE_FROM_PARTNER("500000", "Failed to get response from upstream : "),
    SYSTEM_ERROR("500000", "Failed to process your request"),
    PRODUCT_NOT_FOUND("500101", "Product not found"),

    // Customer
    CUSTOMER_ALREADY_SUBSCRIBED("100101", "Customer already opted in"),
    FAILED_SUBSCRIPTION("100102", "Failed to process opt in"),
    FAILED_UNSUBSCRIPTION("100103", "Failed to process opt out"),
    FAILED_CUSTOMER_INFO_CHECK("100104", "Failed to query customer info"),
    FAILED_ELIGIBILITY_CHECK("100105", "Failed to query customer eligibility"),
    FAILED_STATEMENT_CHECK("100106", "Failed to query customer statement"),
    CUSTOMER_HAS_AN_OUTSTANDING_LOAN("100107", "Failed opt out, customer has an outstanding loan"),
    CUSTOMER_ALREADY_UNSUBSCRIBED("100108", "Customer already opted out"),
    INVALID_CREDENTIALS("900901", "Invalid Credentials"),

    // Transactions
    TRANSACTION_TYPE_NOT_FOUND("400101", "Transaction type not found"),
    TRANSACTION_NOT_FOUND("400102", "Transaction not found"),

    //Loans
    LOAN_REQUEST_FAILED("200101", "Loan request failed"),
    LOAN_REQUEST_LOAN_LIMIT_REACHED("200102", "Customer has active loan(s)"),

    LOAN_REPAYMENT_FAILED("200103", "Loan repayment failed"),
    LOAN_BALANCE_FAILED("200104", "Failed to get loan balance"),

    LOAN_AUTO_STRIKE_FAILED("200105", "Failed to process auto strike"),
    LOAN_FEES_FAILED("200106", "Failed to get loan fees"),
    LOAN_TRANSACTION_FAILED("200107", "Failed to get loan transactions"),
    LOAN_AUTO_REPAYMENT_FAILED("200108", "Failed to get loan repayment schedules"),

    LOAN_CONFIRMATION_FAILED("200109", "Failed to process loan confirmation"),
    LOAN_INFO_FAILED("200201", "Failed to get loan information");


    private final String code;
    private final String message;

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("ErrorCode{code=%s, message='%s'}", code, message);
    }
}