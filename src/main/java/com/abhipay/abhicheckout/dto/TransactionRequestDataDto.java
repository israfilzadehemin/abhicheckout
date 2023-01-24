package com.abhipay.abhicheckout.dto;

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
public class TransactionRequestDataDto {
    String id;
    String createdById;
    LocalDateTime createdAt;
    LocalDateTime deletedDate;
    String transmissionDateTime;
    String stan;
    String paymentPurposeId;
    String financialTransactionId;
    String transactionId;
    String request;
    String type;
    String provider;
    String requestType;
    String updatedById;
    LocalDateTime updatedAt;
    Integer version;
}
