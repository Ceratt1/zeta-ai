package com.zeta.ai.zeta_ai.application.configuration;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link GeminiConfiguration}.
 */
@Generated
public class GeminiConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'geminiConfiguration'.
   */
  public static BeanDefinition getGeminiConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GeminiConfiguration.class);
    beanDefinition.setTargetType(GeminiConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(GeminiConfiguration.class);
    InstanceSupplier<GeminiConfiguration> instanceSupplier = InstanceSupplier.using(GeminiConfiguration$$SpringCGLIB$$0::new);
    instanceSupplier = instanceSupplier.andThen(GeminiConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
