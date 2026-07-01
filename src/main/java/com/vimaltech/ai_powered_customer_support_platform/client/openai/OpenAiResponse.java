package com.vimaltech.ai_powered_customer_support_platform.client.openai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OpenAiResponse(

        @JsonProperty("output_text")
        String outputText

) {
}