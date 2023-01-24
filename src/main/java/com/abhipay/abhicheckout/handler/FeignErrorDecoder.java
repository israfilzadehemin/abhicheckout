package com.abhipay.abhicheckout.handler;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.exception.AbhiClientException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Log4j2
@ControllerAdvice
public class FeignErrorDecoder implements ErrorDecoder{

    @Override
    public Exception decode(String methodKey, Response response) {
        log.info("request : {}", response.request());

        throw new AbhiClientException(getResponse(response), response.status());
    }

    private AbhiRsDto getResponse(Response response) {
        var objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            if (response.body() != null) {
                return objectMapper.readValue(response.body().asReader(), AbhiRsDto.class);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
        return AbhiRsDto.builder()
                .status("failed")
                .message(response.reason())
                .code(response.status())
                .build();
    }
}
