package com.aesirtech.learning.spring.aop.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ProjectName: AOP
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/8 21:54
 */
public class AritchmeticCaculatorProxy {

    /*
     * Indicate the object to be represented.
     */
    private ArithmeticCalculator target;

    public AritchmeticCaculatorProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public ArithmeticCalculator getLoggingProxy() {
        ArithmeticCalculator proxy = null;

        /*
         * Find the class loader for the proxy object.
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};
        InvocationHandler handler = new InvocationHandler() {
            /*
             * @param proxy Proxy object that can be returned. Usually not used.
             * @param method Method being invoked.
             * @param args Parameters that need to be passed in when invoking method.
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                /*
                 * Add logs before or after core method execution.
                 */
                String methodName = method.getName();
                System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
                Object result = null;
                try {
                    /**
                     * AOP pre-notification position.
                     */
                    result = method.invoke(target, args);
                    /**
                     * AOP return-notification position.
                     */
                } catch (Exception e) {
                    /**
                     * AOP exception-notification position.
                     */
                    e.printStackTrace();
                }
                /**
                 * AOP post-notification position.
                 */
                System.out.println("The method " + methodName + " ends with " + result);
                return result;
            }
        };
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(classLoader, interfaces, handler);
        return proxy;
    }
}
