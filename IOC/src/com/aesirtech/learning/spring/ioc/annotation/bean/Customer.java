package com.aesirtech.learning.spring.ioc.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:01
 */
@Component
public class Customer {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
