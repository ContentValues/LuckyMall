package com.lucky.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsProductCategoryAttributeRelation implements Serializable {
    private Long id;

    private Long product_category_id;

    private Long product_attribute_id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(Long product_category_id) {
        this.product_category_id = product_category_id;
    }

    public Long getProduct_attribute_id() {
        return product_attribute_id;
    }

    public void setProduct_attribute_id(Long product_attribute_id) {
        this.product_attribute_id = product_attribute_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", product_category_id=").append(product_category_id);
        sb.append(", product_attribute_id=").append(product_attribute_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}