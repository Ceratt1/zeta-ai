package com.zeta.ai.zeta_ai.modules.conversation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.ai.zeta_ai.modules.conversation.dtos.PromptRequestModel;
import com.zeta.ai.zeta_ai.modules.conversation.dtos.PromptResponseModel;
import com.zeta.ai.zeta_ai.modules.conversation.models.ConversationHistory;
import com.zeta.ai.zeta_ai.modules.conversation.service.IConversationService;

import jakarta.validation.Valid;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/conversation")
public class ConversationController {


    private IConversationService service;

    private ModelMapper mapper;
    
    public ConversationController(IConversationService service, ModelMapper modelMapper) {
        this.service = service;
        this.mapper = modelMapper;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public PromptResponseModel conversation(@RequestBody @Valid PromptRequestModel request) {

        ConversationHistory conversation = mapper.map(request, ConversationHistory.class);

        String content = service.conversation(conversation);

        return new PromptResponseModel(content);

    }
    
    
}
