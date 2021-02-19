package com.tuodi.service;


import com.tuodi.pojo.Items;

import java.util.List;

public interface ItemsService {

    /**
     *
     * @return
     */
    List<Items> findAll();

    /**
     *
     * @param items
     */
    void add(Items items);
}
