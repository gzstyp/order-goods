package com.fwtai.controller;

import com.fwtai.pojo.Item;
import com.fwtai.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:27
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@RestController
@RequestMapping("/item")
public class ItemController{

    @Autowired
    private ItemService service;

    // http://127.0.0.1:8083/item/1
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable final Long id){
        return service.getItemById(id);
    }
}