package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CmsPrefrenceAreaProductRelation implements Serializable {
    private Long id;

    private Long prefrence_area_id;

    private Long product_id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrefrence_area_id() {
        return prefrence_area_id;
    }

    public void setPrefrence_area_id(Long prefrence_area_id) {
        this.prefrence_area_id = prefrence_area_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prefrence_area_id=").append(prefrence_area_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}