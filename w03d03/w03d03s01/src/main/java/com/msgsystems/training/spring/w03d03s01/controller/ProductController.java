package com.msgsystems.training.spring.w03d03s01.controller;

import com.msgsystems.training.spring.w03d03s01.model.Product;
import com.msgsystems.training.spring.w03d03s01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    public Product getProduct(final int id) {
        return productService.getProduct(id);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/hello"
    )
    public @ResponseBody String helloSpring() {
        return "Hello, Spring web!";
    }
}
