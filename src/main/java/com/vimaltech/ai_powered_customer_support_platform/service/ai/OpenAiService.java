package com.vimaltech.ai_powered_customer_support_platform.service.ai;

import com.vimaltech.ai_powered_customer_support_platform.client.openai.OpenAiRequest;
import com.vimaltech.ai_powered_customer_support_platform.client.openai.OpenAiResponse;
import com.vimaltech.ai_powered_customer_support_platform.config.OpenAiProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class OpenAiService implements AiService {

    private final RestClient openAiRestClient;
    private final OpenAiProperties properties;

    @Override
    public String generateResponse(String userMessage) {

        log.info("Sending request to OpenAI");

        OpenAiRequest request = new OpenAiRequest(
                properties.model(),
                userMessage
        );

        OpenAiResponse response = openAiRestClient
                .post()
                .uri("/responses")
                .header(
                        HttpHeaders.AUTHORIZATION,
                        "Bearer " + properties.apiKey()
                )
                .contentType(MediaType.APPLICATION_JSON)
                .body(request)
                .retrieve()
                .body(OpenAiResponse.class);

        if (response == null || response.outputText() == null) {

            log.error("Empty response received from OpenAI");

            return "Unable to generate response at this time.";
        }

        return response.outputText().trim();
    }
}