package com.aesirtech.learning.spring.ioc;

import com.aesirtech.learning.spring.ioc.beans.*;
import com.aesirtech.learning.spring.ioc.autowire.bean.Order;
import com.aesirtech.learning.spring.ioc.collections.CarShop;
import com.aesirtech.learning.spring.ioc.factory.Spacecraft;
import com.aesirtech.learning.spring.ioc.lifecycle.AirPlane;
import com.aesirtech.learning.spring.ioc.properties.DataSource;
import com.aesirtech.learning.spring.ioc.spel.Circular;
import com.aesirtech.learning.spring.ioc.spel.Cone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/17 21:30
 */

/*
 * Three different levels of decoupling:
 * 1、Separate interface and implementation.
 * 2、Factory design pattern.
 * 3、Inversion of control.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * 1、ApplicationContext is a Spring IOC container interface.
         *    ClassPathXmlApplicationContext is an implementation class of ApplicationContext.
         *
         * 2、BeanFactory is the parent interface of Application Context.
         *    It only provides the basic implementation of IOC container for Spring itself.
         *    Application Context provides more advanced features for Spring developers, which makes it more widely used.
         *
         * 3、ConfigurableApplicationContext is a sub-interface of ApplicationContext.
         *    There are two implementation classes: ClassPathXmlApplicationContext and FileSystemXmlApplicationContext.
         *    The difference between them is whether the configuration file loading path is system path or class path.
         *    ConfigurableApplicationContext adds refresh() and close() methods based on ApplicationContext.
         *
         * 4、ApplicationContext instantiates all singleton beans when the context is initialized.
         *
         * 5、WebApplicationContext is used for Web applications which allows initializates from a path relative to the Web-Root directory.
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
         * Components only need to choose an appropriate way to receive the required resources via IOC mechanism.
         * IOC containers can obtain beans by multiple overloading methods, such as by class type.
         * But this requires the bean of that type is unique in the configuration file.
         *
         * Spring supports three kinds of dependency injection:
         * 1. Attribute injection (more uesd, by setter method in conventional form).
         * 2. Constructor injection.
         * 3. Factory Pattern method injection (less used).
         */
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.sayHello();

        Car audi = (Car) applicationContext.getBean("audi");
        Car tesla = (Car) applicationContext.getBean("tesla");
        System.out.println(audi);
        System.out.println(tesla);

        Person tom = (Person) applicationContext.getBean("tom");
        Person jack = (Person) applicationContext.getBean("jack");
        Person michael = (Person) applicationContext.getBean("michael");
        System.out.println(tom);
        System.out.println(jack);
        System.out.println(michael);

        CarShop carShop = (CarShop) applicationContext.getBean("carShop");
        System.out.println(carShop);

        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);

        javax.sql.DataSource myDataSource = (javax.sql.DataSource) applicationContext.getBean("myDataSource");
        System.out.println(myDataSource);

        Circular circular = (Circular) applicationContext.getBean("circular");
        Cone cone = (Cone) applicationContext.getBean("cone");
        System.out.println(circular);
        System.out.println(cone);

        Spacecraft spaceShuttle = (Spacecraft) applicationContext.getBean("spaceShuttle");
        Spacecraft carrierRocket = (Spacecraft) applicationContext.getBean("carrierRocket");
        System.out.println(spaceShuttle);
        System.out.println(carrierRocket);

        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) applicationContext;
        AirPlane airPlane = (AirPlane) configurableApplicationContext.getBean("airPlane");
        System.out.println(airPlane);
        configurableApplicationContext.close();
    }
}
