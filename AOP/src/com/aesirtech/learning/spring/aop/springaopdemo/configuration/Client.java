package com.aesirtech.learning.spring.aop.springaopdemo.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/9 0:01
 */
public class Client {
    public static void main(String[] args) {
        /*
         * Create Spring IOC container.
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_byConfiguration.xml");

        /*
         * Obtain instance of bean from Spring IOC container.
         */
        ArithmeticCalculator arithmeticCalculator = applicationContext.getBean(ArithmeticCalculator.class);

        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.sub(27, 12);
        arithmeticCalculator.mul(7, 8);
        arithmeticCalculator.div(1000, 10);
        arithmeticCalculator.div(100, 0);
    }
}
