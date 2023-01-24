package com.abhipay.abhicheckout.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class OrderDetailsDto {
    String merchantIdentifier;
    String orderId;
    BigDecimal amount;
    String productId;
    String productName;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:")
    LocalDateTime orderDate;
    String description;
}
