package org.springframework.ai.model.openai.autoconfigure;

import org.springframework.ai.model.tool.ToolCallingManager;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * Bean definitions for {@link OpenAiChatAutoConfiguration}.
 */
@Generated
public class OpenAiChatAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'openAiChatAutoConfiguration'.
   */
  public static BeanDefinition getOpenAiChatAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OpenAiChatAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(OpenAiChatAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'openAiChatModel'.
   */
  private static BeanInstanceSupplier<OpenAiChatModel> getOpenAiChatModelInstanceSupplier() {
    return BeanInstanceSupplier.<OpenAiChatModel>forFactoryMethod(OpenAiChatAutoConfiguration.class, "openAiChatModel", OpenAiConnectionProperties.class, OpenAiChatProperties.class, ObjectProvider.class, ObjectProvider.class, ToolCallingManager.class, RetryTemplate.class, ResponseErrorHandler.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.ai.model.openai.autoconfigure.OpenAiChatAutoConfiguration", OpenAiChatAutoConfiguration.class).openAiChatModel(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9)));
  }

  /**
   * Get the bean definition for 'openAiChatModel'.
   */
  public static BeanDefinition getOpenAiChatModelBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(OpenAiChatModel.class);
    beanDefinition.setFactoryBeanName("org.springframework.ai.model.openai.autoconfigure.OpenAiChatAutoConfiguration");
    beanDefinition.setInstanceSupplier(getOpenAiChatModelInstanceSupplier());
    return beanDefinition;
  }
}
