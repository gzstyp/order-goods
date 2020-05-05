package com.fwtai.service;

import com.fwtai.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 获取并处理商品订单服务
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 15:21
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class ItemService{

    @Resource
    private RestTemplate restTemplate;

    /*@Value("${microservice.url.item}")
    private String urlItem;

    public Item getItemById(final Long id){
        return restTemplate.getForObject(urlItem+id,Item.class);
    }*/

    final String itemService = "goods";

    @Autowired
    private DiscoveryClient discoveryClient;

    public Item getItemById(final Long id){
        final List<ServiceInstance> instances = discoveryClient.getInstances(itemService);
        if(instances == null || instances.isEmpty()) return  null;
        final ServiceInstance serviceInstance = instances.get(0);
        final String host = serviceInstance.getHost();
        final int port = serviceInstance.getPort();
        final String urlItem = "http://" + host + ":" + port + "/item/" + id;
        return restTemplate.getForObject(urlItem,Item.class);
    }
}