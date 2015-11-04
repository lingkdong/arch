package com.carl.arch.service;

import com.carl.arch.vo.Page;
import com.googlecode.genericdao.search.ISearch;
import com.googlecode.genericdao.search.Search;

import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 上午11:46
 */
public interface BaseService<T, ID> {
    List<T> findAll();

    List<T> search(ISearch search);

    Page<T> pageSearch(Search search, int pageNum, int nowPage);

    boolean[] save(T... entities);

}
