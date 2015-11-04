package com.carl.arch.vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store extends BaseModel {
    @Id
    @GeneratedValue
    private Integer uuid;
    private Integer goodsUuid;
    private Integer storeNum;

    public void setGoodsUuid(Integer obj) {
        this.goodsUuid = obj;
    }

    public Integer getGoodsUuid() {
        return this.goodsUuid;
    }

    public void setStoreNum(Integer obj) {
        this.storeNum = obj;
    }

    public Integer getStoreNum() {
        return this.storeNum;
    }


    public String toString() {
        return "Model" + this.getClass().getName() + "[goodsUuid=" + this.getGoodsUuid() + ",storeNum=" + this.getStoreNum() + ",]";
    }
}
