package com.metapack.estimatedpackagedeliverytime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class EstimatedPackageDeliveryTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstimatedPackageDeliveryTimeApplication.class, args);
    }
}
