package com.carl.arch.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

import java.io.Serializable;
import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 上午9:47
 */
public interface BaseDao<T, ID extends Serializable> extends GenericDAO<T, ID> {
}
