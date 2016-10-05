package com.msgsystems.training.w03d03s03.repository;


import com.msgsystems.training.w03d03s03.model.Product;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {
    private String fileLocation;

    public ProductRepository() {
        fileLocation = "C:/Users/susand/workspace/my-msg-training/w03d01/s02/src/products.csv";
    }

    @SuppressWarnings("unused")
    public Product get(int id) {
        final Product product = new Product();
        product.setId(24);
        product.setName("Dell XPS 9350");

        return product;
    }

    public List<Product> getProducts() {
        Product first = new Product();
        first.setName("biscuit");
        first.setId(23);

        Product second = new Product();
        second.setName("cake");
        second.setId(55);

        return Arrays.asList(first, second);
    }

    public void saveProduct(Product product) {
        //TODO save Product :)
    }

    public ArrayList<Product> displayProducts () {
        ArrayList<Product> products = new ArrayList<Product>();
        try(FileReader fileReader=  new FileReader(fileLocation);
            BufferedReader bufferedReader= new BufferedReader(fileReader)) {

            String l;
            while((l= bufferedReader.readLine()) !=null){

                String[] splt = l.split(",");

                Product myProduct= new Product();
                myProduct.setId(Integer.parseInt(splt[0]));
                myProduct.setName(splt[1]);

                products.add(myProduct);
             //   System.out.println(myProduct.toString());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;

    }
}
