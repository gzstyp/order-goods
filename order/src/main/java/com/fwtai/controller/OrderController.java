package com.fwtai.controller;

import com.fwtai.pojo.Order;
import com.fwtai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 15:15
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@RestController
public class OrderController{

    @Autowired
    private OrderService service;

    // http://127.0.0.1:8084/order/1024204888
    @GetMapping("/order/{orderId}")
    public Order getOrderById(@PathVariable final String orderId){
        return service.getOrderById(orderId);
    }
}