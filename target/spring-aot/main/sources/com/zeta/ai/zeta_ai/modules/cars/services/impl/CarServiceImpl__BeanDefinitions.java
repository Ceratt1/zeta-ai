package com.zeta.ai.zeta_ai.modules.cars.services.impl;

import com.zeta.ai.zeta_ai.modules.cars.repositories.ICarRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CarServiceImpl}.
 */
@Generated
public class CarServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'carServiceImpl'.
   */
  private static BeanInstanceSupplier<CarServiceImpl> getCarServiceImplInstanceSupplier() {
    return BeanInstanceSupplier.<CarServiceImpl>forConstructor(ICarRepository.class)
            .withGenerator((registeredBean, args) -> new CarServiceImpl(args.get(0)));
  }

  /**
   * Get the bean definition for 'carServiceImpl'.
   */
  public static BeanDefinition getCarServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CarServiceImpl.class);
    beanDefinition.setInstanceSupplier(getCarServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
