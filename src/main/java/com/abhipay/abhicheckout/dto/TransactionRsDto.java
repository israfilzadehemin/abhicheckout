package com.abhipay.abhicheckout.dto;

import java.math.BigDecimal;
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
public class TransactionRsDto {
    String transactionId;
    String onlinePurchaseId;
    String cnic;
    BigDecimal purchaseAmount;
    OrderDetailsDto orderDetails;
    BankDetailsDto bankDetails;
}
