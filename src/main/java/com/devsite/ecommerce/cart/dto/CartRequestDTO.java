package com.devsite.ecommerce.cart.dto;

public class CartRequestDTO {

    private Long productID;
    private Integer cuantity;

    public CartRequestDTO() {
    }

    public CartRequestDTO(Long productID, Integer cuantity) {
        this.productID = productID;
        this.cuantity = cuantity;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Integer getCuantity() {
        return cuantity;
    }

    public void setCuantity(Integer cuantity) {
        this.cuantity = cuantity;
    }
}
