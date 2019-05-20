package com.aesirtech.learning.spring.ioc.lifecycle;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 12:02
 */
public class AirPlane {
    private int id;
    private String model;
    private String color;

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void init() {
        System.out.println("The Spring IOC container is accessing the init method.");
    }

    public void destroy() {
        System.out.println("The Spring IOC container is accessing the destroy method.");
    }
}
