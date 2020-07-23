package com.yang.servicefeign.service;


import com.yang.servicefeign.service.impl.HelloFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhichu
 */
@FeignClient(value = "eureka-client-01", fallback = HelloFeignServiceImpl.class)
public interface HelloFeignService {
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
