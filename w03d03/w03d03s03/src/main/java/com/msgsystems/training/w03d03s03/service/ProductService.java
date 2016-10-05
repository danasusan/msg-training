package com.msgsystems.training.w03d03s03.service;


import com.msgsystems.training.w03d03s03.model.Product;
import com.msgsystems.training.w03d03s03.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(final int id) {
        return productRepository.get(id);
    }

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public String saveProduct(Product product) {
        productRepository.saveProduct(product);
        return "OK";
    }

    public List<Product> getProductRepository () {

       return productRepository.displayProducts();
    }


}
