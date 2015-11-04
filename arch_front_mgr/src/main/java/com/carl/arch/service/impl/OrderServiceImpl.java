package com.carl.arch.service.impl;

import com.carl.arch.dao.OrderDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.OrderService;
import com.carl.arch.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, Integer> implements OrderService {
    private OrderDao dao = null;

    @Autowired
    private void setDao(OrderDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
