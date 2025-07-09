package com.zeta.ai.zeta_ai.modules.cars.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.exceptions.DomainException;
import com.zeta.ai.zeta_ai.modules.cars.models.Car;
import com.zeta.ai.zeta_ai.modules.cars.repositories.ICarRepository;
import com.zeta.ai.zeta_ai.modules.cars.services.ICarService;

@Service
public class CarServiceImpl implements ICarService {

    private ICarRepository carRepository;

    public CarServiceImpl(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    private Car commit(Car car) {
        try {
            return carRepository.save(car);
        } catch (Exception e) {
            throw new DomainException("erro ao salvar carro: " + e.getMessage());
        }
    }

    @Override
    public Car save(Car car) {
        car.setUuid(null);
        return this.commit(car);
    }

    @Override
    public List<Car> listAll() {
        return carRepository.findAll();
    }
    
}
