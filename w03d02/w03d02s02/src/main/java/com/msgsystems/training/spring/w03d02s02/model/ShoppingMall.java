package com.msgsystems.training.spring.w03d02s02.model;

import java.util.List;

/**
 * Created by susand on 04/10/2016.
 */
public class ShoppingMall {
    private String name;
    private List<Store> stores;

    public ShoppingMall(List<Store> stores) {
        this.stores = stores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
