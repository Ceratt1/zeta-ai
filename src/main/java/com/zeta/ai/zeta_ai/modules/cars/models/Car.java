package com.zeta.ai.zeta_ai.modules.cars.models;

import java.math.BigDecimal;


import com.zeta.ai.zeta_ai.application.dtos.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cars")
@Getter
@Setter
public class Car extends BaseEntity  {
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal preco;
}
