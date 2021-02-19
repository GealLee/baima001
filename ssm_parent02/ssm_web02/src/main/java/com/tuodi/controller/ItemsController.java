package com.tuodi.controller;


import com.tuodi.pojo.Items;
import com.tuodi.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/hello")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println(itemsService.findAll());
		int a = 1;
		int b = 2;
        return "success";
    }
    @RequestMapping("/add")
    public String add(){
        itemsService.add(new Items(0,"小小书童",250.0F,"",new Date(),"可笑可笑"));
        return "success";
    }
}
