package com.metapack.estimatedpackagedeliverytime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstimatedPackageDeliveryTimeApplication {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(EstimatedPackageDeliveryTimeApplication.class, args);
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new JwtFilter());
//        filterRegistrationBean.setUrlPatterns(Collections.singleton("/api/test/"));
//        return filterRegistrationBean;
//    }
}
