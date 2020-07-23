package com.yang.servicefeign.controller;

import com.yang.servicefeign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhichu
 */
@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String name){
        return helloFeignService.sayHiFromClientOne(name);
    }
}