package com.devsite.ecommerce.product.controller;

import com.devsite.ecommerce.product.dto.ProductDTO;
import com.devsite.ecommerce.product.service.ProductService;
import com.devsite.ecommerce.shared.dto.ApiResponse;
import com.devsite.ecommerce.shared.dto.PaginationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin
public class ProductController {

    private final ProductService productService;
    private final PaginationService paginationService;

    public ProductController(ProductService productService, PaginationService paginationService) {
        this.productService = productService;
        this.paginationService = paginationService;
    }

    // método para obtener todos los productos
    @GetMapping
    public ResponseEntity<ApiResponse<ProductDTO>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int limit
    ) {
        List<ProductDTO> allProducts = productService.getAllProduct().collectList().block();
        ApiResponse<ProductDTO> response = paginationService.createPaginatedResponse(allProducts, page, limit);
        return ResponseEntity.ok(response);
    }

    // método para obtener un producto por su id
    @GetMapping("/{id}")
    public Mono<ResponseEntity<ProductDTO>> getProductById(@PathVariable Integer id){
        return productService.getProductById(id)
                .map(ResponseEntity:: ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
