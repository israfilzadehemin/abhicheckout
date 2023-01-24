package com.abhipay.abhicheckout.service;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.dto.LoginRqDto;
import com.abhipay.abhicheckout.dto.LoginRsDto;
import com.abhipay.abhicheckout.dto.OtpRqDto;
import com.abhipay.abhicheckout.dto.OtpRsDto;
import com.abhipay.abhicheckout.dto.TransactionRqDto;
import com.abhipay.abhicheckout.dto.TransactionRsDto;
import com.abhipay.abhicheckout.dto.TransactionStatusDto;

public interface AbhiCheckoutService {

    AbhiRsDto<LoginRsDto> login(LoginRqDto loginData);

    AbhiRsDto<TransactionRsDto> transaction(String authorization, TransactionRqDto transactionData);

    AbhiRsDto<OtpRsDto> verify(String authorization, OtpRqDto otpData);

    AbhiRsDto<TransactionStatusDto> getTransactionStatus(String authorization, String transactionId);
}
