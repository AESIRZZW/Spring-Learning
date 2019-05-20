package com.aesirtech.learning.spring.ioc.annotation.service.impl;

import com.aesirtech.learning.spring.ioc.annotation.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:06
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void serve() {
        System.out.println("The Spring IOC container is accessing service method.");
    }
}
