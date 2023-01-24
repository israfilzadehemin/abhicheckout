package com.abhipay.abhicheckout.exception;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AbhiClientException extends RuntimeException {
    int status;
    final AbhiRsDto details;

    public AbhiClientException(AbhiRsDto details, int status) {
        super(details.getMessage());
        this.details = details;
        this.status = status;
    }
}
