package com.zeta.ai.zeta_ai.application.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SwaggerConfig}.
 */
@Generated
public class SwaggerConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'swaggerConfig'.
   */
  public static BeanDefinition getSwaggerConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SwaggerConfig.class);
    beanDefinition.setTargetType(SwaggerConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(SwaggerConfig.class);
    beanDefinition.setInstanceSupplier(SwaggerConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'titleDescription'.
   */
  private static BeanInstanceSupplier<OpenAPI> getTitleDescriptionInstanceSupplier() {
    return BeanInstanceSupplier.<OpenAPI>forFactoryMethod(SwaggerConfig$$SpringCGLIB$$0.class, "titleDescription")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("swaggerConfig", SwaggerConfig.class).titleDescription());
  }

  /**
   * Get the bean definition for 'titleDescription'.
   */
  public static BeanDefinition getTitleDescriptionBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OpenAPI.class);
    beanDefinition.setFactoryBeanName("swaggerConfig");
    beanDefinition.setInstanceSupplier(getTitleDescriptionInstanceSupplier());
    return beanDefinition;
  }
}
