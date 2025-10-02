package com.devsite.ecommerce.cart.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartProductDTO {

    private Integer id;
    private Double price;

    public CartProductDTO() {
    }

    public CartProductDTO(Integer id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
