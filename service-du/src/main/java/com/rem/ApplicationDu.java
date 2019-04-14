package com.rem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationDu {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationDu.class).web(true).run(args);
	}

}
