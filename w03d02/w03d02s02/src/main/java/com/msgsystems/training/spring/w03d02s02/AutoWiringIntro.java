package com.msgsystems.training.spring.w03d02s02;

import com.msgsystems.training.spring.w03d02s02.repository.ProductRepository;
import com.msgsystems.training.spring.w03d02s02.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrates the wiring of an {@link ApplicationContext} using a auto-wired beans
 */
public class AutoWiringIntro {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        final ProductService productService = applicationContext.getBean(ProductService.class);

        /*
        productRepository.displayTheBooleanValue();
        productRepository.displayTheInt();
//        */
//        System.out.println("verify git");
//        productRepository.displayTheProducts();
//        productRepository.displayTheMaps();
//        productRepository.displayProducts();

        productService.getProductRepository();
    }
}
