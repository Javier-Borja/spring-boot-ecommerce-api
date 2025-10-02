package com.devsite.ecommerce.cart.dto;

public class CartResponseDTO {

    private Double total;

    public CartResponseDTO() {
    }

    public CartResponseDTO(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
