package com.wsp.springcloud.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * spring boot 程序启动类
 */
@SpringBootApplication(scanBasePackages={"com.wsp"})
@EntityScan("com.wsp.springcloud.privoder.domain")
@EnableJpaRepositories("com.wsp.springcloud.privoder.dao")
@EnableDiscoveryClient
public class SpringBootAppMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppMain.class,args);
    }
}
