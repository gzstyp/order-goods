package com.fwtai.service;

import com.fwtai.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:15
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com*/
@Service
public class ItemService{

    private static final Map<Long,Item> map = new HashMap<>();

    static {
        map.put(1L,new Item(1L,"Iphone4苹果手机","http://www.yinlz.com/","官方全新机子",1000L));
        map.put(2L,new Item(1L,"Iphone5苹果手机","http://www.yinlz.com/","官方全新机子",2000L));
        map.put(3L,new Item(1L,"Iphone6苹果手机","http://www.yinlz.com/","官方全新机子",3000L));
        map.put(4L,new Item(1L,"Iphone6s苹果手机","http://www.yinlz.com/","官方全新机子",4000L));
        map.put(5L,new Item(1L,"Iphone7苹果手机","http://www.yinlz.com/","官方全新机子",5000L));
        map.put(6L,new Item(1L,"Iphone8苹果手机","http://www.yinlz.com/","官方全新机子",6000L));
        map.put(7L,new Item(1L,"IphoneX苹果手机","http://www.yinlz.com/","官方全新机子",7000L));
        map.put(8L,new Item(1L,"Iphone8s苹果手机","http://www.yinlz.com/","官方全新机子",7000L));
    }

    public Item getItemById(final Long id){
        return map.get(id);
    }

    public Map<Long,Item> getItem(){
        return map;
    }
}