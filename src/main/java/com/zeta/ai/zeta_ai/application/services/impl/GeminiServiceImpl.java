package com.zeta.ai.zeta_ai.application.services.impl;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.configuration.GeminiConfiguration;
import com.zeta.ai.zeta_ai.application.services.IGeminiService;

@Service
public class GeminiServiceImpl implements IGeminiService {

    private final GeminiConfiguration geminiConfiguration;
    private final ChatClient chatClient; 

    public GeminiServiceImpl(GeminiConfiguration geminiConfiguration, ChatClient.Builder chatClientBuilder) {
        this.geminiConfiguration = geminiConfiguration;
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public String conversation(String content) {
        String aiResponse = chatClient.prompt()
                                    .user(content)
                                    .call()
                                    .content();
        return aiResponse;
    }
}