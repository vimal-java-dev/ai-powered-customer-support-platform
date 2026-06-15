package com.vimaltech.ai_powered_customer_support_platform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class OpenAiConfig {

    @Bean
    public RestClient openAiRestClient(OpenAiProperties properties) {

        return RestClient.builder()
                .baseUrl(properties.baseUrl())
                .build();
    }
}