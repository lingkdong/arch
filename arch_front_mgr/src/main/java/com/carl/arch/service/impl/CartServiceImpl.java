package com.carl.arch.service.impl;

import com.carl.arch.dao.CartDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.CartService;
import com.carl.arch.vo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class CartServiceImpl extends BaseServiceImpl<Cart, Integer> implements CartService {
    private CartDao dao = null;

    @Autowired
    private void setDao(CartDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
