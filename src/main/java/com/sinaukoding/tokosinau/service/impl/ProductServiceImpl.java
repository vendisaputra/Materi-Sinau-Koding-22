package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Product;
import com.sinaukoding.tokosinau.entity.dto.ProductDTO;
import com.sinaukoding.tokosinau.entity.mapping.ProductMapping;
import com.sinaukoding.tokosinau.repository.ProductRepository;
import com.sinaukoding.tokosinau.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public ProductDTO save(ProductDTO param) {
        Product data = repository.save(ProductMapping.instance.toEntity(param));
        return ProductMapping.instance.toDto(data);
    }

    @Override
    public List<ProductDTO> findAllData() {
        return ProductMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public ProductDTO update(ProductDTO param, Long id) {
        Product data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setName(param.getName() == null ? data.getName() : param.getName());
            data.setPrice(param.getPrice() != null ? param.getPrice() : data.getPrice());
            data.setStock(param.getStock() != null ? param.getStock() : data.getStock());

            return ProductMapping.instance.toDto(repository.save(data));
        }

        return ProductMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Product data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public ProductDTO findById(Long id) {
        return ProductMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
