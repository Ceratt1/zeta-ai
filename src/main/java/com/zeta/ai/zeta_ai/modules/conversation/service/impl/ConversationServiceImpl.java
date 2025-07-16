package com.zeta.ai.zeta_ai.modules.conversation.service.impl;


import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.services.IGeminiService;
import com.zeta.ai.zeta_ai.modules.conversation.models.ConversationHistory;
import com.zeta.ai.zeta_ai.modules.conversation.service.IConversationService;

@Service
public class ConversationServiceImpl implements IConversationService {

    private  IGeminiService geminiService;



    public ConversationServiceImpl(IGeminiService geminiService) {
        this.geminiService = geminiService;
    }




    @Override
    public String conversation(ConversationHistory conversationHistory) {

        return geminiService.conversation(conversationHistory.getContent());
    }
    
}
