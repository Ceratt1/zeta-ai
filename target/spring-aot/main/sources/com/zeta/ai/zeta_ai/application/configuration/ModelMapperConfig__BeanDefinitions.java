package com.zeta.ai.zeta_ai.application.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link ModelMapperConfig}.
 */
@Generated
public class ModelMapperConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'modelMapperConfig'.
   */
  public static BeanDefinition getModelMapperConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ModelMapperConfig.class);
    beanDefinition.setTargetType(ModelMapperConfig.class);
    ConfigurationClassUtils.initializeConfigurationClass(ModelMapperConfig.class);
    beanDefinition.setInstanceSupplier(ModelMapperConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'modelMapper'.
   */
  private static BeanInstanceSupplier<ModelMapper> getModelMapperInstanceSupplier() {
    return BeanInstanceSupplier.<ModelMapper>forFactoryMethod(ModelMapperConfig$$SpringCGLIB$$0.class, "modelMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("modelMapperConfig", ModelMapperConfig.class).modelMapper());
  }

  /**
   * Get the bean definition for 'modelMapper'.
   */
  public static BeanDefinition getModelMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ModelMapper.class);
    beanDefinition.setFactoryBeanName("modelMapperConfig");
    beanDefinition.setInstanceSupplier(getModelMapperInstanceSupplier());
    return beanDefinition;
  }
}
