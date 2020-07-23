package com.yang.servicefeign.service.impl;

import com.yang.servicefeign.service.HelloFeignService;
import org.springframework.stereotype.Component;

/**
 * @author zhichu
 */

@Component
public class HelloFeignServiceImpl implements HelloFeignService {

    /**
     * 正常调用（接口+注解 服务名 配置），熔断后转至此处
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
