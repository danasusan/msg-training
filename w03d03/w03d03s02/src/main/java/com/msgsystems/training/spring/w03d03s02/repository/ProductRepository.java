package com.msgsystems.training.spring.w03d03s02.repository;

import com.msgsystems.training.spring.w03d03s02.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    @SuppressWarnings("unused")
    public Product get(int id) {
        final Product product = new Product();
        product.setId(24);
        product.setName("Dell XPS 9350");

        return product;
    }

    public List<Product> getProducts() {
        Product first = new Product();
        first.setName("ciocolata");
        first.setId(23);

        Product second = new Product();
        second.setName("tiramisu");
        second.setId(55);

        return Arrays.asList(first, second);
    }

    public void saveProduct(Product product) {
        //TODO save Product :)
    }
}
