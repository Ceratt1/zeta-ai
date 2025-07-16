package com.zeta.ai.zeta_ai.application.configuration;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Bean definitions for {@link CorsConfig}.
 */
@Generated
public class CorsConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'corsConfig'.
   */
  public static BeanDefinition getCorsConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CorsConfig.class);
    beanDefinition.setTargetType(CorsConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(CorsConfig.class);
    beanDefinition.setInstanceSupplier(CorsConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'corsConfigurer'.
   */
  private static BeanInstanceSupplier<WebMvcConfigurer> getCorsConfigurerInstanceSupplier() {
    return BeanInstanceSupplier.<WebMvcConfigurer>forFactoryMethod(CorsConfig$$SpringCGLIB$$0.class, "corsConfigurer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("corsConfig", CorsConfig.class).corsConfigurer());
  }

  /**
   * Get the bean definition for 'corsConfigurer'.
   */
  public static BeanDefinition getCorsConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebMvcConfigurer.class);
    beanDefinition.setFactoryBeanName("corsConfig");
    beanDefinition.setInstanceSupplier(getCorsConfigurerInstanceSupplier());
    return beanDefinition;
  }
}
