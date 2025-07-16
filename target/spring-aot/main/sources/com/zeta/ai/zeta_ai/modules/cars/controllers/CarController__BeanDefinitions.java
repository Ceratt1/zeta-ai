package com.zeta.ai.zeta_ai.modules.cars.controllers;

import com.zeta.ai.zeta_ai.modules.cars.services.ICarService;
import org.modelmapper.ModelMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CarController}.
 */
@Generated
public class CarController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'carController'.
   */
  private static BeanInstanceSupplier<CarController> getCarControllerInstanceSupplier() {
    return BeanInstanceSupplier.<CarController>forConstructor(ICarService.class, ModelMapper.class)
            .withGenerator((registeredBean, args) -> new CarController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'carController'.
   */
  public static BeanDefinition getCarControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CarController.class);
    beanDefinition.setInstanceSupplier(getCarControllerInstanceSupplier());
    return beanDefinition;
  }
}
