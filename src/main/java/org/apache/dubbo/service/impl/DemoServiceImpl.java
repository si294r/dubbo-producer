/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.dubbo.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author LENOVO
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is
     * ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
