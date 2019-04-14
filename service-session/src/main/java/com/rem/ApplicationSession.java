package com.rem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationSession {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationSession.class).web(true).run(args);
	}

}
