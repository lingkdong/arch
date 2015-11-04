package com.carl.arch.service;

import com.googlecode.genericdao.search.ISearch;

import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 上午11:46
 */
public interface BaseService<T, ID> {
    List<T> findAll();

    List<T> search(ISearch search);
}
