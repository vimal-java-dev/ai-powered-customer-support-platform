package com.vimaltech.ai_powered_customer_support_platform.service.ai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OpenAiService implements AiService {

    @Override
    public String generateResponse(String userMessage) {

        log.info("Generating AI response for message: {}", userMessage);

        return "AI integration coming soon: " + userMessage;
    }
}