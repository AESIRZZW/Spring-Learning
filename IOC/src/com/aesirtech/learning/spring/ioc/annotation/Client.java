package com.aesirtech.learning.spring.ioc.annotation;

import com.aesirtech.learning.spring.ioc.annotation.controller.CustomerController;
import com.aesirtech.learning.spring.ioc.annotation.bean.Customer;
import com.aesirtech.learning.spring.ioc.annotation.repository.CustomerDao;
import com.aesirtech.learning.spring.ioc.annotation.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:31
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aesirtech/learning/spring/ioc/annotation/resource/applicationContext.xml");
        Customer customer = (Customer) applicationContext.getBean("customer");
        CustomerController controller = (CustomerController) applicationContext.getBean("customerController");
        CustomerService service = (CustomerService) applicationContext.getBean("customerService");
        CustomerDao dao = (CustomerDao) applicationContext.getBean("customerDao");
        System.out.println(customer);
        controller.control();
        service.serve();
        dao.update();
    }
}
