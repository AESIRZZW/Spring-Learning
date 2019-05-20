package com.aesirtech.learning.spring.ioc.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 12:25
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("The Spring IOC container is accessing the postProcessBeforeInitialization method.");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("The Spring IOC container is accessing the postProcessAfterInitialization method.");
        return bean;
    }
}
