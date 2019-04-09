package com.aesirtech.learning.spring.aop.springaopdemo.annotation;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/8 21:44
 */

/*
 * Register as a component with a custom name.
 */
@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
