package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 订单微服务启动器
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:14
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@SpringBootApplication
@EnableDiscoveryClient //声明这里Euraka客户端,这个可以不用配置???
public class Order{

    public static void main(final String[] args){
        SpringApplication.run(Order.class,args);
    }

    // 对 RestTemplate 的优化
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}