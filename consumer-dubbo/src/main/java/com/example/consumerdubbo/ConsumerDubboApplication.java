package com.example.consumerdubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDubboApplication.class, args);
    }

}
