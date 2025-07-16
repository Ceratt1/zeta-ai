package com.zeta.ai.zeta_ai.application.configuration;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link GeminiConfiguration}.
 */
@Generated
public class GeminiConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static GeminiConfiguration apply(RegisteredBean registeredBean,
      GeminiConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("geminiBaseUrl").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("GEMINI_API_KEY").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("connectionTimeoutMillis").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("readTimeoutMillis").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
