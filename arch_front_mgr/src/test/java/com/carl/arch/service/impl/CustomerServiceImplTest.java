package com.carl.arch.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:49
 */
public class CustomerServiceImplTest {
    private CustomerServiceImpl customerService;

    @Before
    public void init() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        customerService = ctx.getBean(CustomerServiceImpl.class);
    }

    @Test
    public void testFindAll() {
        System.out.println(customerService.findAll());
    }
}
