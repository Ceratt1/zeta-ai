package com.zeta.ai.zeta_ai.modules.conversation.controllers;

import com.zeta.ai.zeta_ai.modules.conversation.service.IConversationService;
import org.modelmapper.ModelMapper;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConversationController}.
 */
@Generated
public class ConversationController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'conversationController'.
   */
  private static BeanInstanceSupplier<ConversationController> getConversationControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConversationController>forConstructor(IConversationService.class, ModelMapper.class)
            .withGenerator((registeredBean, args) -> new ConversationController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'conversationController'.
   */
  public static BeanDefinition getConversationControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConversationController.class);
    beanDefinition.setInstanceSupplier(getConversationControllerInstanceSupplier());
    return beanDefinition;
  }
}
