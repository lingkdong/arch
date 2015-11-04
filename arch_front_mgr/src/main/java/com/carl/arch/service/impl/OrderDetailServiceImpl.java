package com.carl.arch.service.impl;

import com.carl.arch.dao.OrderDetailDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.OrderDetailService;
import com.carl.arch.vo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetail, Integer> implements OrderDetailService {
    private OrderDetailDao dao = null;

    @Autowired
    private void setDao(OrderDetailDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
