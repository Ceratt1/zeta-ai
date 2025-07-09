package com.zeta.ai.zeta_ai.modules.cars.controllers;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.ai.zeta_ai.modules.cars.dtos.CarRequestModel;
import com.zeta.ai.zeta_ai.modules.cars.dtos.CarResponseModel;
import com.zeta.ai.zeta_ai.modules.cars.models.Car;
import com.zeta.ai.zeta_ai.modules.cars.services.ICarService;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    private ICarService service;

    private ModelMapper modelMapper;


    public CarController(ICarService service, ModelMapper modelMapper) {
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @PostMapping()
    public CarResponseModel save(@RequestBody CarRequestModel request) {
        Car car = modelMapper.map(request, Car.class);
        car = service.save(car);
        return modelMapper.map(car, CarResponseModel.class);
    }



}
