package com.aesirtech.learning.spring.ioc.spel;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/19 23:20
 */
public class Cone {
    private Circular circular;
    private double height;
    private double volume;

    public Circular getCircular() {
        return circular;
    }

    public void setCircular(Circular circular) {
        this.circular = circular;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "circular=" + circular +
                ", height=" + height +
                ", volume=" + volume +
                '}';
    }
}
