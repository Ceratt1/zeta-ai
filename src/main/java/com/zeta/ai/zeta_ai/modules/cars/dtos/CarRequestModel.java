package com.zeta.ai.zeta_ai.modules.cars.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRequestModel {
    
    @NotNull
    private String name;
    @NotNull
    private BigDecimal price;
}
