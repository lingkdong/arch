package com.carl.arch.vo;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * User: carl.yu
 * Date: 15-11-4
 * Time: 下午5:39
 */
public class Page<T> implements Serializable {
    private int pageShow = 2;
    private int totalPage;
    private int start;
    private int nowPage;
    private List<T> result = Collections.emptyList();
    private int totalCount;

    public Page() {
    }

    public Page(List<T> result, int totalCount, int start) {

    }

    public int getStart() {
        start = (getNowPage() - 1) * getPageShow();
        if (start < 0) {
            start = 0;
        }
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageShow() {
        return pageShow;
    }

    public void setPageShow(int pageShow) {
        this.pageShow = pageShow;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return (int) Math.ceil(totalCount * 1.0 / pageShow);
    }

    public int getNowPage() {
        if (nowPage <= 0)
            nowPage = 1;
        if (nowPage > getTotalPage())
            nowPage = getTotalPage();
        return nowPage;
    }

    @Override
    public String toString() {
        return "Page [pageShow=" + pageShow + ", totalPage=" + getTotalPage()
                + ", totalCount=" + totalCount + ", nowPage=" + nowPage
                + ", result=" + result + "]";
    }
}
