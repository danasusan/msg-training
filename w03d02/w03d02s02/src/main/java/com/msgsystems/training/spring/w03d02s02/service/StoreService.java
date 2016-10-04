package com.msgsystems.training.spring.w03d02s02.service;

import com.msgsystems.training.spring.w03d02s02.model.Product;
import com.msgsystems.training.spring.w03d02s02.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;

/**
 * Created by susand on 04/10/2016.
 */
public class StoreService {
    ProductRepository productRepository;

    public StoreService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> displayProducts() {
        return productRepository.getProducts();
    }

    public Map<Integer,String> displayMap() {
        return productRepository.getTheOtherProductRepository();
    }


}
