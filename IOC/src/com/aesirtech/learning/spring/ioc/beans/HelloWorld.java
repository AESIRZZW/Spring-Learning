package com.aesirtech.learning.spring.ioc.beans;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/17 21:27
 */
public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("The Spring IOC container is accessing the non-parametric constructor.");
    }

    public void setName(String name) {
        System.out.println("The Spring IOC container is injecting property " + name + ".");
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name + "!");
    }
}
