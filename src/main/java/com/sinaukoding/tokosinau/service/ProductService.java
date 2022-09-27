package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO save(ProductDTO param);

    List<ProductDTO> findAllData();

    ProductDTO update(ProductDTO param, Long id);

    Boolean delete(Long id);

    ProductDTO findById(Long id);
}
