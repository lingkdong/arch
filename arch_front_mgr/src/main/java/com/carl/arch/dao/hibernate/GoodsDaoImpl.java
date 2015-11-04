package com.carl.arch.dao.hibernate;

import com.carl.arch.dao.BaseDaoImpl;
import com.carl.arch.dao.GoodsDao;
import com.carl.arch.vo.Goods;
import org.springframework.stereotype.Repository;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午1:01
 */
@Repository
public class GoodsDaoImpl extends BaseDaoImpl<Goods, Integer> implements GoodsDao {
}
