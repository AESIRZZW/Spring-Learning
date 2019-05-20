package com.aesirtech.learning.spring.ioc.autowire;

import com.aesirtech.learning.spring.ioc.autowire.bean.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:44
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aesirtech/learning/spring/ioc/autowire/resource/applicationContext.xml");
        Order order = (Order) applicationContext.getBean("order");
        System.out.println(order);
    }
}
