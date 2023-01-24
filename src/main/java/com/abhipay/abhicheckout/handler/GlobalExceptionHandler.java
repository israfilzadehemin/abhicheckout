package com.abhipay.abhicheckout.handler;

import com.abhipay.abhicheckout.dto.AbhiRsDto;
import com.abhipay.abhicheckout.exception.AbhiClientException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<AbhiRsDto> handle(Exception exception) {
        log.error("Exception thrown:", exception);
        if (exception instanceof AbhiClientException ex) {
            return ResponseEntity.status(ex.getStatus()).body(ex.getDetails());
        } else {
            return ResponseEntity.internalServerError().body(
                    AbhiRsDto.builder().message("Something went wrong!").build()
            );
        }
    }

}
