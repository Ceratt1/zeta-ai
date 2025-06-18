package com.zeta.ai.zeta_ai.modules.serviceOrder.service.impl;

import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.services.IGeminiService;
import com.zeta.ai.zeta_ai.modules.serviceOrder.service.IServiceOrderService;

@Service
public class ServiceOrderServiceImpl implements IServiceOrderService {

    private  IGeminiService geminiService;

    

    public ServiceOrderServiceImpl(IGeminiService geminiService) {
        this.geminiService = geminiService;
    }



    @Override
    public String conversation(String content) {
        return geminiService.conversation(content);
    }
    
}
