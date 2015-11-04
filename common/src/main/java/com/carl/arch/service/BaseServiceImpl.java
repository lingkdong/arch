package com.carl.arch.service;

import com.carl.arch.dao.BaseDao;
import com.googlecode.genericdao.search.ISearch;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 上午10:36
 */
@Transactional(propagation = Propagation.REQUIRED)
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
    private BaseDao<T, ID> dao = null;

    public void setDAO(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public List<T> search(ISearch search) {
        return dao.search(search);
    }
}
