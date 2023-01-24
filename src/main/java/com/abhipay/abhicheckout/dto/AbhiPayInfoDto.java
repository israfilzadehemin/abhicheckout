package com.abhipay.abhicheckout.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AbhiPayInfoDto {
    String id;
    String createdById;
    LocalDateTime createdAt;
    LocalDateTime deletedDate;
    String purchaserId;
    String organizationId;
    String tariffId;
    String paymentPurposeId;
    BigDecimal amount;
    String tariffFee;
    String comments;
    String initiator;
    String employeeContribution;
    String originalAmount;
    String transactionId;
    Integer otp;
    String otpCheckStatus;
    String merchant;
    OrderDetailsDto orderDetail;
    String mdr;
    String updatedById;
    LocalDateTime updatedAt;
    Integer version;
}
