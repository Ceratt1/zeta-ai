package com.zeta.ai.zeta_ai.application.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    
    @NotNull
    private UUID uuid;

}
