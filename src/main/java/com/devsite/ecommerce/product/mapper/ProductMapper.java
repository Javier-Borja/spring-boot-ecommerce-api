package com.devsite.ecommerce.product.mapper;

import com.devsite.ecommerce.product.dto.ProductDTO;
import com.devsite.ecommerce.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toProductDTO(Product product);
}
