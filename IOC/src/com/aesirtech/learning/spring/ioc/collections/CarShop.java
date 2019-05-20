package com.aesirtech.learning.spring.ioc.collections;

import com.aesirtech.learning.spring.ioc.beans.Car;
import com.aesirtech.learning.spring.ioc.beans.Person;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/18 15:11
 */
public class CarShop {
    private String name;
    private String addr;
    private List<Car> cars;
    private Map<Person,Car> orders;

    public CarShop() {
    }

    public CarShop(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map<Person, Car> getOrders() {
        return orders;
    }

    public void setOrders(Map<Person, Car> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", cars=" + cars +
                ", orders=" + orders +
                '}';
    }
}
