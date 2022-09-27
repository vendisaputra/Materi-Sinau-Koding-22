package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Product;
import com.sinaukoding.tokosinau.entity.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapping {
    ProductMapping instance = Mappers.getMapper(ProductMapping.class);

    Product toEntity(ProductDTO dto);

    ProductDTO toDto(Product param);

    List<ProductDTO> toListDto(List<Product> productList);
}
