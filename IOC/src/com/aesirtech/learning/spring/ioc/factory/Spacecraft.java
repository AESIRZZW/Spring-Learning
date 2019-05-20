package com.aesirtech.learning.spring.ioc.factory;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 15:36
 */
public class Spacecraft {
    private String type;
    private int capacity;
    private boolean ifManned;

    public Spacecraft() {
    }

    public Spacecraft(String type, int capacity, boolean ifManned) {
        this.type = type;
        this.capacity = capacity;
        this.ifManned = ifManned;
    }

    @Override
    public String toString() {
        return "Spacecraft{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", ifManned=" + ifManned +
                '}';
    }
}
