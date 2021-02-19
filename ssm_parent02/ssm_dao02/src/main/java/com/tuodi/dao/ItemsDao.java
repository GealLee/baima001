package com.tuodi.dao;

import com.tuodi.pojo.Items;

import java.util.List;

public interface ItemsDao {

    /**
     * 查询所有的方法
     * @return
     */
    List<Items> findAll();

    /**
     * 添加方法
     * @param items
     */
    void add(Items items);

}
