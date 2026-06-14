package com.vimaltech.ai_powered_customer_support_platform.service;

import com.vimaltech.ai_powered_customer_support_platform.dto.ChatHistoryResponse;
import com.vimaltech.ai_powered_customer_support_platform.dto.ChatResponse;
import com.vimaltech.ai_powered_customer_support_platform.entity.ChatMessage;
import com.vimaltech.ai_powered_customer_support_platform.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatMessageRepository chatMessageRepository;

    public ChatResponse chat(String userMessage) {

        String aiResponse = "AI integration coming soon: " + userMessage;

        ChatMessage chatMessage = ChatMessage.builder()
                .userMessage(userMessage)
                .aiResponse(aiResponse)
                .createdAt(LocalDateTime.now())
                .build();

        chatMessageRepository.save(chatMessage);

        return new ChatResponse(aiResponse);
    }

    public List<ChatHistoryResponse> getHistory() {

        return chatMessageRepository
                .findTop20ByOrderByCreatedAtDesc()
                .stream()
                .map(chat -> new ChatHistoryResponse(
                        chat.getId(),
                        chat.getUserMessage(),
                        chat.getAiResponse(),
                        chat.getCreatedAt()
                ))
                .toList();
    }
}