package com.jeremyyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class ServiceLicensingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceLicensingApplication.class, args);
	}
}
