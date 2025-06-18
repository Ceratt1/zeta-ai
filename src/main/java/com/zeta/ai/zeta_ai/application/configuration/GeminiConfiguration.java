package com.zeta.ai.zeta_ai.application.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeminiConfiguration {

    @Value("${spring.ai.openai.chat.base-url}")
    private String geminiBaseUrl;

    @Value("${spring.ai.openai.api-key}")
    private String GEMINI_API_KEY;

    @Value("${gemini.api.connection-timeout}")
    private int connectionTimeoutMillis;

    @Value("${gemini.api.read-timeout}")
    private int readTimeoutMillis;

}