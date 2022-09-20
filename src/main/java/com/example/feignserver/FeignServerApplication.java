package com.example.feignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeignServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServerApplication.class, args);
    }

}
