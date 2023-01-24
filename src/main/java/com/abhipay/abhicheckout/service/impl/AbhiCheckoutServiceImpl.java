package com.abhipay.abhicheckout.service.impl;

import com.abhipay.abhicheckout.client.AbhiCheckout4Client;
import com.abhipay.abhicheckout.client.AbhiCheckout6Client;
import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.dto.LoginRqDto;
import com.abhipay.abhicheckout.dto.LoginRsDto;
import com.abhipay.abhicheckout.dto.OtpRqDto;
import com.abhipay.abhicheckout.dto.OtpRsDto;
import com.abhipay.abhicheckout.dto.TransactionRqDto;
import com.abhipay.abhicheckout.dto.TransactionRsDto;
import com.abhipay.abhicheckout.dto.TransactionStatusDto;
import com.abhipay.abhicheckout.service.AbhiCheckoutService;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class AbhiCheckoutServiceImpl implements AbhiCheckoutService {
    private final AbhiCheckout4Client abhiCheckout4Client;
    private final AbhiCheckout6Client abhiCheckout6Client;

    @Override
    public AbhiRsDto<LoginRsDto> login(LoginRqDto loginData) {
        log.info("Abhi checkout login request data: {}", loginData);
        var loginResponse = abhiCheckout4Client.login(loginData);
        log.info("Abhi checkout login response data: {}", loginResponse);

        return Objects.requireNonNull(loginResponse.getBody());
    }

    @Override
    public AbhiRsDto<TransactionRsDto> transaction(String authorization, TransactionRqDto transactionData) {
        log.info("Abhi checkout transaction request data: {}", transactionData);
        var transactionResponse = abhiCheckout4Client.transaction(authorization, transactionData);
        log.info("Abhi checkout transaction response data: {}", transactionResponse);

        return Objects.requireNonNull(transactionResponse.getBody());

    }

    @Override
    public AbhiRsDto<OtpRsDto> verify(String authorization, OtpRqDto otpData) {

        log.info("Abhi checkout verify request data: {}", otpData);
        var verifyResponse = abhiCheckout4Client.verify(authorization, otpData);
        log.info("Abhi checkout verify response data: {}", verifyResponse);

        return Objects.requireNonNull(verifyResponse.getBody());
    }

    @Override
    public AbhiRsDto<TransactionStatusDto> getTransactionStatus(String authorization, String transactionId) {
        log.info("Abhi checkout get transaction status request data: {}", transactionId);
        var transactionResponse = abhiCheckout6Client.getTransactionStatus(authorization, transactionId);
        log.info("Abhi checkout get transaction status response data: {}", transactionResponse);

        return Objects.requireNonNull(transactionResponse.getBody());

    }
}
