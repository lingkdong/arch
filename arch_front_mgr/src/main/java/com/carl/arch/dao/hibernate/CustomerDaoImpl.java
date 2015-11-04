package com.carl.arch.dao.hibernate;

import com.carl.arch.dao.BaseDaoImpl;
import com.carl.arch.dao.CustomerDao;
import com.carl.arch.vo.Customer;
import org.springframework.stereotype.Repository;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:01
 */
@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer, Integer> implements CustomerDao {
}
