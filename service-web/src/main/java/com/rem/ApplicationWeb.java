package com.rem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationWeb {

    public static void main(String[] args) {
        SpringApplication.run(com.rem.ApplicationWeb.class, args);
    }

}
