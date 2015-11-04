package com.carl.arch.vo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order extends BaseModel {
    @Id
    @GeneratedValue
    private Integer uuid;
    private Integer customerUuid;
    private String orderTime;
    private Float totalMoney;
    private Float saveMoney;
    private Integer state;

    public void setCustomerUuid(Integer obj) {
        this.customerUuid = obj;
    }

    public Integer getCustomerUuid() {
        return this.customerUuid;
    }

    public void setOrderTime(String obj) {
        this.orderTime = obj;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public void setTotalMoney(Float obj) {
        this.totalMoney = obj;
    }

    public Float getTotalMoney() {
        return this.totalMoney;
    }

    public void setSaveMoney(Float obj) {
        this.saveMoney = obj;
    }

    public Float getSaveMoney() {
        return this.saveMoney;
    }

    public void setState(Integer obj) {
        this.state = obj;
    }

    public Integer getState() {
        return this.state;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
}
