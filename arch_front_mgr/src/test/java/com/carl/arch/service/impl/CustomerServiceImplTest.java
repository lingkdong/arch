package com.carl.arch.service.impl;

import com.carl.arch.vo.Customer;
import com.carl.arch.vo.Page;
import com.googlecode.genericdao.search.Search;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void testPageSearch() {
        int pageShow = 3;
        int nowPage = 5;
        Page<Customer> page = customerService.pageSearch(new Search(), pageShow, nowPage);
        System.out.println(page);
    }

    @Test
    public void initCustomer() {
        int size = 10;
        Customer[] target = new Customer[size];
        for (int i = 0; i < size; i++) {
            Customer customer = new Customer();
            customer.setCustomerId("carl00" + i);
            customer.setPwd("123456");
            customer.setRegisterTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            customer.setShowName("carl");
            customer.setTrueName("yu");
            target[i] = customer;
        }
        customerService.save(target);
    }
}
