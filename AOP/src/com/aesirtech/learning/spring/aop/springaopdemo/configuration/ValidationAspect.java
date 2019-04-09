package com.aesirtech.learning.spring.aop.springaopdemo.configuration;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/9 18:25
 */

public class ValidationAspect {

    public void validateArgs(JoinPoint joinPoint) {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        if (Integer.parseInt(args.get(1).toString()) == 0) {
            System.out.println("[Validation-Notification] " + args + " are invalid parameters");
        } else {
            System.out.println("[Validation-Notification] " + args + " are valid parameters");
        }
    }
}
