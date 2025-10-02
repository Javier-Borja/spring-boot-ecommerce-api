package com.devsite.ecommerce.cart.controller;

import com.devsite.ecommerce.cart.dto.CartRequestDTO;
import com.devsite.ecommerce.cart.dto.CartResponseDTO;
import com.devsite.ecommerce.cart.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/total")
@CrossOrigin
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Método para calcular total a pagar
    @PostMapping
    public ResponseEntity<Mono<CartResponseDTO>> calculateTotalCart(@RequestBody List<CartRequestDTO> cartRequestDTOS){
        return ResponseEntity.ok(cartService.calculateTotalCart(cartRequestDTOS).map(CartResponseDTO::new));
    }
}
