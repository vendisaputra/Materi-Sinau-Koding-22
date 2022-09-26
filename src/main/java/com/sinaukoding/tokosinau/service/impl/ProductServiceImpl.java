package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Product;
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
    public Product save(Product param) {
        return repository.save(param);
    }

    @Override
    public List<Product> findAllData() {
        return repository.findAll();
    }

    @Override
    public Product update(Product param, Long id) {
        Product data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setName(param.getName() == null ? data.getName() : param.getName());
            data.setPrice(param.getPrice() != null ? param.getPrice() : data.getPrice());
            data.setStock(param.getStock() != null ? param.getStock() : data.getStock());

            return repository.save(data);
        }

        return data;
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
    public Product findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
