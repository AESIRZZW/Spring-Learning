package com.aesirtech.learning.spring.ioc.annotation.repository.impl;

import com.aesirtech.learning.spring.ioc.annotation.repository.CustomerDao;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: IOC
 * @Description:
 * @Author: Aesir
 * @Date: 2019/5/20 17:05
 */
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void update() {
        System.out.println("The Spring IOC container is accessing update method.");
    }
}
