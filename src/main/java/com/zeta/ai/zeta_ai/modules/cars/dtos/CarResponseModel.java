package com.zeta.ai.zeta_ai.modules.cars.dtos;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CarResponseModel extends CarRequestModel  {
    
    private UUID uuid;
}
