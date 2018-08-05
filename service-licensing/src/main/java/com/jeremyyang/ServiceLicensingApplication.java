package com.jeremyyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceLicensingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceLicensingApplication.class, args);
	}
}
