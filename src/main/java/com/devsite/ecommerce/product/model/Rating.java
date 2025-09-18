package com.devsite.ecommerce.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {

    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("count")
    private Integer count;

    public Rating() {
    }

    public Rating(Double rate, Integer count) {
        this.rate = rate;
        this.count = count;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
