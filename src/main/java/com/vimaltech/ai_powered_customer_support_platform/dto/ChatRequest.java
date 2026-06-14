package com.vimaltech.ai_powered_customer_support_platform.dto;

import jakarta.validation.constraints.NotBlank;

public record ChatRequest(

        @NotBlank(message = "Message is required")
        String message

) {
}
