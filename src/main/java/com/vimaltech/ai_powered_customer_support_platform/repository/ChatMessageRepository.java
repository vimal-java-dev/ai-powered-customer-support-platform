package com.vimaltech.ai_powered_customer_support_platform.repository;

import com.vimaltech.ai_powered_customer_support_platform.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findTop20ByOrderByCreatedAtDesc();
}
