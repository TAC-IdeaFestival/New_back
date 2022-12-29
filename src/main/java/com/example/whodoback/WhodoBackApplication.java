package com.example.whodoback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class WhodoBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhodoBackApplication.class, args);
    }

}
