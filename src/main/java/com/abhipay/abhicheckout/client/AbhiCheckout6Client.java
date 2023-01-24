package com.abhipay.abhicheckout.client;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.dto.TransactionStatusDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "abhi-checkout-6", url = "${client.abhi.url6}")
public interface AbhiCheckout6Client {

    @GetMapping("transaction-requests/{transaction-id}/status/new")
    ResponseEntity<AbhiRsDto<TransactionStatusDto>> getTransactionStatus(
            @RequestHeader(name = "Authorization") String authorization,
            @PathVariable("transaction-id") String transactionId);

}
