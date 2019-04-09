package com.aesirtech.learning.spring.aop.springaopdemo.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/9 18:25
 */
@Order(2)
@Aspect
@Component("validationAspect")
public class ValidationAspect {

    // @Before("execution(public int ArithmeticCalculatorImpl.div(int, int))")
    /*
     * If the pointcut-expression-declare method from other class is not under the same package,
     * need to write a fully qualified name.
     */
    @Before(value = "com.aesirtech.learning.spring.aop.springaopdemo.annotation.LoggingAspect.declareJointPointExpressionForDiv()")
    public void validateArgs(JoinPoint joinPoint) {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        if (Integer.parseInt(args.get(1).toString()) == 0) {
            System.out.println("[Validation-Notification] " + args + " are invalid parameters");
        } else {
            System.out.println("[Validation-Notification] " + args + " are valid parameters");
        }
    }
}
