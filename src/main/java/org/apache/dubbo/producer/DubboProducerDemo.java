/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 *
 * @author LENOVO
 */
@EnableAutoConfiguration
public class DubboProducerDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboProducerDemo.class,args);
    }
}
