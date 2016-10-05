package com.msgsystems.training.w03d03s03.controller;



import com.msgsystems.training.w03d03s03.model.Product;
import com.msgsystems.training.w03d03s03.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

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
            produces = MediaType.APPLICATION_XML_VALUE,
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public @ResponseBody
    Product getProduct(@PathVariable final int id) {
        return productService.getProduct(id);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/product",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public @ResponseBody String saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/products",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public @ResponseBody List<Product> getProducts() {
        return productService.getProducts();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/tea"
    )
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public @ResponseBody String teaPot() {
        return "I'm a teapot :)";
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/csvproducts",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public @ResponseBody List<Product> getCSVFileJson() {
        return productService.getProductRepository();
    }






}
