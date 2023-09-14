package com.postgresql.testdemo.controller;

import com.postgresql.testdemo.model.Product;
import com.postgresql.testdemo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("product")
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }


}
