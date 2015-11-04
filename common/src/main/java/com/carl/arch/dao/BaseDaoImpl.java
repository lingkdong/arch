package com.carl.arch.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 上午9:48
 */
@Component
public class BaseDaoImpl<T, ID extends java.io.Serializable> extends GenericDAOImpl<T, ID> implements BaseDao<T, ID> {
    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


}
