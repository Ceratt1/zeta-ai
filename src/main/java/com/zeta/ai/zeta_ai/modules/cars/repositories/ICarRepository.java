package com.zeta.ai.zeta_ai.modules.cars.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeta.ai.zeta_ai.modules.cars.models.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car, UUID> {

}
