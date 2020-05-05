package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka启动器
 */
@SpringBootApplication
@EnableEurekaServer //注册中心
public class Eureka{

    public static void main(final String[] args){
        SpringApplication.run(Eureka.class,args);
    }
}