package com.aesirtech.learning.spring.aop.proxydemo;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/8 21:49
 */
public class Client {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();
        ArithmeticCalculator proxy = new AritchmeticCaculatorProxy(arithmeticCalculator).getLoggingProxy();
        proxy.add(1, 2);
        proxy.sub(2, 1);
        proxy.mul(1, 2);
        proxy.div(2, 1);
    }
}
