package com.zeta.ai.zeta_ai.modules.conversation.dtos;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromptRequestModel extends User {

    
    @NotNull
    private String content;
}
