package com.devsite.ecommerce.product.service;

import com.devsite.ecommerce.product.dto.ProductDTO;
import com.devsite.ecommerce.product.mapper.ProductMapper;
import com.devsite.ecommerce.product.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final WebClient webClient;

    public ProductService(WebClient webClient) {
        this.webClient = webClient;
    }

    // método para obtener todos los productos
    public Flux<ProductDTO> getAllProduct() {
        return webClient.get()
                .uri("/products")
                .retrieve()
                .bodyToFlux(Product.class)
                .map(ProductMapper.INSTANCE::toProductDTO);
    }

    // método para obtener un producto por su id
    public Mono<ProductDTO> getProductById(Integer id){
        return webClient.get()
                .uri("/products/{id}", id)
                .retrieve()
                .bodyToMono(Product.class)
                .map(ProductMapper.INSTANCE::toProductDTO);
    }
}
