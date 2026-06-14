package com.vimaltech.ai_powered_customer_support_platform.controller;

import com.vimaltech.ai_powered_customer_support_platform.dto.ChatHistoryResponse;
import com.vimaltech.ai_powered_customer_support_platform.dto.ChatRequest;
import com.vimaltech.ai_powered_customer_support_platform.dto.ChatResponse;
import com.vimaltech.ai_powered_customer_support_platform.service.ChatService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatResponse chat(@Valid @RequestBody ChatRequest request) {
        return chatService.chat(request.message());
    }

    @GetMapping("/history")
    public List<ChatHistoryResponse> history() {
        return chatService.getHistory();
    }
}