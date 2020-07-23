package com.yang.serviceribbon.service.impl;

import com.yang.serviceribbon.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhichu
 */
@Service
public class HelloRibbonServiceImpl implements HelloRibbonService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        //使用注册到Eureka服务中心的客户端，由客户端分配具体调用哪个服务
        return restTemplate.getForObject("http://eureka-client-01/hi?name="+name, String.class);
    }

    @Override
    public String helloRibbon(){
        //访问hello-service服务的hello接口
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://eureka-client-01/hi", String.class);
        System.out.println(forEntity);
        return forEntity.getBody();
    }
}
