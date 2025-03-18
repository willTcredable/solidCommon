package com.solidmetal.events;

import com.solidmetal.enums.ReportType;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class GeneralReportRequestOutbound {

    private Long productId;
    private ReportType reportType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String email;
}