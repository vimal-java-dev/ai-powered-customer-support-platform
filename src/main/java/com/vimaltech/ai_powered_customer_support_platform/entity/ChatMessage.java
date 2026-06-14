package com.vimaltech.ai_powered_customer_support_platform.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "chat_messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String userMessage;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String aiResponse;

    private LocalDateTime createdAt;
}
