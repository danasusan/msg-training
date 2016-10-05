package com.msgsystems.training.spring.w03d03s02.controller;

import com.msgsystems.training.spring.w03d03s02.model.Product;
import com.msgsystems.training.spring.w03d03s02.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/product/{id}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public @ResponseBody Product getProduct(@PathVariable final int id) {
        return productService.getProduct(id);
    }
}
