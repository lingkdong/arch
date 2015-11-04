package com.carl.arch.service.impl;

import com.carl.arch.dao.StoreDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.StoreService;
import com.carl.arch.vo.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class StoreServiceImpl extends BaseServiceImpl<Store, Integer> implements StoreService {
    private StoreDao dao = null;

    @Autowired
    private void setDao(StoreDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
