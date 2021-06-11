package com.metapack.estimatedpackagedeliverytime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@EnableSwagger2
public class EstimatedPackageDeliveryTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstimatedPackageDeliveryTimeApplication.class, args);
    }
}
