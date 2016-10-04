package com.msgsystems.training.spring.w03d02s02.model;

import java.util.List;

/**
 * Created by susand on 04/10/2016.
 */
public class Store {

    private int id;
    private String name;
    private List<String> products;

    public Store(int id, List<String> products) {
        this.id = id;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
