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
public class TransactionResponseDataDto {
    String id;
    String createdById;
    LocalDateTime createdAt;
    LocalDateTime deletedDate;
    String response;
    String financialTransactionId;
    String transactionId;
    String type;
    String provider;
    String responseType;
    String updatedById;
    LocalDateTime updatedAt;
    Integer version;
}
