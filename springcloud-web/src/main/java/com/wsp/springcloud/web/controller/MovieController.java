package com.wsp.springcloud.web.controller;

import com.wsp.springcloud.consumer.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
         return this.restTemplate.getForObject("http://springcloud-provider-user/"+id,User.class);
    }

    @GetMapping("/instance")
    public void findInstance(){
       ServiceInstance serviceInstance =  this.loadBalancerClient.choose("springcloud-provider-user");
       logger.info("{}:{}:{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }


}
