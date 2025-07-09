package com.zeta.ai.zeta_ai.modules.conversation.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.services.IGeminiService;
import com.zeta.ai.zeta_ai.modules.conversation.models.ConversationHistory;
import com.zeta.ai.zeta_ai.modules.conversation.repositories.IConversationHistoryRepository;
import com.zeta.ai.zeta_ai.modules.conversation.service.IConversationService;

@Service
public class ConversationServiceImpl implements IConversationService {

    private  IGeminiService geminiService;

    private IConversationHistoryRepository conversationHistoryRepository;


    public ConversationServiceImpl(IGeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @Override
    public String conversation(ConversationHistory conversationHistory) {

        conversationHistoryRepository.save(conversationHistory);

        return geminiService.conversation(conversationHistory.getContent());
    }
    
}
