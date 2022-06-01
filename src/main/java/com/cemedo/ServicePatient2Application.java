package com.cemedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServicePatient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServicePatient2Application.class, args);
	}

}
