package com.zeta.ai.zeta_ai;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ZetaAiApplication}.
 */
@Generated
public class ZetaAiApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'zetaAiApplication'.
   */
  public static BeanDefinition getZetaAiApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ZetaAiApplication.class);
    beanDefinition.setInstanceSupplier(ZetaAiApplication::new);
    return beanDefinition;
  }
}
