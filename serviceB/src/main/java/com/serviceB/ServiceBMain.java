package com.serviceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/22 3:50 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceBMain {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBMain.class,args);
    }
}
