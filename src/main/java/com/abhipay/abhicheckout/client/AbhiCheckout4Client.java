package com.abhipay.abhicheckout.client;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.dto.LoginRqDto;
import com.abhipay.abhicheckout.dto.LoginRsDto;
import com.abhipay.abhicheckout.dto.OtpRqDto;
import com.abhipay.abhicheckout.dto.OtpRsDto;
import com.abhipay.abhicheckout.dto.TransactionRqDto;
import com.abhipay.abhicheckout.dto.TransactionRsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "abhi-checkout-4", url = "${client.abhi.url4}")
public interface AbhiCheckout4Client {

    @PostMapping("/connect/login")
    ResponseEntity<AbhiRsDto<LoginRsDto>> login(@RequestBody LoginRqDto requestBody);

    @PostMapping("/online/purchase/request")
    ResponseEntity<AbhiRsDto<TransactionRsDto>> transaction(@RequestHeader(name = "Authorization") String authorization,
                                                            @RequestBody TransactionRqDto requestBody);

    @PostMapping("/online/purchase/verify")
    ResponseEntity<AbhiRsDto<OtpRsDto>> verify(@RequestHeader(name = "Authorization") String authorization,
                                               @RequestBody OtpRqDto requestBody);

}
