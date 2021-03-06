package com.msgsystems.training.spring.w03d01s02;

import com.msgsystems.training.spring.w03d01s02.model.Product;
import com.msgsystems.training.spring.w03d01s02.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrates the retrieving of a bean which has a collaborator / dependency, from Spring's {@link ApplicationContext}
 */
public class WiringIntroMain {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final ProductService productService = applicationContext.getBean(ProductService.class);

        final Product product = productService.getProduct(23);
        System.out.println(product.getName());
    }
}
