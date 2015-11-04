package com.carl.arch.service.impl;

import com.carl.arch.dao.GoodsDao;
import com.carl.arch.service.BaseServiceImpl;
import com.carl.arch.service.GoodsService;
import com.carl.arch.vo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:04
 */
@Service
public class GoodsServiceImpl extends BaseServiceImpl<Goods, Integer> implements GoodsService {
    private GoodsDao dao = null;

    @Autowired
    private void setDao(GoodsDao dao) {
        this.dao = dao;
        super.setDAO(dao);
    }
}
