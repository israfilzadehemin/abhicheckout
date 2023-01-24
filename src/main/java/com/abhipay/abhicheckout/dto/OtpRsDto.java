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
public class OtpRsDto {
    public String id;
    public String createdById;
    public LocalDateTime createdAt;
    public LocalDateTime deletedDate;
    public String amount;
    public String fee;
    public String transactionStatus;
    public String type;
    public String transactionConfigurationsId;
    public String userProvider;
    public LocalDateTime transactionDate;
    public String retryCount;
    public String paymentGatewayUsedId;
    public String errorMessage;
    public String toBankAccountId;
    public String empTransactionId;
    public String vendorTransactionId;
    public String accountToNumber;
    public String accountToTitle;
    public String accountToBank;
    public Boolean postBack;
    public Boolean pullBack;
    public String comments;
    public String stan;
    public String responseCode;
    public String titleFetchStan;
    public String titleFetchResponseCode;
    public LocalDateTime onelinkDate;
    public LocalDateTime onelinkTime;
    public LocalDateTime commitedAt;
    public String updatedById;
    public LocalDateTime updatedAt;
    public Integer version;
    public AbhiPayInfoDto abhiPayInfo;
}
