package com.solidmetal.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.solidmetal.constants.Utils;
import com.solidmetal.enums.Gender;
import com.solidmetal.enums.SubscriptionStatus;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class CustomerDTO implements Serializable  {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createdAt;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
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

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateOfBirth;
    private String picturePath;
    private String email;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime activatedDate;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime suspendedDate;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime deactivatedDate;

    @JsonFormat(pattern = Utils.SOLID_DATE_TIME_FORMAT)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastActiveDate;

    private BigDecimal maxLoanLimit;
    private BigDecimal eligibleAmount;
    private BigDecimal score;
    private LocalDateTime creditScoreCheckDate;
    private String customerId;
    private SubscriptionStatus status;

    private List<SubscriptionDTO> subscriptions;


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
                ", subscriptions=" + subscriptions +
                '}';
    }
}
