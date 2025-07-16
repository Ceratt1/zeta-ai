package com.zeta.ai.zeta_ai.application.exceptions;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CustomExceptionHandler}.
 */
@Generated
public class CustomExceptionHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'customExceptionHandler'.
   */
  public static BeanDefinition getCustomExceptionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CustomExceptionHandler.class);
    beanDefinition.setInstanceSupplier(CustomExceptionHandler::new);
    return beanDefinition;
  }
}
