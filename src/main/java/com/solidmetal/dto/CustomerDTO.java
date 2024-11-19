package com.solidmetal.dto;

import com.solidmetal.enums.Gender;
import com.solidmetal.enums.SubscriptionStatus;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class CustomerDTO implements Serializable  {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String mobile;
    private String systemIdNumber;
    private String idType;
    private String idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;
    private String address;
    private String district;
    private String region;
    private Gender gender;
    private LocalDateTime dateOfBirth;
    private String picturePath;
    private String email;

    private LocalDateTime activatedDate;
    private LocalDateTime suspendedDate;
    private LocalDateTime deactivatedDate;
    private LocalDateTime lastActiveDate;

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
    private LocalDateTime creditScoreCheckDate;
    private String customerId;
    private SubscriptionStatus status;


    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", mobile='" + mobile + '\'' +
                ", systemIdNumber='" + systemIdNumber + '\'' +
                ", idType='" + idType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", region='" + region + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", picturePath='" + picturePath + '\'' +
                ", email='" + email + '\'' +
                ", activatedDate=" + activatedDate +
                ", suspendedDate=" + suspendedDate +
                ", deactivatedDate=" + deactivatedDate +
                ", lastActiveDate=" + lastActiveDate +
                ", maxLoanLimit=" + maxLoanLimit +
                ", eligibleAmount=" + eligibleAmount +
                ", score=" + score +
                ", creditScoreCheckDate=" + creditScoreCheckDate +
                ", customerId='" + customerId + '\'' +
                ", status=" + status +
                '}';
    }
}
