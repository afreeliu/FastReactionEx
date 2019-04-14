package com.rem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApplicationSq {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationSq.class).web(true).run(args);
	}

}
