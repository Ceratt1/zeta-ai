package com.zeta.ai.zeta_ai.modules.cars.services;

import java.util.List;

import com.zeta.ai.zeta_ai.modules.cars.models.Car;

public interface ICarService {

    Car save(Car carRequestModel);
    
    List<Car> listAll();
}
