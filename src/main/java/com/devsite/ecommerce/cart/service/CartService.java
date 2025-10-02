package com.devsite.ecommerce.cart.service;

import com.devsite.ecommerce.cart.dto.CartProductDTO;
import com.devsite.ecommerce.cart.dto.CartRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CartService {

    private final WebClient webClient;

    public CartService(WebClient webClient) {
        this.webClient = webClient;
    }

    // Método para calcular el total a pagar
    public Mono<Double> calculateTotalCart(List<CartRequestDTO> cartRequestDTOS){
        return Flux.fromIterable(cartRequestDTOS)
                .flatMap(cart -> webClient.get()
                        .uri("/products/{id}", cart.getProductID())
                        .retrieve()
                        .bodyToMono(CartProductDTO.class)
                        .map(product -> product.getPrice() * cart.getCuantity())
                )
                .reduce(0.0, Double::sum);
    }
}
