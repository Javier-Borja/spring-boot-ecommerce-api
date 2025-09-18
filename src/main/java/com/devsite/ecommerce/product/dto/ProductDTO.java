package com.devsite.ecommerce.product.dto;

public record ProductDTO(
        Integer id,
        String title,
        Double price,
        String description,
        String category,
        String image,
        RatingDTO rating
) { }
