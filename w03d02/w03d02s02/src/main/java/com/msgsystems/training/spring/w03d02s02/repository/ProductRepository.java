package com.msgsystems.training.spring.w03d02s02.repository;

import com.msgsystems.training.spring.w03d02s02.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {

    private String fileLocation;

    @Value("${aBooleanValue}")
    private boolean theBooleanValue;

    @Value("${anIntegerValue}")
    private int theIntValue;

    private List<Product> products;

    public ProductRepository(@Value("${productsFile}") String fileLocation) {
        this.fileLocation = fileLocation;
    }

    private Map<Integer,String> theOtherProductRepository;

    @SuppressWarnings("unused")
    public Product get(int id) {
        final Product product = new Product();
        product.setId(24);
        product.setName("Dell XPS 9350");

        return product;
    }

    public void displayTheBooleanValue() {
        System.out.println("The boolean value is " + theBooleanValue);
    }

    public void displayTheInt() {
        System.out.println("The int is " + theIntValue);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void displayTheProducts() {
        products.forEach(product -> System.out.println(product.getId() + ", " + product.getName()));
    }

    public Map<Integer, String> getTheOtherProductRepository() {
        return theOtherProductRepository;
    }

    public void setTheOtherProductRepository(Map<Integer, String> theOtherProductRepository) {
        this.theOtherProductRepository = theOtherProductRepository;
    }

    public void displayTheMaps() {
        theOtherProductRepository.forEach((k,v)->System.out.println("Count : " + k + " Item : " + v));
    }

    @PostConstruct
    public void composeProductsList() {
        System.out.println("Composing the list of products...");
    }

    public ArrayList<Product> displayProducts () {
        ArrayList<Product> products = new ArrayList<Product>();
        try(FileReader fileReader=  new FileReader(fileLocation);
            BufferedReader bufferedReader= new BufferedReader(fileReader)) {

            String line;
            while((line= bufferedReader.readLine()) !=null) {

                String[] splt = line.split(",");

                Product p1= new Product();
                p1.setId(Integer.parseInt(splt[0]));
                p1.setName(splt[1]);

                products.add(p1);
                System.out.println(p1.toString());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;

    }
}
