package com.aesirtech.learning.spring.ioc.autowire.bean;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/18 19:27
 */
public class Order {
    private User user;
    private Address address;
    private double price;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", address=" + address +
                ", price=" + price +
                '}';
    }
}
