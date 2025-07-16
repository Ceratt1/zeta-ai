package com.zeta.ai.zeta_ai.application.services.impl;

import com.zeta.ai.zeta_ai.application.configuration.GeminiConfiguration;
import com.zeta.ai.zeta_ai.modules.cars.services.ICarService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GeminiServiceImpl}.
 */
@Generated
public class GeminiServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'geminiServiceImpl'.
   */
  private static BeanInstanceSupplier<GeminiServiceImpl> getGeminiServiceImplInstanceSupplier() {
    return BeanInstanceSupplier.<GeminiServiceImpl>forConstructor(GeminiConfiguration.class, ChatClient.Builder.class, ICarService.class)
            .withGenerator((registeredBean, args) -> new GeminiServiceImpl(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'geminiServiceImpl'.
   */
  public static BeanDefinition getGeminiServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GeminiServiceImpl.class);
    beanDefinition.setInstanceSupplier(getGeminiServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
