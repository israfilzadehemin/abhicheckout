package com.abhipay.abhicheckout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AbhiCheckoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbhiCheckoutApplication.class, args);
    }

}
