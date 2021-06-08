package com.serviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/22 3:50 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAMain {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAMain.class,args);
    }
}
