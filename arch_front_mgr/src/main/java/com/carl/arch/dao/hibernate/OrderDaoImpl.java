package com.carl.arch.dao.hibernate;

import com.carl.arch.dao.BaseDaoImpl;
import com.carl.arch.dao.CartDao;
import com.carl.arch.dao.OrderDao;
import com.carl.arch.vo.Cart;
import com.carl.arch.vo.Order;
import org.springframework.stereotype.Repository;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:01
 */
@Repository
public class OrderDaoImpl extends BaseDaoImpl<Order, Integer> implements OrderDao {
}
