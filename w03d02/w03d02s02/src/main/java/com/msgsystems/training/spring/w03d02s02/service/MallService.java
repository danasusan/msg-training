package com.msgsystems.training.spring.w03d02s02.service;

import com.msgsystems.training.spring.w03d02s02.model.Store;
import com.msgsystems.training.spring.w03d02s02.repository.StoreRepository;

import java.util.List;

/**
 * Created by susand on 04/10/2016.
 */
public class MallService {

    StoreRepository storeRepository;

    public MallService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> displayStores() {
        return storeRepository.getStores();
    }
}
