package com.carl.arch.vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart extends BaseModel {
    @Id
    @GeneratedValue
    private Integer uuid;
    private Integer customerUuid;
    private Integer goodsUuid;
    private Integer buyNum;

    public void setCustomerUuid(Integer obj) {
        this.customerUuid = obj;
    }

    public Integer getCustomerUuid() {
        return this.customerUuid;
    }

    public void setGoodsUuid(Integer obj) {
        this.goodsUuid = obj;
    }

    public Integer getGoodsUuid() {
        return this.goodsUuid;
    }

    public void setBuyNum(Integer obj) {
        this.buyNum = obj;
    }

    public Integer getBuyNum() {
        return this.buyNum;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
}
