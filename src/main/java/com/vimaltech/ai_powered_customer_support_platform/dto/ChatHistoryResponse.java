package com.vimaltech.ai_powered_customer_support_platform.dto;

import com.vimaltech.ai_powered_customer_support_platform.enums.Role;

import java.time.LocalDateTime;

public record ChatHistoryResponse(
        Long id,
        Role role,
        String content,
        LocalDateTime createdAt
) {
}