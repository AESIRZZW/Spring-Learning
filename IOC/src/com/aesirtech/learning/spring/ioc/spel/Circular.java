package com.aesirtech.learning.spring.ioc.spel;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/19 23:15
 */
public class Circular {
    private double diameter;
    private double perimeter;
    private double area;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circular{" +
                "diameter=" + diameter +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
