package com.vimaltech.ai_powered_customer_support_platform;

import com.vimaltech.ai_powered_customer_support_platform.config.OpenAiProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.TimeZone;

@SpringBootApplication
@EnableConfigurationProperties(OpenAiProperties.class)
public class AiPoweredCustomerSupportPlatformApplication {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
	}

	public static void main(String[] args) {
		SpringApplication.run(AiPoweredCustomerSupportPlatformApplication.class, args);
	}

}
