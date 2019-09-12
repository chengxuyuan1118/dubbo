package com.example.providerdubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfiguration
@SpringBootApplication
public class ProviderDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDubboApplication.class, args);
    }

}
