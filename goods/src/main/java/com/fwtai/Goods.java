package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 商品微服务启动器
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:14
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@SpringBootApplication
@EnableEurekaClient
public class Goods{

    public static void main(final String[] args){
        SpringApplication.run(Goods.class,args);
    }
}