package com.vimaltech.ai_powered_customer_support_platform.client.openai;

public record OpenAiRequest(
        String model,
        String input
) {
}