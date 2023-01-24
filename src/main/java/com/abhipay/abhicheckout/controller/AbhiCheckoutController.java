package com.abhipay.abhicheckout.controller;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.dto.LoginRqDto;
import com.abhipay.abhicheckout.dto.OtpRqDto;
import com.abhipay.abhicheckout.dto.TransactionRqDto;
import com.abhipay.abhicheckout.dto.TransactionStatusDto;
import com.abhipay.abhicheckout.service.AbhiCheckoutService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@AllArgsConstructor
@RestController
@RequestMapping("/checkout")
public class AbhiCheckoutController {
    private final AbhiCheckoutService abhiCheckoutService;


    @PostMapping("/login")
    ResponseEntity<AbhiRsDto> login(@RequestBody LoginRqDto requestBody) {
        log.info("Request data: {}", requestBody);
        var response = abhiCheckoutService.login(requestBody);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/transaction")
    ResponseEntity<AbhiRsDto> transaction(
            @RequestHeader(name = "Authorization") String authorization,
            @RequestBody TransactionRqDto requestBody) {
        log.info("Request data: {}", requestBody);
        var response = abhiCheckoutService.transaction(authorization, requestBody);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/verify")
    ResponseEntity<AbhiRsDto> verify(
            @RequestHeader(name = "Authorization") String authorization,
            @RequestBody OtpRqDto requestBody) {
        log.info("Request data: {}", requestBody);
        var response = abhiCheckoutService.verify(authorization, requestBody);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/transaction/{transaction-id}")
    ResponseEntity<AbhiRsDto> getStatus(
            @RequestHeader(name = "Authorization") String authorization,
            @PathVariable("transaction-id") String transactionId) {
        log.info("Request data: {}", transactionId);
        var response = abhiCheckoutService.getTransactionStatus(authorization, transactionId);

        return ResponseEntity.ok(response);
    }
}
