package com.springboot.eurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryService2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryService2Application.class, args);
	}

}
