package com.msgsystems.training.spring.w03d02s02.repository;

import com.msgsystems.training.spring.w03d02s02.model.Store;

import java.util.List;

/**
 * Created by susand on 04/10/2016.
 */
public class StoreRepository {
    List<Store> stores;

    public StoreRepository(List<Store> stores) {
        this.stores = stores;
    }

    public List<Store> getStores() {
        return stores;
    }
}
