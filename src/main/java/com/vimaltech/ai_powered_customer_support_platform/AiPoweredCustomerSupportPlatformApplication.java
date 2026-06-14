package com.vimaltech.ai_powered_customer_support_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class AiPoweredCustomerSupportPlatformApplication {

	public static void main(String[] args) {

		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));

		System.out.println(TimeZone.getDefault().getID());

		SpringApplication.run(AiPoweredCustomerSupportPlatformApplication.class, args);
	}

}
