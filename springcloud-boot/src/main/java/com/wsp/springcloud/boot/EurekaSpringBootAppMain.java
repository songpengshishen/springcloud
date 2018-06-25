package com.wsp.springcloud.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class EurekaSpringBootAppMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringBootAppMain.class,args);
    }
}
