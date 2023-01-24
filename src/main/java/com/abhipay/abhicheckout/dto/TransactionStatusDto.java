package com.abhipay.abhicheckout.dto;

import java.time.LocalDateTime;
import java.util.List;
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
public class TransactionStatusDto {
    String id;
    String createdById;
    LocalDateTime createdAt;
    LocalDateTime deletedDate;
    String amount;
    String fee;
    String transactionStatus;
    String type;
    String transactionConfigurationsId;
    String userProvider;
    LocalDateTime transactionDate;
    String retryCount;
    String paymentGatewayUsedId;
    String errorMessage;
    String toBankAccountId;
    Object empTransactionId;
    Object vendorTransactionId;
    String accountToNumber;
    String accountToTitle;
    String accountToBank;
    Boolean postBack;
    Boolean pullBack;
    String comments;
    String stan;
    String responseCode;
    String titleFetchStan;
    String titleFetchResponseCode;
    String onelinkDate;
    String onelinkTime;
    LocalDateTime commitedAt;
    String updatedById;
    LocalDateTime updatedAt;
    Integer version;
    List<TransactionRequestDataDto> transactionsRequests;
    List<TransactionResponseDataDto> transactionsResponses;
    AbhiPayInfoDto abhiPayInfo;
}
