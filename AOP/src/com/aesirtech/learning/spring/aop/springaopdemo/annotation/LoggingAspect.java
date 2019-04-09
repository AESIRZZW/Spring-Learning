package com.aesirtech.learning.spring.aop.springaopdemo.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/9 13:50
 */

/*
 * Place this Class in IOC container and declare it as an aspect.
 * Specify this aspect priority by @Order, the smaller the Order value, the higher the priority.
 */
@Order(1)
@Aspect
@Component("loggingAspect")
public class LoggingAspect {

    /*
     * Declaring a pointcut expression through @Pointcut can effectively improve code reuse.
     * Generally, no additional code is needed in this method.
     */
    @Pointcut("execution(public int com.aesirtech.learning.spring.aop.springaopdemo.annotation.ArithmeticCalculatorImpl.*(int, int))")
    public void declareJointPointExpression() {
    }

    @Pointcut("execution(public int com.aesirtech.learning.spring.aop.springaopdemo.annotation.ArithmeticCalculatorImpl.div(int, int))")
    public void declareJointPointExpressionForDiv() {
    }

    /*
     * Annotate this method as a pre-notification that is executed before the target method starts.
     * '*' can be placed in several places as a placeholder to represent different meanings.
     */
    // @Before("execution(public int ArithmeticCalculatorImpl.*(int, int))")
    @Before(value = "declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("[Pre-Notification] The method " + methodName + " begins with " + args);
    }

    /*
     * Post-notification is a notification that is executed after the target method is executed,
     * regardless of whether an exception occurs.
     * The results of the execution of the target method cannot be accessed in the post-notification.
     */
    // @After("execution(* com.aesirtech.learning.spring.aop.springaopdemo.*.*(int, int))")
    @After(value = "declareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Post-Notification] The method " + methodName + " ends");
    }

    /*
     * Return-notification is a notification that is executed after the target method is executed successfully,
     * The results of the execution of the target method can be accessed in the return-notification.
     */
    // @AfterReturning(value = "execution(* com.aesirtech.learning.spring.aop.springaopdemo.*.*(..))", returning = "result")
    @AfterReturning(value = "declareJointPointExpression()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Return-Notification] The method " + methodName + " ends with " + result);
    }

    /*
     * Exception-notification is a notification that is executed after the target method throws a specified exception,
     * The exception objects can be accessed.
     */
    // @AfterThrowing(value = "execution(* com.aesirtech.learning.spring.aop.springaopdemo.*.*(..))", throwing = "e")
    @AfterThrowing(value = "declareJointPointExpression()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, NullPointerException e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Exception-Notification] The method " + methodName + " occurs an exception: " + e);
    }

    /*
     * Around-notification is similar to the whole process of dynamic proxy.
     * The parameter proceedingJoinPoint determines whether the target method will be executed or not.
     * Around-notification must have a return value, which is the return value of the target method.
     */
    // @Around("execution(* com.aesirtech.learning.spring.aop.springaopdemo.*.*(..))")
    @Around(value = "declareJointPointExpression()")
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
