package com.aesirtech.learning.spring.ioc.autowire.bean;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/18 19:29
 */
public class User {
    private String name;
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
