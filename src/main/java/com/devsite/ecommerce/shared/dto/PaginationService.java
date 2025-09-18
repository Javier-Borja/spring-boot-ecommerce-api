package com.devsite.ecommerce.shared.dto;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PaginationService {

    public <T> ApiResponse<T> createPaginatedResponse(List<T> items, int page, int limit) {

        if (items == null || items.isEmpty()) {
            PaginationMeta meta = new PaginationMeta(0, 0, page, limit);
            return new ApiResponse<>(Collections.emptyList(), meta);
        }

        int totalItems = items.size();
        int totalPages = (int) Math.ceil((double) totalItems / limit);

        int startIndex = page * limit;
        int endIndex = Math.min(startIndex + limit, totalItems);

        // Si la página solicitada está fuera de rango
        if (startIndex >= totalItems || startIndex < 0) {
            PaginationMeta meta = new PaginationMeta(totalItems, totalPages, page, limit);
            return new ApiResponse<>(Collections.emptyList(), meta);
        }

        List<T> paginatedItems = items.subList(startIndex, endIndex);
        PaginationMeta meta = new PaginationMeta(totalItems, totalPages, page, limit);

        return new ApiResponse<>(paginatedItems, meta);
    }
}
