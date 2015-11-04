package com.carl.arch.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods extends BaseModel {
    @Id
    @GeneratedValue
    private Integer uuid;
    private String name;
    private String imgPath;
    private String description;

    public void setName(String obj) {
        this.name = obj;
    }

    public String getName() {
        return this.name;
    }

    public void setImgPath(String obj) {
        this.imgPath = obj;
    }

    public String getImgPath() {
        return this.imgPath;
    }

    public void setDescription(String obj) {
        this.description = obj;
    }

    public String getDescription() {
        return this.description;
    }


    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
}
