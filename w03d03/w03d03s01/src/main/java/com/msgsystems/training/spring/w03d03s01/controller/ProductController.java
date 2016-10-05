package com.msgsystems.training.spring.w03d03s01.controller;

import com.msgsystems.training.spring.w03d03s01.model.Product;
import com.msgsystems.training.spring.w03d03s01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Lazy
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
            path = {"/hello", "/salut", "bonjour"}
    )
    public @ResponseBody String helloSpring() {
        return "Hello, Spring web! The date is " + new Date();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/requestParams"
    )
    public @ResponseBody String requestParamsIntro(@RequestParam(name = "culoare") String color,
                                                   @RequestParam(required = false) String weight) {
        return "The color is '" + color + "', the weight is '" + weight + "'";
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/pathVariable/{first}/{second}"
    )
    public @ResponseBody String pathVariableIntro(@PathVariable String first,
                                                  @PathVariable String second) {
        return "The first path variable value is '" + first + "', the second is '" + second + "'";
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/postIntro"
    )
    public @ResponseBody String postIntro(@RequestBody String request) {
        return "I agree :)";
    }
}
