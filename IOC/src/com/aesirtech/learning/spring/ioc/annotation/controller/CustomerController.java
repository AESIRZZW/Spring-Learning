package com.aesirtech.learning.spring.ioc.annotation.controller;

import org.springframework.stereotype.Controller;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:04
 */
@Controller
public class CustomerController {
    public void control() {
        System.out.println("The Spring IOC container is accessing control method.");
    }
}
