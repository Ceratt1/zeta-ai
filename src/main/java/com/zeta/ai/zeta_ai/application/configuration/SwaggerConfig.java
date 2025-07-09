package com.zeta.ai.zeta_ai.application.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI titleDescription() {
        return new OpenAPI()
                .info(new Info().title("Zeta AI")
                        .description("Módulo responsável pelo gerenciamento da AI do sistema.")
                        .version("1.0"));
    }
}