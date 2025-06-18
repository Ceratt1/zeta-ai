package com.zeta.ai.zeta_ai.modules.serviceOrder.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.ai.zeta_ai.application.dtos.PromptRequestModel;
import com.zeta.ai.zeta_ai.application.dtos.PromptResponseModel;
import com.zeta.ai.zeta_ai.modules.serviceOrder.service.IServiceOrderService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/service-order")
public class ServiceOrderController {


    private IServiceOrderService service;

    
    public ServiceOrderController(IServiceOrderService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public PromptResponseModel conversation(@RequestBody @Valid PromptRequestModel request) {

        String content = service.conversation(request.getContent());

        return new PromptResponseModel(content);

    }
    
    
}
