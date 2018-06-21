package com.demo.thymeleaf.service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class InvoiceDto {
    private String invoiceCode;
    private String invoiceNo;
    private BigDecimal amount;
    private String relatedNo;
    private String remark;
    private String status;
    private String createUserNick;
    private Date gmtCreate;
    private String sourceType;
}
