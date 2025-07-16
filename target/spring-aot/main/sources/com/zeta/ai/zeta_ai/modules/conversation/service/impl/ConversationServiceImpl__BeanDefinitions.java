package com.zeta.ai.zeta_ai.modules.conversation.service.impl;

import com.zeta.ai.zeta_ai.application.services.IGeminiService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConversationServiceImpl}.
 */
@Generated
public class ConversationServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'conversationServiceImpl'.
   */
  private static BeanInstanceSupplier<ConversationServiceImpl> getConversationServiceImplInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConversationServiceImpl>forConstructor(IGeminiService.class)
            .withGenerator((registeredBean, args) -> new ConversationServiceImpl(args.get(0)));
  }

  /**
   * Get the bean definition for 'conversationServiceImpl'.
   */
  public static BeanDefinition getConversationServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConversationServiceImpl.class);
    beanDefinition.setInstanceSupplier(getConversationServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
