package com.vimaltech.ai_powered_customer_support_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class AiPoweredCustomerSupportPlatformApplication {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
	}

	public static void main(String[] args) {
		SpringApplication.run(AiPoweredCustomerSupportPlatformApplication.class, args);
	}

}
