package com.zeta.ai.zeta_ai.application.services.impl;

import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.zeta.ai.zeta_ai.application.configuration.GeminiConfiguration;
import com.zeta.ai.zeta_ai.application.services.IGeminiService;
import com.zeta.ai.zeta_ai.modules.cars.models.Car;
import com.zeta.ai.zeta_ai.modules.cars.services.ICarService;

@Service
public class GeminiServiceImpl implements IGeminiService {

    private final GeminiConfiguration geminiConfiguration;
    private final ChatClient chatClient; 
    private ICarService carService;


    public GeminiServiceImpl(GeminiConfiguration geminiConfiguration, ChatClient.Builder chatClientBuilder, ICarService carService) {
        this.geminiConfiguration = geminiConfiguration;
        this.chatClient = chatClientBuilder.build();
        this.carService = carService;

    }

    @Override
    public String conversation(String chatMessage) {
 
        List<Car> cars = carService.listAll();

        StringBuilder content = new StringBuilder();

        content.append("Você é um agente especializado em carros, Seja gentil porém direto ao ponto, tente economizar linhas para uma resposta curta, não é necessário formatar o texto.");
        
        content.append("Sempre retorne o nome do carro, os motivos e por final o preço do carro. \n\n");

        content.append("Sempre cumprimente o cliente \n\n");

        
        content.append(" aqui temos uma lista de carros: \\n");
        for (Car car : cars) {
            content.append(car.getName() + " - " + car.getPreco()).append("\n");
        }

        content.append("Sempre baseado no envio do cliente, tente sugerir um ou alguns carros que fazem sentido pra situação de vida atual do prompt do cliente. \n\n Cliente: " + chatMessage);
        
        
        String aiResponse = chatClient.prompt()
                                    .user(content.toString())
                                    .call()
                                    .content();
        return aiResponse;
    }
}