package com.solidmetal.dto;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private String customerNumber;
    private SubscriptionStatus status;

}
