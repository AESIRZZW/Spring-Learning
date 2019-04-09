package com.aesirtech.learning.spring.aop.springaopdemo.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/9 13:50
 */

public class LoggingAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("[Pre-Notification] The method " + methodName + " begins with " + args);
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Post-Notification] The method " + methodName + " ends");
    }

    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Return-Notification] The method " + methodName + " ends with " + result);
    }

    public void afterThrowing(JoinPoint joinPoint, NullPointerException e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Exception-Notification] The method " + methodName + " occurs an exception: " + e);
    }

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());
        /*
         * Execute target method.
         */
        try {
            /*
             * Pre-notification
             */
            System.out.println("[Around-Notification-Pre] The method " + methodName + " begins with " + args);
            result = proceedingJoinPoint.proceed();
            /*
             * Return-notification
             */
            System.out.println("[Around-Notification-Return] The method " + methodName + " ends with " + result);
        } catch (Throwable throwable) {
            /*
             * Exception-notification
             */
            System.out.println("[Around-Notification-Exception] The method " + methodName + " occurs an exception: " + throwable);
            throw new RuntimeException(methodName + " execution failed");
        } finally {
            /*
             * Post-notification
             */
            System.out.println("[Around-Notification-Post] The method " + methodName + " ends");

        }
        return result;
    }
}
