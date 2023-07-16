package org.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AadharApplication {

    public static void main(String[] args) {
        SpringApplication.run(AadharApplication.class, args);
    }
}
