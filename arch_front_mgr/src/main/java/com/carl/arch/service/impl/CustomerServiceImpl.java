package com.carl.arch.service.impl;

import com.carl.arch.dao.CustomerDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.CustomerService;
import com.carl.arch.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, Integer> implements CustomerService {
    private CustomerDao dao = null;

    @Autowired
    private void setDao(CustomerDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
