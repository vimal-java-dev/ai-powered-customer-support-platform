package com.vimaltech.ai_powered_customer_support_platform.dto;

import java.time.LocalDateTime;

public record ChatHistoryResponse(
        Long id,
        String userMessage,
        String aiResponse,
        LocalDateTime createdAt
) {
}