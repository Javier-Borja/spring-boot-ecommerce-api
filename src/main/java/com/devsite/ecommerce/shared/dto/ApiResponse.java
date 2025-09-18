package com.devsite.ecommerce.shared.dto;

import java.util.List;

public class ApiResponse<T>{
    private List<T> data;
    private PaginationMeta meta;

    public ApiResponse() {
    }

    public ApiResponse(List<T> data, PaginationMeta meta) {
        this.data = data;
        this.meta = meta;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PaginationMeta getMeta() {
        return meta;
    }

    public void setMeta(PaginationMeta meta) {
        this.meta = meta;
    }
}
