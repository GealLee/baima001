package com.tuodi.service.impl;

import com.tuodi.dao.ItemsDao;
import com.tuodi.pojo.Items;
import com.tuodi.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void add(Items items) {
        itemsDao.add(items);
    }
}
