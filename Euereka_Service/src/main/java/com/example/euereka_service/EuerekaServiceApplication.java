package com.example.euereka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuerekaServiceApplication.class, args);
    }

}
