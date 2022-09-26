package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product param);

    List<Product> findAllData();

    Product update(Product param, Long id);

    Boolean delete(Long id);

    Product findById(Long id);
}
