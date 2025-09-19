package com.devsite.ecommerce.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigWebClient {

    String API_FAKE_STORE = "https://fakestoreapi.com";

    @Bean
    WebClient webClient(){
        return WebClient.builder()
                .baseUrl(API_FAKE_STORE)
                .build();
    }
}
